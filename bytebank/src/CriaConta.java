
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);	
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo += 50;
		System.out.println(segundaConta.saldo);	
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println("A primeira conta esta na agencia " + primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		
		System.out.println("a Segunda conta esta na agencia " + segundaConta.agencia);
		System.out.println(segundaConta.numero);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Sao a mesma conta");
		}else {
			System.out.println("Não sao a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}

}
