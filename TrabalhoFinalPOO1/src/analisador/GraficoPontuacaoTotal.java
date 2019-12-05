package analisador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GraficoPontuacaoTotal {

public static void gerarHtml(List<Pontuacao> vetor) throws IOException {
		
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
				"      data.addColumn('number', 'Pontuação Total');\r\n" + 

				"\r\n" + 
				"      data.addRows([\r\n" + 	dadosGrafico(vetor) +		"      ]);\r\n" + 
				"\r\n" + 
				"      var options = {\r\n" + 
				"        chart: {\r\n" + 
				"          title: 'Pontuação total de cada Atleta',\r\n" + 
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
		
		
		FileWriter arq = new FileWriter("C:\\Users\\Vinicius\\Desktop\\graficoPonitsTotal.html");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf(htmlGera);
	    arq.close();
	}
	private static String dadosGrafico(List<Pontuacao> vetor) {
		String dados = "";
		for (Pontuacao pontuacao:vetor) {
			dados += "['"+ pontuacao.getNome()+ "' , " + String.valueOf(pontuacao.getPtsTotal()) +"],\r\n";
			
		}
		return dados;
	}
}
