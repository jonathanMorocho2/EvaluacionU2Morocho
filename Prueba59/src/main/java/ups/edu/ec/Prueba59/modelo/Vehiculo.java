
package ups.edu.ec.Prueba59.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehiculo {
	
	@Id
	
	@Column(name = "vehi_placa")
	private String placa ;
	
	@Column(name = "vehi_marca")
	private String marca ;
	
	@Column(name = "vehi_color")
	private String color;
	
	@Column(name = "vehi_modelo")
	private String modelo;
	
	
	/**
	 * 
	 * @return the placa
	 */

	public String getPlaca() {
		return placa;
	}
	
	/**
	 * 
	 * @param placa the placa to set 
	 */

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	/**
	 * 
	 * @return marca 
	 */

	public String getMarca() {
		return marca;
	}

	
	/**
	 * 
	 * @param placa the marca to set 
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	

}
