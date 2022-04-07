package RPG_50taoo;

public class Personagem {
	//O que os personagens do nosso RPG terão em comum?
	
	private String nome;
	private int classe, arquetipo, vida, arma, armadura;
	
	public void atacar() {
		if (this.classe == 1 && this.arquetipo == 1) {
				System.out.println("Você ataca o monstro com um feitiço de fogo!");
				// Rola o dado de dano com modificadores
				/* O 'Mago de Fogo' irá rolar um d20 + d8, e se acertar a armadura do monstro,
				 * irá atacar por d10 + 4 de dano no turno. */
			}
		else if (this.classe == 1 && this.arquetipo == 2) {
				System.out.println("Você ataca o monstro com um feitiço de gelo!");
				// Rola o dado de dano com modificadores
				/* O 'Mago de Gelo' irá rolar um d20 + d6, e se acertar a armadura do monstro,
				 * irá atacar por d8 + 6 de dano no turno. */
		    }
		else if (this.classe == 2 && this.arquetipo == 1) {
			System.out.println("Você dispara uma flecha em direção ao monstro!");
			// Rola o dado de dano com modificadores
			/* O 'Arqueiro' irá rolar um d20 + 5, e se acertar a armadura do monstro,
			 * irá atacar por d6 + 2 de dano no turno. */
		}
		else {
			System.out.println("Você ataca o monstro com sua katana!");
			// Rola o dado de dano com modificadores
			/* O 'Samurai' irá rolar um d20 + 3, e se acertar a armadura do monstro,
			 * irá atacar por d8 + 4 de dano no turno. */
		}
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
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getArma() {
		return arma;
	}
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
}