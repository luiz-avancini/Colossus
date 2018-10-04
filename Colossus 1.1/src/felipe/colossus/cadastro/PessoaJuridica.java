package felipe.colossus.cadastro;

import java.util.Date;
import java.util.List;

public class PessoaJuridica implements Pessoa {
	
	private long id;
	private String nomePessoaContato;
	private String fantasia;
	private String razaoSocial;
	private String cnpj;
	private int qtdFiliais;
	private String inscEstadual;
	private String inscMunicipal;
	private Date dataCadastro;
	private Date dataUltimaModificacao;
	private String observacao;
	private List<Telefone> telefone;
	private List<Referencia> referencia;
	private static final String tipo = "JURIDICA";
	

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCpfCnpj() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco getEndereco() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Telefone> getTelefone() {
		// TODO Auto-generated method stub
		return telefone;
	}

}
