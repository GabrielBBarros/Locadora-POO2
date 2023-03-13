package telas;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import controlador.*;
import imovel.*;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public final class Rel_apartamento extends JDialog {
	
	private static Controlador controlador;
	private static Rel_apartamento relApartInst;
	
	private final JPanel contentPanel = new JPanel();
	private JTable tabela;
	private String [][] dados;
	private String [] titulos = {"Codigo", "Endereco", "D. Construcao", "A. Total", "A. Construida","Dormitorios","Banheiros", "V. Garagem", "IPTU", "Venda", "Aluguel", "Andar", "Condominio"};
	private int linha;
	private int coluna;
	
	
	
	
	public static void main(String[] args) {
		try {
			Rel_apartamento dialog = Rel_apartamento.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Rel_apartamento getInstancia(Controlador control) {
		
		if(relApartInst == null) {
			relApartInst = new Rel_apartamento(control);
		}
		return relApartInst;
	}
	
	private Rel_apartamento(Controlador control) {
		controlador = control.getInstancia();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio Apartamento");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosapartamento();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		tabela.setEnabled(false);
		scrollPane.setViewportView(tabela);
	}

	public void setTamDadosapartamento() {
		this.dados = new String[controlador.getApartamentos().size()][13];
	}
	
	public void setTabela() {
		ArrayList<Imovel> apartamentos = controlador.getApartamentos();
		
		this.linha = 0;
		for(Imovel imo : apartamentos) {
			this.coluna = 0;
			String codigoImovel = (imo.getCodigoImovel());
			String endereco = imo.getEndereco();
			LocalDate dataConstrucao = imo.getDataConstrucao();
			String data_cons = dataConstrucao.getDayOfMonth()+"/"+dataConstrucao.getMonthValue()+"/"+dataConstrucao.getYear();
			String areaTotal = Float.toString(imo.getAreaTotal());
			String areaConstruida = Float.toString(imo.getAreaConstruida());
			String qtdDormitorios = Integer.toString(imo.getQtdDormitoriios());
			String qtdBanheiros = Integer.toString(imo.getQtdBanheiros());
			String qtdVagasGarragem = Integer.toString(imo.getQtdVagasGaragem());
			String valorIPTU = Float.toString(imo.getValorIPTU());
			String valorVenda = Float.toString(imo.getValorVenda());
			String valorAluguel = Float.toString(imo.getValorAluguel());
			String andar = Integer.toString(imo.getAndar());
			String valorCondominio = Float.toString(imo.getValorCondominio());
			
			dados[this.linha][this.coluna] = codigoImovel; this.coluna++;
			dados[this.linha][this.coluna] = endereco; this.coluna++;
			dados[this.linha][this.coluna] = data_cons; this.coluna++;
			dados[this.linha][this.coluna] = areaTotal; this.coluna++;
			dados[this.linha][this.coluna] = areaConstruida; this.coluna++;
			dados[this.linha][this.coluna] = qtdDormitorios; this.coluna++;
			dados[this.linha][this.coluna] = qtdBanheiros; this.coluna++;
			dados[this.linha][this.coluna] = qtdVagasGarragem; this.coluna++;
			dados[this.linha][this.coluna] = valorIPTU; this.coluna++;
			dados[this.linha][this.coluna] = valorVenda; this.coluna++;
			dados[this.linha][this.coluna] = valorAluguel; this.coluna++;
			dados[this.linha][this.coluna] = andar; this.coluna++;
			dados[this.linha][this.coluna] = valorCondominio; this.coluna++;
			this.linha++;
		}
	}
	
	public void att() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio Apartamento");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosapartamento();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		tabela.setEnabled(false);
		scrollPane.setViewportView(tabela);
	}
	

}
