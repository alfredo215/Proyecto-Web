package com.alfredo.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alfredo.DAO.ClienteDao;
import com.alfredo.model.Cliente;
import com.google.gson.Gson;


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
		
		Cliente cl = new Cliente();
		ClienteDao cld = new ClienteDao();
		
		String id = null;
		String nombrepr = null;
		String apellidopr = null;
		String edadpr = null;
		String direccionpr = null;
		String duipr = null;
		String nitpr = null;
		String grupopr = null;
		String notapr = null;
		
		try {
		 id= request.getParameter("Id");
		 nombrepr= request.getParameter("Unombre");
		 apellidopr= request.getParameter("Uapellido");
		 edadpr= request.getParameter("Uedad");
		 direccionpr= request.getParameter("Udireccion");
		 duipr= request.getParameter("Udui");
		 nitpr= request.getParameter("Unit");
		 grupopr= request.getParameter("Ugrupo");
		 notapr= request.getParameter("Unota");
		 
			cl.setId(Integer.parseInt(id));
			cl.setNombre(nombrepr);
			cl.setApellido(apellidopr);
			cl.setEdad(Integer.parseInt(edadpr));
			cl.setDireccion(direccionpr);
			cl.setDui(duipr);
			cl.setNit(nitpr);
			cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupopr));
			cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(notapr));
		}catch (Exception e) {
			
		}
		

		
		String acction=request.getParameter("btn");
		
		if(acction.equals("Guardar")) {
		cl.setId(Integer.parseInt(id));
		cl.setNombre(nombrepr);
		cl.setApellido(apellidopr);
		cl.setEdad(Integer.parseInt(edadpr));
		cl.setDireccion(direccionpr);
		cl.setDui(duipr);
		cl.setNit(nitpr);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupopr));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(notapr));
		
		cld.agregarDatos(cl);
		}
		else if(acction.equals("Actualizar")) {
		cl.setId(Integer.parseInt(id));
		cl.setNombre(nombrepr);
		cl.setApellido(apellidopr);
		cl.setEdad(Integer.parseInt(edadpr));
		cl.setDireccion(direccionpr);
		cl.setDui(duipr);
		cl.setNit(nitpr);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupopr));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(notapr));
		
		cld.actualizarDatos(cl);
		}
		else if(acction.equals("Eliminar")) {
			cl.setId(Integer.parseInt(id));
			
			cld.eliminarDatos(cl);
		};
		response.sendRedirect("index.jsp");
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ClienteDao cldao = new ClienteDao();
		Gson json = new Gson();
		
		try {
			response.getWriter().append(json.toJson(cldao.clienteLista()));
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		


		
		
	}

}
