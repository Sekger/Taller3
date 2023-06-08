public class Evento {

	SalaEvento domo;
	private String tipo;



	public Evento(){
		tipo= this.tipo;
	}
	public Evento(String nuevoTipo) {
		this.tipo= nuevoTipo;

	}
	public String asignarTipo(){
		String[] a = new String[2];
		a[0]="Formal";
		a[1]="Informal";
		int b = (int) (Math.random()*2+1);
		return a[b];
	}

	public String getTipo() {
		return this.tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Evento{" +
				"tipo='" + tipo + '\'' +
				'}';
	}
}