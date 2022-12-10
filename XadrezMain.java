public class XadrezMain {
    public static void main(String[] args) {

		TabuleiroXadrez pecas = new TabuleiroXadrez();

		Xadrez p1 = new XadrezBispo();
		pecas.adicionarPeca(p1);

		Xadrez p2 = new XadrezCavalo();
		pecas.adicionarPeca(p2);

        Xadrez p3 = new XadrezTorre();
        pecas.adicionarPeca(p3);
		
		pecas.tabuleiro();
	}
}
