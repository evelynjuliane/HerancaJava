package br.com.model;

public class Veiculo {
	
	private String modelo;
	private int velocidade;
	private int passageiros;
	private int combustivel;
	
	public Veiculo() {
	}

	public Veiculo(String modelo, int velocidade, int passageiros, int combustivel) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	public void imprime() {
		System.out.println("Modelo:" + modelo + "\nvelocidade:" + velocidade + "\npassageiros:" + passageiros 
				+ "\ncombustivel:" + combustivel);
	}
}
