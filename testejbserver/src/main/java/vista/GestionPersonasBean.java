package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Persona;
import modelo.Telefono;
import negocio.GestionPersonas;

//@ManagedBean
//@SessionScoped
public class GestionPersonasBean {
	
	//@Inject
	private GestionPersonas gp;
	
	private List<Persona> personas;
	
	/*Bean Properties*/
	private Persona persona = new Persona();

	/*Action Controller*/
	public String guardarPersona() {
		gp.guardar(persona);
		return null;
	}
	
	public String addTelefono() {
		persona.addTelefono(new Telefono());
		return null;
	}
	
	@PostConstruct
	public void init() {
		persona = new Persona();
		persona.addTelefono(new Telefono());
	}
	
	public Persona getPersona() {
		System.out.println(persona);
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}	
}
