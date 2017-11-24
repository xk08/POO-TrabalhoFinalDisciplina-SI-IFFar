package br.edu.iffarroupilha.dao.relacional;

import org.hibernate.Session;

import br.edu.iffarroupilha.si16.modelo.CategoriaCurso;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		CategoriaCurso cat = new CategoriaCurso();
		cat.setDescricao("Programação");
	
		
		Session s =
		 HibernateConnection.getFactory().openSession();
		s.beginTransaction();
		s.save(cat);
		s.getTransaction().commit();
		s.close();
	
	}
	
}
