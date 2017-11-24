package br.edu.iffarroupilha.si16.modelo.dao;

/**
 * 
 * @author Marcos
 * <p>
 * Classe utilizada para definir o motoro de persist�ncia, ou seja o mecanismo de persist�ncia 
 * adotado pela aplica��o
 * </p>
 *
 */
public class FabricaDAO {
	
	private static IFabricaDAO fabrica ;
	
	/**
	 * Define a f�brica de DAO, ou seja, aponta para o objeto que sabe como construir objetos do tipo DAO
	 * @param _fabrica
	 */
	public static void defineFabrica (IFabricaDAO _fabrica){
		fabrica = _fabrica ; 
	}
	
	public static IFabricaDAO getFabrica(){
		if(fabrica == null){
			throw new RuntimeException(" Fabrica de DAO n�o definida!Chame o Metodo FabricaDAO.defineFabrica");
			
		}
		return fabrica ;
	}

}
