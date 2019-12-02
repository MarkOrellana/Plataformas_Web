package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Persona;

@Stateless
public class PersonaDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Persona persona) {
		em.persist(persona);
	}
	
	public void update(Persona persona) {
		em.merge(persona);
	}
	
	public void remove(String cedula) {
		em.remove(this.read(cedula));
	}
	
	public Persona read(String cedula) {
		return em.find(Persona.class, cedula);
	}
	
	public List<Persona> getPersona(){
		String jpql = "SELECT p FROM Persona p";
		Query q = em.createQuery(jpql, Persona.class);
		
		List<Persona> personas = q.getResultList();
		
		return personas;
	}
}
