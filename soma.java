//Valor final da variável SOMA no trecho de código:

public class SomaCalculada {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA será: " + SOMA);

        //O valor final de SOMA será 91. Isso porque a soma dos números de 1 a 13 resulta em 91
    }
}

