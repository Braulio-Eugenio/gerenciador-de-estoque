package br.com.zup.gerenciador.estoque.mercado;

import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.zup.gerenciador.estoque.produtos.Produto;
import br.com.zup.gerenciador.estoque.produtos.ProdutoAlimenticio;

public class EstoqueAlimenticio implements Estoque {
	private List<Produto> produtosAlimenticios = new ArrayList<Produto>();

	@Override
	public void alteraPrecoProdutos(float porcentagem, boolean aumenta) {
		for (int i = 0; i < produtosAlimenticios.size(); i++) {
			if (aumenta) {
				this.produtosAlimenticios.get(i).aumentaPrecoVenda(porcentagem);

			} else {

				this.produtosAlimenticios.get(i).diminuiPrecoVenda(porcentagem);
			}
		}

	}

	@Override
	public boolean cadastrarProduto(Produto produto) {
		if (produto instanceof ProdutoAlimenticio) {
			this.produtosAlimenticios.add(produto);
			return true;

		} else {

			return false;
		}

	}

	@Override
	public List<Produto> listaProduto() {
		return produtosAlimenticios;
	}

	@Override
	public boolean alteraPrecoProduto(float porcentagem, boolean aumenta, int codigoDeBarras) {
		for (Produto produto : produtosAlimenticios) {
			if (produto.getCodigoDeBarras() == codigoDeBarras) {
				if (aumenta) {
					produto.aumentaPrecoVenda(porcentagem);
				} else {
					produto.diminuiPrecoVenda(porcentagem);
				}
				return true;
			}
		}
		return false;

	}

	@Override
	public Produto consultaProduto(Integer codigoDeBarras) {
		for (Produto produto : produtosAlimenticios) {
			if (produto.getCodigoDeBarras() == codigoDeBarras) {
				return produto;
			}
		}
		return null;
	}

	@Override
	public boolean gravaListaProdutos() {
		try {
			FileWriter arquivo = new FileWriter("ListaEstoqueAlimenticio.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			gravaArquivo.print("produtos em estoque");
			for (int i = 0; i < produtosAlimenticios.size(); i++) {
				gravaArquivo.print("\n");
				gravaArquivo.print(produtosAlimenticios.get(i));
			}
			arquivo.close();
			gravaArquivo.close();

		} catch (Exception e) {
			System.out.println("Erro ao gravar o produto!");
			e.printStackTrace();
			return false;
		}
		return true;

	}

	@Override
	public int quantidadeProdutosEmEstoque() {

		return produtosAlimenticios.size();
	}

	@Override
	public boolean removeProduto(Integer codigoDeBarras) {
		for (int i = 0; i < produtosAlimenticios.size(); i++) {
			if (produtosAlimenticios.get(i).getCodigoDeBarras() == codigoDeBarras) {
				produtosAlimenticios.remove(i);
				return true;
			}
		}
		return false;
	}

	

}
