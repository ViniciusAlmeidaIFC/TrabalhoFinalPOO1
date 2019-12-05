package gerador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GeradorNomes {
	private List<String> list = new ArrayList<String>();
	
	public List<String>  importar(int QtdNomes) throws MalformedURLException, IOException {
		Gson gson = new Gson();
		InputStream is = new URL("http://www.curvello.com/gerador/nomecompleto/"+QtdNomes).openStream();
        try {
			BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			Type collectionType = new TypeToken<Collection<String>>(){}.getType();
			list = gson.fromJson(br, collectionType);
		}catch (Exception e) {
			e.printStackTrace();
		}
        
        return list;
        
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GeradorNomes [list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}
	
	
}
