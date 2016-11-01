package br.com.crud.generico.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.crud.generico.model.Pessoa;
import br.com.crud.generico.repository.AbstractRepository;
import br.com.crud.generico.repository.PessoaRepository;

@Stateless
public class PessoaService extends AbstractService<Pessoa>{

	@Inject
	private PessoaRepository pessoaRepository;
	
	public PessoaService(){
        super(Pessoa.class);
    }
	
	@Override
	protected AbstractRepository<Pessoa> getRepository() {
		return this.pessoaRepository;
	}

}
