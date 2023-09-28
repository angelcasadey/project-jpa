/**
 * 
 */
package com.goca.projectjpa.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author angel
 * Clase que representa una entidad de subgenero
 */

@Entity
@Table(name = "subgenero")
public class SubGenero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long idSubgenero;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGenero")
	//@Cascade(CascadeType.PERSIST)
	//@Cascade(CascadeType.MERGE) Sirve para actualizar registros en cascada 
	@Cascade(CascadeType.REMOVE)
	private Genero genero;
	
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModficacion;
	
	@Column(name = "estatus")
	private boolean estatus;

	/**
	 * @return the idSubgenero
	 */
	public Long getIdSubgenero() {
		return idSubgenero;
	}

	/**
	 * @param idSubgenero the idSubgenero to set
	 */
	public void setIdSubgenero(Long idSubgenero) {
		this.idSubgenero = idSubgenero;
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
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
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
