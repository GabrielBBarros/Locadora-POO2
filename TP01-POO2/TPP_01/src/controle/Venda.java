package controle;

import imovel.*;
import seguro.*;
import usuario.*;

import java.io.Serializable;
import java.time.*;

public class Venda implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2058299484110448788L;
	private String codigoVenda;
	private Usuario cliente;
	private Usuario corretor;
	private Imovel imovel;
	private LocalDate dataVenda;
	private float valorTotalVenda;
	private Pagamento formaPagamento;

	public Venda() {
	}

	public Venda(String codigoVenda, Usuario cliente, Usuario corretor, Imovel imovel, LocalDate dataVenda,
			float valorTotalVenda, Pagamento formaPagamento) {
		setCodigoVenda(codigoVenda);
		setCliente(cliente);
		setCorretor(corretor);
		setImovel(imovel);
		setDataVenda(dataVenda);
		setValorTotalVenda(valorTotalVenda);
		setFormaPagamento(formaPagamento);
	}

	public String getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(String codigoVenda) {
		this.codigoVenda = codigoVenda;
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

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public float getValorTotalVenda() {
		return valorTotalVenda;
	}

	public void setValorTotalVenda(float valorTotalVenda) {
		this.valorTotalVenda = valorTotalVenda;
	}

	public Pagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(Pagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public String getCodigoImovel() {
		return imovel.getCodigoImovel();
	}

	@Override
	public String toString() {
		return "Venda [codigoVenda=" + codigoVenda + ", cliente=" + cliente + ", corretor=" + corretor + ", imovel="
				+ imovel + ", dataVenda=" + dataVenda + ", valorTotalVenda=" + valorTotalVenda + ", formaPagamento="
				+ formaPagamento + "]";
	}

}
