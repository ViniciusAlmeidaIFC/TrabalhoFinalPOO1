package analisador;

import java.util.ArrayList;
import java.util.List;

import gerador.Atleta;

public class Analisador {

	public List<Pontuacao> qtdPontosPorPartida(List<Atleta> lista){
		
		Pontuacao pontuacao = new Pontuacao();
		List<Pontuacao> listaPoints = new ArrayList<Pontuacao>();
		for (int i = 0; i < lista.size();i++) {
			for (int k = 0; k < lista.get(i).getLista().size(); k++) {
				int pts3 = 0, pts2 = 0 , ft = 0, ptsTotal = 0;
				pts3 += lista.get(i).getLista().get(k).getPts3_certas() * 3;
				pts2 += lista.get(i).getLista().get(k).getPts2_certas() * 2;
				ft += lista.get(i).getLista().get(k).getFT_certas();
				pontuacao = new Pontuacao();
				pontuacao.setPts3(pts3);
				pontuacao.setPts2(pts2);
				pontuacao.setFt(ft);
				pontuacao.setPtsTotal(pts3 + pts2 + ft);
				pontuacao.setNome(lista.get(i).getNome());
				listaPoints.add(pontuacao);
			}
		}
		return listaPoints;
	}
}
