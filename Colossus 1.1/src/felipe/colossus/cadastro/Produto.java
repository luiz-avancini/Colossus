package felipe.colossus.cadastro;

public class Produto {
	private long id;
	private long codigo_barras;
	private String descricao;
	private Fabricante fabricante;
	private Grupo grupo;
	private Subgrupo subgrupo;
	private Setor setor;
	private long ncm;
	private StatusProduto statusproduto;
	private boolean enviaBalanca;
	private boolean controlaEstoque;
	private boolean composicaoProducao;
	private boolean composicaoVendaDireta;
	private boolean vendaFracionada;
	private boolean permiteDesconto;
	private String detalhesProduto;
	private int informacoesAdicionaisNFE;
}
