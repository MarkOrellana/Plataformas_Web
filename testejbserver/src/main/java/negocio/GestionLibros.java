package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.LibroDAO;
import modelo.Libro;

@Stateless
public class GestionLibros{

	@Inject
	private LibroDAO libroDAO;
	
	public void guardarLibro(Libro libro) {
		if(libroDAO.read(libro.getCodigo())==null) {
			libroDAO.insert(libro);
		}else {
			libroDAO.update(libro);
		}
	}
}
