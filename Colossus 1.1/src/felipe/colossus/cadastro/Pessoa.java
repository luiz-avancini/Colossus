package felipe.colossus.cadastro;

import java.util.List;

public interface Pessoa {
	public long getId();
	public String getTipo();
	public String getCpfCnpj();
	public Endereco getEndereco();
	public List<Telefone> getTelefone();
}
