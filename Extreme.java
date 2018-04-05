public class Extreme extends Conta{  //Inclusão

	public Extreme(){
		super();
	}

	public Extreme(float creditoInicial){ //Sobrecarga
		super();
		creditar(creditoInicial);
	}

	public void creditar(float valor){
		super.saldo += (valor + (valor * 0.002));
	}

	public void debitar(float valor){
		super.saldo -= (valor - (valor * 0.002));
	}

	public String toString(){
		return "Tipo de conta: Conta XPTO Extreme\nID da conta: " + super.id + "\nSaldo da conta: " + super.saldo; //Coerção
	}
}