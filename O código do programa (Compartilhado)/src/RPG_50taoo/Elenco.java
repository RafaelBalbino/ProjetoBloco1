package RPG_50taoo;

public class Elenco {
	private String nome, papel;

	public String toString() {
		return nome + "\t" + papel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
}
