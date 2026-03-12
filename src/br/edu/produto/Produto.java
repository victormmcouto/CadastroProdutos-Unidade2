package br.edu.produto;

public class Produto {

	String nome;
	double preco;
	static int quantidadeTotal = 0;

	public Produto() {
		quantidadeTotal++;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		quantidadeTotal++;
	}

	public void exibirDados() {
		System.out.println("Nome: " + nome + " | Preço: " + preco);
	}

	public static void exbirQuantidade() {
		System.out.println("Total de produtos: " + quantidadeTotal);
	}
}
