package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import gerador.Atleta;

public class JSON implements Gravacao {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
		this.nome = nome;
	}

	public List<Atleta> ler() throws ParseException, FileNotFoundException{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(nome+".json"));

		    Type listType = new TypeToken<ArrayList<Atleta>>(){}.getType();

		    List<Atleta> lista = new ArrayList<Atleta>();
		   
		    return lista = new Gson().fromJson(bufferedReader, listType);
	}
	
	public boolean gravar(List<Atleta> lista) throws IOException{
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer = new FileWriter(nome+".json");
	    writer.write(gson.toJson(lista));
	    writer.close();
	    return true;
	}
}
