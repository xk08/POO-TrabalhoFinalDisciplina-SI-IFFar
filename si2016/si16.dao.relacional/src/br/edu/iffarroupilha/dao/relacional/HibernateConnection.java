package br.edu.iffarroupilha.dao.relacional;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import br.edu.iffarroupilha.si16.modelo.CategoriaCurso;
import br.edu.iffarroupilha.si16.modelo.Usuario;

/**
 * <p>
 * Estabelecer a conexao com banco de dados, 
 * toda sessao de comunicação será provida por esta classe.
 * </p>
 *
 * @author Prof. Fernando
 * @since 16/11/2017 19:45:18
 */
public class HibernateConnection {

	private static SessionFactory sf;
	
	public static SessionFactory getFactory(){
		if(sf == null){
			
			
			
			
			// inicializa-lo
			// A SessionFactory is set up once for an application!
			final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure() // configures settings from hibernate.cfg.xml
					.build();
			
			Metadata md = new MetadataSources( registry  )
			              .addAnnotatedClass(CategoriaCurso.class)
			              .addAnnotatedClass(Usuario.class)
			              .buildMetadata();
			
			
			
			try {
				sf =  md.buildSessionFactory(); 
				//sf = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
			}
			catch (Exception e) {
				// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
				// so destroy it manually.
				StandardServiceRegistryBuilder.destroy( registry );
				e.printStackTrace();
			}
		}
		return sf;
	}
	
	
}
