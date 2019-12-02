package negocio;

import javax.ejb.Remote;

import modelo.Prestamo;

@Remote
public interface GestionPrestamosRemote {

	public void guardarPrestamo(Prestamo prestamo);
}
