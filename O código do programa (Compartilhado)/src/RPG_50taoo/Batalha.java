package RPG_50taoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Batalha {

	public static void main(String[] args) throws InterruptedException {
		Personagem per = new Personagem();
		Imperador imp = new Imperador();
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> pes = new ArrayList<>();
		
		System.out.println("Seja bem-vindo a 50TÃOO, o RPG do Império da Cevada!\n");
		Thread.sleep(3000);
		
	    try {
	    	System.out.print("Digite o nome do seu personagem: ");
			per.setNome(leia.next());

			while (per.getClasse() != 1 || per.getClasse() != 2 && per.getArquetipo() != 1 || per.getArquetipo() != 2) {
				System.out.println("Agora escolha sua classe, caro(a) jogador(a)!");
				System.out.print("1 - Mago/Feitiçeira | 2 - Guerreiro(a): ");
				per.setClasse(leia.nextInt());
				System.out.println();
				
				if (per.getClasse() == 1) {
					per.setArmadura(8);
					per.setVida(35);
					
					System.out.print("Classe escolhida: Mago/Feitiçeira \n");
					System.out.println("Você estudou magia toda sua vida...agora é " 
					+ "hora de por em prática tudo o que aprendeu!");

					System.out.println("Em que tipo de magia você é proficiente?");
					System.out.print("1 - Piromancia(Fogo) | 2 - Criogenia(Gelo) - ");
					per.setArquetipo(leia.nextInt());

					if (per.getArquetipo() == 1) {
						System.out.println();
						System.out.println("Arquetipo escolhido: Piromancia");
						System.out.println("Você é um(a) mago/feitiçeira que usa de sua magia para queimar a carne "
						+ " de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
						break;
					} else if (per.getArquetipo() == 2) {
						System.out.println();
						System.out.println("Arquetipo escolhido: Criogenia");
						System.out.println("Você é um(a) mago/feitiçeira que congela cada centímetro de seus inimigos, "
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
					
					System.out.print("Classe escolhida: Guerreiro(a) \n");
					System.out.println("Você estudou a arte da guerra por toda a sua vida... "
					+ "mas agora é hora de por em prática tudo o que aprendeu!");

					System.out.println("Em que tipo de arma você é proficiente?");
					System.out.print("1 - Arqueiro(a) (Arco de Precisão) | 2 - Samurai (Katana) - ");
					per.setArquetipo(leia.nextInt());

					if (per.getArquetipo() == 1) {
						System.out.println();
						System.out.println("Arquetipo escolhido: Arqueiro(a)");
						System.out.println("Você treinou com um arco sua vida toda, aperfeiçoando sua "
						+ " mira e perfurando, com maestria, todos seus inimigos com suas flechas. " 
						+ "Que nem o Légolas.");
						break;
					} else if (per.getArquetipo() == 2) {
						System.out.println();
						System.out.println("Arquetipo escolhido: Samurai");
						System.out.println("Você treinou com a espada que você herdou de seus antepassados "
						+ "samurai, fatiando e cortando todos pela sua frente. Só não a coloque em uma pedra...");
						break;
					} 
					else {
						System.out.println("Escolha um, ô seu(ua) palhaço(a).");
					}
				}
				else {
					System.out.println("Vou te kickar do servidor, hein? Escolhe logo!");
					System.out.println();
				}
			}
			Thread.sleep(4000);
			System.out.println();
			per.informacoesPersonagem();
			per.checarClasse(per.getClasse());
			System.out.println();
			Thread.sleep(4500);
			
			System.out.println("Em uma linda sexta-feira, você acorda querendo sextar e vai para a sua taverna favorita "
			+ "à fim de se divertir e tomar um suco de cevada geladinho, \nenquanto assiste duelos em sua bola de cristal "
			+ "portátil, um presente de seu avô, Gerenay Icho Brasilis.\n");
			Thread.sleep(7000);
			
			System.out.println("Como hoje é dia de maldade, você decide comprar as dez últimas garrafas da taverna. "
			+ "Enquanto você curte suas loiras geladas, Cezanthersoon, o \nImperador da Cevada, reclama da falta de cerveja "
			+ "na taverna e, apenas pelo cheiro de álcool, começa a se aproximar de você, derrubando mesas \ne cadeiras em "
			+ "seu caminho, completamente furioso. É hora de lutar!");
			Thread.sleep(11250);
			
			System.out.println();
			System.out.println("Você acaba de encontrar...Cezanthersoon, o Imperador da Cevada!");
			System.out.println();
			Thread.sleep(2500);
			
			imp.setVida(50);
			int vidaImp = imp.getVida();
			int vidaPer = per.getVida();
			int contTurno = 1, contLoira = 1;
			int acao;
			
			
			
			while (vidaPer > 0 && vidaImp > 0) {
				
				System.out.println("Vida do(a) " +  per.getNome() + ": " + vidaPer + " | " 
								 + "Vida do Cezantherson: " + vidaImp);
				System.out.println();
				
				System.out.println("Escolha sua ação (E se escolher outra opção é panaca): ");
				System.out.print("1 - Atacar | 2 - Loira Gelada - ");
				acao = leia.nextInt();
				System.out.println();
				
				do {
					switch (acao)  {
					case 1:
						per.atacar();
						vidaImp -= per.getDano();
					
						if (vidaImp <= 0) {
							System.out.println("Turnos percorridos até o final da batlha: " + contTurno + "\n");
							System.out.println("Você derrotou o Imperador da Cevada e agora é o novo Imperador! Toda a cevada gelada "
											+ "pertence à você agora!\n");
							Thread.sleep(1000);
							System.out.println("Parabéns por completar nosso jogo '50tãoo'! Nos avalie com 5 estrelas se gostou! " + 
											  "E também se não gostou. Por favor, esse foi nosso primeiro projeto! ;-;\n");
							System.out.println("Cesar e Anderson nós te amamos! PS: Isso não é chantagem pra dar bom feedback kkkk");
							
							String pessoa1 = "Rafael: " + "Programador Chefe\n";
							String pessoa2 = "Mayara: " + "Padroeira dos Programadores que a Bên zuou nosso projeto\n";
							String pessoa3 = "Beatrice: " + "Cê tá beijando(muito)????? Ah, o áudio tá ligado...\n";
							String pessoa4 = "Léo: " + "Arrumou o código e deixou todos felizes\n";
							String pessoa5 = "Marcos: " + "Futuro fazedor de trilha de som\n";
							String pessoa6 = "Wesley: " + "Não é o safadãoo(infelizmente)\n";
							String pessoa7 = "Daniel: " + "Nosso idealizador, mas já pode tirar do grupo kkkk-";

							pes.add(pessoa1);
							pes.add(pessoa2);
							pes.add(pessoa3);
							pes.add(pessoa4);
							pes.add(pessoa5);
							pes.add(pessoa6);
							pes.add(pessoa7);
							
							System.out.println("\n---> Pessoal que fez o projeto <---");
							System.out.println("\n" + pes);
							return;
						}
					
						imp.atacar();
						vidaPer -= imp.getDanu();
						
						if (vidaPer <= 0) {
							System.out.println("Turnos percorridos até o final da batlha: " + contTurno + "\n");
								System.out.println("Você foi derrotado(a) pelo Imperador da Cevada...e perdeu todas as suas cervejas.\n");
								Thread.sleep(1000);
								System.out.println("Quem sabe da próxima vez? De qualquer forma, parabéns por (não)completar o jogo!\n");
								System.out.println("Cesar e Anderson nós te amamos! PS: Isso não é chantagem pra dar bom feedback kkkk");
								
								String pessoa1 = "Rafael: " + "Programador Chefe\n";
								String pessoa2 = "Mayara: " + "Padroeira dos Programadores que a Bên zuou nosso projeto\n";
								String pessoa3 = "Beatrice: " + "Cê tá beijando(muito)????? Ah, o áudio tá ligado...\n";
								String pessoa4 = "Léo: " + "Arrumou o código e deixou todos felizes\n";
								String pessoa5 = "Marcos: " + "Futuro fazedor de trilha de som\n";
								String pessoa6 = "Wesley: " + "Não é o safadãoo(infelizmente)\n";
								String pessoa7 = "Daniel: " + "Nosso idealizador, mas já pode tirar do grupo kkkk-";

								pes.add(pessoa1);
								pes.add(pessoa2);
								pes.add(pessoa3);
								pes.add(pessoa4);
								pes.add(pessoa5);
								pes.add(pessoa6);
								pes.add(pessoa7);
								
								System.out.println("\n---> Pessoal que fez o projeto <---");
								System.out.println("\n" + pes);
								return;
								
								
						}
						System.out.println("Fim do turno " + contTurno + "\n");
						System.out.println("Vida do(a) " +  per.getNome() + ": " + vidaPer + " | " 
								 + "Vida do Cezantherson: " + vidaImp);
						System.out.println();
						contTurno++;
						Thread.sleep(3000);
						
						System.out.println("\nEscolha sua ação: ");
						System.out.print("1 - Atacar | 2 - Loira Gelada - ");
						acao = leia.nextInt();
						break;
						
					case 2:
						if (contLoira == 1) {
							
							vidaPer += 10;
							
							imp.atacar();
							vidaPer -= imp.getDanu();
							contLoira--;
							if (vidaPer <= 0) {
								System.out.println("Turnos percorridos até o final da batlha: " + contTurno + "\n");
								System.out.println("Turnos percorridos até o final da batlha: " + contTurno + "\n");
								System.out.println("Você foi derrotado(a) pelo Imperador da Cevada...e perdeu todas as suas cervejas.\n");
								Thread.sleep(1000);
								System.out.println("Quem sabe da próxima vez? De qualquer forma, parabéns por (não)completar o jogo!\n");
								System.out.println("Cesar e Anderson nós te amamos! PS: Isso não é chantagem pra dar bom feedback kkkk");
								
								String pessoa1 = "Rafael: " + "Programador Chefe\n";
								String pessoa2 = "Mayara: " + "Padroeira dos Programadores que a Bên zuou nosso projeto\n";
								String pessoa3 = "Beatrice: " + "Cê tá beijando(muito)????? Ah, o áudio tá ligado...\n";
								String pessoa4 = "Léo: " + "Arrumou o código e deixou todos felizes\n";
								String pessoa5 = "Marcos: " + "Futuro fazedor de trilha de som\n";
								String pessoa6 = "Wesley: " + "Não é o safadãoo(infelizmente)\n";
								String pessoa7 = "Daniel: " + "Nosso idealizador, mas já pode tirar do grupo kkkk-";

								pes.add(pessoa1);
								pes.add(pessoa2);
								pes.add(pessoa3);
								pes.add(pessoa4);
								pes.add(pessoa5);
								pes.add(pessoa6);
								pes.add(pessoa7);
								
								System.out.println("\n---> Pessoal que fez o projeto <---");
								System.out.println("\n" + pes);
								break;
							}
							System.out.println("Fim do turno " + contTurno + "\n");
							System.out.println("Vida do(a) " +  per.getNome() + ": " + vidaPer + " | " 
									 + "Vida do Cezantherson: " + vidaImp);
							System.out.println();
							contTurno++;
							
							Thread.sleep(3000);
						}
						else {
							System.out.println("Você procura por uma loira gelada mas percebe que acabaram! Nesse meio " +
							"tempo, o imperador te ataca!\n");
							
							imp.atacar();
							vidaPer -= imp.getDanu();
							
							if (vidaPer <= 0) {
								System.out.println("Turnos percorridos até o final da batlha: " + contTurno + "\n");
								System.out.println("Você foi derrotado(a) pelo Imperador da Cevada...e perdeu todas as suas cervejas.\n");
								Thread.sleep(1000);
								System.out.println("Quem sabe da próxima vez? De qualquer forma, parabéns por (não)completar o jogo!\n");
								System.out.println("Cesar e Anderson nós te amamos! PS: Isso não é chantagem pra dar bom feedback kkkk");
								
								String pessoa1 = "Rafael: " + "Programador Chefe\n";
								String pessoa2 = "Mayara: " + "Padroeira dos Programadores que a Bên zuou nosso projeto\n";
								String pessoa3 = "Beatrice: " + "Cê tá beijando(muito)????? Ah, o áudio tá ligado...\n";
								String pessoa4 = "Léo: " + "Arrumou o código e deixou todos felizes\n";
								String pessoa5 = "Marcos: " + "Futuro fazedor de trilha de som\n";
								String pessoa6 = "Wesley: " + "Não é o safadãoo(infelizmente)\n";
								String pessoa7 = "Daniel: " + "Nosso idealizador, mas já pode tirar do grupo kkkk-";

								pes.add(pessoa1);
								pes.add(pessoa2);
								pes.add(pessoa3);
								pes.add(pessoa4);
								pes.add(pessoa5);
								pes.add(pessoa6);
								pes.add(pessoa7);
								
								System.out.println("\n---> Pessoal que fez o projeto <---");
								System.out.println("\n" + pes);
								break;
							}
							System.out.println("Fim do turno " + contTurno + "\n");
							System.out.println("Vida do(a) " +  per.getNome() + ": " + vidaPer + " | " 
									 + "Vida do Cezantherson: " + vidaImp);
							System.out.println();
							contTurno++;
							Thread.sleep(3000);
							
							System.out.println("\nEscolha sua ação: ");
							System.out.print("1 - Atacar | 2 - Loira Gelada - ");
							acao = leia.nextInt();
							break;
						}
					default:
				
						System.out.println("\nNão existe terceira opção, panaca! Agora escolha sua ação: ");
						System.out.println("1 - Atacar | 2 - Loira Gelada - ");
						acao = leia.nextInt();
				}
			} while (acao > 0 && acao < 3);
				
				System.out.println("Já que tu é palhaço, inicia o programa de novo aí, vai!");
				System.out.println("Vida do(a) " +  per.getNome() + ": | " + vidaPer + 
								   "Vida do Cezantherson: " + vidaImp);
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
				System.out.println("Vida do(a) " +  per.getNome() + ": " + vidaPer + " | " 
						 + "Vida do Cezantherson: " + vidaImp);
				System.out.println();
				contTurno++;
				Thread.sleep(3000);
				break;
				
				
			}
			
			
			
			
			
			
			
		} catch (InputMismatchException err) {
	         System.out.println("Erro! O valor digitado não é válido, digite apenas números. Tente novamente!");
		}
	}
}
