package com.alfredo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alfredo.model.Cliente;

public class ClienteDao {

	public List<Cliente> clienteLista() {
		List<Cliente> listacl = new ArrayList<>();
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("Carlos_Alfredo_Moran_Cartagena");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			listacl = em.createQuery("from Cliente").getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		return listacl;
	}
	
	public void agregarDatos(Cliente cl) {
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("Carlos_Alfredo_Moran_Cartagena");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cl);
		em.flush();
		em.getTransaction().commit();
	};
	
	public void actualizarDatos(Cliente cl) {
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("Carlos_Alfredo_Moran_Cartagena");
		em = emf.createEntityManager();		
		
		cl.getId();
		cl.getNombre();
		cl.getApellido();
		cl.getDireccion();
		cl.getDui();
		cl.getNit();
		cl.getEdad();
		cl.getGrupoDeClaseProgramacion3Alquepertenece();
		cl.getUtimaNotaObtenidaEnProgramacion2();
		em.getTransaction().begin();
		em.merge(cl);
		em.flush();
		em.getTransaction().commit();
	};
	
	public void eliminarDatos(Cliente cl) {
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("Carlos_Alfredo_Moran_Cartagena");
		em = emf.createEntityManager();	
		
		cl = em.getReference(Cliente.class, cl.getId());
		em.getTransaction().begin();
		em.remove(cl);
		em.flush();
		em.getTransaction().commit();
	};
	
	
}
