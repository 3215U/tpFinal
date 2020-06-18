/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrabajoFinalVisual2020Application;
import ar.edu.unju.fi.tracking.model.RegistroTracking;

/**
 * @author grupo 6
 *
 */
@Repository("/registroTrackingImpl")
public class RegistroTrackingImpl implements IRegistroTracking {

	@Autowired
	private RegistroTracking registroTracking;
	public static Logger LOG = LoggerFactory.getLogger(TrabajoFinalVisual2020Application.class);

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("El registro de Tracking fue guardo: "+registroTracking.getVehiculo()+", "+registroTracking.getLocalidad()+", "+registroTracking.getTripulantes()+", "+registroTracking.getFechaHora()+", "+registroTracking.getClass()+", "+registroTracking.getDetalleLugarRegistro());

	}

	@Override
	public RegistroTracking mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de Registro tracking");
		return registroTracking;
	
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino el registro de Tracking de bd");
	}

	@Override
	public RegistroTracking modificar() {
		// TODO Auto-generated method stub
		return registroTracking;
	}

}
