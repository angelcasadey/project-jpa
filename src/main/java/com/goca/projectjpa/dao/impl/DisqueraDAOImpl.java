/**
 * @author angel
 * Clase que implementa las transacciones para la tabla Disquera.
 */
package com.goca.projectjpa.dao.impl;

import java.util.List;

import com.goca.projectjpa.dao.DisqueraDAO;
import com.goca.projectjpa.entity.Disquera;
import com.mysql.cj.protocol.result.AbstractResultsetRow;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * 
 */
public class DisqueraDAOImpl implements DisqueraDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceGOCA");

	@Override
	public void guardar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(disquera);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.clear();
		}

	}

	@Override
	public void actualizar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(disquera);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.clear();
		}

	}

	@Override
	public void eliminar(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		Disquera disqueraConsultada = em.find(Disquera.class, id);

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(disqueraConsultada);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.clear();
		}

		
	}

	@Override
	public List<Disquera> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		TypedQuery<Disquera> queryDisquera = (TypedQuery<Disquera>) em.createQuery("FROM Disquera ORDER BY descripcion");
		
		return queryDisquera.getResultList();
	}

	@Override
	public Disquera consultarById(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		Disquera disqueraConsultada = em.find(Disquera.class, id);
		if (disqueraConsultada == null) {
			throw new EntityNotFoundException("La disquera con id " + id + " no se encontro");
		}
		return disqueraConsultada;
	}

}
