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
import controle.Aluguel;



import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public final  class Rel_alugueis extends JDialog {
	
	
	private final JPanel contentPanel = new JPanel();
	private JTable tabela;
	private String [][] dados;
	private String [] titulos = {"Codigo A.", "Cliente", "Corretor", "Imovel", "D. Aluguel", "D. Devolucao","D. Pagamento","Total A.", "Valor A.", "Pago"};
	private int linha;
	private int coluna;
	
	private static Controlador controlador;
	private static Rel_alugueis relAluInst;

	public static void main(String[] args) {
		try {
			Rel_alugueis dialog = Rel_alugueis.getInstancia(Controlador.getInstancia());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Rel_alugueis getInstancia(Controlador control) {
		
		if(relAluInst == null) {
			relAluInst = new Rel_alugueis(control);
		}
		return relAluInst;
	}
	
	private Rel_alugueis(Controlador control) {
		controlador = control.getInstancia();
		setBounds(100, 100, 800, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
		setTitle("Relatorio alugueis");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosalugueis();
		setTabela();
		
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
		
	}
	


	public void setTamDadosalugueis() {
		this.dados = new String[controlador.getAlugueis().size()][10];
	}
	
	public void setTabela() {
		ArrayList<Aluguel> alugueis = controlador.getAlugueis();
		
		this.linha = 0;
		for(Aluguel alu : alugueis) {
			this.coluna = 0;
			
			String codigoAluguel = alu.getCodigoAluguel().toUpperCase();
			String cliente = (alu.getCliente().getCodigoUsuario());
			String corretor = (alu.getCorretor().getCodigoUsuario());
			String imovel = (alu.getImovel().getCodigoImovel());
			LocalDate dataAluguel = alu.getDataInicioAluguel();
			String data_aluguel = dataAluguel.getDayOfMonth()+"/"+dataAluguel.getMonthValue()+"/"+dataAluguel.getYear();
			LocalDate dataDevolucao = alu.getDataDevolucao();
			String data_devolucao = dataDevolucao.getDayOfMonth()+"/"+dataDevolucao.getMonthValue()+"/"+dataDevolucao.getYear();
			LocalDate dataPagamentoMensal = alu.getDataPagamentoMensal();
			String data_pagamento_mensal = dataPagamentoMensal.getDayOfMonth()+"/"+dataPagamentoMensal.getMonthValue()+"/"+dataPagamentoMensal.getYear();
			String valorTotalAluguel = Float.toString(alu.getValorTotalAluguel());
			String valor = Float.toString(alu.getImovel().getValorAluguel());
			String pago = Boolean.toString(alu.isPago());
			if(!alu.verificaAtraso()) {
				pago = "Pago";
			}
			else {
				pago = "Atrasado";
			}
					
			dados[this.linha][this.coluna] = codigoAluguel; this.coluna++;
			dados[this.linha][this.coluna] = cliente; this.coluna++;
			dados[this.linha][this.coluna] = corretor; this.coluna++;
			dados[this.linha][this.coluna] = imovel; this.coluna++;
			dados[this.linha][this.coluna] = data_aluguel; this.coluna++;
			dados[this.linha][this.coluna] = data_devolucao; this.coluna++;
			dados[this.linha][this.coluna] = data_pagamento_mensal; this.coluna++;
			dados[this.linha][this.coluna] = valorTotalAluguel; this.coluna++;
			dados[this.linha][this.coluna] = valor; this.coluna++;
			dados[this.linha][this.coluna] = pago; this.coluna++;
			this.linha++;
		}
		
		
	}
	
	public void att() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		setBounds(100, 100, 900, 600);
  		setIconImage(Toolkit.getDefaultToolkit().getImage("src/arquivos/bandeira_brasil.jpg"));
  		setTitle("Relatorio alugueis");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		setTamDadosalugueis();
		setTabela();
		tabela = new JTable(dados, titulos);
		scrollPane.setViewportView(tabela);
	}
	

}
