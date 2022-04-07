package RPG_50taoo;

import java.util.Scanner;
/* private String nome;
 * private int classe, arquetipo, vida, dano; */

public class Batalha {

	public static void main(String[] args) {
		Personagem per = new Personagem();
		Chefao che = new Chefao();
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do seu personagem: ");
		per.setNome(leia.next());
		
		System.out.println("Agora escolha sua classe, caro jogador!");
		System.out.println("1 - Mago | 2 - Guerreiro: ");
		per.setClasse(leia.nextInt());
		
		if (per.getClasse() == 1) {
			System.out.println();
			System.out.println("Classe escolhida: Mago ");
			System.out.println("Você estudou magia toda sua vida...agora é " 
			+ "hora de por em prática tudo o que aprendeu!");
			
			System.out.println("Em que tipo de magia você é proficiente?");
			System.out.println("1 - Piromancia(Fogo)| 2 - Criogenia(Gelo) ");
			per.setArquetipo(leia.nextInt());
			
			if (per.getArquetipo() == 1) {
				System.out.println();
				System.out.println("Arquetipo escolhido: Piromancia");
				System.out.println("Você é um mago que usa de sua magia para queimar a carne " +
				" de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
			}
			else if (per.getArquetipo() == 2) {
				System.out.println();
				System.out.println("Arquetipo escolhido: Criogenia");
				System.out.println("Você é um mago que congela cada centímetro de seus inimigos, " 
				+ "sua alma tão gélida quanto sua magia.");
			}
			else {
				System.out.println("Eu tô falando que vou te kickar, tu não acredita...");
			}
		}
		
		else if (per.getClasse() == 2) {
			System.out.println();
			System.out.println("Classe escolhida: Guerreiro ");
			System.out.println("Você estudou a arte da guerra por toda a sua vida... " 
					+ "mas agora é hora de por em prática tudo o que aprendeu!");
		}
		else {
			System.out.println("Vou te kickar do servidor, hein?");
		}
		
		///////////////////////////////////////////////////////////////////////////////////
		
		// Fazer o mesmo mas só que com guerreiro (Arquétipo de Arqueiro e Espadachin
	}

}
