package br.com.zup.gerenciador.estoque.produtos;



public class ProdutoAlimenticio extends Produto {
	private String origem;

	@Override
	public String toString() {
		return "ProdutoAlimenticio [origem=" + origem + "]";
	}

	public ProdutoAlimenticio(float precoCusto, float precoVenda, String nome, int codigoDeBarras,
			String dataValidade, String origem) {
		super(precoCusto, precoVenda, nome, codigoDeBarras, dataValidade);
		this.origem = origem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

}
