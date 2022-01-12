
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica (Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("pode acessar o Sistema");			
		}else {
			System.out.println("Nao pode acessar o Sistema");
		}
	}

}
