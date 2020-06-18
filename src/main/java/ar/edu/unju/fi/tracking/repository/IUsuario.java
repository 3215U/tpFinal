/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author ssd
 *
 */
public interface IUsuario {
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
	
	
}
