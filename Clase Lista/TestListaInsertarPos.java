package listas;

import static org.junit.Assert.*;

import org.junit.*;
import listas.listas;
import listas.persona;
public class TestListaInsertarPos {

	listas lista;
	persona hombre = new persona("Alex");	
	persona mujer = new persona("Adriana");
	@Before
	public void crear_objeto()
	{
		lista = new listas(5);
		
		
	}
	
	@After
	public void borrar_objeto()
	{
		lista = null;
	}
	
	@Test
	public void testIngresoPosBien()throws Exception {
		
		
		
		boolean insertar = lista.insertar(mujer,1);
		 insertar = lista.insertar(mujer,3);
		boolean esperado = true;
		
		assertEquals(esperado, insertar);
		
	}

}
