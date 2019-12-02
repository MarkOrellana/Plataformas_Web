package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private int codigo;
	private String cedula;
	private String nombre;
	private String telefono;
	private String direccion;
	private String estado_lector;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstado_lector() {
		return estado_lector;
	}
	public void setEstado_lector(String estado_lector) {
		this.estado_lector = estado_lector;
	}
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", estado_lector=" + estado_lector + "]";
	}
	
	
}
