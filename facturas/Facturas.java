package facturas;

private class Facturas implements IFacturas {
	
	public static void main (String [] args)  {
		
		int num;
		float base;
		float tipoIva;
		protected Estados estado;
		
	}


	public void cambiarEstado(Estados estado) {
		// TODO Auto-generated method stub
		
	}

	//Metodo implementado
	public float getTotal() {
		return base + (base * tipoIva);
	}

	//Metodo implementado
	public float getCantidadIva() {
		return base * tipoIva;
	}

	
	
	
}