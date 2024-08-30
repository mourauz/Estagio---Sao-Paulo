import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Faturamento {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("faturamento.json")));
            JSONArray faturamentoMensal = new JSONArray(content);

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;
            List<Double> faturamentosValidos = new ArrayList<>();

            for (int i = 0; i < faturamentoMensal.length(); i++) {
                double valor = faturamentoMensal.getJSONObject(i).getDouble("valor");
                if (valor > 0) {
                    if (valor < menorFaturamento) {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento) {
                        maiorFaturamento = valor;
                    }
                    somaFaturamento += valor;
                    diasComFaturamento++;
                    faturamentosValidos.add(valor);
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;
            int diasAcimaMedia = 0;

            for (double valor : faturamentosValidos) {
                if (valor > mediaMensal) {
                    diasAcimaMedia++;
                }
            }

            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento superior à média: " + diasAcimaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
