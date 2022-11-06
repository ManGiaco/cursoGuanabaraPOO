package aula03;

public class Caneta {
	//Atributos:
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	//Métodos:
	//ps: void significa "sem retorno"
	public void status () {
		System.out.println("Modelo: "+this.modelo+".");
		System.out.println("Uma caneta "+this.cor+".");
		System.out.println("Tamanho da ponta: "+this.ponta+".");
		System.out.println("Porcentagem de carga: "+this.carga+".");
		System.out.println("Está tampada? "+this.tampada+".");
	}
	public void rabiscar () {
		if (this.tampada == true) {
			System.out.println("Você não pode rabiscar!");
		} else {
			System.out.println("Você está rabiscando :)");
		}
	}
	protected void tampar () {
		this.tampada = true;
	}
	protected void destampar () {
		this.tampada = false;
	}
	
}
