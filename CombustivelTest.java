import java.util.Scanner;

public class CombustivelTest{

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args){
	calcCombustivel();
    }
    public static void calcCombustivel(){
	double valor = 0;
	try{
	    System.out.print("1 Gasolina 2 Alcool? ");
	    int opcao = inp.nextInt();
	    System.out.print("Quantidade de litros ? ");
	    double qtdLitros = inp.nextDouble();
	    Combustivel combustivel = new Combustivel(qtdLitros, opcao);
	    combustivel.gastoCombustivel(valor);
	}catch(Exception k){
	    System.out.println(k);
	    inp.nextLine();
	}
    }
    
}
