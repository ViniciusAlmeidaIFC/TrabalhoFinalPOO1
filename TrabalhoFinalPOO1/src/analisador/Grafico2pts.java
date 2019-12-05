package analisador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import gerador.Atleta;

public class Grafico2pts {

public static void gerarHtml(List<Atleta> vetor) throws IOException {
		
		String htmlGera = "<html>\r\n" + 
				"<head>\r\n" + 
				"  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\">\r\n" + 
				"      google.charts.load('current', {'packages':['bar']});\r\n" + 
				"      google.charts.setOnLoadCallback(drawChart);\r\n" + 
				"\r\n" + 
				"    function drawChart() {\r\n" + 
				"\r\n" + 
				"      var data = new google.visualization.DataTable();\r\n" +
				"      data.addColumn('string', 'Nome Atleta');\r\n" +
				"      data.addColumn('number', 'Arremessos Tentados 2 pontos');\r\n" + 
				"      data.addColumn('number', 'Arremessos Acertados 2 pontos');\r\n" + 
				"      data.addColumn('number', 'Total de 2 pontos');\r\n" + 

				"\r\n" + 
				"      data.addRows([\r\n" + 	dadosGrafico(vetor) +		"      ]);\r\n" + 
				"\r\n" + 
				"      var options = {\r\n" + 
				"        chart: {\r\n" + 
				"          title: 'Número de tentativas e acertos por Atleta',\r\n" + 
				"          subtitle: 'Feito por: Vinicius Goulart Almeida'\r\n" + 
				"        },\r\n" + 
				"        width: 900,\r\n" + 
				"        height: 500,\r\n" + 
				"        axes: {\r\n" + 
				"          x: {\r\n" + 
				"            0: {side: 'top'}\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"      };\r\n" + 
				"\r\n" + 
				"      var chart = new google.charts.Bar(document.getElementById('bar_top_x'));\r\n" + 
				"\r\n" + 
				"      chart.draw(data, google.charts.Bar.convertOptions(options));\r\n" + 
				"    }\r\n" + 
				"  </script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"  <div id=\"bar_top_x\"></div>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"";
		
		
		FileWriter arq = new FileWriter("C:\\Users\\Vinicius\\Desktop\\grafico2pts.html");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf(htmlGera);
	    arq.close();
	}
	private static String dadosGrafico(List<Atleta> vetor) {
		String dados = "";
		for (Atleta atleta:vetor) {
			for (int i = 0;i < atleta.getLista().size() ;i++)
			dados += "['"+ atleta.getNome()+ "' , " + String.valueOf(atleta.getLista().get(i).getPts2_tentadas()) + ", " + String.valueOf(atleta.getLista().get(i).getPts2_certas())+ " , " + String.valueOf(atleta.getLista().get(i).getPts2_tentadas()*2) +"],\r\n";
			
		}
		return dados;
	}
}
