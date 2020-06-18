/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrabajoFinalVisual2020Application;
import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author grupo 6
 *
 */
@Repository("/UsuarioImpl")
public class UsuarioImpl implements IUsuario {

	@Autowired
	private Usuario usuario;
	public static Logger LOG = LoggerFactory.getLogger(TrabajoFinalVisual2020Application.class);

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("El usuario fue guardado: "+usuario.getApellidoReal()+", "+usuario.getNombreReal()+", "+usuario.getNombreUsuario()+", "+usuario.getTipoUsuario()+", "+usuario.getTipoUsuario());
	}


	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// Se elimino el obeto usuario de bd
		LOG.info("Se elimino el usuario de bd");
	}

	@Override
	public Usuario modificar() {
		return usuario;
	}

}
