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
public final class Cad_Apartamento extends JDialog{

	private static Controlador control;
	private static Cad_Apartamento cadAptoInst;
	
	
	private final JPanel contentPanel = new JPanel();
	private JTextField ruaTXT;
	private JTextField numeroTXT;
	private JTextField bairroTXT;
	private JTextField areaTotalTXT;
	private JTextField areaConTXT;
	private JTextField quartosTXT;
	private JTextField banheiroTXT;
	private JTextField vagasTXT;
	private JTextField iptuTXT;
	private JTextField vendaTXT;
	private JTextField aluguelTXT;
	private JTextField andarTXT;
	private JTextField condominioTXT;


	public static void main(String[] args) {
		try {
			Cad_Apartamento ap = Cad_Apartamento.getInstancia(control.getInstancia());
			ap.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			ap.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Cad_Apartamento getInstancia(Controlador control) {
		if(cadAptoInst ==null) {
			cadAptoInst = new Cad_Apartamento(control);
		}
		return cadAptoInst;
	}
	

	private Cad_Apartamento(Controlador control) {
		this.control = control.getInstancia();
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Cadastro Apartamento");
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
		ruaLabel.setBounds(60, 10, 200, 15);
		ruaLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(ruaLabel);

		ruaTXT = new JTextField();
		ruaTXT.setBounds(60, 35, 200, 30);
		ruaTXT.setColumns(10);
		contentPanel.add(ruaTXT);
		
		//Endereco - pt 2
		JLabel numeroLabel = new JLabel("Numero");
		numeroLabel.setFont(fonte);
		numeroLabel.setBounds(300, 10, 200, 15);
		numeroLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(numeroLabel);

		numeroTXT = new JTextField();
		numeroTXT.setBounds(300, 35, 80, 30);
		numeroTXT.setColumns(10);
		contentPanel.add(numeroTXT);
		
		//Endereco - pt 3
		JLabel bairroLabel = new JLabel("Bairro");
		bairroLabel.setFont(fonte);
		bairroLabel.setBounds(400, 10, 200, 15);
		bairroLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(bairroLabel);

		bairroTXT = new JTextField();
		bairroTXT.setBounds(400, 35, 150, 30);
		bairroTXT.setColumns(10);
		contentPanel.add(bairroTXT);
		
		//Area Total - 1 
		JLabel areaTotalLabel = new JLabel("Area Total (m quadrado)");
		areaTotalLabel.setFont(fonte);
		areaTotalLabel.setBounds(60, 80, 250, 15);
		areaTotalLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(areaTotalLabel);

		areaTotalTXT = new JTextField();
		areaTotalTXT.setBounds(60, 105, 200, 30);
		areaTotalTXT.setColumns(10);
		contentPanel.add(areaTotalTXT);
		
		//Area Construida - 2
		JLabel areaConstruidaLabel = new JLabel("Area Construida (m quadrado)");
		areaConstruidaLabel.setFont(fonte);
		areaConstruidaLabel.setBounds(320, 80, 250, 15);
		areaConstruidaLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(areaConstruidaLabel);

		areaConTXT = new JTextField();
		areaConTXT.setBounds(320, 105, 200, 30);
		areaConTXT.setColumns(10);
		contentPanel.add(areaConTXT);
		
		//Dormitorios - 3 
		JLabel quartosLabel = new JLabel("Dormitorios");
		quartosLabel.setFont(fonte);
		quartosLabel.setBounds(60, 150, 250, 15);
		quartosLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(quartosLabel);

		quartosTXT = new JTextField();
		quartosTXT.setBounds(60, 175, 200, 30);
		quartosTXT.setColumns(10);
		contentPanel.add(quartosTXT);
		
		//Banheiros - 4 
		JLabel banheiroLabel = new JLabel("Banheiros");
		banheiroLabel.setFont(fonte);
		banheiroLabel.setBounds(320, 150, 250, 15);
		banheiroLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(banheiroLabel);

		banheiroTXT = new JTextField();
		banheiroTXT.setBounds(320, 175, 200, 30);
		banheiroTXT.setColumns(10);
		contentPanel.add(banheiroTXT);
		
		//Vagas - 5
		JLabel vagasLabel = new JLabel("Vagas na garagem");
		vagasLabel.setFont(fonte);
		vagasLabel.setBounds(60, 220, 250, 15);
		vagasLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(vagasLabel);

		vagasTXT = new JTextField();
		vagasTXT.setBounds(60, 245, 200, 30);
		vagasTXT.setColumns(10);
		contentPanel.add(vagasTXT);
		
		//Valor Venda - 6
		JLabel vendaLabel = new JLabel("Valor de venda");
		vendaLabel.setFont(fonte);
		vendaLabel.setBounds(320, 220, 250, 15);
		vendaLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(vendaLabel);

		vendaTXT = new JTextField();
		vendaTXT.setBounds(320, 245, 200, 30);
		vendaTXT.setColumns(10);
		contentPanel.add(vendaTXT);
		
		//Valor aluguel - 7
		JLabel aluguelLabel = new JLabel("Valor aluguel");
		aluguelLabel.setFont(fonte);
		aluguelLabel.setBounds(60, 290, 250, 15);
		aluguelLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(aluguelLabel);

		aluguelTXT = new JTextField();
		aluguelTXT.setBounds(60, 315, 200, 30);
		aluguelTXT.setColumns(10);
		contentPanel.add(aluguelTXT);
		
		//Valor IPTU - 8  
		JLabel iptuLabel = new JLabel("Valor IPTU");
		iptuLabel.setFont(fonte);
		iptuLabel.setBounds(320, 290, 250, 15);
		iptuLabel.setForeground(new Color(255, 255, 255));
		contentPanel.add(iptuLabel);

		iptuTXT = new JTextField();
		iptuTXT.setBounds(320, 315, 200, 30);
		iptuTXT.setColumns(10);
		contentPanel.add(iptuTXT);
		
		JLabel erroSucesso = new JLabel();
		erroSucesso.setFont(fonte);
		erroSucesso.setBounds(330, 475, 500, 15);
		erroSucesso.setForeground(new Color(255, 255, 255));
		contentPanel.add(erroSucesso);
		
		JLabel lblAndar = new JLabel("Andar");
		lblAndar.setForeground(Color.WHITE);
		lblAndar.setFont(new Font("Serif", Font.BOLD, 15));
		lblAndar.setBounds(60, 361, 250, 15);
		contentPanel.add(lblAndar);
		
		andarTXT = new JTextField();
		andarTXT.setColumns(10);
		andarTXT.setBounds(60, 386, 200, 30);
		contentPanel.add(andarTXT);
		
		JLabel lblValorCondomnio = new JLabel("Valor Condominio");
		lblValorCondomnio.setForeground(Color.WHITE);
		lblValorCondomnio.setFont(new Font("Serif", Font.BOLD, 15));
		lblValorCondomnio.setBounds(320, 361, 250, 15);
		contentPanel.add(lblValorCondomnio);
		
		condominioTXT = new JTextField();
		condominioTXT.setColumns(10);
		condominioTXT.setBounds(320, 386, 200, 30);
		contentPanel.add(condominioTXT);
		
		//-------------------------------------------------FIM LABELS E TEXTO-------------------------------------------------//
		
		botaoCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ArrayList<Float> fl = new ArrayList<>();
					ArrayList<Integer> in = new ArrayList<>();
					
					fl.add(Float.parseFloat(areaTotalTXT.getText().trim()));
					fl.add(Float.parseFloat(areaConTXT.getText().trim()));
					fl.add(Float.parseFloat(iptuTXT.getText().trim()));
					fl.add(Float.parseFloat(vendaTXT.getText().trim()));
					fl.add(Float.parseFloat(aluguelTXT.getText().trim()));
					fl.add(Float.parseFloat(condominioTXT.getText().trim()));
					in.add(Integer.parseInt(quartosTXT.getText().trim()));
					in.add(Integer.parseInt(banheiroTXT.getText().trim()));
					in.add(Integer.parseInt(vagasTXT.getText().trim()));
					in.add(Integer.parseInt(andarTXT.getText().trim()));
					String endereco = ruaTXT.getText().trim() + "," + numeroTXT.getText().trim() + ". " + bairroTXT.getText().trim();
					LocalDate data = LocalDate.now();
					if(control.cadastroApartamento(endereco, data, fl, in)) {
						control.salvarArquivos();
						clearTXT();
						erroSucesso.setText("<html><center>Apartamento cadastrado com Sucesso!!!</center></html>");
					}
					else {
						erroSucesso.setText("<html><center>Apartamento nao cadastrado. Erro ocorreu!!!</center></html>");
					}
				} catch (Exception e2) {
					erroSucesso.setText("<html><center>Apartamento nao cadastrado. Erro ocorreu!!!</center></html>");
					e2.printStackTrace();
				}
			}
		});
	}
	
	public void clearTXT() {
		ruaTXT.setText("");
		numeroTXT.setText("");
		bairroTXT.setText("");
		areaTotalTXT.setText("");
		areaConTXT.setText("");
		quartosTXT.setText("");
		banheiroTXT.setText("");
		vagasTXT.setText("");
		iptuTXT.setText("");
		vendaTXT.setText("");
		aluguelTXT.setText("");
		andarTXT.setText("");
		condominioTXT.setText("");
	}
}
