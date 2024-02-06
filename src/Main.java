import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner leitor = new Scanner(System.in);

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("A soma é: " + soma);
    }
}
