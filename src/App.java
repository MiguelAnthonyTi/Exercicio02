import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //soma dos os números fornecidos enquanto forem positivos
        
       Scanner ler =new Scanner (System.in);
        int valor;
        int soma=0;

        System.out.println("Insira os numeros posistivos para soma, para encerrar apenas digite um numero negavativo:");
        valor=ler.nextInt();

        
        while (valor>=0) { // Como eu faço para incluir soma de um numero positivo com um numero negativo?
            soma =soma+valor;
            valor=ler.nextInt();
        
        }


        System.out.println("A soma dos valores positivos são: " + soma);
        ler.close();

    }
}
