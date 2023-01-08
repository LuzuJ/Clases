import java.io.Serializable;

public class Mascota implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1363631906449713876L;
	private Integer id;
	private String nombre;
	private String tipo;
	private String raza;
	private Integer edad;
	private Boolean estadoMatch;
	private String observacion;
	private Persona propietario;
	private Mascota matchMascota;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getEstadoMatch() {
		return estadoMatch;
	}

	public void setEstadoMatch(Boolean estadoMatch) {
		this.estadoMatch = estadoMatch;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Mascota getMatchMascota() {
		return matchMascota;
	}

	public void setMatchMascota(Mascota matchMascota) {
		this.matchMascota = matchMascota;
	}

	public String toString() {

		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getId());
		buffer.append("\t");
		buffer.append(this.getNombre());
		buffer.append("\t");
		buffer.append(this.getTipo());
		buffer.append("\t");
		buffer.append(this.getRaza());
		buffer.append("\t");
		buffer.append(this.getEdad());
		buffer.append("\t");
		buffer.append(this.getEstadoMatch());
		buffer.append("\t");
		buffer.append(this.getObservacion());
		buffer.append("\t");
		buffer.append(this.getPropietario() != null ? this.getPropietario().getCedula():"SIN PROPIETARIO");
		buffer.append("\t");
		buffer.append(this.getMatchMascota() != null ? this.getMatchMascota().getId() : 0);
		buffer.append("\n");

		return buffer.toString();
	}

}
