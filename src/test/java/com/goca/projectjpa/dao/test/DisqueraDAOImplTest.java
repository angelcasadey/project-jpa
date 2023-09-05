/**
 * 
 */
package com.goca.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.goca.projectjpa.dao.impl.DisqueraDAOImpl;
import com.goca.projectjpa.entity.Disquera;

/**
 * 
 */
class DisqueraDAOImplTest {

	private DisqueraDAOImpl disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.DisqueraDAOImpl#guardar(com.goca.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("DiabloRecords");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);

		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.DisqueraDAOImpl#actualizar(com.goca.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {

		Disquera disqueraConsultada = this.disqueraDAO.consultarById(9L);
		disqueraConsultada.setDescripcion("Disquera AppleRecord");
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.DisqueraDAOImpl#eliminar(com.goca.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Long id = 9L;
		
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> disqueraConsultada = this.disqueraDAO.consultar();
		assertTrue(disqueraConsultada.size() > 0);
		disqueraConsultada.forEach(disquera ->{
			System.out.println("Disquera: " + disquera.getDescripcion());
		});
	}

	/**
	 * Test method for
	 * {@link com.goca.projectjpa.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(11L);
		System.out.println("Disquera: " + disquera.getDescripcion());
	}

}
