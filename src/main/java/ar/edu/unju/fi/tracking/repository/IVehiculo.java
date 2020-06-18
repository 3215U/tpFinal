/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * @author grupo 6
 *
 */
public interface IVehiculo {
	public void guardar();
	public Vehiculo mostrar();
	public void eliminar();
	public Vehiculo modificar();
	
	

}
