package controller;

public class Exercicio1SO1 {

	public Exercicio1SO1() {
		super();
	}

	public void vetorTempo(int size) { // recebendo o tamanho da classe view
		int[] vt = new int[size]; // utiliza a variável como tamanho do vetor

		long timeInicial = System.nanoTime(); // recebe o tempo de início do preenchimento do vetor

		for (int i = 0; i < vt.length; i++) {// utiliza-se .length para se adaptar a qualquer valor usado como tamanho
												// ao invés de ser "chumbado"
			vt[i] = 0;
		}

		long timeFinal = System.nanoTime(); // recebe o tempo de conclusão do preenchimento do vetor

		double timeTotal = timeFinal - timeInicial; // calcula o tempo percorrido em nanosegundos
		timeTotal = timeTotal / Math.pow(10, 9); // tranforma nanosegundos em segundos

		System.out.println("Tempo gasto para preencher um vetor de " + size + " posições: " + timeTotal + " segundos");
	}

}
