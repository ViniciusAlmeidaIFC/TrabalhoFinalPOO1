package analisador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import gerador.Atleta;

public class GraficoPizzaFTMaisAcertou {

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
			"      data.addColumn('number', 'Arremessos Acertados FT');\r\n" + 
			"      data.addColumn('number', 'Arremessos Tentados FT');\r\n" + 

			"\r\n" + 
			"      data.addRows([\r\n" + 	dadosGrafico(vetor) +		"      ]);\r\n" + 
			"\r\n" + 
		        "var options = {"+
		         "title: 'Mais Acertou Lances Livres (em Quantidade)',"+
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
		
		FileWriter arq = new FileWriter("C:\\Users\\Vinicius\\Desktop\\graficoPizzaMaisChutesFT.html");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf(htmlGera);
	    arq.close();
	}
	private static String dadosGrafico(List<Atleta> vetor) {
	String dados = "";
	for (Atleta atleta:vetor) {
		for (int i = 0;i < atleta.getLista().size() ;i++) {
			dados += "['"+ atleta.getNome()+ "' , " + String.valueOf(atleta.getLista().get(i).getFT_certas()) + ", " + String.valueOf(atleta.getLista().get(i).getFT_tentadas()) +"],\r\n";
		
		}
	}
	return dados;
	}
}
