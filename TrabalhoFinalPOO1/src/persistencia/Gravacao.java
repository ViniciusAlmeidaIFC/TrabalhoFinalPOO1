package persistencia;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import gerador.Atleta;

public interface Gravacao {
	
	public boolean gravar(List<Atleta> list) throws IOException;
	public List<Atleta> ler() throws ParseException, FileNotFoundException;

}
