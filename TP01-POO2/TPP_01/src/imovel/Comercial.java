package imovel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Comercial extends Imovel implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -312195502970112443L;
	protected float taxaImpostoFederal;

	public Comercial() {
	}

	public Comercial(String codigoImovel, String endereco,LocalDate data, ArrayList<Float> f, ArrayList<Integer> in) {
		super(codigoImovel, endereco, data, f, in);
		this.taxaImpostoFederal = f.get(5);
	}
	
	public Comercial(String codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida,
			int qtdDormitoriios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, float taxaImposto) {
		super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitoriios, qtdBanheiros,
				qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
		this.taxaImpostoFederal = taxaImposto;
	}
	@Override
	public float getTaxaImpostoFederal() {
		return taxaImpostoFederal;
	}

	public String getType() {
		return "comercio";
	}
	
	public void setTaxaImpostoFederal(float taxaImpostoFederal) {
		this.taxaImpostoFederal = taxaImpostoFederal;
	}

	@Override
	public String toString() {
		return super.toString() + "Comercio [taxaImpostoFederal=" + taxaImpostoFederal + "]";
	}
	
	public float getValorAluguelTotal() {
		return super.getValorAluguel() + super.getValorAluguel()*taxaImpostoFederal/100;
	}
	

}