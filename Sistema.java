import java.util.ArrayList;
import java.util.List;

public class Sistema{
	List<Conta> c = new ArrayList<Conta>();

	public Sistema(){
		c.add(null);
	}

	public void criarContaXPTOBasic(int i){
		c.add(i, new Basic());
	}

	public void criarContaXPTOPlus(int i){
		c.add(i, new Plus());
	}

	public void criarContaXPTOExtreme(int i){
		c.add(i, new Extreme());
	}

	public void creditar(int i, float valor){
		c.get(i).creditar(valor);
	}

	public void debitar(int i, float valor){
		c.get(i).debitar(valor);
	}

	public float consultarSaldo(int i){
		return c.get(i).consultarSaldo();
	}


	public static void main (String args[]){
		Sistema s = new Sistema();
		s.criarContaXPTOBasic(1);
		s.criarContaXPTOPlus(2);
		s.criarContaXPTOExtreme(3);

		for(int i = 1; i <=3; i++) s.creditar(i, 1000); //Coerção

		for(int i = 1; i<=3; i++) s.debitar(i, 10); //Coerção

		System.out.println(s.consultarSaldo(1) == 990); //Coerção
		System.out.println(s.consultarSaldo(2) == 995); //Coerção
		System.out.println(s.consultarSaldo(3) == 992.02f); //Coerção
	}
}