package artCollection;

public class Quadro extends OD {
	
	private double altezza;
	private double larghezza;
	
	public Quadro(String titolo,String Artista,double altezza,double larghezza) {
		super(titolo,Artista);
		this.altezza=altezza;
		this.larghezza=larghezza;
	}

	public double getIngombro() {
		return altezza*larghezza;
	}

	public boolean equals(Object o) {
		if(o instanceof Quadro) {
			Quadro q=(Quadro) o;
			return ((q.altezza==this.altezza) && (q.larghezza==this.larghezza));
		}
		else
			return false;
	}

}
