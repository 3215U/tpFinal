/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrabajoFinalVisual2020Application;
import ar.edu.unju.fi.tracking.model.Tripulante;

/**
 * @author grupo 6
 *
 */
@Repository(" /TripulanteImpl")
public class TripulanteImpl implements ITripulante {

	@Autowired
	private Tripulante tripulante;
	public static Logger LOG = LoggerFactory.getLogger(TrabajoFinalVisual2020Application.class);

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("Datos de tripulante fue guardo: "+tripulante.getApellido()+", "+tripulante.getNombres()+", "+tripulante.getDocumento()+", "+tripulante.getNacionalida());

	}

	@Override
	public Tripulante mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de tripulante");
		return tripulante;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino la tripulante de bd");

	}

	@Override
	public Tripulante modificar() {
		// TODO Auto-generated method stub
		return tripulante;
	}

}
