package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.*;

public final class Cad_Venda extends JDialog {

	private static Cad_Venda cadVenInst;
	private static Controlador control;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField clienteTXT;
	private JTextField corretorTXT;
	private JTextField imovelTXT;
	private JTextField valorTXT;
	private JTextField pagamentoTXT;
	private JTextField nomeTXT;
	private JTextField bandeiraTXT;
	private JTextField numeroTXT;
	
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Venda dialog = Cad_Venda.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Cad_Venda getInstancia(Controlador control) {
		if(cadVenInst == null) {
			cadVenInst = new Cad_Venda(control);
		}
		return cadVenInst;
	}

	private Cad_Venda(Controlador control) {
		this.control = control.getInstancia();
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Cadastro venda");
		setBounds(100, 100, 640, 580);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		//Bot�o - Cadastro
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(465, 495, 132, 32);
		botaoCadastrar.setBorder(null);
		botaoCadastrar.setBackground(new Color(0,39,118));
		botaoCadastrar.setForeground(new Color(255,223,0));
		botaoCadastrar.setFocusPainted(false);
		contentPanel.add(botaoCadastrar);

		
		Font fonte = new Font("Serif", Font.BOLD, 15);
		
		
		
		
		//-------------------------------------------------LABELS E TEXTO-------------------------------------------------//

		//Cliente - 1 
		JLabel clienteLabel = new JLabel("Codigo Cliente");
		clienteLabel.setFont(fonte);
		clienteLabel.setBounds(60, 80, 250, 15);
		clienteLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(clienteLabel);

		clienteTXT = new JTextField();
		clienteTXT.setBounds(60, 105, 200, 30);
		clienteTXT.setColumns(10);
		contentPanel.add(clienteTXT);
		
		//Corretor - 2
		JLabel corretorLabel = new JLabel("Codigo Corretor");
		corretorLabel.setFont(fonte);
		corretorLabel.setBounds(320, 80, 250, 15);
		corretorLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(corretorLabel);

		corretorTXT = new JTextField();
		corretorTXT.setBounds(320, 105, 200, 30);
		corretorTXT.setColumns(10);
		contentPanel.add(corretorTXT);
		
		//Imovel - 3
		JLabel imovelLabel = new JLabel("Codigo Imovel");
		imovelLabel.setFont(fonte);
		imovelLabel.setBounds(60, 150, 250, 15);
		imovelLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(imovelLabel);

		imovelTXT = new JTextField();
		imovelTXT.setBounds(60, 175, 200, 30);
		imovelTXT.setColumns(10);
		contentPanel.add(imovelTXT);
		
		//Valor - 4
		JLabel valorLabel = new JLabel("Valor da Venda");
		valorLabel.setFont(fonte);
		valorLabel.setBounds(320, 150, 250, 15);
		valorLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(valorLabel);

		valorTXT = new JTextField();
		valorTXT.setBounds(320, 175, 200, 30);
		valorTXT.setColumns(10);
		contentPanel.add(valorTXT);
		
		//Nome - 6
		JLabel nomeLabel = new JLabel("Titular do Cartao");
		nomeLabel.setFont(fonte);
		nomeLabel.setBounds(60, 220, 250, 15);
		nomeLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(nomeLabel);

		nomeTXT = new JTextField("");
		nomeTXT.setBounds(60, 245, 200, 30);
		nomeTXT.setColumns(10);
		contentPanel.add(nomeTXT);
		
		
		//Bandeira - 7
		JLabel bandeiraLabel = new JLabel("Bandeira do Cartao");
		bandeiraLabel.setFont(fonte);
		bandeiraLabel.setBounds(320, 220, 250, 15);
		bandeiraLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(bandeiraLabel);

		bandeiraTXT = new JTextField("");
		bandeiraTXT.setBounds(320, 245, 200, 30);
		bandeiraTXT.setColumns(10);
		contentPanel.add(bandeiraTXT);
		
		//Numero - 6
		JLabel numeroLabel = new JLabel("Numero do Cartao");
		numeroLabel.setFont(fonte);
		numeroLabel.setBounds(60, 290, 250, 15);
		numeroLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(numeroLabel);

		numeroTXT = new JTextField("");
		numeroTXT.setBounds(60, 315, 200, 30);
		numeroTXT.setColumns(10);
		contentPanel.add(numeroTXT);
		
		
		
		//Erro ou sucesso
		JLabel erroSucesso = new JLabel();
		erroSucesso.setFont(fonte);
		erroSucesso.setBounds(330, 475, 500, 15);
		erroSucesso.setForeground(new Color(255, 255, 255));
		contentPanel.add(erroSucesso);
		//-------------------------------------------------FIM LABELS E TEXTO-------------------------------------------------//
		
		botaoCadastrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					LocalDate data = LocalDate.now();
					ArrayList<String> str = new ArrayList<>();
					str.add("Cartão");
					str.add(nomeTXT.getText().trim());
					str.add(bandeiraTXT.getText().trim());
					str.add(numeroTXT.getText().trim());
					
					if(control.cadastroVenda(clienteTXT.getText().trim().toUpperCase(), corretorTXT.getText().trim(), imovelTXT.getText().trim(), data, Float.parseFloat(valorTXT.getText().trim()), str)) {
						control.salvarArquivos();
						clearTXT();
						erroSucesso.setText("<html><center>Venda cadastrada com Sucesso!!!</center></html>");
					}
					else {
						erroSucesso.setText("<html><center>Venda nao cadastrada. Erro ocorreu!!!</center></html>");
					}
				} catch (Exception e2) {
					erroSucesso.setText("<html><center>Venda nao cadastrada. Erro ocorreu!!!</center></html>");
					e2.printStackTrace();
				}
				
			}
			
			
		});
		
		
	}
	
	public void clearTXT() {
		clienteTXT.setText("");
		corretorTXT.setText("");
		imovelTXT.setText("");
		valorTXT.setText("");
		pagamentoTXT.setText("");
	}
}
