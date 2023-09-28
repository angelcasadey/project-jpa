/**
 * 
 */
package com.goca.projectjpa.dao;

import java.util.List;

import com.goca.projectjpa.entity.SubGenero;

/**
 * @author angel
 * Interface DAO que realiza el CRUD con JPA para la tabla de subgenero
 */
public interface SubGeneroDAO {
	
	/**
	 * Metodo que permite guardar un subgenero
	 * @param subGenero {@link SubGenero} objeto a guardar
	 */
	void guardar(SubGenero subgenero);
	
	/**
	 * Metodo que permite actualizar un subgenero.
	 * @param subGenero {@link SubGenero} objeto a actualizar
	 */
	void actualizar(SubGenero subgenero);
	
	
	/**
	 * Metodo que permite eliminar un subgenero por su identificador.
	 * @param id{@link Long} indentificador del subgenero a eliminar
	 */
	void eliminar(Long id);
	
	
	/**
	 * Metodo que permite consultar la lista de subgeneros.
	 * @return{link List} lista de subgeneros consultados.
	 */
	List<SubGenero> consultar();
	
	/**
	 * Metodo que permite consultar un SubGenero a partir de su identificador.
	 * @param id {@link Long} identificador del subgenero a consultar.
	 * @return{@link SubGenero} un objeto subgenero consultado.
	 */
	SubGenero consultarById(Long id);
	
	

}
