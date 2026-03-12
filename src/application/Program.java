package application;

import br.edu.produto.Produto;

public class Program {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV", 4500.99);
		Produto p2 = new Produto();
		Produto p3 = new Produto("Geladeira", 5000.58);
		
		p1.exibirDados();
		p2.exibirDados();
		p3.exibirDados();
		
		Produto.exbirQuantidade();
	}

}
