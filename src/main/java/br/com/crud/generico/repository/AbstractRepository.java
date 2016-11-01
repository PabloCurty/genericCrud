package br.com.crud.generico.repository;


import javax.persistence.EntityManager;

import br.com.crud.generico.model.AbstractEntity;

public abstract class AbstractRepository<T extends AbstractEntity> {
	
	private Class<T> entityClass;
	
	protected abstract EntityManager getEntityManager();
	
	public AbstractRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

	public T find(String oid) {
		return getEntityManager().find(entityClass, oid);
	}
	
	

}
