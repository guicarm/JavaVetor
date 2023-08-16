package br.com.fiap.beans;

public class Professor extends Pessoa{

	private float salario;
	
	public Professor() {
		super();
	}
	public Professor(float salario) {
		super();
		this.salario = salario;
	}
// ----------- CONSTRUTOR COM HERANÇA
	public Professor(String nome, String rg, int idade, float altura, float salario) {
		super(nome, rg, idade, altura);
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
