/**
 * 
 */
package com.goca.projectjpa.entity;



import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author angel
 * Clase que representa el entity que mappea a la tabla de disquera con JPA
 */
@Entity
@Table(name = "disquera")
public class Disquera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDisquera")
	private Long idDisquera;
	
	@Column(name = "descripcion",length = 100)
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModficacion;
	
	@Column(name = "estatus")
	private boolean estatus;
	/**
	 * @return the id
	 */
	public Long getId() {
		return idDisquera;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.idDisquera = id;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the fechaModficacion
	 */
	public LocalDateTime getFechaModficacion() {
		return fechaModficacion;
	}
	/**
	 * @param fechaModficacion the fechaModficacion to set
	 */
	public void setFechaModficacion(LocalDateTime fechaModficacion) {
		this.fechaModficacion = fechaModficacion;
	}
	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	

}
