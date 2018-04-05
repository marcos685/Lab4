public abstract class Conta{
	protected int id;
	protected float saldo;

	public Conta(){
		id = 0;
		saldo = 0f;
	}

	public abstract void creditar(float valor);
	public abstract void debitar(float valor);

	public float consultarSaldo(){
		return saldo;
	} 

}