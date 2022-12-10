import java.util.ArrayList;
import java.util.List;

public class TabuleiroXadrez{
    private List<Xadrez> tabuleiro = new ArrayList<Xadrez>();

	public void adicionarPeca(Xadrez xadrez) {
		tabuleiro.add(xadrez);
	}

	public void tabuleiro() {
		for (Xadrez peca : this.tabuleiro) {
			System.out.println("Peça: " + peca.getnomePeca());
			System.out.println("Movimento: " + peca.getmovimentoPeca());
			System.out.println("Pode pular peças: " + peca.getpulaPeca());
			System.out.println();
		}
	}
}