package telas;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import controlador.*;
import controle.Venda;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public final class Rel_Vendas_lucro extends JDialog {
	
	private final JPanel contentPanel = new JPanel();
	private JTable tabela;
	private String [][] dados;
	private String [] titulos = {"Codigo V.", "Cliente","Corretor", "Imovel", "Data Venda","Valor total","Pagamento"};
	private int linha;
	private int coluna;
	double Total = 0;
	private static Controlador controlador;
	private static Rel_Vendas_lucro relVenTotalInst;

	public static void main(String[] args) {
		try {
			Rel_Vendas_lucro dialog = Rel_Vendas_lucro.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Rel_Vendas_lucro getInstancia(Controlador control) {
		
		if(relVenTotalInst == null) {
			relVenTotalInst = new Rel_Vendas_lucro(control);
		}
		return relVenTotalInst;
	}
	
	private Rel_Vendas_lucro(Controlador control) {
		controlador = control.getInstancia();
		getContentPane().setLayout(new BorderLayout());
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Lucro total das vendas");
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 876, 468);
		contentPanel.add(scrollPane);
		
		setTamDadosvendas();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
		
		JLabel lblNewLabel = new JLabel("Lucro:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel.setBounds(286, 513, 51, 40);
		contentPanel.add(lblNewLabel);
		
		JLabel LucroTXT = new JLabel("R$: "+Total);
		LucroTXT.setForeground(Color.WHITE);
		LucroTXT.setFont(new Font("Serif", Font.BOLD, 15));
		LucroTXT.setBounds(344, 513, 393, 40);
		contentPanel.add(LucroTXT);
		
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
		
		for (Venda aux : vendas) {
			Total += aux.getValorTotalVenda();
		}
	}
	
	public void att() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		getContentPane().setLayout(new BorderLayout());
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Lucro total das vendas");
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 876, 468);
		contentPanel.add(scrollPane);
		
		setTamDadosvendas();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
		
		JLabel lblNewLabel = new JLabel("Lucro:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel.setBounds(286, 513, 51, 40);
		contentPanel.add(lblNewLabel);
		
		JLabel LucroTXT = new JLabel("R$: "+Total);
		LucroTXT.setForeground(Color.WHITE);
		LucroTXT.setFont(new Font("Serif", Font.BOLD, 15));
		LucroTXT.setBounds(344, 513, 393, 40);
		contentPanel.add(LucroTXT);
	}
}
