package felipe.colossus.cadastro;

import java.util.Date;
import java.util.List;

public class PessoaFisica implements Pessoa {

	private long id;
	private String nome;
	private char sexo;
	private String cpf;
	private String identidade;
	private Date dataNascimento;
	private Endereco endereco;
	private String naturalidade;
	private String nacionalidade;
	private double rendaFamiliar;
	private Date dataCadastro;
	private Date dataUltimaModificacao;
	private String observacao;
	private List<Telefone> telefone;
	private List<Referencia> referencia;
	private static final String tipo = "FISICA";
	
	
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	@Override
	public String getCpfCnpj() {
		// TODO Auto-generated method stub
		return cpf;
	}

	@Override
	public Endereco getEndereco() {
		// TODO Auto-generated method stub
		return endereco;
	}

	@Override
	public List<Telefone> getTelefone() {
		// TODO Auto-generated method stub
		return telefone;
	}

}
