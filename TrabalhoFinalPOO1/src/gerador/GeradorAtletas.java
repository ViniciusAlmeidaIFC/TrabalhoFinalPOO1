package gerador;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class GeradorAtletas {
	private Atleta atleta;
	private List<Atleta> lista = new ArrayList<Atleta>();
	private GeradorNomes gn = new GeradorNomes();
	private List<String> list = new ArrayList<String>();
	private GeradorStats gs = new GeradorStats();
	private List<Stats> listaStats;
	
	public List<Atleta> geraAtleta(int qtdNomes, int qtdStats) throws MalformedURLException, IOException{
		list = gn.importar(qtdNomes);
		
		for (int i = 0; i < qtdNomes; i++) {
		atleta = new Atleta();
		listaStats = new ArrayList<Stats>();
		listaStats = gs.retornaStats(qtdStats);
		atleta.setNome(list.get(i));
		atleta.setLista(listaStats);
		lista.add(atleta);
		gs = new GeradorStats();
	}
	
	return lista; 
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GeradorAtletas [lista=");
		builder.append(lista);
		builder.append(", atleta=");
		builder.append(atleta);
		builder.append("]");
		return builder.toString();
	}

	

	

	

	
}
