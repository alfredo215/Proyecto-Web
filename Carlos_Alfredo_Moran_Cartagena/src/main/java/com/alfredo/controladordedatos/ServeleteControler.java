package com.alfredo.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alfredo.model.Cliente;


/**
 * Servlet implementation class ServeleteControler
 */
public class ServeleteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String acction=request.getParameter("btn");
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Carlos_Alfredo_Moran_Cartagena");
		em = emf.createEntityManager();
		
		Cliente cl = new Cliente();
		
		try {
			
		
		String id = request.getParameter("Id");
		String nombrepr = request.getParameter("Unombre");
		String apellidopr = request.getParameter("Uapellido");
		String edadpr = request.getParameter("Uedad");
		String direccionpr = request.getParameter("Udireccion");
		String duipr = request.getParameter("Udui");
		String nitpr = request.getParameter("Unit");
		String grupopr = request.getParameter("Ugrupo");
		String notapr = request.getParameter("Unota");
		
		cl.setId(Integer.parseInt(id));
		cl.setNombre(nombrepr);
		cl.setApellido(apellidopr);
		cl.setEdad(Integer.parseInt(edadpr));
		cl.setDireccion(direccionpr);
		cl.setDui(duipr);
		cl.setNit(nitpr);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupopr));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(notapr));
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if (acction.equals("Guardar")) {
			
			em.getTransaction().begin();
			em.persist(cl);
			em.flush();
			em.getTransaction().commit();
			
		}else if (acction.equals("Actualizar")) {
			
			em.getTransaction().begin();
			em.merge(cl);
			em.flush();
			em.getTransaction().commit();
			
		}else if (acction.equals("Eliminar")) {
			
			cl = em.getReference(Cliente.class, cl.getId());
			em.getTransaction().begin();
			em.remove(cl);
			em.flush();
			em.getTransaction().commit();
			
		}
		
		response.sendRedirect("index.jsp");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
