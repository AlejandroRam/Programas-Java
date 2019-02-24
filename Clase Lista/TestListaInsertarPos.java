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
		
		
		lista.insertar(hombre);
		lista.insertar(hombre);
		lista.insertar(hombre,1);
		lista.insertar(hombre,2);
		boolean insertar = lista.insertar(mujer,5);

		boolean esperado = true;
		
		assertEquals(esperado, insertar);
		
	}


}
