package br.com.zup.gerenciador.estoque.produtos.menus;

import java.util.Scanner;


import br.com.zup.gerenciador.estoque.mercado.EstoqueLimpeza;
import br.com.zup.gerenciador.estoque.produtos.Produto;

public class Menu  {

	public Menu ()   {
		
	}

	public void menuEstoqueLimpeza() {
		String opcao = "";
		do {
			
			Scanner teclado = new Scanner(System.in);
			
			EstoqueLimpeza estoque = new EstoqueLimpeza();
			System.out.println("Voc� esta no menu Estoque de Limpeza escolha as opc�es :");
			System.out.println("[1] Para cadastrar produto.");
			System.out.println("[2] Para remover um produto.");
			System.out.println("[3] Para alterar o pre�o de todos os produtos.");
			System.out.println("[4] Para alterar o pre�o de um produto.");
			System.out.println("[5] Para ver os produtos cadastrados.");
			System.out.println("[6] Para consultar produtos.");
			System.out.println("[7] Para consultar a quantidade de produtos.");
			System.out.println("[8] Para retornar ao menu anterior.");
			
			switch (opcao) {
			case "1":
				//cadatro de produto
				
				

			default:
				
			}
		} while (null != null);

	}

}
/*
 * Nos submenus de produtos aliment�cios e de limpeza de ofere�a op��es para
 * utilizar todos os seus m�todos e ofere�a ao usu�rio as intera��es necess�rias
 * (ler do teclado as informa��es num caso de cadastro por exemplo) e a op��o de
 * retornar ao menu anterior.
 * 
 */