/**
 * 
 */
package com.goca.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.goca.projectjpa.dao.SubGeneroDAO;
import com.goca.projectjpa.dao.impl.SubGeneroDAOImpl;
import com.goca.projectjpa.entity.Genero;
import com.goca.projectjpa.entity.SubGenero;

import jakarta.persistence.EntityManager;

/**
 * @author angel Clase Test para comprobar el funcionamiento del CRUD subgenero
 */
class SubGeneroDAOImplTest {

	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.goca.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.SubGeneroDAOImpl#actualizar(com.goca.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado =	this.subGeneroDAO.consultarById(7L);
		
		subGeneroConsultado.getGenero().setDescripcion("Metal Trash");
		subGeneroConsultado.setDescripcion("Trash Metal");
		
		
		this.subGeneroDAO.actualizar(subGeneroConsultado);
		
	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(7L);
	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados = this.subGeneroDAO.consultar();

		assertTrue(subGenerosConsultados.size() > 0);

		for (SubGenero subGenero : subGenerosConsultados) {
			System.out.println("Genero: " + subGenero.getGenero().getDescripcion());
			System.out.println("Subgenero: " + subGenero.getDescripcion());

		}

	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}


}
