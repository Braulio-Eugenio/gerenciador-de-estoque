package br.com.zup.gerenciador.estoque.mercado;

import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.zup.gerenciador.estoque.produtos.Produto;
import br.com.zup.gerenciador.estoque.produtos.ProdutoLimpeza;

public class EstoqueLimpeza implements Estoque {
	private List<Produto> produtosLimpeza = new ArrayList<Produto>();

	@Override
	public void alteraPrecoProdutos(float porcentagem, boolean aumenta) {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (aumenta) {
				this.produtosLimpeza.get(i).aumentaPrecoVenda(porcentagem);

			} else {

				this.produtosLimpeza.get(i).diminuiPrecoVenda(porcentagem);
			}
		}

	}

	@Override
	public boolean cadastrarProduto(Produto produto) {
		if (produto instanceof ProdutoLimpeza) {
			this.produtosLimpeza.add(produto);
			return true;

		} else {

			return false;
		}

	}

	@Override
	public List<Produto> listaProduto() {
		return produtosLimpeza;
	}

	@Override
	public boolean alteraPrecoProduto(float porcentagem, boolean aumenta, int codigoDeBarras) {
		for (Produto produto : produtosLimpeza) {
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
		for (Produto produto : produtosLimpeza) {
			if (produto.getCodigoDeBarras() == codigoDeBarras) {
				return produto;
			}
		}
		return null;
	}

	@Override
	public boolean gravaListaProdutos() {
		try {
			FileWriter arquivo = new FileWriter("ListaEstoqueLimpeza.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			gravaArquivo.print("produtos em estoque");
			for (int i = 0; i < produtosLimpeza.size(); i++) {
				gravaArquivo.print("\n");
				gravaArquivo.print(produtosLimpeza.get(i));
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
		return produtosLimpeza.size();
	}

	@Override
	public boolean removeProduto(Integer codigoDeBarras) {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (produtosLimpeza.get(i).getCodigoDeBarras() == codigoDeBarras) {
				produtosLimpeza.remove(i);
				return true;
			}
		}
		return false;
	}

	public List<Produto> getProdutosLimpeza() {
		return produtosLimpeza;
	}

	public void setProdutosLimpeza(List<Produto> produtosLimpeza) {
		this.produtosLimpeza = produtosLimpeza;
	}

}
