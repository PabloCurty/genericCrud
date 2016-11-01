package br.com.crud.generico.service;

import java.lang.reflect.InvocationTargetException;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.crud.generico.exception.AppServiceException;
import br.com.crud.generico.model.AbstractEntity;
import br.com.crud.generico.repository.AbstractRepository;

public abstract class AbstractService<E extends AbstractEntity> {

	private Class<E> entityClass;

	protected abstract AbstractRepository<E> getRepository();

	public AbstractService() {
		super();
	}

	public AbstractService(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
	public E find(String oid) throws AppServiceException {
		try {
			return getRepository().find(oid);
		} catch (Exception e) {
			throw new AppServiceException("ERROR_SERVICE_LEVEL_GET_BY_ID");
		}
	}

}
