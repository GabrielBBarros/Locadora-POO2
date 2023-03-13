package telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public final class Cad_Pagamento extends JDialog {

	private static Cad_Pagamento instancia;
	private final JPanel contentPanel = new JPanel();
	private JTextField Cod_ClienteTXT;
	private JTextField Cod_CorretorTXT;
	private static Controlador control;
	private JTextField Cod_ImovelTXT;
	private JTextField ValorTXT;
	private JTextField numeroTXT;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Pagamento dialog = Cad_Pagamento.getInstancia(control);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Cad_Pagamento getInstancia(Controlador control) {
		if(instancia == null) {
			instancia = new Cad_Pagamento(control);
		}
		return instancia;
	}

	/**
	 * Create the dialog.
	 */
	private Cad_Pagamento(Controlador control) {
		this.control = control.getInstancia();
		setBounds(100, 100, 800, 599);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Ativar seguro");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigoAluguelseguro = new JLabel("Codigo aluguel");
		lblCodigoAluguelseguro.setForeground(Color.WHITE);
		lblCodigoAluguelseguro.setFont(new Font("Serif", Font.BOLD, 15));
		lblCodigoAluguelseguro.setBounds(126, 186, 250, 15);
		contentPanel.add(lblCodigoAluguelseguro);
		
		Cod_ClienteTXT = new JTextField();
		Cod_ClienteTXT.setColumns(10);
		Cod_ClienteTXT.setBounds(126, 211, 200, 30);
		contentPanel.add(Cod_ClienteTXT);

		
		//(String tipoPagamento, String nome, String bandeira, String numero
		JLabel lblCodigoSeguro = new JLabel("Forma de pagamento");
		lblCodigoSeguro.setForeground(Color.WHITE);
		lblCodigoSeguro.setFont(new Font("Serif", Font.BOLD, 15));
		lblCodigoSeguro.setBounds(386, 186, 250, 15);
		contentPanel.add(lblCodigoSeguro);
		
		Cod_CorretorTXT = new JTextField();
		Cod_CorretorTXT.setColumns(10);
		Cod_CorretorTXT.setBounds(386, 211, 200, 30);
		contentPanel.add(Cod_CorretorTXT);

		JLabel lblNome = new JLabel("Nome do titular do cartao");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Serif", Font.BOLD, 15));
		lblNome.setBounds(126, 263, 250, 15);
		contentPanel.add(lblNome);
		
		Cod_ImovelTXT = new JTextField();
		Cod_ImovelTXT.setColumns(10);
		Cod_ImovelTXT.setBounds(126, 288, 200, 30);
		contentPanel.add(Cod_ImovelTXT);
		
		JLabel lblValor = new JLabel("Bandeira do carto");
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Serif", Font.BOLD, 15));
		lblValor.setBounds(386, 263, 250, 15);
		contentPanel.add(lblValor);
		
		ValorTXT = new JTextField();
		ValorTXT.setColumns(10);
		ValorTXT.setBounds(386, 288, 200, 30);
		contentPanel.add(ValorTXT);
		
		JLabel lblNumero = new JLabel("Numero do cartao");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setFont(new Font("Serif", Font.BOLD, 15));
		lblNumero.setBounds(126, 350, 250, 15);
		contentPanel.add(lblNumero);
		
		numeroTXT = new JTextField();
		numeroTXT.setColumns(10);
		numeroTXT.setBounds(126, 375, 200, 30);
		contentPanel.add(numeroTXT);
		
		
		JLabel lblPay = new JLabel("Pagamento");
		lblPay.setForeground(Color.WHITE);
		lblPay.setFont(new Font("Serif", Font.BOLD, 25));
		lblPay.setBounds(289, 54, 250, 64);
		contentPanel.add(lblPay);
		
		JButton botaoPagar = new JButton("Pagar");
		botaoPagar.setForeground(new Color(255, 223, 0));
		botaoPagar.setFocusPainted(false);
		botaoPagar.setBorder(null);
		botaoPagar.setBackground(new Color(0, 39, 118));
		botaoPagar.setBounds(504, 485, 132, 32);
		contentPanel.add(botaoPagar);
		botaoPagar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<String> str = new ArrayList<>();
					String codigo = Cod_ClienteTXT.getText().trim().toUpperCase();
					str.add(Cod_CorretorTXT.getText().trim().toUpperCase());
					str.add(Cod_ImovelTXT.getText().trim().toUpperCase());
					str.add(ValorTXT.getText().trim().toUpperCase());
					str.add(numeroTXT.getText().trim().toUpperCase());
					if(control.pagarAluguel(codigo, str) ) {
						control.salvarArquivos();
						clearTxt();
					}
					
				} catch (Exception e2) {
				}
			}
		});
	}
	
	public void clearTxt() {
		Cod_ClienteTXT.setText("");
		Cod_CorretorTXT.setText("");
		Cod_ImovelTXT.setText("");
		ValorTXT.setText("");
		numeroTXT.setText("");
	}
	
}