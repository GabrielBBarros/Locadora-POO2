package controlador;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import controle.*;
import imovel.*;
import seguro.*;
import usuario.*;

public final class Controlador {
	
	private static Controlador instanciaControlador = null;
	private static Imobiliaria imobiliaria;
	
	private Controlador() {
		imobiliaria = Imobiliaria.getInstancia();
	}
	
	public static Controlador getInstancia() {
		if(instanciaControlador == null) {
			instanciaControlador = new Controlador();
		}
		return instanciaControlador;
	}
	
	public void carregaArquivo() {
		try {
			imobiliaria.carregaArquivos();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarArquivos() {
		imobiliaria.salvarArquivos();
	}
	
	public boolean salvarAlugueis() {
		try {
			return imobiliaria.salvarAlugueis();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean salvarClientes() {
		try {
			return imobiliaria.salvarClientes();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean salvarImovel() {
		try {
			return imobiliaria.salvarImovel();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean salvarVendas() {
		try {
			return imobiliaria.salvarVendas();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean salvarCorretores() {
		try {
			return imobiliaria.salvarCorretores();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean buscaCliente(String codigo) {
		return imobiliaria.buscaCliente(codigo);
	}
	
	public boolean buscaCorretor(String codigo) {
		return imobiliaria.buscaCorretor(codigo);
	}
	
	public boolean buscaVenda(String codigo) {
		return imobiliaria.buscaVenda(codigo);
	}
	
	public boolean buscaResidencia(String codigo) {
		return imobiliaria.buscaImovel(codigo);
	}
	
	public boolean buscaAlugueis(String codigo) {
		return imobiliaria.buscaAlugueis(codigo);
	}
	
	public boolean buscaSeguro(String codigo) {
		return imobiliaria.buscaSeguro(codigo);
	}

	public Usuario retornoCliente(String codigo) {
		try {
			return imobiliaria.retornoCliente(codigo);
		} catch (Exception e) {
			return null;
		}
	}
	
	public Usuario retornoCorretor(String codigo) {
		try {
			return imobiliaria.retornoCorretor(codigo);
		} catch (Exception e) {
			return null;
		}
	}

	public Venda retornoVenda(String codigo) {
		try {
			return imobiliaria.retornoVenda(codigo);
		} catch (Exception e) {
			return null;
		}
	}

	public Imovel retornoCasaResidencial(String codigo) {
		try {
			return imobiliaria.retornoImovel(codigo);
		} catch (Exception e) {
			return null;
		}
	}

	public Aluguel retornoAlugueis(String codigo) {
		try {
			return imobiliaria.retornoAlugueis(codigo);
		} catch (Exception e) {
			return null;
		}
	}

	public Seguro retornoSeguro(String codigo) {
		try {
			return imobiliaria.retornoSeguro(codigo);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean cadastroCliente(ArrayList<String> str, LocalDate datadenascimento, LocalDate dataCadastro) {
		try {
			return imobiliaria.cadastroCliente(str, datadenascimento, dataCadastro);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean cadastroCorretor(ArrayList<String> str, float salario, LocalDate datadenascimento, LocalDate dataCadastro) {
		try {
			return imobiliaria.cadastroCorretor(str, datadenascimento, salario, dataCadastro);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean cadastroCasaResidencial(String endereco,LocalDate data, ArrayList<Float> fl, ArrayList<Integer> in) {
		try {
			return imobiliaria.cadastroResidencia(endereco, data, fl, in);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean cadastroApartamento(String endereco,LocalDate data, ArrayList<Float> fl, ArrayList<Integer> in) {
		try {
			return imobiliaria.cadastroApartamento(endereco, data, fl, in);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean cadastroComercial(String endereco, LocalDate data, ArrayList<Float> fl, ArrayList<Integer> in) {
		try {
			return imobiliaria.cadastroComercial(endereco, data, fl, in);
		} catch (Exception e) {
			return false;
		}
	}

	public boolean cadastroVenda(String cliente, String corretor, String imovel, LocalDate dataVenda,
			float valorTotalVenda, ArrayList<String> formaPagamento) {
		try {
			return imobiliaria.cadastroVenda(cliente, corretor, imovel, dataVenda, valorTotalVenda, formaPagamento);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean cadastroAluguel(String cliente, String corretor, String imovel, LocalDate dataInicioAluguel,
			LocalDate dataDevolucao, LocalDate dataPagamentoMensal) {
		try {
			return imobiliaria.cadastroAluguel(cliente, corretor, imovel, dataInicioAluguel, dataDevolucao, dataPagamentoMensal);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean cadastroSeguro(String nomeSeguradora, String tipo, String descricao, float valor) {
		try {
			return imobiliaria.cadastroSeguro( nomeSeguradora, tipo, descricao, valor);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean pagarAluguel(String codigoAluguel, ArrayList<String> str) {
		return imobiliaria.pagarAluguel(codigoAluguel, str);
	}
	
	public ArrayList<Imovel> imoveisDispo(){
		return imobiliaria.imoveisDispo();
	}
	
	public ArrayList<Imovel> imoveisNaoDispo(){
		return imobiliaria.imoveisNaoDispo();
	}
	
	public ArrayList<Aluguel> getAlugueis(){
		return imobiliaria.getAlugueis();
	}
	
	public ArrayList<Imovel> imoveisAtrasados(){
		return imobiliaria.imoveisAtrasados();
	}
	
	public ArrayList<Imovel> imoveisAlugadosCliente(String codigo){
		return imobiliaria.imoveisAlugadosCliente(codigo);
	}
	
	public ArrayList<Imovel> imoveisCompradosCliente(String codigo){
		return imobiliaria.imoveisCompradosCliente(codigo);
	}
	
	public ArrayList<Usuario> corretoresMes(int mes){
		return imobiliaria.funcionarioDoMes(mes);
	}
	
	public ArrayList<Usuario> clientesAluguelAtrasado(){
		return imobiliaria.clientesAluguelAtrasado();
	}
	
	public ArrayList<Aluguel> alugueisFinalizados(){
		return imobiliaria.alugueisAcabados();
	}
	
	public ArrayList<Aluguel> alugueisNaoFinalizados(){
		return imobiliaria.alugueisNaoAcabados();
	}
	
	public ArrayList<Imovel> casasAlugadas(){
		return imobiliaria.casasAlugadas();
	}
	
	public ArrayList<Imovel> apartamentoAlugadas(){
		return imobiliaria.apartamentoAlugados();
	}
	
	public ArrayList<Imovel> comercioAlugadas(){
		return imobiliaria.comercioAlugados();
	}
	
	public ArrayList<Venda> vendasMes(int mes){
		return imobiliaria.vendasMes(mes);
	}

	public ArrayList<Venda> getVendas() {
		return imobiliaria.getVendas();
	}
	
	public boolean ativarSeguro(String aluguel, String seguro) {
		return imobiliaria.ativarSeguro(aluguel, seguro);
	}

	public ArrayList<Imovel> getImoveis() {
		return imobiliaria.getImoveis();
	}

	public ArrayList<Usuario> getClientes() {
		return imobiliaria.getClientes();
	}

	public ArrayList<Usuario> getCorretores() {
		return imobiliaria.getCorretores();
	}

	public ArrayList<Seguro> getSeguros() {
		return imobiliaria.getSeguros();
	}
	
	public ArrayList<Imovel> getApartamentos(){
		return imobiliaria.getApartamentos();
	}
	
	public ArrayList<Imovel> getCasas(){
		return imobiliaria.getCasas();
	}
	
	public ArrayList<Imovel> getComercios(){
		return imobiliaria.getComerios();
	}
	
}
