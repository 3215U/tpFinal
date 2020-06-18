/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.RegistroTracking;

/**
 * @author ssd
 *
 */
public interface IRegistroTracking {
	public void guardar();
	public RegistroTracking mostrar();
	public void eliminar();
	public RegistroTracking modificar();
	
	
}
