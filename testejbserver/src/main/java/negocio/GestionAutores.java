package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.AutorDAO;
import modelo.Autor;

@Stateless
public class GestionAutores {

	@Inject
	private AutorDAO autorDAO;
	
	public void guardarAutor(Autor autor) {
		if(autorDAO.read(autor.getCodigo())==null) {
			autorDAO.insert(autor);
		}else {
			autorDAO.update(autor);
		}
	}
}
