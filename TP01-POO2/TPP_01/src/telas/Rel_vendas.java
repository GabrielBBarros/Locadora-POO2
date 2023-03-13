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
import controle.Venda;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public final class Rel_vendas extends JDialog {
	
	private static Controlador controlador;
	private static Rel_vendas relVenInst;
	
	private final JPanel contentPanel = new JPanel();
	private JTable tabela;
	private String [][] dados;
	private String [] titulos = {"Codigo V.", "Cliente","Corretor", "Imovel", "Data Venda","Valor total","Pagamento"};
	private int linha;
	private int coluna;



	public static void main(String[] args) {
		try {
			Rel_vendas dialog = Rel_vendas.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Rel_vendas getInstancia(Controlador control) {
		
		if(relVenInst == null) {
			relVenInst = new Rel_vendas(control);
		}
		return relVenInst;
	}
	private Rel_vendas(Controlador control) {
		controlador = control.getInstancia();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio vendas");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosvendas();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
	}

	public void setTamDadosvendas() {
		this.dados = new String[controlador.getVendas().size()][7];
	}
	
	public void setTabela() {
		ArrayList<Venda> vendas = controlador.getVendas();
		
		this.linha = 0;
		for(Venda vend : vendas) {
			this.coluna = 0;
			String codigoVenda = (vend.getCodigoVenda());
			String cliente = (vend.getCliente().getCodigoUsuario());
			String corretor = (vend.getCorretor().getCodigoUsuario());
			String imovel = (vend.getImovel().getCodigoImovel());
			LocalDate dataVenda = vend.getDataVenda();
			String dataVend = dataVenda.getDayOfMonth()+"/"+dataVenda.getMonthValue()+"/"+dataVenda.getYear();
			String valorTotalVenda = Float.toString(vend.getValorTotalVenda());
			String formaPagamento = vend.getFormaPagamento().getTipoPagamento();
				
			dados[linha][coluna] = codigoVenda; this.coluna++;
			dados[linha][coluna] = cliente; this.coluna++;
			dados[linha][coluna] = corretor; this.coluna++;
			dados[linha][coluna] = imovel; this.coluna++;
			dados[linha][coluna] = dataVend; this.coluna++;
			dados[linha][coluna] = valorTotalVenda; this.coluna++;
			dados[linha][coluna] = formaPagamento; this.coluna++;
			this.linha++;
		}
	}
	
	public void att() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio vendas");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosvendas();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
	}
	

}
