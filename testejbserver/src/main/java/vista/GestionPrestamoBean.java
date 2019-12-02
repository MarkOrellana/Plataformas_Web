package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Autor;
import modelo.Libro;
import modelo.Prestamo;
import modelo.Usuario;
import negocio.GestionPrestamos;

@ManagedBean
@SessionScoped
public class GestionPrestamoBean {

	@Inject
	private GestionPrestamos gp;
	
	private Prestamo prestamo = new Prestamo();
	
	public String guardarPrestamo() {
		gp.guardarPrestamo(prestamo);
		return null;
	}
	
	@PostConstruct
	public void init() {
		prestamo = new Prestamo();
		prestamo.setLibro(new Libro());
		prestamo.setUsuario(new Usuario());
	}

	public GestionPrestamos getGp() {
		return gp;
	}

	public void setGp(GestionPrestamos gp) {
		this.gp = gp;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	

}
