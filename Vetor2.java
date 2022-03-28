//importa a classe Scanner para nosso projeto, que esta dentro do pacote java.util
import java.util.Scanner;
// declara uma classe publica chamada vertor 2 e inicia o corpo da classe por meio do sinal
public class Vetor2 {

public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
 int n=5;
 String funcionario[]=new String[n];
// comente cada linha em detalhe, não pode faltar nada
 for (int index = 0; index < funcionario.length; index++) {
     System.out.println("Digite o nome do funcionario");
     funcionario[index]=sc.next();
 }
 for (int index = 0; index < funcionario.length; index++) {
     System.out.println(funcionario[index]);
 

 }
 sc.close();
}
}