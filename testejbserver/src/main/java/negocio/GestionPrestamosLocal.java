package negocio;

import javax.ejb.Local;

import modelo.Prestamo;

@Local
public interface GestionPrestamosLocal {
	
	public void guardarPrestamo(Prestamo prestamo);

}
