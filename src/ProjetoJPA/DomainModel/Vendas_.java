package ProjetoJPA.DomainModel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-03-20T03:33:24.486-0300")
@StaticMetamodel(Vendas.class)
public class Vendas_ {
	public static volatile SingularAttribute<Vendas, Integer> codigo;
	public static volatile SingularAttribute<Vendas, Clientes> cliente;
	public static volatile SingularAttribute<Vendas, Date> data;
	public static volatile SingularAttribute<Vendas, Float> valortotal;
}
