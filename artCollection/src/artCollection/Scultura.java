package artCollection;

public class Scultura extends OD{
	private double altezza;
	private double larghezza;
	private double profonditÓ;
	
	public 	Scultura(String titolo,String Artista,double altezza,double larghezza,double profonditÓ) {
		super(titolo,Artista);
		this.altezza=altezza;
		this.larghezza=larghezza;
		this.profonditÓ=profonditÓ;
	}
	
	public double getIngombro() {
		return altezza*larghezza*profonditÓ;
	}

	public boolean equals(Object o) {
		if(o instanceof Scultura) {
			Scultura q=(Scultura) o;
			return ((q.altezza==this.altezza) && (q.larghezza==this.larghezza) &&(q.larghezza==this.larghezza));
		}
		else
			return false;
	}


}
