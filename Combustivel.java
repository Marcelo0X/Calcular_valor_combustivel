public class Combustivel{

    private double gasolina = 3.30;
    private double alcool = 2.90;
    private double qtdLitros;
    private int opcao;

    public Combustivel(double qtdLitros, int opcao){
	setQtdLitros(qtdLitros);
	setOpcao(opcao);
    }
    public void setQtdLitros(double qtdLitros){
	this.qtdLitros = qtdLitros;
    }
    public double getQtdLitros(){
	return qtdLitros;
    }
    public void setOpcao(int opcao){
	this.opcao = opcao;
    }
    public int getOpcao(){
	return opcao;
    }
    public void gastoCombustivel(double valor){
	switch(opcao){
	case 1:
	    if(qtdLitros <= 20){
		valor = (qtdLitros * gasolina) * (1 - 0.04);
	    }else if(qtdLitros > 20){
		valor = (qtdLitros * gasolina) * (1 - 0.06);
	    }
	    break;
	case 2:
	    if(qtdLitros <= 20){
		valor = (qtdLitros * alcool) * (1 - 0.03);		
	    }else if(qtdLitros > 20){
		valor = (qtdLitros * alcool) * (1 - 0.05);
	    }
	    break;
	default:
	    System.out.println("Fora de escopo");
	}
	System.out.printf("Total R$ %.2f%n",valor);
    }

}
