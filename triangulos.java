import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {
        
        int ladoA, ladoB, ladoC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado");
        ladoA = sc.nextInt();

        System.out.println("Digite o segundo lado");
        ladoB = sc.nextInt();

        System.out.println("Digite o terceiro lado");
        ladoC = sc.nextInt();

        if (
            ladoA + ladoB > ladoC &&
            ladoA + ladoC > ladoB &&
            ladoB + ladoC > ladoA
        ) {
            System.out.println(" Os valores formam um triângulo:");

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println(" Equilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println(" Isósceles");
            } else {
                System.out.println(" Escaleno");
            }
        } else {
            System.out.println(" Esses valores não formam um triângulo ");
        }
        sc.close();

        
    }
    
}
