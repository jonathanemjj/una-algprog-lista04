import java.time.LocalDate;
import java.util.Scanner;

public class SiteJogos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int anoNascimento, anoAtual, idade;

        System.out.println("Digite o ano de nascimento");
        anoNascimento = sc.nextInt();

        
        anoAtual = LocalDate.now().getYear();

        idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado: Usuário menor de idade");
        }
          
        sc.close();


    }


    
    
}
