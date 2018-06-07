package trabalho;

public class Acao {
	
	public void SalvarNome(String nome) {
		
		Nome n = new Nome();
		n.setNome(nome);
		
		Nome.dados.add(n);
		
	}

}
