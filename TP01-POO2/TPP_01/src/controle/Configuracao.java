package controle;

public final class Configuracao{
	private static Configuracao instanciaConfiguracao = null;
	private String arquivoAlugueis;
	private String arquivoVendas;
	private String arquivoImoveis;

	private String arquivoCliente;
	private String arquivoCorretores;
	private String arquivoSeguros;

	
	private Configuracao(){
		this.arquivoAlugueis = "src/arquivos/alugueis.ser";
		this.arquivoVendas = "src/arquivos/vendas.ser";
		this.arquivoImoveis = "src/arquivos/imoveis.ser";
		this.arquivoCliente = "src/arquivos/clientes.ser";
		this.arquivoCorretores = "src/arquivos/corretores.ser";
		this.arquivoSeguros = "src/arquivos/seguros.ser";
	}
	
	public static Configuracao getInstancia() {
		if(instanciaConfiguracao == null) {
			instanciaConfiguracao = new Configuracao();
		}
		return instanciaConfiguracao;
	}

	public static Configuracao getInstanciaConfiguracao() {
		return instanciaConfiguracao;
	}

	public static void setInstanciaConfiguracao(Configuracao instanciaConfiguracao) {
		Configuracao.instanciaConfiguracao = instanciaConfiguracao;
	}

	public String getArquivoAlugueis() {
		return arquivoAlugueis;
	}

	public void setArquivoAlugueis(String arquivoAlugueis) {
		this.arquivoAlugueis = arquivoAlugueis;
	}

	public String getArquivoVendas() {
		return arquivoVendas;
	}

	public void setArquivoVendas(String arquivoVendas) {
		this.arquivoVendas = arquivoVendas;
	}

	public String getArquivoImoveis() {
		return arquivoImoveis;
	}

	public void setArquivoImoveis(String arquivoImoveis) {
		this.arquivoImoveis = arquivoImoveis;
	}

	public String getArquivoCliente() {
		return arquivoCliente;
	}

	public void setArquivoCliente(String arquivoCliente) {
		this.arquivoCliente = arquivoCliente;
	}

	public String getArquivoCorretores() {
		return arquivoCorretores;
	}

	public void setArquivoCorretores(String arquivoCorretores) {
		this.arquivoCorretores = arquivoCorretores;
	}

	public String getArquivoSeguros() {
		return arquivoSeguros;
	}

	public void setArquivoSeguros(String arquivoSeguros) {
		this.arquivoSeguros = arquivoSeguros;
	}

}