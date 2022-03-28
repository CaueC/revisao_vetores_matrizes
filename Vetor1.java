public class Vetor1{

public static void main(String[] args) {

    int tamanho=20;
    String produto [] = new String [10];
    produto[0]= "Amendoim";
    produto[1]= "Cana de açucar";
    produto[2]= "Soja";
    produto[3]= "Café";
    produto[4]= "Carne";
    produto[5]= "Arroz";
    produto[6]= "Trigo";
    produto[7]= "Gasolina";
    produto[8]= "Milho";
    produto[9]= "Algodão";

    int estoque[]=new int [10];
    estoque[0]= 100;
    estoque[1]= 5000;
    estoque[2]= 60;
    estoque[3]= 20;
    estoque[4]= 15;
    estoque[5]= 60;
    estoque[6]= 100;
    estoque[7]= 7;
    estoque[8]= 60;
    estoque[9]= 100;

    for (int index = 0; index < estoque.length; index++) {
        System.out.println("O produto "+ produto[index] + " tem 10" + estoque [index]+ " unidades em estoque");

    }


}
}