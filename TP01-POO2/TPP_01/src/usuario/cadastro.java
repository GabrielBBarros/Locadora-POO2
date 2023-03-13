package usuario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import controle.*;
import imovel.*;
import seguro.*;

public class cadastro {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		LocalDate cadastro = LocalDate.now();
		LocalDate data;
		ArrayList<Usuario> clientes = new ArrayList<>();
		ArrayList<Usuario> corretores = new ArrayList<>();
		ArrayList<Aluguel> alugueis = new ArrayList<>();
		ArrayList<Venda> vendas = new ArrayList<>();
		ArrayList<Imovel> imoveis = new ArrayList<>();
		ArrayList<Seguro> seguros = new ArrayList<>();
		Configuracao configuracao = Configuracao.getInstancia();
		try {
			FileInputStream inn = new FileInputStream(configuracao.getArquivoCliente());
			ObjectInputStream obj = new ObjectInputStream(inn);
			clientes = (ArrayList<Usuario>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoCorretores());
			obj = new ObjectInputStream(inn);
			corretores = (ArrayList<Usuario>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoImoveis());
			obj = new ObjectInputStream(inn);
			imoveis = (ArrayList<Imovel>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoVendas());
			obj = new ObjectInputStream(inn);
			vendas = (ArrayList<Venda>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoSeguros());
			obj = new ObjectInputStream(inn);
			seguros = (ArrayList<Seguro>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoAlugueis());
			obj = new ObjectInputStream(inn);
			alugueis = (ArrayList<Aluguel>) obj.readObject();
			obj.close();
			inn.close();
			
		} catch (IOException|ClassNotFoundException e2) {
		}
		
		clientes.get(2).setCpf("78819839814");
		
		try {
			FileOutputStream out = new FileOutputStream(configuracao.getArquivoCliente());
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(clientes);
			obj.close();
			out.close();
		} catch (Exception e) {
		}
	
	}
}