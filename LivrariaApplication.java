import java.rmi.server.ServerNotActiveException;
import java.util.Scanner;

/**
 * LivrariaApplication
 */
public class LivrariaApplication {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Digite o seu nome: ");
String nome = sc.nextLine();

System.out.println("Digite sua idade :");
int idade = sc.nextInt();
if (idade < 18){
System.out.println("Voce é menor de idade!");

}else{System.out.println("Voce é maior de idade!");}




sc.close();
System.out.println("Olá," + nome + "!");
}
}