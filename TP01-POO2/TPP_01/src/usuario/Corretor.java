package usuario;

import java.io.*;
import java.util.ArrayList;
import java.time.LocalDate;


public class Corretor extends Usuario implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3856849301465468014L;
	protected String creci;
	protected float salario;
	protected String pis;
	protected LocalDate dataAdmissao;

	public Corretor() {
		
	}

	public Corretor(String codigoUsuario, float salario, LocalDate datadenascimento, LocalDate dataAdmissao, ArrayList<String> str) {
		super(codigoUsuario,  datadenascimento, str);
		this.creci = str.get(7);
		this.pis = str.get(8);
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	
	@Override
	public String getCreci() {
		return creci;
	}

	public void setCreci(String creci) {
		this.creci = creci;
	}
	
	@Override
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String getPis() {
		return pis;
	}
	
	public void setPis(String pis) {
		this.pis = pis;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public String toString() {
		return "Corretor [creci=" + creci + ", salario=" + salario + ", pis=" + pis + ", dataAdmissao=" + dataAdmissao
				+ "]";
	}

	

}
