/**
 * 
 */
package main.principal.services;

import main.principal.dao.IProdutoDAO;
import main.principal.domain.Produto;
import main.principal.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
