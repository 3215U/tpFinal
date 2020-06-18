/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.Localidad;

/**
 * @author grupo 6
 *
 */
public interface ILocalidad {
	public void guardar();
	public Localidad mostrar();
	public void eliminar();
	public Localidad modificar();
	
	
}
