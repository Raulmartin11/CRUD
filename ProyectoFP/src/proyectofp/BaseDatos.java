package proyectofp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.activation.*;

public class BaseDatos {
	Connection connection = null;
	Context ctx;

	public BaseDatos() {

		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/ProyectoFP");
			connection = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
	}

	public Impresoras[] Tabla() {

		Impresoras[] AUX = new Impresoras[100];
		int i = 0;

		try {
			Statement stmt = null;
			String query = "select * from Impresoras";
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String Marca = rs.getString("Marca");
				String Modelo = rs.getString("Modelo");
				String Tipo = rs.getString("Tipo");
				String Precio = rs.getString("Precio");

				AUX[i] = new Impresoras(Marca, Modelo, Tipo, Precio);
				i++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		Impresoras[] datosImpresoras = new Impresoras[i];

		for (int j = 0; j < i; j++) {
			datosImpresoras[j] = new Impresoras(AUX[j].getMarca(), AUX[j].getModelo(), AUX[j].getTipo(),
					AUX[j].getPrecio());
		}

		return datosImpresoras;
	}

	public void Delete(String Modelo) {

		Statement stmt = null;
		try {

			String query = "delete from Impresoras where Modelo like '" + Modelo + "'";
			stmt = connection.createStatement();
			int rs = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void Modify(String Marca, String Modelo, String Tipo, String Precio) {
		Statement stmt = null;
		Statement stmt1 = null;
		String query = "select Modelo from Impresoras where Moledo='"+ Modelo +"'";
		Impresoras[] impresoras = null;
		Impresoras Impresora = null;
		try {
			
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String marca = rs.getString("Marca");
				String modelo = rs.getString("Modelo");
				String tipo = rs.getString("Tipo");
				String precio = rs.getString("Precio");
				
				Impresora = new Impresoras(marca, modelo, tipo, precio);

			}

			

			
			String query1 = "update Impresoras set Marca='" + Marca + "', Modelo='" + Modelo + "', Tipo='" + Tipo
					+ "', Precio='" + Precio + "' where Modelo like'"+ Modelo +"";

			stmt1 = connection.createStatement();
			ResultSet rs1 = stmt.executeQuery(query1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
