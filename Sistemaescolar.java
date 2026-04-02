import java.util.Scanner;

public class Sistemaescolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double notaA, notaB, media;

        System.out.println("Digite a nota da Prova A: ");
        notaA = sc.nextDouble();

        System.out.println("Digite a nota da Prova B: ");
        notaB = sc.nextDouble();

        media = (notaA + notaB) /2;

       if (media >= 7){
        System.out.println("Você está aprovado!!");
       } else if (media >= 5){
        System.out.println("Você está de recuperação");
       }else 
        System.out.println("Você está reprovado");
        
        sc.close();
    } 
    
}
