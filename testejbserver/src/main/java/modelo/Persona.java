package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

//@Entity
public class Persona {
	
	@Id
	@Column(name="cedula")
	private String cedula;
		
	@Column(name="nombre")
	private String nombre;
	
	/*Una persona con varios telefonos relacionada por la columna per_cedula en telefonos*/
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="cedula")
	private List<Telefono> telefonos;
	
	@Column(name="direccion")
	private String direccion;
	

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	public void addTelefono(Telefono telefono) {
		if(telefonos==null) {
			telefonos=new ArrayList<Telefono>();
			telefonos.add(telefono);
		}
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefonos="
				+ telefonos + "]";
	}
}
