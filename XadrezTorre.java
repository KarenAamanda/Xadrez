public class XadrezTorre extends Xadrez{
    
    public String getnomePeca(){
        return "Torre";
    }
    
    public String getmovimentoPeca() {
		return "Para frente, para trás, para direita e para esquerda";
	}

    public String getpulaPeca() {
		return "Não pode";
	}
}
