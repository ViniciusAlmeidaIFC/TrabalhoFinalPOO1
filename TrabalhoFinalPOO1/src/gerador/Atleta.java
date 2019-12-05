package gerador;

import java.util.ArrayList;
import java.util.List;

public class Atleta {

	private String nome;
	protected List<Stats> lista = new ArrayList<Stats>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Stats> getLista() {
		return lista;
	}
	public void setLista(List<Stats> lista) {
		this.lista = lista;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atleta [nome=");
		builder.append(nome);
		builder.append(", lista=");
		builder.append(lista);
		builder.append("]");
		return builder.toString();
	}
	
	
}
