/**
 * 
 */
package com.goca.projectjpa.dao;

import java.util.List;

import com.goca.projectjpa.entity.Disquera;

/**
 * @author angel
 * Interface que genera el DAO para las transacciones del CRUD a la tabla de la disquera.
 */
public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	void actualizar(Disquera disquera);
	void eliminar(Long id);
	List<Disquera> consultar();
	Disquera consultarById(Long id);

}
