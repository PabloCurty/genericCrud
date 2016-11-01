package br.com.crud.generico.control;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import br.com.crud.generico.model.Pessoa;
import br.com.crud.generico.service.AbstractService;

@RunWith(JUnit4.class)
public class FindEntityTest {

	/*@Test
	public void createEntityPessoa() {
		AbstractService findEntity = new AbstractService
		Class<?> klass;
		try {
			klass = Class.forName("br.com.crud.generico.model.Pessoa");
			assertEquals(klass.getName() , findEntity.createEntity(klass, "1").getClass().getName());
		} catch (ClassNotFoundException e) {
			fail();
			e.printStackTrace();
		} catch (SecurityException e) {
			fail();
			e.printStackTrace();
		}
		
	}*/
	
	/*@Test
	public void buscaEntityPessoa() {
		Class<?> klass;
		
		try {
			ControlEntity findEntity = new ControlEntity();
			klass = Class.forName("br.com.crud.generico.model.Pessoa");
			Object obj = findEntity.FindEntity(klass, 1);
		} catch (ClassNotFoundException e) {
			fail();
			e.printStackTrace();
		}
		
		
	}*/

}
