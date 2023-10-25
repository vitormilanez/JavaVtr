package Beto_classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class GoogleProgramable {


        public static void main(String[] args) {

            String apiKey = "AIzaSyAs5OVQWnDRY7I34axhu63mSWk8A5PfSD8";

            String cx = "549332260ff2c43e7";

            // Ler a lista de empresas de um arquivo CSV
            List<String[]> empresas = new ArrayList<>();
            try (BufferedReader csvReader = new BufferedReader(new FileReader("empresas.csv"))) {
                String line;
                while ((line = csvReader.readLine()) != null) {
                    String[] empresa = line.split(",");
                    empresas.add(empresa);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            // Atualizar a lista de empresas com os sites encontrados
            for (String[] empresa : empresas) {
                String nome = empresa[0];
                String endereco = empresa[1];
                String query = nome + " " + endereco + " site:";

                try {
                    String site = performGoogleSearch(apiKey, cx, query);
                    if (site != null) {
                        // Remove o protocolo e qualquer coisa após o domínio
                        site = site.split("//")[1].split("/")[0];
                    }
                    empresa[2] = site;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // Salvar a lista atualizada em um novo arquivo CSV
            try (FileWriter csvWriter = new FileWriter("empresas_atualizadas.csv")) {
                for (String[] empresa : empresas) {
                    csvWriter.append(String.join(",", empresa));
                    csvWriter.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Função para realizar a pesquisa no Google
        private static String performGoogleSearch(String apiKey, String cx, String query) throws IOException {
            String url = "https://customsearch.googleapis.com/customsearch/v1?key=AIzaSyAHrD5WMfGf1vHgrFDNtRr5zxYuRlzGHQY&cx=05fcf2b036aaa4715&q=DIESEL%20DENMARK%20APS%20cvr%2011109977";
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                return response.toString();
            }
        }
    }
