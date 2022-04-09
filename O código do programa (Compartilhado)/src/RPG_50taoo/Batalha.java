package RPG_50taoo;

import java.util.Scanner;

// Utilizar 'Sobrecarga' que ainda n�o colocamos
// Esperar pra ver como utilizar Collections
// Esperar pra ver como utilizar Expections

// Leo, v� como que a gente faz a batalha em si 
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
				
				System.out.println("Classe escolhida: Mago \n");
				System.out.println("Voc� estudou magia toda sua vida...agora � " 
				+ "hora de por em pr�tica tudo o que aprendeu!");

				System.out.println("Em que tipo de magia voc� � proficiente?");
				System.out.print("1 - Piromancia(Fogo)| 2 - Criogenia(Gelo) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					// Codar o cajado de fogo e o dano dele pra j� setar ele aqui;
					System.out.println();
					System.out.println("Arquetipo escolhido: Piromancia");
					System.out.println("Voc� � um mago que usa de sua magia para queimar a carne "
					+ " de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
					break;
				} else if (per.getArquetipo() == 2) {
					// Codar o cajado de gelo e o dano dele pra j� setar ele aqui;
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
				
				System.out.println("Classe escolhida: Guerreiro \n");
				System.out.println("Voc� estudou a arte da guerra por toda a sua vida... "
				+ "mas agora � hora de por em pr�tica tudo o que aprendeu!");

				System.out.println("Em que tipo de arma voc� � proficiente?");
				System.out.print("1 - Arqueiro (Arco de Precis�o)| 2 - Samurai (Katana) - ");
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
		System.out.println();
		
		System.out.println("Em uma linda sexta-feira, voc� acorda querendo sextar e vai para a sua taverna favorita "
		+ "� fim de se divertir e tomar um suco de cevada geladinho, \nenquanto assiste duelos em sua bola de cristal "
		+ "port�til, um presente de seu av�, Gerenay Icho Brasilis.\n");

		System.out.println("Como hoje � dia de maldade, voc� decide comprar as dez �ltimas garrafas da taverna. "
		+ "Enquanto voc� curte suas loiras geladas, Cezanthersoon, o \nImperador da Cevada, reclama da falta de cerveja "
		+ "na taverna e, apenas pelo cheiro de �lcool, come�a a se aproximar de voc�, derrubando mesas \ne cadeiras em "
		+ "seu caminho, completamente furioso. � hora de lutar!");
		
		System.out.println();
		System.out.println("Voc� acaba de encontrar...Cezanthersoon, o Imperador da Cevada!");
		System.out.println();
		
		int vidaImp = 100;
		int contTurno = 1;
		int vidaPer = per.getVida();
		
		// Mesmo criando essas vari�veis acima(que provavelmente n�o � pra usar), o personagem n�o perde vida
		// Contador de turno � mais pra ficar mais fofolete mesmo, precisa mudar isso n�o.
		// Colocamos a armadura das duas classes como 10 pra testar mas nem isso ajuda, qualquer coisa muda de volta
		// Pode ser que por mais que o dano do imperador calcule, ele n�o diminui a vida do personagem
		
		while (vidaPer > 0 && vidaImp > 0) {
			System.out.println("Vida do Personagem: " + vidaPer + " | Vida do Cezantherson: " + vidaImp);
			per.atacar();
			
			vidaImp -= per.getDano();
	
			if (vidaImp < 0) {
				break;
			}
			imp.atacar();
			
			vidaPer -= imp.getDanu();
			System.out.println("Fim do turno " + contTurno + "\n");
			contTurno++;
		}
		

		if (vidaPer <= 0) {
			System.out.println("Voc� foi derrotado pelo Imperador da Cevada...e perdeu todas as suas cervejas.");
			
		} 
		else {
			System.out.println("Voc� derrotou o Imperador da Cevada e agora � o novo Imperador! Toda a cevada gelada "
					+ "pertence � voc� agora!");
		}
	}
}
