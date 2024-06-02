package escola;

public class Aluno {
	private String nome;
	private int idade;
	
	private String sexo;
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	}



//getS ou setS

//primeiro se define os atributos, nome, idade
//em vez disso, clicar com o botão direito do mouse
// source - generate getters and setters e aí se colcoar os getters e setters e facilita muito.

//para criar novo atributo
//escrever private String sexo e faz o mesmo caminho acima e o atributo
// já vai aparecer em getters and setters

