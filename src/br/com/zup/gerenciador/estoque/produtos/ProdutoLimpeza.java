package br.com.zup.gerenciador.estoque.produtos;

public class ProdutoLimpeza extends Produto {
	private String aroma;
	private String parteDaCasa;

	public ProdutoLimpeza(float precoCusto, float precoVenda, String nome, int codigoDeBarras, String dataValidade,
			String aroma, String parteDaCasa) {
		super(precoCusto, precoVenda, nome, codigoDeBarras, dataValidade);
		this.aroma = aroma;
		this.parteDaCasa = parteDaCasa;
	}

	




	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public String getParteDaCasa() {
		return parteDaCasa;
	}

	public void setParteDaCasa(String parteDaCasa) {
		this.parteDaCasa = parteDaCasa;
	}

	@Override
	public String toString() {
		return "ProdutoLimpeza [aroma=" + aroma + ", parteDaCasa=" + parteDaCasa + "]";
	}
}