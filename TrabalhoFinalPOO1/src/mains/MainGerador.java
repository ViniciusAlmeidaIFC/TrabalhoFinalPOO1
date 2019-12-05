package mains;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import gerador.Atleta;
import gerador.GeradorAtletas;
import persistencia.JSON;
import persistencia.Persistencia;
import persistencia.XML;

public class MainGerador {
	public static void main(String[] args) throws IOException, ParseException {
	GeradorAtletas ga = new GeradorAtletas();
	List<Atleta> listaAtleta = new ArrayList<Atleta>();
	List<Atleta> listaAtleta1 = new ArrayList<Atleta>();
	JSON json = new JSON();
	json.setNome("teste");
	XML xml = new XML();
	xml.setNome("teste");
	Persistencia pers = new Persistencia(json);
	int possui = 1;
	
	if (possui == 1) {
	listaAtleta = (ArrayList<Atleta>)pers.ler();
	
	listaAtleta1 = ga.geraAtleta(2,1);
	for (int i = 0; i < listaAtleta1.size();i++) {
		listaAtleta.add(listaAtleta1.get(i));
	}
	System.out.println(listaAtleta);
	
	json.gravar(listaAtleta);
	xml.gravar(listaAtleta);
	} else {
		listaAtleta1 = ga.geraAtleta(2,1);
		System.out.println(listaAtleta1);
		json.gravar(listaAtleta1);
		xml.gravar(listaAtleta1);
	}
	
	}
}
