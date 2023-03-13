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
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public final class Rel_Vendas_mes extends JDialog {
	
	private final JPanel contentPanel = new JPanel();
	private JTable tabela;
	private String [][] dados;
	private String [] titulos = {"Codigo V.", "Cliente","Corretor", "Imovel", "Data Venda","Valor total","Pagamento"};
	private int linha;
	private int coluna;
	private final JLabel lblNewLabel = new JLabel("Digite o m\u00EAs");
	private JTextField BotaomesTXT;
	private static Controlador controlador;
	private static Rel_Vendas_mes relVenMesInst;

	public static void main(String[] args) {
		try {
			Rel_Vendas_mes dialog = Rel_Vendas_mes.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Rel_Vendas_mes getInstancia(Controlador control) {
		
		if(relVenMesInst == null) {
			relVenMesInst = new Rel_Vendas_mes(control);
		}
		return relVenMesInst;
	}
	
	private Rel_Vendas_mes(Controlador control) {
		controlador = control.getInstancia();
		getContentPane().setLayout(new BorderLayout());
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Buscar vendas em um mes");
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 96, 876, 462);
		contentPanel.add(scrollPane);
		
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel.setBounds(15, 10, 866, 35);
		
		contentPanel.add(lblNewLabel);
		
		BotaomesTXT = new JTextField();
		BotaomesTXT.setBounds(25, 40, 96, 19);
		contentPanel.add(BotaomesTXT);
		BotaomesTXT.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int mes = Integer.parseInt(BotaomesTXT.getText().trim());
				setTamDadosvendas(mes);
				setTabela(mes);
				tabela = new JTable(dados, titulos);
				scrollPane.setViewportView(tabela);
				
			}
		});
		btnBuscar.setBounds(131, 39, 85, 21);
		contentPanel.add(btnBuscar);
	}

	public void setTamDadosvendas(int mes) {
		this.dados = new String[controlador.vendasMes(mes).size()][7];
	}
	
	public void setTabela(int mes) {
		ArrayList<Venda> vendas = controlador.vendasMes(mes);
		
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
		getContentPane().setLayout(new BorderLayout());
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Buscar vendas em um mes");
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 96, 876, 462);
		contentPanel.add(scrollPane);
		
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel.setBounds(15, 10, 866, 35);
		
		contentPanel.add(lblNewLabel);
		
		BotaomesTXT = new JTextField();
		BotaomesTXT.setBounds(25, 40, 96, 19);
		contentPanel.add(BotaomesTXT);
		BotaomesTXT.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int mes = Integer.parseInt(BotaomesTXT.getText().trim());
				setTamDadosvendas(mes);
				setTabela(mes);
				tabela = new JTable(dados, titulos);
				scrollPane.setViewportView(tabela);
				
			}
		});
		btnBuscar.setBounds(131, 39, 85, 21);
		contentPanel.add(btnBuscar);
	}
}
