package aula02;

public class Caneta {
	//Atributos:
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	//Métodos:
	//ps: void significa "sem retorno"
	void status () {
		System.out.println("Uma caneta "+this.cor+".");
		System.out.println("Modelo: "+this.modelo+".");
		System.out.println("Está tampada? "+this.tampada+".");
		System.out.println("Tamanho da ponta: "+this.ponta+".");
		System.out.println("Porcentagem de carga: "+this.carga+".");
	}
	void rabiscar () {
		if (this.tampada == true) {
			System.out.println("Você não pode rabiscar!");
		} else {
			System.out.println("Você está rabiscando :)");
		}
	}
	void tampar () {
		this.tampada = true;
	}
	void destampar () {
		this.tampada = false;
	}
	
}
