package cine;

public class Sala {

	private int numesala;
	private int valorasiento;
	private int cantidadasiento;
	
	
	
	public Sala(int numesala, int valorasiento, int cantidadasiento) {
		this.numesala = numesala;
		this.valorasiento = valorasiento;
		this.cantidadasiento = cantidadasiento;
	}

	public int getNumesala() {
		return numesala;
	}

	public void setNumesala(int numesala) {
		this.numesala = numesala;
	}

	public int getValorasiento() {
		return valorasiento;
	}

	public void setValorasiento(int valorasiento) {
		this.valorasiento = valorasiento;
	}

	public int getCantidadasiento() {
		return cantidadasiento;
	}

	public void setCantidadasiento(int cantidadasiento) {
		this.cantidadasiento = cantidadasiento;
	}
	
	
	
}
