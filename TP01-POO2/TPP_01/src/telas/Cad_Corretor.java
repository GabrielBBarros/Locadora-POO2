package telas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;


@SuppressWarnings("serial")
public final class Cad_Corretor extends JDialog{

	private static Cad_Corretor cadCorIns;
	private static Controlador control;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField ruaTXT;
	private JTextField numeroTXT;
	private JTextField bairroTXT;
	private JTextField nomeTXT;
	private JTextField cpfTXT;
	private JTextField rgTXT;
	private JTextField diaTXT;
	private JTextField cepTXT;
	private JTextField telefoneTXT;
	private JTextField emailTXT;
	private JTextField mesTXT;
	private JTextField anoTXT;
	private JTextField salarioTXT;
	private JTextField cresciTXT;
	private JTextField pisTXT;


	public static void main(String[] args) {
		try {
			Cad_Corretor corretor = Cad_Corretor.getInstancia(control.getInstancia());
			corretor.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			corretor.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Cad_Corretor getInstancia(Controlador control) {
		if(cadCorIns == null) {
			cadCorIns = new Cad_Corretor(control);
		}
		return cadCorIns;
	}

	private Cad_Corretor(Controlador control) {
		this.control = control.getInstancia();
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Cadastro Corretor");
		setBounds(100, 100, 640, 580);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		
		//-------------------------------------------------LABELS E TEXTO-------------------------------------------------//
		//Bot�o - Cadastro
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(465, 495, 132, 32);
		botaoCadastrar.setBorder(null);
		botaoCadastrar.setBackground(new Color(0,39,118));
		botaoCadastrar.setForeground(new Color(255,223,0));
		botaoCadastrar.setFocusPainted(false);
		contentPanel.add(botaoCadastrar);

		Font fonte = new Font("Serif", Font.BOLD, 15);

		//Endereco - pt 1
		JLabel ruaLabel = new JLabel("Rua");
		ruaLabel.setFont(fonte);
		ruaLabel.setBounds(62, 189, 200, 15);
		ruaLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(ruaLabel);

		ruaTXT = new JTextField();
		ruaTXT.setBounds(62, 214, 200, 30);
		ruaTXT.setColumns(10);
		contentPanel.add(ruaTXT);
		
		//Endereco - pt 2
		JLabel numeroLabel = new JLabel("Numero");
		numeroLabel.setFont(fonte);
		numeroLabel.setBounds(322, 189, 69, 15);
		numeroLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(numeroLabel);

		numeroTXT = new JTextField();
		numeroTXT.setBounds(322, 214, 80, 30);
		numeroTXT.setColumns(10);
		contentPanel.add(numeroTXT);
		
		//Endereco - pt 3
		JLabel bairroLabel = new JLabel("Bairro");
		bairroLabel.setFont(fonte);
		bairroLabel.setBounds(447, 189, 200, 15);
		bairroLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(bairroLabel);

		bairroTXT = new JTextField();
		bairroTXT.setBounds(447, 214, 150, 30);
		bairroTXT.setColumns(10);
		contentPanel.add(bairroTXT);
		
		//Nome - 1 
		JLabel areaTotalLabel = new JLabel("Nome");
		areaTotalLabel.setFont(fonte);
		areaTotalLabel.setBounds(62, 59, 250, 15);
		areaTotalLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(areaTotalLabel);

		nomeTXT = new JTextField();
		nomeTXT.setBounds(62, 84, 200, 30);
		nomeTXT.setColumns(10);
		contentPanel.add(nomeTXT);
		
		//CPF - 2
		JLabel areaConstruidaLabel = new JLabel("CPF");
		areaConstruidaLabel.setFont(fonte);
		areaConstruidaLabel.setBounds(322, 59, 250, 15);
		areaConstruidaLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(areaConstruidaLabel);

		cpfTXT = new JTextField();
		cpfTXT.setBounds(322, 84, 200, 30);
		cpfTXT.setColumns(10);
		contentPanel.add(cpfTXT);
		
		//RG - 3 
		JLabel quartosLabel = new JLabel("RG");
		quartosLabel.setFont(fonte);
		quartosLabel.setBounds(62, 124, 250, 15);
		quartosLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(quartosLabel);

		rgTXT = new JTextField();
		rgTXT.setBounds(62, 149, 200, 30);
		rgTXT.setColumns(10);
		contentPanel.add(rgTXT);
		
		//Data de nascimento - 4 
		JLabel banheiroLabel = new JLabel("Dia");
		banheiroLabel.setFont(fonte);
		banheiroLabel.setBounds(322, 124, 30, 15);
		banheiroLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(banheiroLabel);

		diaTXT = new JTextField();
		diaTXT.setBounds(322, 149, 50, 30);
		diaTXT.setColumns(10);
		contentPanel.add(diaTXT);
		
		//Data de nascimento - 4.2
		JLabel lblMs = new JLabel("Mes");
		lblMs.setForeground(Color.WHITE);
		lblMs.setFont(new Font("Serif", Font.BOLD, 15));
		lblMs.setBounds(392, 124, 30, 15);
		contentPanel.add(lblMs);
		
		mesTXT = new JTextField();
		mesTXT.setColumns(10);
		mesTXT.setBounds(392, 149, 50, 30);
		contentPanel.add(mesTXT);
		
		//Data de nascimento - 4.3
		JLabel lblAno = new JLabel("Ano");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Serif", Font.BOLD, 15));
		lblAno.setBounds(465, 124, 30, 15);
		contentPanel.add(lblAno);
		
		anoTXT = new JTextField();
		anoTXT.setColumns(10);
		anoTXT.setBounds(465, 149, 50, 30);
		contentPanel.add(anoTXT);
		
		//CEP - 5
		JLabel vagasLabel = new JLabel("CEP");
		vagasLabel.setFont(fonte);
		vagasLabel.setBounds(62, 254, 250, 15);
		vagasLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(vagasLabel);

		cepTXT = new JTextField();
		cepTXT.setBounds(62, 279, 200, 30);
		cepTXT.setColumns(10);
		contentPanel.add(cepTXT);
		
		//Telefone - 6
		JLabel vendaLabel = new JLabel("Telefone");
		vendaLabel.setFont(fonte);
		vendaLabel.setBounds(322, 254, 250, 15);
		vendaLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(vendaLabel);

		telefoneTXT = new JTextField();
		telefoneTXT.setBounds(322, 279, 200, 30);
		telefoneTXT.setColumns(10);
		contentPanel.add(telefoneTXT);
		
		//Email - 7
		JLabel aluguelLabel = new JLabel("E-mail");
		aluguelLabel.setFont(fonte);
		aluguelLabel.setBounds(62, 324, 250, 15);
		aluguelLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(aluguelLabel);

		emailTXT = new JTextField();
		emailTXT.setBounds(62, 349, 200, 30);
		emailTXT.setColumns(10);
		contentPanel.add(emailTXT);
		
		//Salario - 6
		JLabel salarioLabel = new JLabel("Salario");
		salarioLabel.setFont(fonte);
		salarioLabel.setBounds(322, 324, 250, 15);
		salarioLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(salarioLabel);

		salarioTXT = new JTextField();
		salarioTXT.setBounds(322, 349, 200, 30);
		salarioTXT.setColumns(10);
		contentPanel.add(salarioTXT);
		
		//Email - 7
		JLabel crescilLabel = new JLabel("CRESCI");
		crescilLabel.setFont(fonte);
		crescilLabel.setBounds(62, 394, 250, 15);
		crescilLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(crescilLabel);

		cresciTXT = new JTextField();
		cresciTXT.setBounds(62, 419, 200, 30);
		cresciTXT.setColumns(10);
		contentPanel.add(cresciTXT);
		
		//PIS - 8
		JLabel pisLabel = new JLabel("PIS");
		pisLabel.setFont(fonte);
		pisLabel.setBounds(322, 394, 250, 15);
		pisLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(pisLabel);

		pisTXT = new JTextField();
		pisTXT.setBounds(322, 419, 200, 30);
		pisTXT.setColumns(10);
		contentPanel.add(pisTXT);
		
		

		JLabel erroSucesso = new JLabel();
		erroSucesso.setFont(fonte);
		erroSucesso.setBounds(330, 475, 500, 15);
		erroSucesso.setForeground(new Color(255, 255, 255));
		contentPanel.add(erroSucesso);
		
				
		
		
		//-------------------------------------------------FIM LABELS E TEXTO-------------------------------------------------//
		
		botaoCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ArrayList<String> str = new ArrayList<>();
					str.add(nomeTXT.getText().trim()); //0
					str.add(cpfTXT.getText().trim()); //1
					str.add(rgTXT.getText().trim()); //2
					str.add(ruaTXT.getText().trim() + "," + numeroTXT.getText().trim() + ". " + bairroTXT.getText().trim()); //3
					str.add(cepTXT.getText().trim()); //4
					str.add(telefoneTXT.getText().trim()); //5
					str.add(emailTXT.getText().trim()); //6
					str.add(cresciTXT.getText().trim()); //7
					str.add(pisTXT.getText().trim()); //8
					LocalDate datadenascimento = LocalDate.parse(setData(Integer.parseInt(diaTXT.getText().trim()), Integer.parseInt(mesTXT.getText().trim()), Integer.parseInt(anoTXT.getText().trim())));
					LocalDate dataAdmimissao = LocalDate.now();
					
					float salario = Float.parseFloat(salarioTXT.getText().trim());
					
					
					if(control.cadastroCorretor(str, salario, datadenascimento, dataAdmimissao)) {
						control.salvarArquivos();
						clearTXT();
						erroSucesso.setText("<html><center>Corretor cadastrado com Sucesso!!!</center></html>");
					}
					else {
						erroSucesso.setText("<html><center>Corretor nao cadastrado. Erro ocorreu!!!</center></html>");
					}
				} catch (Exception e2) {
					erroSucesso.setText("<html><center>Corretor nao cadastrado. Erro ocorreu!!!</center></html>");
					e2.printStackTrace();
				}
				
			}
			
			
		});
		
	}
	
	
	
	public void clearTXT() {
		
		nomeTXT.setText("");
		cpfTXT.setText("");
		rgTXT.setText("");
		diaTXT.setText("");
		mesTXT.setText("");
		anoTXT.setText("");
		ruaTXT.setText("");
		numeroTXT.setText("");
		bairroTXT.setText("");
		cepTXT.setText("");
		telefoneTXT.setText("");
		emailTXT.setText("");

	}
	
	public String setData(int dia, int mes, int ano) {
		if(dia >= 10) {
			if(mes >= 10) {
				return Integer.toString(ano) + "-" + Integer.toString(mes) + "-" + Integer.toString(dia);
			}
			else {
				return Integer.toString(ano) + "-0" + Integer.toString(mes) + "-" + Integer.toString(dia);
			}
		}
		else {
			if(mes >= 10) {
				return Integer.toString(ano) + "-" + Integer.toString(mes) + "-0" + Integer.toString(dia);
			}
			else {
				return Integer.toString(ano) + "-0" + Integer.toString(mes) + "-0" + Integer.toString(dia);
			}
		}
	}
}