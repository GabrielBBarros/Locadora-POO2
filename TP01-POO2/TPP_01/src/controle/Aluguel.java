package controle;


import java.io.Serializable;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import imovel.*;
import seguro.*;
import usuario.*;

public class Aluguel implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7102577200839538848L;
	private String codigoAluguel;
	private Usuario cliente;
	private Usuario corretor;
	private Imovel imovel;
	private LocalDate dataInicioAluguel;
	private LocalDate dataDevolucao;
	private LocalDate dataPagamentoMensal;
	private float valorTotalAluguel;
	private ArrayList<Registro> registros;
	ArrayList<Seguro> segurosContratados;
	private boolean Pago;

	public Aluguel() {
		segurosContratados = new ArrayList<>();
		registros = new ArrayList<>();
	}
	
	public Aluguel(String CodigoAluguel, Usuario cliente, Usuario corretor, Imovel imovel, LocalDate dataInicioAluguel,
			LocalDate dataDevolucao, LocalDate dataPagamentoMensal) {
		setCodigoAluguel(CodigoAluguel);
		setCliente(cliente);
		setCorretor(corretor);
		setImovel(imovel);
		setDataInicioAluguel(dataInicioAluguel);
		setDataDevolucao(dataDevolucao);
		setDataPagamentoMensal(dataPagamentoMensal);
		calcularValorTotal();
		registros = new ArrayList<>();
		segurosContratados = new ArrayList<>();
		this.Pago = false;
	}

	// Metodos
	
	public void calcularValorTotal() {
		int meses =  (int) this.dataInicioAluguel.until(dataDevolucao, ChronoUnit.MONTHS);
		if(this.imovel instanceof Comercial) {
			this.valorTotalAluguel = this.imovel.getValorAluguelTotal()*meses;
		} else  if( this.imovel instanceof Apartamento){
			this.valorTotalAluguel = meses*this.imovel.getValorAluguelTotal() + meses*this.imovel.getValorAluguelTotal();
		} else {
			this.valorTotalAluguel = meses*this.imovel.getValorAluguelTotal();
		}
	}
	
	public boolean possuiSeguro() {
		return !this.segurosContratados.isEmpty();
	}
	
	public boolean verificaAtraso() {
		LocalDate hoje = LocalDate.now();
		if(hoje.isAfter(getDataDevolucao())) {
			return false;
		}
		if (this.dataPagamentoMensal.getMonthValue() > hoje.getMonthValue()) {
			return false;
		} else if(this.dataPagamentoMensal.getMonthValue() == hoje.getMonthValue()) {
			if( this.dataPagamentoMensal.getDayOfMonth() >= hoje.getDayOfMonth()) {
				return false;
			} else {
				return true;
			}
		} else return true;
	}
	
	public boolean pagar(ArrayList<String> str) {
		try {
			LocalDate agora = LocalDate.now();
			if(str.get(0).equalsIgnoreCase("dinheiro")) {
				Dinheiro dinheiro = new Dinheiro(str.get(0));
				Registro registro = new Registro(dinheiro, agora);
				registros.add(registro);
				this.Pago = true;
				return true;
			}
			Cartao cartao = new Cartao(str.get(0), str.get(1), str.get(2),str.get(3));
			Registro registro = new Registro(cartao, agora);
			registros.add(registro);
			this.Pago = true;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean addSeguro(Seguro seguro) {
		try {
			segurosContratados.add(seguro);
			this.imovel.setValorAluguel(this.getImovel().getValorAluguel() + seguro.getValor());
			calcularValorTotal();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	// Getts e Setters
	public String getCodigoAluguel() {
		return codigoAluguel;
	}

	public void setCodigoAluguel(String codigoAluguel) {
		this.codigoAluguel = codigoAluguel;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public Usuario getCorretor() {
		return corretor;
	}

	public void setCorretor(Usuario corretor) {
		this.corretor = corretor;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public LocalDate getDataInicioAluguel() {
		return dataInicioAluguel;
	}

	public void setDataInicioAluguel(LocalDate dataInicioAluguel) {
		this.dataInicioAluguel = dataInicioAluguel;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public LocalDate getDataPagamentoMensal() {
		return dataPagamentoMensal;
	}

	public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
		this.dataPagamentoMensal = dataPagamentoMensal;
	}

	public float getValorTotalAluguel() {
		return valorTotalAluguel;
	}

	public void setValorTotalAluguel(float valorTotalAluguel) {
		this.valorTotalAluguel = valorTotalAluguel;
	}

	public ArrayList<Registro> getFormaPagamento() {
		return registros;
	}

	public ArrayList<Seguro> getSegurosContratados() {
		return segurosContratados;
	}

	public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
		this.segurosContratados = segurosContratados;
	}

	public boolean isPago() {
		return Pago;
	}

	public void setPago(boolean pago) {
		Pago = pago;
	}

	@Override
	public String toString() {
		return "Aluguel [codigoAluguel=" + codigoAluguel + ", cliente=" + cliente + ", corretor=" + corretor
				+ ", imovel=" + imovel + ", dataInicioAluguel=" + dataInicioAluguel + ", dataDevolucao=" + dataDevolucao
				+ ", dataPagamentoMensal=" + dataPagamentoMensal + ", valorTotalAluguel=" + valorTotalAluguel
				+ ", registros=" + registros + ", segurosContratados=" + segurosContratados + ", Pago=" + Pago + "]";
	}
	
	
	
}

