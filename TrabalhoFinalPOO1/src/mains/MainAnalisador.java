package mains;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import analisador.Analisador;
import analisador.GeraGrafico;
import analisador.GeraGrafico2;
import analisador.Grafico2pts;
import analisador.Grafico3pts;
import analisador.GraficoFT;
import analisador.GraficoPizza2ptsMaisAcertou;
import analisador.GraficoPizza2ptsMaisTentou;
import analisador.GraficoPizza3ptsMaisAcertou;
import analisador.GraficoPizza3ptsMaisTentou;
import analisador.GraficoPizzaFTMaisAcertou;
import analisador.GraficoPizzaFTMaisTentou;
import analisador.GraficoPontuacaoTotal;
import gerador.Atleta;
import persistencia.JSON;
import persistencia.Persistencia;
import persistencia.XML;

public class MainAnalisador {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		
		List<Atleta> listaAtleta = new ArrayList<Atleta>();
		JSON json = new JSON();
		json.setNome("teste");
		XML xml = new XML();
		xml.setNome("teste");
		Persistencia pers = new Persistencia(json);
		listaAtleta = (ArrayList<Atleta>)pers.ler();
		
		Analisador analisador = new Analisador();
		System.out.println(analisador.qtdPontosPorPartida(listaAtleta));
		

		GeraGrafico g = new GeraGrafico();
		g.setVetor(listaAtleta);
		
		GeraGrafico2 g2 = new GeraGrafico2();
		g2.setVetor(analisador.qtdPontosPorPartida(listaAtleta));
		
		try {
			GraficoPontuacaoTotal.gerarHtml(g2.getVetor());
			Grafico3pts.gerarHtml(g.getVetor());
			Grafico2pts.gerarHtml(g.getVetor());
			GraficoFT.gerarHtml(g.getVetor());
			GraficoPizza3ptsMaisTentou.gerarHtml(g.getVetor());
			GraficoPizza2ptsMaisTentou.gerarHtml(g.getVetor());
			GraficoPizzaFTMaisTentou.gerarHtml(g.getVetor());
			GraficoPizza3ptsMaisAcertou.gerarHtml(g.getVetor());
			GraficoPizza2ptsMaisAcertou.gerarHtml(g.getVetor());
			GraficoPizzaFTMaisAcertou.gerarHtml(g.getVetor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
