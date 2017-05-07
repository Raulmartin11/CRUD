package proyectofp;

/**
 * @author Raúl
 *
 */
public class Impresoras {
	String Marca;
	String Modelo;
	String Tipo;
	String Precio;
	public Impresoras (String marca, String modelo, String tipo, String precio){
	
		this.Marca = marca;
		this.Modelo = modelo;
		this.Tipo = tipo;
		this.Precio = precio;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}	
	
	
}
