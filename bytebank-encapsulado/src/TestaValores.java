
public class TestaValores {
	
	public static void main(String[] args) {
		
		//int total = 0;
		Conta conta = new Conta(1337,024226);
		//total++;
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232132);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(1337, 16549);
		//conta esta inconsistente
		//conta.setAgencia(-50);
		//conta.setNumero(-350);
		
		System.out.println(Conta.getTotal());
		
		
		System.out.println(conta.getAgencia());
		
	}

}
