/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.TrabajoFinalVisual2020Application;
import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * @author Grupo 6
 */
public class VehiculoImpl implements IVehiculo {

	
	@Autowired 
	private Vehiculo vehiculo;
	
	public static Logger LOG = LoggerFactory.getLogger(TrabajoFinalVisual2020Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto usuario en la BD
		LOG.info("La cuota fue guarda: "+ vehiculo.getTitular()+", "+vehiculo.getPatente()+", "+vehiculo.getNumeroChasis()+", "+vehiculo.getTipo()+", "+vehiculo.getModelo()+vehiculo.getMarca()+", "+vehiculo.getCalor());
	}

	@Override
	public Vehiculo mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de la vehiculo");
		return vehiculo;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino la vehiculo de bd");
	}

	@Override
	public Vehiculo modificar() {
		// TODO Auto-generated method stub
		return vehiculo;
	}

}
