public class Basic extends Conta{ //Inclusão

	public Basic(){
		super();
	}

	public Basic(float creditoInicial){ //Sobrecarga
		super();
		creditar(creditoInicial);
	}

	public void creditar(float valor){
		super.saldo += valor;
	}

	public void debitar(float valor){
		super.saldo -= valor;
	}

	public String toString(){
		return "Tipo de conta: Conta XPTO Basic\nID da conta: " + super.id + "\nSaldo da conta: " + super.saldo; //Coerção
	}
}