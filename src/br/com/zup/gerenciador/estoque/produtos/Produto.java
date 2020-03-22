package br.com.zup.gerenciador.estoque.produtos;

public class Produto {
	private float precoCusto;
	private float precoVenda;
	private String nome;
	private int codigoDeBarras;
	private String dataValidade;

	public Produto(float precoCusto, float precoVenda, String nome, int codigoDeBarras, String dataValidade) {
		super();
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.nome = nome;
		this.codigoDeBarras = codigoDeBarras;
		this.dataValidade = dataValidade;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(int codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String isDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public void aumentaPrecoVenda(float porcentagem) {
		//XXX: Tem algum problema neste cáculo caso o usuário digite 10, 
		// o resultado vai ser o produto mais ele mesmo X10.
		this.precoVenda += precoVenda * porcentagem;
	}
	public void diminuiPrecoVenda(float porcentagem) {
		this.precoVenda -= precoVenda * porcentagem;
		
	}
	
	@Override
	public String toString() {
		return "Produto [precoCusto=" + precoCusto + ", precoVenda=" + precoVenda + ", nome=" + nome
				+ ", codigoDeBarras=" + codigoDeBarras + ", dataValidade=" + dataValidade + "]";
	}
}
