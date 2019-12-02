package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.PrestamoDAO;
import modelo.Prestamo;

@Stateless
public class GestionPrestamos {

	@Inject
	private PrestamoDAO dao;
	
	public void guardarPrestamo(Prestamo prestamo) {
		dao.guardar(prestamo);
	}
}
