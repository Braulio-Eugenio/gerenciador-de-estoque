package br.com.zup.gerenciador.estoque.produtos;

import java.util.Date;

public class Produto {
	private float precoCusto;
	private float precoVenda;
	private String nome;
	private boolean codigoDeBarras;
	private Date dataValidade;

	public Produto(float precoCusto, float precoVenda, String nome, boolean codigoDeBarras, Date dataValidade) {
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

	public boolean isCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(boolean codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public Date isDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
}
