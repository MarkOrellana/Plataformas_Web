package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import modelo.Categoria;
import datos.CategoriaDAO;

@Stateless
public class GestionCategorias {

	@Inject
	private CategoriaDAO categoriaDAO;
	
	public void guardarAutor(Categoria categoria) {
		if(categoriaDAO.read(categoria.getCodigo())==null) {
			categoriaDAO.insert(categoria);
		}else {
			categoriaDAO.update(categoria);
		}
	}
	
}
