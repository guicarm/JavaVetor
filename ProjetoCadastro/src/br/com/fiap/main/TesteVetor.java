package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteVetor {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		Aluno[] vetorAluno = new Aluno[3];
		
		int i = 0;
		
		do {
//================================= INSTANCIAR OBJETO ===================================
		vetorAluno[i] = new Aluno();
		vetorAluno[i].setNome(texto("Nome do aluno:"));
		vetorAluno[i].setRg(texto("RG do aluno:"));
		vetorAluno[i].setIdade(inteiro("Idade do aluno:"));
		vetorAluno[i].setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura do aluno: ")));
		vetorAluno[i].setRm(inteiro("RM do aluno: "));
		vetorAluno[i].setNota(inteiro("Nota do aluno: "));
			
		i ++;
		
		}while(JOptionPane.showConfirmDialog(null, "Adicionar aluno?", "ALUNOS",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);		
		
		
//================================ SAÍDA DE DADOS ==========================================
		for(int cont = 0; cont < i; cont ++) {
			System.out.println("============ ALUNO " + (cont + 1) + " ============" +
							"\nNOME: " + vetorAluno[cont].getNome() + 
							"\nRG: " + vetorAluno[cont].getRg() + 
							"\nIDADE: " + vetorAluno[cont].getIdade() + 
							"\nALTURA: " + vetorAluno[cont].getAltura() +
							"\nRM: " + vetorAluno[cont].getRm () +
							"\nNOTA: " + vetorAluno[cont].getNota());
	}
}
}

