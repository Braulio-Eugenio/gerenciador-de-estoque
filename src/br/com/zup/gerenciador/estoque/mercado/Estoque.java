package br.com.zup.gerenciador.estoque.mercado;

import java.util.List;

import br.com.zup.gerenciador.estoque.produtos.Produto;

public interface Estoque {

	void alteraPrecoProdutos(float porcentagem, boolean aumenta);

	boolean cadastrarProduto(Produto produto);
	
	boolean removeProduto(Integer codigoDeBarras);
	
	List<Produto> listaProduto();

	boolean alteraPrecoProduto(float porcentagem, boolean aumenta, int codigoDeBarras);

	Produto consultaProduto(Integer codigoDeBarras) throws Exception;

	boolean gravaListaProdutos();

	int quantidadeProdutosEmEstoque();

	

	

	

}
