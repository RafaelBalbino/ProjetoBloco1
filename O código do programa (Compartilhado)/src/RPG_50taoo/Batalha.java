package RPG_50taoo;

import java.util.Scanner;

//Esperar pra ver como utilizar Collections
//Esperar pra ver como utilizar Expections

public class Batalha {

	public static void main(String[] args) {
		Personagem per = new Personagem();
		Imperador imp = new Imperador();
			
		Scanner leia = new Scanner(System.in);
			
	    System.out.print("Digite o nome do seu personagem: ");
		per.setNome(leia.next());

		while (per.getClasse() != 1 || per.getClasse() != 2 && per.getArquetipo() != 1 || per.getArquetipo() != 2) {
			System.out.println("Agora escolha sua classe, caro jogador!");
			System.out.print("1 - Mago | 2 - Guerreiro: ");
			per.setClasse(leia.nextInt());
			System.out.println();
			
			if (per.getClasse() == 1) {
				per.setArmadura(10);
				per.setVida(30);
				
				System.out.print("Classe escolhida: Mago \n");
				System.out.println("Você estudou magia toda sua vida...agora é " 
				+ "hora de por em prática tudo o que aprendeu!");

				System.out.println("Em que tipo de magia você é proficiente?");
				System.out.print("1 - Piromancia(Fogo) | 2 - Criogenia(Gelo) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Piromancia");
					System.out.println("Você é um mago que usa de sua magia para queimar a carne "
					+ " de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
					break;
				} else if (per.getArquetipo() == 2) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Criogenia");
					System.out.println("Você é um mago que congela cada centímetro de seus inimigos, "
					+ "sua alma tão gélida quanto sua magia.");
					break;
				} else {
					System.out.println("Eu tô falando que vou te kickar do servidor, tu não acredita...");
					System.out.println();
				}
			}

			if (per.getClasse() == 2) {
				per.setArmadura(10);
				per.setVida(40);
				
				System.out.print("Classe escolhida: Guerreiro \n");
				System.out.println("Você estudou a arte da guerra por toda a sua vida... "
				+ "mas agora é hora de por em prática tudo o que aprendeu!");

				System.out.println("Em que tipo de arma você é proficiente?");
				System.out.print("1 - Arqueiro (Arco de Precisão) | 2 - Samurai (Katana) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Arqueiro");
					System.out.println("Você treinou com um arco sua vida toda, aperfeiçoando sua "
					+ " mira e perfurando seus inimigos com suas flechas. Que nem o Légolas.");
					break;
				} else if (per.getArquetipo() == 2) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Samurai");
					System.out.println("Você treinou com a espada que você herdou de seus antepassados "
					+ "samurai, fatiando e cortando todos pela sua frente. Só não a coloque em uma pedra...");
					break;
				} 
				else {
					System.out.println("Escolha um, ô seu palhaço.");
				}
			}
			else {
				System.out.println("Vou te kickar do servidor, hein? Escolhe logo!");
				System.out.println();
			}
		}
		System.out.println();
		per.informacoesPersonagem();
		per.checarClasse(per.getClasse());
		System.out.println();
		
		
		System.out.println("Em uma linda sexta-feira, você acorda querendo sextar e vai para a sua taverna favorita "
		+ "à fim de se divertir e tomar um suco de cevada geladinho, \nenquanto assiste duelos em sua bola de cristal "
		+ "portátil, um presente de seu avô, Gerenay Icho Brasilis.\n");
		// Delay de 7 segundos
		
		System.out.println("Como hoje é dia de maldade, você decide comprar as dez últimas garrafas da taverna. "
		+ "Enquanto você curte suas loiras geladas, Cezanthersoon, o \nImperador da Cevada, reclama da falta de cerveja "
		+ "na taverna e, apenas pelo cheiro de álcool, começa a se aproximar de você, derrubando mesas \ne cadeiras em "
		+ "seu caminho, completamente furioso. É hora de lutar!");
		// Delay de 7 segundos
		
		System.out.println();
		System.out.println("Você acaba de encontrar...Cezanthersoon, o Imperador da Cevada!");
		System.out.println();
		// Delay de 2 segundos 
		
		imp.setVida(50);
		int vidaImp = imp.getVida();
		int vidaPer = per.getVida();
		int contTurno = 1;
		
		// Como dar um delay de 3 segundos antes de aparecer se o personagem/imperador errou o ataque ou não
		while (vidaPer > 0 && vidaImp > 0) {
			System.out.println("Vida do Personagem: " + vidaPer + " | Vida do Cezantherson: " + vidaImp);
			
			per.atacar();
			vidaImp -= per.getDano();
	
			if (vidaImp <= 0) {
				System.out.println("Turnos percorridos até o final da batlha: " + contTurno + "\n");
				break;
			}
		
			imp.atacar();
			vidaPer -= imp.getDanu();
			
			if (vidaPer <= 0) {
				System.out.println("Turnos percorridos até o final da batlha: " + contTurno + "\n");
				break;
			}
			System.out.println("Fim do turno " + contTurno + "\n");
			contTurno++;
			// Delay de 3 segundos
		}
		
		if (vidaPer <= 0) {
			System.out.println("Você foi derrotado pelo Imperador da Cevada...e perdeu todas as suas cervejas.");
			System.out.println("Quem sabe da próxima vez?");
			
		} 
		else {
			System.out.println("Você derrotou o Imperador da Cevada e agora é o novo Imperador! Toda a cevada gelada "
							  + "pertence à você agora!");
			System.out.println("Parabéns por completar nosso jogo '50tãoo'! Nos avalie com 5 estrelas se gostou!" + 
							  "E também se não gostou. Por favor, esse foi nosso primeiro projeto! ;-;");
		} 
	}
}
