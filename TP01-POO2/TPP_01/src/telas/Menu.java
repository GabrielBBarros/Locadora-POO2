package telas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public final class Menu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static Controlador control;
	private static Menu menuInst;
	ArrayList<Boolean> atualiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Menu dialog = Menu.getInstancia();
			dialog.setResizable(false);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static Menu getInstancia() {
		if(menuInst == null) {
			menuInst = new Menu();
		}
		return menuInst;
	}
	
	
	/**
	 * Create the dialog.
	 */
	private Menu() {
		control = Controlador.getInstancia();
		atualiza = new ArrayList<>();
		
		for(int i = 0; i< 23; i++) {
			atualiza.add(false);
		}
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(53, 78, 81));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnCad = new JButton("Cadastro");
		btnCad.setForeground(Color.WHITE);
		
		try {
			
		} catch (Exception e) {
		}
		//Redirecionamento
		JButton btncasa = new JButton("Casa");		
		btncasa.setBounds(57, 38, 0, 0);
		contentPanel.add(btncasa);
		
		JButton btnapartamento = new JButton("Apartamento");
		btnapartamento.setBounds(57, 90, 0, 0);
		contentPanel.add(btnapartamento);
		
		JButton btncomercio = new JButton("Comercio");
		btncomercio.setBounds(57, 102, 0, 0);
		contentPanel.add(btncomercio);
		
		JButton btncliente = new JButton("Cliente");
		btncliente.setBounds(57, 138, 0, 0);
		contentPanel.add(btncliente);
		
		JButton btncorretor = new JButton("Corretor");
		btncorretor.setBounds(57, 156, 0, 0);
		contentPanel.add(btncorretor);
		
		JButton btnseguro = new JButton("Seguro");
		btnseguro.setBounds(57, 182, 0, 0);
		contentPanel.add(btnseguro);
		
		JButton btnalugueis = new JButton("Alugueis");
		btnalugueis.setBounds(57, 182, 0, 0);
		contentPanel.add(btnalugueis);
		
		JButton btnvendas = new JButton("Vendas");
		btnvendas.setBounds(57, 182, 0, 0);
		contentPanel.add(btnvendas);
		
		JButton btnpagamento = new JButton("Pagamento");
		btnpagamento.setBounds(57, 182, 0, 0);
		contentPanel.add(btnpagamento);
		
		JButton btnTodosimoveis = new JButton("Todos Imoveis");
		btnTodosimoveis.setBounds(213, 38, 0, 0);
		contentPanel.add(btnTodosimoveis);
		
		JButton btnTodosclientes = new JButton("Todos Clientes");
		btnTodosclientes.setBounds(213, 68, 0, 0);
		contentPanel.add(btnTodosclientes);
		
		JButton btnTotalcorretores = new JButton("Total Corretores");
		btnTotalcorretores.setBounds(213, 98, 0, 0);
		contentPanel.add(btnTotalcorretores);
		
		JButton btnTodoscasas = new JButton("Todas Casas");
		btnTodoscasas.setBounds(213, 128, 0, 0);
		contentPanel.add(btnTodoscasas);
		
		JButton btnTodosapartamentos = new JButton("Todos Apartamentos");
		btnTodosapartamentos.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosapartamentos);
		
		JButton btnTodoscomercios = new JButton("Todos Comercios");
		btnTodoscomercios.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodoscomercios);
		
		JButton btnTodosseguros = new JButton("Todos Seguros");
		btnTodosseguros.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosseguros);
		
		JButton btnTodosalugueis = new JButton("Todos Alugueis");
		btnTodosalugueis.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosalugueis);
		
		JButton btnTodosvendas = new JButton("Todos Vendas");
		btnTodosvendas.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosvendas);
		
		JButton btnImoveldisponivel = new JButton("Imoveis disponiveis");
		btnImoveldisponivel.setBounds(213, 158, 0, 0);
		contentPanel.add(btnImoveldisponivel);
		
		JButton btnImovelindisponivel = new JButton("Imoveis indisponiveis");
		btnImovelindisponivel.setBounds(213, 158, 0, 0);
		contentPanel.add(btnImovelindisponivel);
		
		JButton btnImovelatrasado = new JButton("Imoveis atrasados");
		btnImovelatrasado.setBounds(213, 158, 0, 0);
		contentPanel.add(btnImovelatrasado);
		
		JButton btnImovelcomprado= new JButton("Imoveis comprados cliente");
		btnImovelcomprado.setBounds(213, 158, 0, 0);
		contentPanel.add(btnImovelcomprado);
		
		JButton btnImovelalugado= new JButton("Imoveis alugados cliente");
		btnImovelalugado.setBounds(213, 158, 0, 0);
		contentPanel.add(btnImovelalugado);
		
		JButton btnFuncionariomes= new JButton("Funcionario do mes");
		btnFuncionariomes.setBounds(213, 158, 0, 0);
		contentPanel.add(btnFuncionariomes);
		
		JButton btnClientesatrasados= new JButton("Clientes atrasados");
		btnClientesatrasados.setBounds(213, 158, 0, 0);
		contentPanel.add(btnClientesatrasados);
		
		
		JButton btnAlugueisfinalizados= new JButton("Alugueis finalizados");
		btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
		contentPanel.add(btnAlugueisfinalizados);
		
		JButton btnAlugueisnaofinalizados= new JButton("Alugueis nao finalizados");
		btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
		contentPanel.add(btnAlugueisnaofinalizados);
		
		JButton btnCasasvingente= new JButton("Casas vingente");
		btnCasasvingente.setBounds(213, 158, 0, 0);
		contentPanel.add(btnCasasvingente);
		
		JButton btnApartamentosvingente= new JButton("Apartamentos vingentes");
		btnApartamentosvingente.setBounds(213, 158, 0, 0);
		contentPanel.add(btnApartamentosvingente);
		
		JButton btnComerciovingente= new JButton("Comercio vingentes");
		btnComerciovingente.setBounds(213, 158, 0, 0);
		contentPanel.add(btnComerciovingente);
		
		JButton btnVendaslucro= new JButton("Vendas lucro");
		btnVendaslucro.setBounds(213, 158, 0, 0);
		contentPanel.add(btnVendaslucro);
		
		JButton btnVendasmes= new JButton("Vendas mes");
		btnVendasmes.setBounds(213, 158, 0, 0);
		contentPanel.add(btnVendasmes);
		
		JButton btnAtivarseguro = new JButton("Ativar seguro");
		btnAtivarseguro.setBounds(213,158,0,0);
		contentPanel.add(btnAtivarseguro);
		
		
		JLabel dropdown = new JLabel("");
		dropdown.setIcon(new ImageIcon("src/Arquivos/barra_cad2.jpg"));
		dropdown.setBounds(35, 29, 0, 0);
		contentPanel.add(dropdown);
		
		JLabel lbldropdown2 = new JLabel("");
		lbldropdown2.setIcon(new ImageIcon("src/Arquivos/barra_rel2.png"));
		lbldropdown2.setBounds(203, 29, 0, 0);
		contentPanel.add(lbldropdown2);
		
		
		
		btnCad.setBounds(35, 7, 139, 21);
		btnCad.setBackground(new Color(106,17,132));
		btnCad.setBorder(null);
		btnCad.setFocusPainted(false);
		contentPanel.add(btnCad);
		
		
		
		
		JButton btnRel = new JButton("Relat\u00F3rios");
		btnRel.setForeground(Color.WHITE);
		btnRel.setBounds(280, 7, 170, 21);
		btnRel.setBackground(new Color(107,17,132));
		btnRel.setBorder(null);
		btnRel.setFocusPainted(false);
		contentPanel.add(btnRel);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("src/Arquivos/barra.jpg"));
			lblNewLabel.setBackground(new Color(0, 0, 0));
			
			lblNewLabel.setBounds(0, 0, 786, 28);
			contentPanel.add(lblNewLabel);
		}
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setIcon(new ImageIcon("src/Arquivos/Logo.png"));
		lblNewLabel_1.setBounds(0, 29, 786, 534);
		contentPanel.add(lblNewLabel_1);
		
		
	
		//Funï¿½ï¿½o dropdown Cadastro
		btnCad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dropdown.setBounds(35, 29, 170, 209);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(45, 38, 120, 18);
				btnapartamento.setBounds(45, 60, 120, 18);
				btncliente.setBounds(45, 82, 120, 18);
				btncomercio.setBounds(45, 104, 120, 18);
				btncorretor.setBounds(45, 126, 120, 18);
				btnseguro.setBounds(45, 148, 120, 18);
				btnalugueis.setBounds(45, 170, 120, 18);
				btnvendas.setBounds(45, 192, 120, 18);
				btnpagamento.setBounds(45, 214, 120, 18);
				
				
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 158, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				
			}
		});
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				
				
			}
		});
		
		btnRel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 29, 340, 255);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				
				
				btnTodosimoveis.setBounds(213, 38, 148, 16);
				btnTodosclientes.setBounds(213, 58, 148, 16);
				btnTotalcorretores.setBounds(213, 78, 148, 16);
				btnTodoscasas.setBounds(213, 98, 148, 16);
				btnTodosapartamentos.setBounds(213, 118, 148, 16);
				btnTodoscomercios.setBounds(213, 138, 148, 16);
				btnTodosseguros.setBounds(213, 158, 148, 16);
				btnTodosalugueis.setBounds(213, 178, 148, 16);
				btnTodosvendas.setBounds(213, 198, 148, 16);
				btnImoveldisponivel.setBounds(213, 218, 148, 16);
				btnImovelindisponivel.setBounds(213, 238,  148, 16);
				btnImovelcomprado.setBounds(213, 258, 148, 16);
				
				btnImovelalugado.setBounds(380, 38, 148, 16);
				btnFuncionariomes.setBounds(380, 58, 148, 16);
				btnClientesatrasados.setBounds(380, 78, 148, 16);
				btnImovelatrasado.setBounds(380, 98, 148, 16);
				btnAlugueisfinalizados.setBounds(380, 118, 148, 16);
				btnAlugueisnaofinalizados.setBounds(380, 138, 148, 16);
				btnCasasvingente.setBounds(380, 158, 148, 16);
				btnApartamentosvingente.setBounds(380, 178, 148, 16);
				btnComerciovingente.setBounds(380, 198, 148, 16);
				btnVendaslucro.setBounds(380, 218, 148, 16);
				btnVendasmes.setBounds(380, 238, 148, 16);
				btnAtivarseguro.setBounds(380,258,148,16);
			}
		});
		
		//-------------------------------------------------------------------CADASTRO-------------------------------------------------------------------//
		//Cadastrar
		btncasa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Casa dialog = Cad_Casa.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btnapartamento.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Apartamento dialog = Cad_Apartamento.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btncomercio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Comercio dialog = Cad_Comercio.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btncliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Cliente dialog = Cad_Cliente.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btncorretor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Corretor dialog = Cad_Corretor.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btnseguro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Seguro dialog = Cad_Seguro.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btnalugueis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Aluguel dialog = Cad_Aluguel.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btnvendas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Venda dialog = Cad_Venda.getInstancia(control);
				dialog.setVisible(true);
			}
		});
		
		
		
		btnAtivarseguro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Ativar_Seguro dialog = Ativar_Seguro.getinstancia(control);
				dialog.setVisible(true);
			}
		});
		
		btnpagamento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btncasa.setBounds(57, 38, 0, 0);
				btnapartamento.setBounds(57, 70, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btncomercio.setBounds(57, 102, 0, 0);
				btncorretor.setBounds(57, 156, 0, 0);
				btnseguro.setBounds(57, 182, 0, 0);
				btnalugueis.setBounds(57, 220, 0, 0);
				btnvendas.setBounds(57, 250, 0, 0);
				btnpagamento.setBounds(57, 182, 0, 0);
				Cad_Pagamento dialog = Cad_Pagamento.getInstancia(control);
				dialog.setVisible(true);
				
			}
		});
		
		
		
		//-------------------------------------------------------------------RELATORIOS-------------------------------------------------------------------//
		btnTodosalugueis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_alugueis dialog = Rel_alugueis.getInstancia(control);
				if(atualiza.get(0) == true) {
					dialog.att();
				}
				else
					atualiza.set(0,true);
				
				dialog.setVisible(true);
			}
		});
		
		btnTodosapartamentos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_apartamento dialog = Rel_apartamento.getInstancia(control);
				if(atualiza.get(1)) 
					dialog.att();
				else
					atualiza.set(1,true);
				dialog.setVisible(true);
			}
		});
		
		btnTodoscasas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_casa dialog = Rel_casa.getInstancia(control);
				if(atualiza.get(2)) 
					dialog.att();
				else
					atualiza.set(2,true);
				dialog.setVisible(true);
			}
		});
		
		btnTodosclientes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_clientes dialog = Rel_clientes.getInstancia(control);
				if(atualiza.get(3)) 
					dialog.att();
				else
					atualiza.set(3,true);
				dialog.setVisible(true);
			}
		});
		
		btnTodoscomercios.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_comercio dialog = Rel_comercio.getInstancia(control);
				if(atualiza.get(4)) 
					dialog.att();
				else
					atualiza.set(4,true);
				dialog.setVisible(true);
			}
		});
	
		btnTotalcorretores.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Corretores dialog = Rel_Corretores.getInstancia(control);
				if(atualiza.get(5)) 
					dialog.att();
				else
					atualiza.set(5,true);
				dialog.setVisible(true);
			}
			
		});
		
		btnTodosimoveis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Imoveis dialog = Rel_Imoveis.getInstancia(control);
				if(atualiza.get(6)) 
					dialog.att();
				else
					atualiza.set(6,true);
				dialog.setVisible(true);
			}
		});
		
		btnTodosseguros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_seguros dialog = Rel_seguros.getInstancia(control);
				if(atualiza.get(7)) 
					dialog.att();
				else
					atualiza.set(7,true);
				dialog.setVisible(true);
			}
		});
		
		btnTodosvendas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_vendas dialog = Rel_vendas.getInstancia(control);
				if(atualiza.get(8)) 
					dialog.att();
				else
					atualiza.set(8,true);
				dialog.setVisible(true);
			}
		});
		
		btnAlugueisfinalizados.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Alugueis_finalizados dialog = Rel_Alugueis_finalizados.getInstancia(control);
				if(atualiza.get(9)) 
					
					dialog.att();
				else
					atualiza.set(9,true);
				dialog.setVisible(true);
			}
		});
		
		btnAlugueisnaofinalizados.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Alugueis_nao_finalizados dialog = Rel_Alugueis_nao_finalizados.getInstancia(control);
				if(atualiza.get(10)) 
					dialog.att();
				else
					atualiza.set(10,true);
				dialog.setVisible(true);
			}
		});
		
		btnApartamentosvingente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Apartamento_ainda_vingente dialog = Rel_Apartamento_ainda_vingente.getInstancia(control);
				if(atualiza.get(11)) 
					dialog.att();
				else
					atualiza.set(11,true);
				dialog.setVisible(true);
			}
		});
		
		btnCasasvingente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Casa_ainda_vingente dialog = Rel_Casa_ainda_vingente.getInstancia(control);
				if(atualiza.get(12)) 
					dialog.att();
				else
					atualiza.set(12,true);
				dialog.setVisible(true);
			}
		});
		
		btnComerciovingente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Comercio_ainda_vingente dialog = Rel_Comercio_ainda_vingente.getInstancia(control);
				if(atualiza.get(13)) 
					dialog.att();
				else
					atualiza.set(13,true);
				dialog.setVisible(true);
			}
		});
		
		btnFuncionariomes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Funcionario_do_mes dialog = Rel_Funcionario_do_mes.getInstancia(control);
				if(atualiza.get(14)) 
					dialog.att();
				else
					atualiza.set(14,true);
				dialog.setVisible(true);
			}
		});
		
		btnImovelalugado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Imoveis_aluguel_cliente dialog = Rel_Imoveis_aluguel_cliente.getInstancia(control);
				if(atualiza.get(15)) 
					dialog.att();
				else
					atualiza.set(15,true);
				dialog.setVisible(true);
			}
		});
		
		btnImovelatrasado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Imoveis_atrasados dialog = Rel_Imoveis_atrasados.getInstancia(control);
				if(atualiza.get(16)) 
					dialog.att();
				else
					atualiza.set(16,true);
				dialog.setVisible(true);
			}
		});
		
		btnImoveldisponivel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Imoveis_disponivel dialog = Rel_Imoveis_disponivel.getInstancia(control);
				if(atualiza.get(17)) 
					dialog.att();
				else
					atualiza.set(17,true);
				dialog.setVisible(true);
			}
		});
		
		btnImovelindisponivel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Imoveis_indisponivel dialog = Rel_Imoveis_indisponivel.getInstancia(control);
				if(atualiza.get(18)) 
					dialog.att();
				else
					atualiza.set(18,true);
				dialog.setVisible(true);
			}
		});
		
		
		btnImovelcomprado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Imoveis_vendas_cliente dialog = Rel_Imoveis_vendas_cliente.getInstancia(control);
				if(atualiza.get(19)) 
					dialog.att();
				else
					atualiza.set(19,true);
				dialog.setVisible(true);
			}
		});
		
		btnVendaslucro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Vendas_lucro dialog = Rel_Vendas_lucro.getInstancia(control);
				if(atualiza.get(20)) 
					dialog.att();
				else
					atualiza.set(20,true);
				dialog.setVisible(true);
			}
		});
		
		btnVendasmes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Vendas_mes dialog = Rel_Vendas_mes.getInstancia(control);
				if(atualiza.get(21))
					dialog.att();
				else
					atualiza.set(21,true);
				dialog.setVisible(true);
			}
		});

		btnClientesatrasados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnTodosimoveis.setBounds(213, 38, 0, 0);
				btnTodosclientes.setBounds(213, 68, 0, 0);
				btnTotalcorretores.setBounds(213, 98, 0, 0);
				btnTodoscasas.setBounds(213, 128, 0, 0);
				btnTodosapartamentos.setBounds(213, 128, 0, 0);
				btnTodoscomercios.setBounds(213, 138, 0, 0);
				btnTodosseguros.setBounds(213, 158, 0, 0);
				btnTodosalugueis.setBounds(213, 158, 0, 0);
				btnTodosvendas.setBounds(213, 158, 0, 0);
				btnImoveldisponivel.setBounds(213, 208, 0, 0);
				btnImovelindisponivel.setBounds(213, 158, 0, 0);
				btnImovelatrasado.setBounds(213, 158, 0, 0);
				btnImovelcomprado.setBounds(213, 158, 0, 0);
				btnImovelalugado.setBounds(213, 158, 0, 0);
				btnFuncionariomes.setBounds(213, 158, 0, 0);
				btnClientesatrasados.setBounds(213, 158, 0, 0);
				btnAlugueisfinalizados.setBounds(213, 158, 0, 0);
				btnAlugueisnaofinalizados.setBounds(213, 158, 0, 0);
				btnCasasvingente.setBounds(213, 158, 0, 0);
				btnApartamentosvingente.setBounds(213, 158, 0, 0);
				btnComerciovingente.setBounds(213, 158, 0, 0);
				btnVendaslucro.setBounds(213, 158, 0, 0);
				btnVendasmes.setBounds(213, 158, 0, 0);
				btnAtivarseguro.setBounds(213,158,0,0);
				Rel_Clientes_atrasados dialog = Rel_Clientes_atrasados.getInstancia(control);
				if(atualiza.get(22)) 
					dialog.att();
				else
					atualiza.set(22,true);
				dialog.setVisible(true);
			}
		});
	}
}