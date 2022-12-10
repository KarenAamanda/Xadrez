public abstract class Xadrez{
    private String nomePeca;
	private String movimentoPeca;
	private String pularPeca;

	public Xadrez(String nomePeca, String movimentoPeca, String pularPeca){
		this.nomePeca = nomePeca;
		this.movimentoPeca = movimentoPeca;
		this.pularPeca = pularPeca;
	}

	public Xadrez(){

	}

	//get
    public String getnomePeca() {
		return null;
	}

	public String getmovimentoPeca() {
		return null;
	}

	public String getpulaPeca() {
		return null;
	}

	//set
	public void setnomePeca(String nomePeca){
		this.nomePeca = nomePeca;
	}

	public void setmovimentoPeca(String movimentoPeca){
		this.movimentoPeca = movimentoPeca;
	}

	public void setpularPeca(String pularPeca){
		this.pularPeca = pularPeca;
	}
}
