import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int velocidade, excesso;
        double multa;

       System.out.println("Digite a velocidade do carro ");
       velocidade = sc.nextInt();

       if (velocidade > 80){
        excesso = velocidade - 80;
        multa = excesso * 7.0;

        System.out.println("Você foi multado! ");
        System.out.println(" Valor da multa " + multa);
       } else {
        System.out.println("Boa viagem!");

        sc.close();
       }

        }
    }
    

