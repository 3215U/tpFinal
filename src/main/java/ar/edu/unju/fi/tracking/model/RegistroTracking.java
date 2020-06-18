/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author grupo 6
 *
 */
public class RegistroTracking {
	LocalDateTime fechaHora;
	Vehiculo vehiculo;
	List<Tripulante> tripulantes;
	Localidad localidad;
	String detalleLugarRegistro;
}
