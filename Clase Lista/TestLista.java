package listas;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;
import listas.listas;
import listas.persona;
public class TestLista {
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
	public void testInsertar() throws Exception {
		
		
		boolean insertar = lista.insertar(mujer);
		
		boolean esperado = true;
		
		assertEquals(esperado,insertar);

	}
	
	
	

	
	
	

	


}
