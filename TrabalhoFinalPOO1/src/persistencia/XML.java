package persistencia;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import gerador.Atleta;

public class XML implements Gravacao {
	private String nome;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length()>0)
		this.nome = nome;
	}

	public List<Atleta> ler() throws ParseException{
		try {
		List <Atleta> lista = new ArrayList <Atleta>();
		FileInputStream fis = new FileInputStream(nome+".xml");
		BufferedInputStream buff = new BufferedInputStream(fis);
		XMLDecoder xml = new XMLDecoder(buff);
		lista = (List<Atleta>) xml.readObject();
		xml.close();
	    	return lista;
	    } catch(IOException e) {
	    	System.err.printf("Erro na Abertura do Arquivo: %s. \n", e.getMessage());
	    	return null;
	    }
	}
	
	public boolean gravar(List<Atleta> lista){
		try {
			FileOutputStream fos = new FileOutputStream(nome+".xml");
			BufferedOutputStream buff = new BufferedOutputStream(fos);
			XMLEncoder xml = new XMLEncoder(buff);
			xml.writeObject(lista);
			xml.close();
			
			return true;
			}catch (IOException e) {
				return false;
			}
	}
}
