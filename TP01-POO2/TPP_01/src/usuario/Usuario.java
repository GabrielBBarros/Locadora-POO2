package usuario;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Usuario implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5157655581249313871L;
	protected String codigoUsuario;
	protected String nome;
	protected String cpf;
	protected String rg;
	protected LocalDate datadenascimento;
	protected String endereco;
	protected String cep;
	protected String telefone;
	protected String email;

	Usuario() {
	}

	Usuario(String codigoUsuario, LocalDate datadenascimento, ArrayList<String> str) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.nome = str.get(0);
		this.cpf = str.get(1);
		this.rg = str.get(2);
		this.endereco = str.get(3);
		this.cep = str.get(4);
		this.telefone = str.get(5);
		this.email = str.get(6);
		this.datadenascimento = datadenascimento;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String spf) {
		this.cpf = spf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDataAdmissao() {
		return null;
	}
	
	public LocalDate getDataCadastro() {
		return null;
	}

	public String getCreci() {
		return null;
	}

	public  float getSalario() {
		return 0;
	}

	public  String getPis() {
		return null;
	}

	@Override
	public String toString() {
		return "codigoUsuario=" + codigoUsuario + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", datadenascimento=" + datadenascimento + ", endereco=" + endereco + ", cep=" + cep + ", telefone="
				+ telefone + ", email=" + email + "]";
	}
	
	

}
