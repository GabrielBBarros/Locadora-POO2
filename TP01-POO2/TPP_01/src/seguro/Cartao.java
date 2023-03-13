package seguro;

import java.io.*;

public class Cartao extends Pagamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5133370793683869742L;
	private String nome;
	private String bandeira;
	private String numero;
	
	
	public Cartao() {
		
	}

	public Cartao(String tipoPagamento, String nome, String bandeira, String numero) {
		super(tipoPagamento);
		this.nome = nome;
		this.bandeira = bandeira;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getBandeira() {
		return bandeira;
	}


	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Pagamento [tipoPagamento=" + tipoPagamento + "]"+"Cartao [nome=" + nome + ", bandeira=" + bandeira + ", numero=" + numero + "]";
	}
	
	
	
	

}
