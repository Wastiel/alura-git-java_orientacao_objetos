
//Gerente e um Funcionario, gerente herda da class funcionario, assina o contrato autenticavel, 
// e um autenticavel

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chama o método de bonificacoa do GERENTE");
		return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}


	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
