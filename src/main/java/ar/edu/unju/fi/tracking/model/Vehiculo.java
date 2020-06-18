/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author grupo 6
 *
 */
public class Vehiculo {
	@Autowired
	String patente;
	@Autowired
	String calor;
	@Autowired
	String titular;
	@Autowired
	String marca;
	@Autowired
	String modelo;
	@Autowired
	String tipo;
	@Autowired
	String numeroChasis;
	@Autowired
	String numeroMotor;
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	public Vehiculo(String patente, String calor, String titular, String marca, String modelo, String tipo,
			String numeroChasis, String numeroMotor) {
		super();
		this.patente = patente;
		this.calor = calor;
		this.titular = titular;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.numeroChasis = numeroChasis;
		this.numeroMotor = numeroMotor;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getCalor() {
		return calor;
	}
	public void setCalor(String calor) {
		this.calor = calor;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumeroChasis() {
		return numeroChasis;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	public String getNumeroMotor() {
		return numeroMotor;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", calor=" + calor + ", titular=" + titular + ", marca=" + marca
				+ ", modelo=" + modelo + ", tipo=" + tipo + ", numeroChasis=" + numeroChasis + ", numeroMotor="
				+ numeroMotor + "]";
	}
	
	
}
