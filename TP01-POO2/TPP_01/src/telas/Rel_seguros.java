package telas;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import controlador.*;
import seguro.Seguro;


import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public final class Rel_seguros extends JDialog {
	
	private static Controlador controlador;
	private static Rel_seguros relSegInst;
	
	private final JPanel contentPanel = new JPanel();
	private JTable tabela;
	private String [][] dados;
	private String [] titulos = {"Codigo S.", "Nome Seguradora","Tipo", "Descricao", "Valor"};
	private int linha;
	private int coluna;


	public static void main(String[] args) {
		try {
			Rel_seguros dialog = Rel_seguros.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Rel_seguros getInstancia(Controlador control) {
		
		if(relSegInst == null) {
			relSegInst = new Rel_seguros(control);
		}
		return relSegInst;
	}
	
	
	private Rel_seguros(Controlador control) {
		controlador = control.getInstancia();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio seguros");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosseguros();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
	}

	public void setTamDadosseguros() {
		this.dados = new String[controlador.getSeguros().size()][5];
	}
	
	public void setTabela() {
		ArrayList<Seguro> seguro = controlador.getSeguros();
		
		this.linha = 0;
		for(Seguro seg : seguro) {
			this.coluna = 0;
			String codigoSeguro = (seg.getCodigoSeguro());
			String nomeSeguradora = seg.getNomeSeguradora();
			String tipo = seg.getTipo();
			String descricao = seg.getDescricao();
			String valor = Float.toString(seg.getValor());
					
			dados[this.linha][this.coluna] = codigoSeguro; this.coluna++;
			dados[this.linha][this.coluna] = nomeSeguradora; this.coluna++;
			dados[this.linha][this.coluna] = tipo; this.coluna++;
			dados[this.linha][this.coluna] = descricao; this.coluna++;
			dados[this.linha][this.coluna] = valor; this.coluna++;
			this.linha++;
		}
	}
	
	public void att() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		setBounds(100, 100, 900, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio seguros");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosseguros();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
	}
}
