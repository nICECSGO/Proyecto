package cine;



public class Funciones {

	private int horario;
	private String nombrefuncion;
	private int asiento;
	
	public Funciones(int horario, String nombrefuncion, int asiento) {
		this.horario = horario;
		this.nombrefuncion = nombrefuncion;
		this.asiento = asiento;
	}

	public Funciones() {
		// TODO Auto-generated constructor stub
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getNombrefuncion() {
		return nombrefuncion;
	}

	public void setNombrefuncion(String nombrefuncion) {
		this.nombrefuncion = nombrefuncion;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	
	public void visualizar(Sala[] sala) {
		
	}
	
	
}
