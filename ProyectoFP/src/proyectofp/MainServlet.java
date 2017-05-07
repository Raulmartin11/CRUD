package proyectofp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
        String nextJSP = "";
        Impresoras[] datosImpresoras = null;
        BaseDatos InfoImpresoras = new BaseDatos();
        String option = request.getParameter("action");
        
        switch(option){
        
        case "List":
        	datosImpresoras = InfoImpresoras.Tabla();
        	request.setAttribute("datosImpresoras", datosImpresoras);
        	nextJSP = "/Pagina3.jsp";
			break;
			
        case "Add":
        	nextJSP = "/Nuevo.jsp";
			break;
        case "Modificar":
        	String Numero = request.getParameter("Numero");
        	request.setAttribute("datosImpresoras", datosImpresoras);
        	nextJSP = "/Modificar.jsp?Numero=" + Numero;
        } 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nextJSP = "";
		Impresoras[] DatosImpresoras = null;
		String action = request.getParameter("action");
		BaseDatos InfoImpresoras = new BaseDatos();
		
		switch(action) {
		
		case "Deleter":
			String Modelo = request.getParameter("Modelo");
			InfoImpresoras.Delete(Modelo);
			DatosImpresoras = InfoImpresoras.Tabla();
			request.setAttribute("DatosImpresoras", DatosImpresoras);
			nextJSP = "/Pagina3.jsp";
			break;
		case "Modify":
			InfoImpresoras.Modify(request.getParameter("Marca"), request.getParameter("Modelo"), request.getParameter("Tipo"), request.getParameter("Precio"));
			break;
		}
	
			
	}

}
