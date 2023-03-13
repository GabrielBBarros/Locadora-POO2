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
import usuario.*;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public final class Rel_Corretores extends JDialog {
	
	private static Controlador controlador;
	private static Rel_Corretores relCorInst;
	
	private final JPanel contentPanel = new JPanel();
	private JTable tabela;
	private String [][] dados;
	private String [] titulos = {"Codigo", "Nome", "CPF", "RG", "Data de nascimento","Endereco","CEP", "Telefone", "E-mail", "Cresci", "Salario", "PIS", "Data Admissao"};
	private int linha;
	private int coluna;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Corretores dialog = Rel_Corretores.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Rel_Corretores getInstancia(Controlador control) {
		
		if(relCorInst == null) {
			relCorInst = new Rel_Corretores(control);
		}
		return relCorInst;
	}
	
	private Rel_Corretores(Controlador control) {
		controlador = control.getInstancia();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio corretores");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadoscorretor();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
		
		
		
	}

	public void setTamDadoscorretor() {
		this.dados = new String[controlador.getCorretores().size()][13];
	}
	
	public void setTabela() {
		ArrayList<Usuario> corretor = controlador.getCorretores();
		
		this.linha = 0;
		for(Usuario usu : corretor) {
			this.coluna = 0;
			String codigo = (usu.getCodigoUsuario());
			String nome = usu.getNome();
			String cpf = usu.getCpf();
			String RG = usu.getRg();
			LocalDate dataNascimento = usu.getDatadenascimento();
			String data = dataNascimento.getDayOfMonth()+"/"+ dataNascimento.getMonthValue()+"/"+dataNascimento.getYear();
			String endereco = usu.getEndereco();
			String CEP = usu.getCep();
			String telefone = usu.getTelefone();
			String email = usu.getEmail();
			String cresci = usu.getCreci();
			String salario = Float.toString(usu.getSalario());
			String pis = usu.getPis();
			LocalDate dataAdmissao = usu.getDataAdmissao();
			String data_adm = dataAdmissao.getDayOfMonth()+"/"+dataAdmissao.getMonthValue()+"/"+dataAdmissao.getYear();
			

			dados[this.linha][this.coluna] = codigo; this.coluna++;
			dados[this.linha][this.coluna] = nome; this.coluna++;
			dados[this.linha][this.coluna] = cpf; this.coluna++;
			dados[this.linha][this.coluna] = RG; this.coluna++;
			dados[this.linha][this.coluna] = data; this.coluna++;
			dados[this.linha][this.coluna] = endereco; this.coluna++;
			dados[this.linha][this.coluna] = CEP; this.coluna++;
			dados[this.linha][this.coluna] = telefone; this.coluna++;
			dados[this.linha][this.coluna] = email; this.coluna++;
			dados[this.linha][this.coluna] = cresci; this.coluna++;
			dados[this.linha][this.coluna] = salario; this.coluna++;
			dados[this.linha][this.coluna] = pis; this.coluna++;
			dados[this.linha][this.coluna] = data_adm; this.coluna++;
			this.linha++;
		}
	}
	
	
	public void att() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio corretores");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadoscorretor();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
	}

}
