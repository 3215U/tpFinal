/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import org.springframework.stereotype.Component;

/**
 * @author grupo 6
 *
 */

@Component
public class Tripulante {
	String documento;
	String apellido;
	String nombres;
	String nacionalida;
	public Tripulante() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Tripulante(String documento, String apellido, String nombres, String nacionalida) {
		super();
		this.documento = documento;
		this.apellido = apellido;
		this.nombres = nombres;
		this.nacionalida = nacionalida;
	}

	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNacionalida() {
		return nacionalida;
	}
	public void setNacionalida(String nacionalida) {
		this.nacionalida = nacionalida;
	}
	@Override
	public String toString() {
		return "Tripulante [documento=" + documento + ", apellido=" + apellido + ", nombres=" + nombres
				+ ", nacionalida=" + nacionalida + "]";
	}
	
	
	
}
