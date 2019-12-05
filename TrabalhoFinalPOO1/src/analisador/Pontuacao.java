package analisador;

public class Pontuacao {

	private String nome;
	private int pts3 = 0; 
	private int pts2 = 0;
	private int	ft = 0; 
	private int ptsTotal = 0;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPts3() {
		return pts3;
	}
	public void setPts3(int pts3) {
		this.pts3 = pts3;
	}
	public int getPts2() {
		return pts2;
	}
	public void setPts2(int pts2) {
		this.pts2 = pts2;
	}
	public int getFt() {
		return ft;
	}
	public void setFt(int ft) {
		this.ft = ft;
	}
	public int getPtsTotal() {
		return ptsTotal;
	}
	public void setPtsTotal(int ptsTotal) {
		this.ptsTotal = ptsTotal;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pontuacao [nome=");
		builder.append(nome);
		builder.append(", pts3=");
		builder.append(pts3);
		builder.append(", pts2=");
		builder.append(pts2);
		builder.append(", ft=");
		builder.append(ft);
		builder.append(", ptsTotal=");
		builder.append(ptsTotal);
		builder.append("]");
		return builder.toString();
	}
	
}
