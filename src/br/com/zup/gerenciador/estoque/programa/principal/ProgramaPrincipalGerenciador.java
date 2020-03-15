package br.com.zup.gerenciador.estoque.programa.principal;

import br.com.zup.gerenciador.estoque.mercado.EstoqueAlimenticio;
import br.com.zup.gerenciador.estoque.mercado.EstoqueLimpeza;
import br.com.zup.gerenciador.estoque.produtos.Produto;
import br.com.zup.gerenciador.estoque.produtos.ProdutoAlimenticio;
import br.com.zup.gerenciador.estoque.produtos.ProdutoLimpeza;

public class ProgramaPrincipalGerenciador {
	public static void main(String[] args) throws Exception {
		Produto candida = new ProdutoLimpeza(0f, 0f, "", 000000, "00/00/0000", "candidamesmo", "Banheiro");
		EstoqueLimpeza estoqueLimpeza = new EstoqueLimpeza();
		EstoqueAlimenticio estoqueAlimenticio = new EstoqueAlimenticio();

		System.out.println(estoqueLimpeza.cadastrarProduto(candida));
		
		String opcao = null;
		
		do {
			System.out.println("Ol� voc� esta no seu menu inicial !");
			System.out.println("[1] Para ir para o estoque de limpeza.");
			System.out.println("[2] Para ir para o estoque alimenticio.");
			System.out.println("[0] Para encerrar o dia.");
			
			
			
		}  while (opcao.equals("0") );
		
		

	}

}
/*
 * Programa Principal Ofere�a ao seu usu�rio a op��o de navega��o por um menu
 * onde ele pode decidir se quer trabalhar com o menu de produtos aliment�cios
 * ou de limpeza ou encerrar o dia. Nos submenus de produtos aliment�cios e de
 * limpeza de ofere�a op��es para utilizar todos os seus m�todos e ofere�a ao
 * usu�rio as intera��es necess�rias (ler do teclado as informa��es num caso de
 * cadastro por exemplo) e a op��o de retornar ao menu anterior.
 */



/* do {
System.out.println("Ol� voc� esta no seu menu inicial !");
System.out.println("[1] Para cadastrar o produto.");
System.out.println("[2] Para remover um produto.");
System.out.println("[3] Para alterar o pre�o de todos os produtos. ");
System.out.println("[4] Para alterar o pre�o de um produto.");
System.out.println("[5] Para consultar produtos.");
System.out.println("[6] Para lista de produtos.");
System.out.println("[7] Para quantidade de produto em estoque.");
System.out.println("[0] Para voltar ao menu anterior.");

}*/