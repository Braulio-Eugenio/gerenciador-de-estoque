package br.com.zup.gerenciador.estoque.programa.principal;

import java.util.Scanner;

import br.com.zup.gerenciador.estoque.mercado.EstoqueAlimenticio;
import br.com.zup.gerenciador.estoque.mercado.EstoqueLimpeza;
import br.com.zup.gerenciador.estoque.produtos.Produto;
import br.com.zup.gerenciador.estoque.produtos.ProdutoAlimenticio;
import br.com.zup.gerenciador.estoque.produtos.ProdutoLimpeza;
import br.com.zup.gerenciador.estoque.produtos.menus.Menu;

public class ProgramaPrincipalGerenciador extends Menu {
	public static void main(String[] args) throws Exception {
		EstoqueLimpeza estoqueLimpeza = new EstoqueLimpeza();
		EstoqueAlimenticio estoqueAlimenticio = new EstoqueAlimenticio();

		Scanner teclado = new Scanner(System.in);
		int opcao = 0;

		do {
			System.out.println("Olá você esta no seu menu inicial !");
			System.out.println("[1] Para ir para o estoque de limpeza.");
			System.out.println("[2] Para ir para o estoque alimenticio.");
			System.out.println("[0] Para encerrar o dia.");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				subMenuLimpeza(estoqueLimpeza, teclado);
				break;
			case 2:
				subMenuAlimenticio(estoqueAlimenticio, teclado);
				break;
			}

		} while (opcao != 0);

	}

	public static int subMenuAlimenticio(EstoqueAlimenticio estoqueAlimenticio, Scanner teclado) {
		int opcao;
		do {
			
			System.out.println("Você esta no menu Estoque alimenticio escolha as opcões :");
			System.out.println("[1] Para cadastrar produto.");
			System.out.println("[2] Para remover um produto.");
			System.out.println("[3] Para alterar o preço de todos os produtos.");
			System.out.println("[4] Para alterar o preço de um produto.");
			System.out.println("[5] Para ver os produtos cadastrados.");
			System.out.println("[6] Para consultar produtos.");
			System.out.println("[7] Para consultar a quantidade de produtos.");
			System.out.println("[0] Para retornar ao menu anterior.");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				cadastraProdutoAlimenticio(estoqueAlimenticio, teclado);

				break;
			case 2:
				removeProdutoAlimenticio(estoqueAlimenticio, teclado);
				break;
			case 3:
				alteraPrecoDeTodosProdutosAlimenticios(estoqueAlimenticio, teclado);
				break;
			case 4:
				alteraPrecoDeUmProdutoAlimenticio(estoqueAlimenticio, teclado);
				break;
			case 5:
				estoqueAlimenticio.listaProduto();
				break;
			case 6:
				consultaProduto(estoqueAlimenticio, teclado);
				break;
			case 7:
				estoqueAlimenticio.quantidadeProdutosEmEstoque();
				break;
			case 0:
				break;
			}
		} while (opcao != 0);
		return opcao;
	}

	private static void consultaProduto(EstoqueAlimenticio estoqueAlimenticio, Scanner teclado) {
		System.out.println("Digite o código de barras para consultar o produto");
		int codigoDeBarras = teclado.nextInt();
		estoqueAlimenticio.consultaProduto(codigoDeBarras);
	}

	private static void alteraPrecoDeUmProdutoAlimenticio(EstoqueAlimenticio estoqueAlimenticio, Scanner teclado) {
		System.out.println("Digite o código de barras para encontrar e alterar o preço do produto:");
		int codigoDeBarras = teclado.nextInt();
		System.out.println("Digite o valor a ser aumentado");
		float porcentagem = teclado.nextFloat();
		boolean aumenta = true;
		estoqueAlimenticio.alteraPrecoProduto(porcentagem, aumenta, codigoDeBarras);
	}

	private static void cadastraProdutoAlimenticio(EstoqueAlimenticio estoqueAlimenticio, Scanner teclado) {
		System.out.println("Digite o nome do produto: ");
		String nome = teclado.next();
		System.out.println("Digite a data do produto: ");
		String dataValidade = teclado.next();
		System.out.println("Digite o preço de custo:");
		float precoCusto = teclado.nextFloat();
		System.out.println("Digite o preço de venda:");
		float precoVenda = teclado.nextFloat();
		System.out.println("Digite o código de barra:");
		int codigoDeBarras = teclado.nextInt();
		System.out.println("Digite a origem:");
		String origem = teclado.next();
		Produto produtoAlimenticio = new ProdutoAlimenticio(precoCusto, precoVenda, nome, codigoDeBarras, dataValidade,
				origem);
		estoqueAlimenticio.cadastrarProduto(produtoAlimenticio);
	}

	private static void alteraPrecoDeTodosProdutosAlimenticios(EstoqueAlimenticio estoqueAlimenticio, Scanner teclado) {
		System.out.println("Digite o valor a ser auterado:");
		float porcentagem = teclado.nextFloat();
		boolean aumenta = true;
		estoqueAlimenticio.alteraPrecoProdutos(porcentagem, aumenta);
	}

	private static void removeProdutoAlimenticio(EstoqueAlimenticio estoqueAlimenticio, Scanner teclado) {
		System.out.println("Digite o código de barras para remover um produto:");
		int codigoDeBarra = teclado.nextInt();
		estoqueAlimenticio.removeProduto(codigoDeBarra);
	}

	private static void removeProdutoDeLimpeza(EstoqueLimpeza estoqueLimpeza, Scanner teclado) {
		System.out.println("Digite o código de barra para remover:");
		int codigoDeBarras = teclado.nextInt();
		estoqueLimpeza.removeProduto(codigoDeBarras);
	}

	public static int subMenuLimpeza(EstoqueLimpeza estoqueLimpeza, Scanner teclado) {
		int opcao;
		System.out.println("Você esta no menu Estoque de Limpeza escolha as opcões :");
		System.out.println("[1] Para cadastrar produto.");
		System.out.println("[2] Para remover um produto.");
		System.out.println("[3] Para alterar o preço de todos os produtos.");
		System.out.println("[4] Para alterar o preço de um produto.");
		System.out.println("[5] Para ver os produtos cadastrados.");
		System.out.println("[6] Para consultar produtos.");
		System.out.println("[7] Para consultar a quantidade de produtos.");
		System.out.println("[0] Para retornar ao menu anterior.");
		opcao = teclado.nextInt();
		return opcao;
	}

	public static void cadastrarProdutoDelimpeza(EstoqueLimpeza estoqueLimpeza, Scanner teclado) {
		System.out.println("Digite o nome do produto: ");
		String nome = teclado.next();
		System.out.println("Digite a data do produto: ");
		String dataValidade = teclado.next();
		System.out.println("Digite o preço de custo:");
		float precoCusto = teclado.nextFloat();
		System.out.println("Digite o preço de venda:");
		float precoVenda = teclado.nextFloat();
		System.out.println("Digite o código de barra:");
		int codigoDeBarras = teclado.nextInt();
		System.out.println("Digite o aroma:");
		String aroma = teclado.next();
		System.out.println("Digite a parte de casa:");
		String parteDaCasa = teclado.next();
		Produto produto = new ProdutoLimpeza(precoCusto, precoVenda, nome, codigoDeBarras, dataValidade, aroma,
				parteDaCasa);
		estoqueLimpeza.cadastrarProduto(produto);
	}

}
