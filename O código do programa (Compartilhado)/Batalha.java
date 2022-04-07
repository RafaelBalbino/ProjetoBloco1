package RPG_50taoo;

import java.util.Random;
import java.util.Scanner;
/* private String nome;
 * private int classe, arquetipo, vida, arma, armadura; */

// Usar dado d20 com mod de acordo com arma, e com boss tendo +3 de mod
public class Batalha {

	public static void main(String[] args) {
		Personagem per = new Personagem();
		Chefao che = new Chefao();
		
		Scanner leia = new Scanner(System.in);
		Random dado = new Random();
		
		// Setar os dados do chef�o abaixo
		
		System.out.println("Digite o nome do seu personagem: ");
		per.setNome(leia.next());
		
		System.out.println("Agora escolha sua classe, caro jogador!");
		System.out.println("1 - Mago | 2 - Guerreiro: ");
		per.setClasse(leia.nextInt());
		
		if (per.getClasse() == 1) {
			per.setArmadura(7);
			per.setVida(20);
			System.out.println();
			System.out.println("Classe escolhida: Mago ");
			System.out.println("Voc� estudou magia toda sua vida...agora � " 
			+ "hora de por em pr�tica tudo o que aprendeu!");
			
			System.out.println("Em que tipo de magia voc� � proficiente?");
			System.out.println("1 - Piromancia(Fogo)| 2 - Criogenia(Gelo) ");
			per.setArquetipo(leia.nextInt());
			
			if (per.getArquetipo() == 1) {
				// Codar o cajado de fogo e o dano dele pra j� setar ele aqui;
				System.out.println();
				System.out.println("Arquetipo escolhido: Piromancia");
				System.out.println("Voc� � um mago que usa de sua magia para queimar a carne " +
				" de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
			}
			else if (per.getArquetipo() == 2) {
				// Codar o cajado de gelo e o dano dele pra j� setar ele aqui;
				System.out.println();
				System.out.println("Arquetipo escolhido: Criogenia");
				System.out.println("Voc� � um mago que congela cada cent�metro de seus inimigos, " 
				+ "sua alma t�o g�lida quanto sua magia.");
			}
			else {
				System.out.println("Eu t� falando que vou te kickar, tu n�o acredita...");
			}
		}	
		
		if (per.getClasse() == 2) {
			per.setArmadura(10);
			per.setVida(30);
			System.out.println();
			System.out.println("Classe escolhida: Guerreiro ");
			System.out.println("Voc� estudou a arte da guerra por toda a sua vida... " 
			+ "mas agora � hora de por em pr�tica tudo o que aprendeu!");
			
			System.out.println("Em que tipo de arma voc� � proficiente?");
			System.out.println("1 - Arqueiro (Arco de Precis�o)| 2 - Samurai (Katana) ");
			per.setArquetipo(leia.nextInt());
			
			if (per.getArquetipo() == 1) {
				// Codar a arma e o dano delas pra j� setar ela aqui
				System.out.println();
				System.out.println("Arquetipo escolhido: Arqueiro");
				System.out.println("Voc� treinou com um arco sua vida toda, aperfei�oando sua " 
				+" mira e perfurando seus inimigos com suas flechas. Que nem o L�golas.");
			}
			else if (per.getArquetipo() == 2) {
				// Codar a arma e o dano delas pra j� setar ela aqui
				System.out.println();
				System.out.println("Arquetipo escolhido: Samurai");
				System.out.println("Voc� treinou com a espada que voc� herdou de seus antepassados "
				+ "samurai, fatiando e cortando todos pela sua frente. S� n�o a coloque em uma pedra...");
			}
			else {
				System.out.println("Escolha um, � seu palha�o.");
			}
		}
		else {
			System.out.println("Vou te kickar do servidor, hein?");
		}
		if (per.getClasse() < 1 && per.getClasse() > 2) {
			System.out.println("N�o vai jogar tamb�m ent�o. Tu comeu Cirquitos, foi?");
		}
	}
}
