package RPG_50taoo;

public class Personagem {
	//O que os personagens do nosso RPG terão em comum?
	
	private String nome;
	private int classe, arquetipo, vida, dano;
	
	public void atacar() {
		System.out.println("E dale dano!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public int getArquetipo() {
		return arquetipo;
	}

	public void setArquetipo(int arquetipo) {
		this.arquetipo = arquetipo;
	}

	public int getVida() {
		return vida;
	}

	public int getDano() {
		return dano;
	}
}