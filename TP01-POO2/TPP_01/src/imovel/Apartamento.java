package imovel;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Apartamento extends Imovel implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3106624659192136917L;
	protected int andar;
	protected float valorCondominio;
	

	public Apartamento() {
	}


	public Apartamento(String codigoImovel, String endereco, LocalDate data, ArrayList<Float> f, ArrayList<Integer> in) {
		super(codigoImovel, endereco, data, f, in);
		this.andar = in.get(3);
		this.valorCondominio = f.get(5);
	}
	
	public Apartamento(String codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal,
			float areaConstruida, int qtdDormitoriios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU,
			float valorVenda, float valorAluguel, int andar, int valorCondominio) {
		super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitoriios, qtdBanheiros,
				qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
		this.andar = andar;
		this.valorCondominio = valorCondominio;
		
	}
	
	public float getValorAluguelTotal() {
		return super.getValorAluguel() + this.valorCondominio;
	}

	
	public String getType() {
		return "apartamento";
	}
	
	@Override
	public int getAndar() {
		return andar;
	}


	public void setAndar(int andar) {
		this.andar = andar;
	}

	@Override
	public float getValorCondominio() {
		return valorCondominio;
	}


	public void setValorCondominio(float valorCondominio) {
		this.valorCondominio = valorCondominio;
	}


	@Override
	public String toString() {
		return super.toString() +"Apartamento [andar=" + andar + ", valorCondominio=" + valorCondominio + "]";
	}
	
}