public class Plus extends Conta{ //Inclusão

	public Plus(){
		super();
	}

	public Plus(float creditoInicial){ //Sobrecarga
		super();
		creditar(creditoInicial);
	}

	public void creditar(float valor){
		super.saldo += (valor + (valor * 0.005));
	}

	public void debitar(float valor){
		super.saldo -= valor;
	}

	public String toString(){
		return "Tipo de conta: Conta XPTO Plus\nID da conta: " + super.id + "\nSaldo da conta: " + super.saldo; //coerção
	}
}