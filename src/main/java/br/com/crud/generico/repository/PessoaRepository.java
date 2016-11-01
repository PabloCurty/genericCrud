package br.com.crud.generico.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.crud.generico.model.Pessoa;

@Stateless
public class PessoaRepository extends AbstractRepository<Pessoa>{

	@PersistenceContext
	private EntityManager em;
	
	public PessoaRepository(){
        super(Pessoa.class);
    }
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
