package br.com.fiap.beans;

public class Aluno extends Pessoa{

	private int rm;
	private float nota;
	
	public Aluno() {
		super();
	}
	public Aluno(int rm, float nota) {
		super();
		this.rm = rm;
		this.nota = nota;
	}

// ----------- CONSTRUTOR COM HERANÇA
	public Aluno(String nome, String rg, int idade, float altura, int rm, float nota) {
		super(nome, rg, idade, altura);
		this.rm = rm;
		this.nota = nota;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
}
