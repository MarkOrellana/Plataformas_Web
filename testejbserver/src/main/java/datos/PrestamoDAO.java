package datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Libro;
import modelo.Prestamo;

@Stateless
public class PrestamoDAO {

	@Inject
	private EntityManager em;
	
	public void guardar(Prestamo prestamo) {
		em.persist(prestamo);
	}
	public void update(Prestamo prestamo) {
		em.merge(prestamo);
	}
	public void remove(int codigo) {
		Prestamo prestamo = this.read(codigo);
		em.remove(prestamo);
	}
	
	public Prestamo read(int codigo) {
		Prestamo l = em.find(Prestamo.class, codigo);
		return l;
	}
	
}
