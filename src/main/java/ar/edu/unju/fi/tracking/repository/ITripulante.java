/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.Tripulante;

/**
 * @author grupo 6
 *
 */
public interface ITripulante {
	public void guardar();
	public Tripulante mostrar();
	public void eliminar();
	public Tripulante modificar();
	
	
}
