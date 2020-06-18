/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrabajoFinalVisual2020Application;
import ar.edu.unju.fi.tracking.model.Localidad;

/**
 * @author grupo 6
 *
 */
@Repository("/localidadImpl")
public class LocalidadImpl implements ILocalidad {

	@Autowired
	private Localidad localidad;
	public static Logger LOG = LoggerFactory.getLogger(TrabajoFinalVisual2020Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto usuario en la BD
		LOG.info("La cuota fue guarda: "+", "+localidad.getNombre());
	}

	@Override
	public Localidad mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de la localidad");
		return localidad;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino la localidad de bd");

	}

	@Override
	public Localidad modificar() {
		// TODO Auto-generated method stub
		return localidad;
	}

}
