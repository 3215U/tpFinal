/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author grupo 6
 *
 */
@Component
public class Localidad {
	@Autowired
	private String nombre;
	@Autowired
	public Localidad() {
		// TODO Auto-generated constructor stub
	}
	
	public Localidad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Localidad [nombre=" + nombre + "]";
	}
	
	
	
}
