package analisador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import gerador.Atleta;

public class GraficoPizza2ptsMaisAcertou {

public static void gerarHtml(List<Atleta> vetor) throws IOException {
		
		String htmlGera = "<html>\r\n" + 
			"	<html>"+
		  "<head>"+
		    "<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>"+
		    "<script type=\"text/javascript\">"+
		      "google.charts.load(\"current\", {packages:[\"corechart\"]});"+
		      "google.charts.setOnLoadCallback(drawChart);"+
		      "function drawChart() {"+
		  	"      var data = new google.visualization.DataTable();\r\n" + 
			"      data.addColumn('string', 'Nome');\r\n" + 
			"      data.addColumn('number', 'Arremessos Acertados 2 pontos');\r\n" + 
			"      data.addColumn('number', 'Arremessos Tentados 2 pontos');\r\n" + 

			"\r\n" + 
			"      data.addRows([\r\n" + 	dadosGrafico(vetor) +		"      ]);\r\n" + 
			"\r\n" + 
		        "var options = {"+
		         "title: 'Mais Acertou Chutes de 2 pts (em Quantidade)',"+
		         " is3D: true,"+
		       " };"+

		      " var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));"+
		     "  chart.draw(data, options);"+
		    "  }"+
		   " </script>"+
		  "</head>"+
		  "<body>"+
		  "  <div id=\"piechart_3d\" style=\"width: 900px; height: 500px;\"></div>"+
		 " </body>"+
		"</html>"
		;
		
		FileWriter arq = new FileWriter("C:\\Users\\Vinicius\\Desktop\\graficoPizzaMaisChutes2pts.html");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf(htmlGera);
	    arq.close();
	}
	private static String dadosGrafico(List<Atleta> vetor) {
	String dados = "";
	for (Atleta atleta:vetor) {
		for (int i = 0;i < atleta.getLista().size() ;i++) {
			dados += "['"+ atleta.getNome()+ "' , " + String.valueOf(atleta.getLista().get(i).getPts2_certas()) + ", " + String.valueOf(atleta.getLista().get(i).getPts2_tentadas()) +"],\r\n";
		
		}
	}
	return dados;
	}
}
