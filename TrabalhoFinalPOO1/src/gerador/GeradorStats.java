package gerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorStats {

	private Random random = new Random();
	private Stats stats = new Stats();
	final int TAM = 25;
	private List<Stats> listaStats = new ArrayList<Stats>();
	
	public List<Stats> retornaStats(int qtdStats){
		for (int i = 0; i < qtdStats; i++) {
			stats.setPts2_tentadas(random.nextInt(TAM));
			stats.setPts2_certas(random.nextInt(TAM));
			if (stats.getPts2_certas() > stats.getPts2_tentadas()) {
				do {
					stats.setPts2_tentadas(random.nextInt(TAM));
					stats.setPts2_certas(random.nextInt(TAM));
				} while (stats.getPts2_certas() > stats.getPts2_tentadas());
			}
			stats.setFT_tentadas(random.nextInt(TAM));
			stats.setFT_certas(random.nextInt(TAM));
			if (stats.getFT_certas() > stats.getFT_tentadas()) {
				do {
					stats.setFT_tentadas(random.nextInt(TAM));
					stats.setFT_certas(random.nextInt(TAM));
				} while (stats.getFT_certas() > stats.getFT_tentadas());
			}
			stats.setPts3_tentadas(random.nextInt(TAM));
			stats.setPts3_certas(random.nextInt(TAM));
			if (stats.getPts3_certas() > stats.getPts3_tentadas()) {
				do {
					stats.setPts3_tentadas(random.nextInt(TAM));
					stats.setPts3_certas(random.nextInt(TAM));
				} while (stats.getPts3_certas() > stats.getPts3_tentadas());
			}
			listaStats.add(stats);
			stats = new Stats();
		}
		
		return listaStats;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GeradorStats [random=");
		builder.append(random);
		builder.append(", listaStats=");
		builder.append(listaStats);
		builder.append("]");
		return builder.toString();
	}
	
	
}
