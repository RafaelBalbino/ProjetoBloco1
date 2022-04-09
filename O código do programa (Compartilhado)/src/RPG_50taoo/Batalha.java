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
				System.out.println("Voc� estudou magia toda sua vida...agora � " 
				+ "hora de por em pr�tica tudo o que aprendeu!");

				System.out.println("Em que tipo de magia voc� � proficiente?");
				System.out.print("1 - Piromancia(Fogo) | 2 - Criogenia(Gelo) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Piromancia");
					System.out.println("Voc� � um mago que usa de sua magia para queimar a carne "
					+ " de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
					break;
				} else if (per.getArquetipo() == 2) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Criogenia");
					System.out.println("Voc� � um mago que congela cada cent�metro de seus inimigos, "
					+ "sua alma t�o g�lida quanto sua magia.");
					break;
				} else {
					System.out.println("Eu t� falando que vou te kickar do servidor, tu n�o acredita...");
					System.out.println();
				}
			}

			if (per.getClasse() == 2) {
				per.setArmadura(10);
				per.setVida(40);
				
				System.out.print("Classe escolhida: Guerreiro \n");
				System.out.println("Voc� estudou a arte da guerra por toda a sua vida... "
				+ "mas agora � hora de por em pr�tica tudo o que aprendeu!");

				System.out.println("Em que tipo de arma voc� � proficiente?");
				System.out.print("1 - Arqueiro (Arco de Precis�o) | 2 - Samurai (Katana) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Arqueiro");
					System.out.println("Voc� treinou com um arco sua vida toda, aperfei�oando sua "
					+ " mira e perfurando seus inimigos com suas flechas. Que nem o L�golas.");
					break;
				} else if (per.getArquetipo() == 2) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Samurai");
					System.out.println("Voc� treinou com a espada que voc� herdou de seus antepassados "
					+ "samurai, fatiando e cortando todos pela sua frente. S� n�o a coloque em uma pedra...");
					break;
				} 
				else {
					System.out.println("Escolha um, � seu palha�o.");
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
		
		
		System.out.println("Em uma linda sexta-feira, voc� acorda querendo sextar e vai para a sua taverna favorita "
		+ "� fim de se divertir e tomar um suco de cevada geladinho, \nenquanto assiste duelos em sua bola de cristal "
		+ "port�til, um presente de seu av�, Gerenay Icho Brasilis.\n");
		// Delay de 7 segundos
		
		System.out.println("Como hoje � dia de maldade, voc� decide comprar as dez �ltimas garrafas da taverna. "
		+ "Enquanto voc� curte suas loiras geladas, Cezanthersoon, o \nImperador da Cevada, reclama da falta de cerveja "
		+ "na taverna e, apenas pelo cheiro de �lcool, come�a a se aproximar de voc�, derrubando mesas \ne cadeiras em "
		+ "seu caminho, completamente furioso. � hora de lutar!");
		// Delay de 7 segundos
		
		System.out.println();
		System.out.println("Voc� acaba de encontrar...Cezanthersoon, o Imperador da Cevada!");
		System.out.println();
		// Delay de 2 segundos 
		
		imp.setVida(50);
		int vidaImp = imp.getVida();
		int vidaPer = per.getVida();
		int contTurno = 1;
		
		// Como dar um delay de 3 segundos antes de aparecer se o personagem/imperador errou o ataque ou n�o
		while (vidaPer > 0 && vidaImp > 0) {
			System.out.println("Vida do Personagem: " + vidaPer + " | Vida do Cezantherson: " + vidaImp);
			
			per.atacar();
			vidaImp -= per.getDano();
	
			if (vidaImp <= 0) {
				System.out.println("Turnos percorridos at� o final da batlha: " + contTurno + "\n");
				break;
			}
		
			imp.atacar();
			vidaPer -= imp.getDanu();
			
			if (vidaPer <= 0) {
				System.out.println("Turnos percorridos at� o final da batlha: " + contTurno + "\n");
				break;
			}
			System.out.println("Fim do turno " + contTurno + "\n");
			contTurno++;
			// Delay de 3 segundos
		}
		
		if (vidaPer <= 0) {
			System.out.println("Voc� foi derrotado pelo Imperador da Cevada...e perdeu todas as suas cervejas.");
			System.out.println("Quem sabe da pr�xima vez?");
			
		} 
		else {
			System.out.println("Voc� derrotou o Imperador da Cevada e agora � o novo Imperador! Toda a cevada gelada "
							  + "pertence � voc� agora!");
			System.out.println("Parab�ns por completar nosso jogo '50t�oo'! Nos avalie com 5 estrelas se gostou!" + 
							  "E tamb�m se n�o gostou. Por favor, esse foi nosso primeiro projeto! ;-;");
		} 
	}
}
