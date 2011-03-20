package ProjetoJPA.Presentation;

import ProjetoJPA.DomainModel.*;

import ProjetoJPA.DataAccess.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*ClientesRepository repo = new ClientesRepository();
		Clientes obj = new Clientes();
		obj.setNome("blá blá");
		try {
			repo.Save(obj);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}*/
		ProdutoRepository prepo = new ProdutoRepository();
		Produto pobj = new Produto();
		pobj.setNome("Melancia");
		//pobj.setPrecoUnitario(2);
		try{
			prepo.Save(pobj);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}
