public class listas <T> {

	/*
	 * Elementos de la clase lista Primero un array de objetos Segundo tamaño del
	 * array tercero numero real de elementos deel array
	 */
	private T[] contenedor;
	private int num_elementos;
	private int elementos_reales = 0;
	private int elemento_fin ;
	/* Constructor vacío */
	public listas() {

	}

	/* Constructor paramatetro tamaño */
	public listas(int tam) {
		contenedor = (T[])new Object[tam];
		this.num_elementos = tam;
		elemento_fin = tam-1;
	}

	public boolean insertar(T objeto) throws Exception {
		boolean exito = false;

		 if (contenedor.length  == (elementos_reales)) {
			throw new Exception("Fallo, lista completa");
		} else {
			contenedor[elementos_reales] = objeto;
			elementos_reales++;
			exito = true;
		}

		return exito;
	}

	/*Metodo insertar posicion, introducimos un objeto y una posicion valida dentro del array, puede estar vacia o no la 
	 * posicion*/
	public boolean insertarPos(T objeto, int n) throws Exception {
		boolean exito = false;
		n = n-1;
		if (n > elementos_reales|| n<0) {
			throw new Exception("posicion no disponible");
		
		}else if(elementos_reales == (contenedor.length)) 
		{
			throw new Exception("Array lleno");
		}
		else {
			
			T aux = contenedor[n];
			T aux2;
			contenedor[n] = objeto;
			for(int i = n+1;i<elementos_reales;i++)
			{
				aux2 = contenedor[i];
				contenedor[i]=aux;
				aux = aux2;
			}
			
			elementos_reales++;
			exito = true;
		}

		return exito;
	}

	public boolean eliminar() throws Exception {
		boolean exito = false;

		if (elementos_reales == 0) {
			throw new Exception("Fallo, no hay nada en la lista");
		} else {
			elementos_reales--;
		}

		return exito;
	}

	public boolean eliminar(int n) throws Exception {
		boolean exito = false;
		if (n > elementos_reales) {
			throw new Exception("no se puede borrar elemento inexistente");
		} else if (n < 0) {
			throw new Exception("Fallo");
		} else {

			for (int i = n; i < elementos_reales; i++) {

				contenedor[i] = contenedor[i + 1];
			}
			elementos_reales--;
		}

		return exito;
	}


		public T devolver() throws Exception {
		
		T aux;
		if(elementos_reales == 0)
		{
			throw new Exception("Lista vacia");
		}else {
			aux= contenedor[elementos_reales-1];
		}
		
		return aux;
	}

	
	public T devolverPos(int pos) throws Exception
	{
		
		T aux;
		
		if(pos<0)
		{
			throw new Exception("Posicion no disponible");
		}else if(pos>elementos_reales)
		{
			throw new Exception("Posicion no disponible");
		}else {
			aux= contenedor[pos];
		}
		
		return aux;
	}

	public int length()
	{
		return num_elementos;
	}
	
	public int length_real()
	{
		return elementos_reales;
	}
	
}
