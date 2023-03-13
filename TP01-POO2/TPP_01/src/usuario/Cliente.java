package usuario;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 512008093889793329L;
	protected LocalDate dataCadastro;

	public Cliente() {
	}

	public Cliente(String codigoUsuario, LocalDate datadenascimento, LocalDate dataCadastro, ArrayList<String> str) {
		super(codigoUsuario,  datadenascimento, str);
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [dataCadastro=" + dataCadastro + "]";
	}

	
	

}
