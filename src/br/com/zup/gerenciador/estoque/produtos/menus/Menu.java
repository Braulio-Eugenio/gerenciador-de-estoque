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
			System.out.println("Você esta no menu Estoque de Limpeza escolha as opcões :");
			System.out.println("[1] Para cadastrar produto.");
			System.out.println("[2] Para remover um produto.");
			System.out.println("[3] Para alterar o preço de todos os produtos.");
			System.out.println("[4] Para alterar o preço de um produto.");
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
 * Nos submenus de produtos alimentícios e de limpeza de ofereça opções para
 * utilizar todos os seus métodos e ofereça ao usuário as interações necessárias
 * (ler do teclado as informações num caso de cadastro por exemplo) e a opção de
 * retornar ao menu anterior.
 * 
 */