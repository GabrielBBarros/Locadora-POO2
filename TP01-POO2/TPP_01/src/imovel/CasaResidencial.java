package imovel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class CasaResidencial extends Imovel implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4144923162787137144L;

	public CasaResidencial() {
		
	}

	public CasaResidencial(String codigoImovel, String endereco, LocalDate data, ArrayList<Float> f, ArrayList<Integer> in) {
		super(codigoImovel, endereco, data, f, in);
	}
	
	CasaResidencial(String codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal,
			float areaConstruida, int qtdDormitoriios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU,
			float valorVenda, float valorAluguel) {
		
		super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitoriios, qtdBanheiros,
				qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
		
	}
	


	public String getType() {
		return "residencia";
	}

	@Override
	public String toString() {
		return "CasaResidencial [codigoImovel=" + codigoImovel + ", endereco=" + endereco + ", dataConstrucao="
				+ dataConstrucao + ", areaTotal=" + areaTotal + ", areaConstruida=" + areaConstruida + ", valorIPTU="
				+ valorIPTU + ", valorVenda=" + valorVenda + ", valorAluguel=" + valorAluguel + ", qtdDormitoriios="
				+ qtdDormitoriios + ", qtdBanheiros=" + qtdBanheiros + ", qtdVagasGaragem=" + qtdVagasGaragem + "]";
	}
	
	
}
