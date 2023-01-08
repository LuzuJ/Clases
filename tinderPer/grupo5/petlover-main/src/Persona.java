import java.io.Serializable;

public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1138413018473248759L;
	private String cedula;
	private String nombres;
	private String apellidos;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String toString() {

		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getCedula());
		buffer.append("\t");
		buffer.append(this.getNombres());
		buffer.append("\t");
		buffer.append(this.getApellidos());
		buffer.append("\n");

		return buffer.toString();
	}
}
