package Gimnasio;

public class Dueño {
	public int Codigo;
	public String nombre;
	public String apellidos;
	public String email;
	public int tlf;
	public Dueño(int codigo, String nombre, String apellidos, String email, int tlf) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.tlf = tlf;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTlf() {
		return tlf;
	}
	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	@Override
	public String toString() {
		return "Dueño [Codigo=" + Codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
				+ ", tlf=" + tlf + "]";
	}
	
	
}
