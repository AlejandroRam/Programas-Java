package listas;

public class listas {

	protected Object[] contenedor;
	protected int num_elementos;
	protected int elementos_reales = 0;

	public listas() {

	}

	public listas(int tam) {
		contenedor = new Object[tam];
		this.num_elementos = tam;
	}

	public boolean insertar(Object objeto) throws Exception {
		boolean exito = false;
		if (contenedor.length - 1 == (elementos_reales)) {
			throw new Exception("Fallo, lista completa");
		} else {
			contenedor[elementos_reales] = objeto;
			elementos_reales++;
			exito = true;
		}

		return exito;
	}

	public boolean insertar(Object objeto, int n) throws Exception {
		boolean exito = false;

		if (n > elementos_reales) {
			throw new Exception("posicion no disponible");
		} else if (elementos_reales == (num_elementos - 1)) {
			throw new Exception("fallo, lista completa");
		} else {
			contenedor[elementos_reales] = objeto;
			elementos_reales++;
			exito = true;

		}

		return exito;
	}

	public boolean eliminar(Object o) throws Exception {
		boolean exito = false;

		if (elementos_reales == 0) {
			throw new Exception("Fallo, no hay nada en la lista");
		} else {
			elementos_reales--;
		}

		return exito;
	}

	public boolean eliminar(Object o, int n) throws Exception {
		boolean exito = false;
		if (n > elementos_reales) {
			throw new Exception("no se puede borrar elemento inexistente");
		} else if (n < 0) {
			throw new Exception("Fallo");
		} else {

			for (int i = n; n < elementos_reales; n++) {

				contenedor[n] = contenedor[n + 1];
			}

		}

		return exito;
	}

	public Object devolver()
	{
		return contenedor[elementos_reales];
	}
	
	/*
	public Object devolver(int n)throws Exception
	{
		
	}*/
	
}
