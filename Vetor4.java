import java.util.Random;

public class Vetor4 {

    public static void main(String[] args) {

        Random random = new Random();
        int numero [] = {random.nextInt(100),random.nextInt(100),random.nextInt(100)};

        for (int index = 0; index < numero.length; index++) {
            if (numero[index] % 2 == 0){
                System.out.println("Pares");
                System.out.println(numero[index]);
            }
            else{
                System.out.println("Impares");
                System.out.println(numero[index]);
            }
        }
    }
}