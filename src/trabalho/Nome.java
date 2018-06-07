package trabalho;

import java.util.ArrayList;

public class Nome {
	
	//Atributos
	private String nome;
	
	public static ArrayList<Nome> dados = new ArrayList<>();
	
	//Métodos Mágicos
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
}
