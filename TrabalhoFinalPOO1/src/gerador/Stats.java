package gerador;

public class Stats {

	private int Pts2_certas;
	private int Pts2_tentadas;
	private int Pts3_certas;
	private int Pts3_tentadas;
	private int FT_certas;
	private int FT_tentadas;
	
	public int getPts2_certas() {
		return Pts2_certas;
	}
	public void setPts2_certas(int pts2_certas) {
		Pts2_certas = pts2_certas;
	}
	public int getPts2_tentadas() {
		return Pts2_tentadas;
	}
	public void setPts2_tentadas(int pts2_tentadas) {
		Pts2_tentadas = pts2_tentadas;
	}
	public int getPts3_certas() {
		return Pts3_certas;
	}
	public void setPts3_certas(int pts3_certas) {
		Pts3_certas = pts3_certas;
	}
	public int getPts3_tentadas() {
		return Pts3_tentadas;
	}
	public void setPts3_tentadas(int pts3_tentadas) {
		Pts3_tentadas = pts3_tentadas;
	}
	public int getFT_certas() {
		return FT_certas;
	}
	public void setFT_certas(int fT_certas) {
		FT_certas = fT_certas;
	}
	public int getFT_tentadas() {
		return FT_tentadas;
	}
	public void setFT_tentadas(int fT_tentadas) {
		FT_tentadas = fT_tentadas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stats [Pts2_certas=");
		builder.append(Pts2_certas);
		builder.append(", Pts2_tentadas=");
		builder.append(Pts2_tentadas);
		builder.append(", Pts3_certas=");
		builder.append(Pts3_certas);
		builder.append(", Pts3_tentadas=");
		builder.append(Pts3_tentadas);
		builder.append(", FT_certas=");
		builder.append(FT_certas);
		builder.append(", FT_tentadas=");
		builder.append(FT_tentadas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
