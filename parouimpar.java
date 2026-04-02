import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar");
        }
        
        sc.close();
   }
    
}
