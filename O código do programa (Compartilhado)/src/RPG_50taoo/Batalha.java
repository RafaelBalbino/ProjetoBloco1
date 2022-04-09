package RPG_50taoo;

import java.util.Scanner;

// Utilizar 'Sobrecarga' que ainda não colocamos
// Esperar pra ver como utilizar Collections
// Esperar pra ver como utilizar Expections

// Leo, vê como que a gente faz a batalha em si 
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
				System.out.println("Você estudou magia toda sua vida...agora é " 
				+ "hora de por em prática tudo o que aprendeu!");

				System.out.println("Em que tipo de magia você é proficiente?");
				System.out.print("1 - Piromancia(Fogo)| 2 - Criogenia(Gelo) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					// Codar o cajado de fogo e o dano dele pra já setar ele aqui;
					System.out.println();
					System.out.println("Arquetipo escolhido: Piromancia");
					System.out.println("Você é um mago que usa de sua magia para queimar a carne "
					+ " de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
					break;
				} else if (per.getArquetipo() == 2) {
					// Codar o cajado de gelo e o dano dele pra já setar ele aqui;
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
				
				System.out.println("Classe escolhida: Guerreiro \n");
				System.out.println("Você estudou a arte da guerra por toda a sua vida... "
				+ "mas agora é hora de por em prática tudo o que aprendeu!");

				System.out.println("Em que tipo de arma você é proficiente?");
				System.out.print("1 - Arqueiro (Arco de Precisão)| 2 - Samurai (Katana) - ");
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
		System.out.println();
		
		System.out.println("Em uma linda sexta-feira, você acorda querendo sextar e vai para a sua taverna favorita "
		+ "à fim de se divertir e tomar um suco de cevada geladinho, \nenquanto assiste duelos em sua bola de cristal "
		+ "portátil, um presente de seu avô, Gerenay Icho Brasilis.\n");

		System.out.println("Como hoje é dia de maldade, você decide comprar as dez últimas garrafas da taverna. "
		+ "Enquanto você curte suas loiras geladas, Cezanthersoon, o \nImperador da Cevada, reclama da falta de cerveja "
		+ "na taverna e, apenas pelo cheiro de álcool, começa a se aproximar de você, derrubando mesas \ne cadeiras em "
		+ "seu caminho, completamente furioso. É hora de lutar!");
		
		System.out.println();
		System.out.println("Você acaba de encontrar...Cezanthersoon, o Imperador da Cevada!");
		System.out.println();
		
		int vidaImp = 100;
		int contTurno = 1;
		int vidaPer = per.getVida();
		
		// Mesmo criando essas variáveis acima(que provavelmente não é pra usar), o personagem não perde vida
		// Contador de turno é mais pra ficar mais fofolete mesmo, precisa mudar isso não.
		// Colocamos a armadura das duas classes como 10 pra testar mas nem isso ajuda, qualquer coisa muda de volta
		// Pode ser que por mais que o dano do imperador calcule, ele não diminui a vida do personagem
		
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
			System.out.println("Você foi derrotado pelo Imperador da Cevada...e perdeu todas as suas cervejas.");
			
		} 
		else {
			System.out.println("Você derrotou o Imperador da Cevada e agora é o novo Imperador! Toda a cevada gelada "
					+ "pertence à você agora!");
		}
	}
}
