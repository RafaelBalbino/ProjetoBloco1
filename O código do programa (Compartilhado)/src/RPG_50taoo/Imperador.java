package RPG_50taoo;

public class Imperador extends Personagem {
	//O que os chef�o do nosso RPG ter�o em comum?
	// Cezanthersoon, Imperador da Cevada
	
	int danu, atq;
	boolean acertu;
	
	@Override
	public void atacar() {
		System.out.println("Cezanthersoon te ataca com 'Mega-Garrafada Rainiquem'!");
		atq = (dado.nextInt(20) + 6);
		
		if (atq >= 10) {
			acertu = true;
		}
		else {
			acertu = false;
			System.out.println("Mas ele errou! E agora outra pessoa t� toda cortada e com cheiro de loira gelada.\n");
		}
		
		if (acertu == true) { 
			danu = dado.nextInt(8) + 3;
		}
	}

	public int getDanu() {
		return danu;
	}
}
