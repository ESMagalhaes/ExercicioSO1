package view;
import controller.Exercicio1SO1;
import javax.swing.*;

public class Ex1SO1viewer {

	public static void main(String[] args) {
		Exercicio1SO1 ex1so = new Exercicio1SO1();
		int size = Integer.parseInt(JOptionPane.showInputDialog("insira o tamanho do vetor: "));
		
		ex1so.vetorTempo(size);

	}

}
