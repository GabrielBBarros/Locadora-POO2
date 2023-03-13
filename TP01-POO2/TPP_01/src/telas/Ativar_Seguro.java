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

public final class Ativar_Seguro extends JDialog {

	private static Ativar_Seguro instancia;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private static Controlador control;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ativar_Seguro dialog = Ativar_Seguro.getinstancia(control);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Ativar_Seguro getinstancia(Controlador control) {
		if(instancia == null) {
			instancia = new Ativar_Seguro(control);
		}
		return instancia;
	}

	/**
	 * Create the dialog.
	 */
	private Ativar_Seguro(Controlador control) {
		this.control = control.getInstancia();
		setBounds(100, 100, 800, 599);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Ativar seguro");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		Font fonte = new Font("Serif", Font.BOLD, 15);
		JLabel lblCodigoAluguelseguro = new JLabel("Codigo Aluguel");
		lblCodigoAluguelseguro.setForeground(Color.WHITE);
		lblCodigoAluguelseguro.setFont(fonte);
		lblCodigoAluguelseguro.setBounds(126, 186, 250, 15);
		contentPanel.add(lblCodigoAluguelseguro);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(126, 211, 200, 30);
		contentPanel.add(textField);
		
		JLabel lblCodigoSeguro = new JLabel("Codigo seguro");
		lblCodigoSeguro.setForeground(Color.WHITE);
		lblCodigoSeguro.setFont(fonte);
		lblCodigoSeguro.setBounds(386, 186, 250, 15);
		contentPanel.add(lblCodigoSeguro);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(386, 211, 200, 30);
		contentPanel.add(textField_1);
		
		JLabel erroSucesso = new JLabel();
		erroSucesso.setFont(fonte);
		erroSucesso.setBounds(369, 465, 500, 15);
		erroSucesso.setForeground(new Color(255, 255, 255));
		contentPanel.add(erroSucesso);
		
		
		
		JButton botaoAtivar = new JButton("Ativar");
		botaoAtivar.setForeground(new Color(255, 223, 0));
		botaoAtivar.setFocusPainted(false);
		botaoAtivar.setBorder(null);
		botaoAtivar.setBackground(new Color(0, 39, 118));
		botaoAtivar.setBounds(504, 485, 132, 32);
		contentPanel.add(botaoAtivar);
		botaoAtivar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String aluguel = textField.getText().trim().toUpperCase();
					String seguro = textField_1.getText().trim().toUpperCase();
					
					if(control.ativarSeguro(aluguel, seguro)) {
						control.salvarArquivos();
						clearTXT();
						erroSucesso.setText("<html><center>Seguro ativado com sucesso!!!</center></html>");
					}
					else {
						erroSucesso.setText("<html><center>Seguro nao ativado. Erro ocorreu!!!</center></html>");
					}					
				} catch (Exception e2) {
					erroSucesso.setText("<html><center>Seguro nao ativado. Erro ocorreu!!!</center></html>");
					e2.printStackTrace();
				}
			}
		});
		
		JLabel lblAtivao = new JLabel("Ativacao de Seguro");
		lblAtivao.setForeground(Color.WHITE);
		lblAtivao.setFont(new Font("Serif", Font.BOLD, 25));
		lblAtivao.setBounds(271, 61, 250, 64);
		contentPanel.add(lblAtivao);
	}
	
	
	public void clearTXT() {
		textField.setText("");
		textField_1.setText("");
	}
}
