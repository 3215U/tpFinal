/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author grupo 6
 *
 */

@Component
public class RegistroTracking {
	@Autowired
	LocalDateTime fechaHora;
	@Autowired
	Vehiculo vehiculo;
	@Autowired
	List<Tripulante> tripulantes;
	@Autowired
	Localidad localidad;
	@Autowired
	String detalleLugarRegistro;
	
	public RegistroTracking() {
		// TODO Auto-generated constructor stub
	}

	public RegistroTracking(LocalDateTime fechaHora, Vehiculo vehiculo, List<Tripulante> tripulantes,
			Localidad localidad, String detalleLugarRegistro) {
		super();
		this.fechaHora = fechaHora;
		this.vehiculo = vehiculo;
		this.tripulantes = tripulantes;
		this.localidad = localidad;
		this.detalleLugarRegistro = detalleLugarRegistro;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public List<Tripulante> getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(List<Tripulante> tripulantes) {
		this.tripulantes = tripulantes;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public String getDetalleLugarRegistro() {
		return detalleLugarRegistro;
	}

	public void setDetalleLugarRegistro(String detalleLugarRegistro) {
		this.detalleLugarRegistro = detalleLugarRegistro;
	}

	@Override
	public String toString() {
		return "RegistroTracking [fechaHora=" + fechaHora + ", vehiculo=" + vehiculo + ", tripulantes=" + tripulantes
				+ ", localidad=" + localidad + ", detalleLugarRegistro=" + detalleLugarRegistro + "]";
	}
	
	
}
