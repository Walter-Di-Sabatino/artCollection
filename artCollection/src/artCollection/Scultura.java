package artCollection;

public class Scultura extends OD{
	private double altezza;
	private double larghezza;
	private double profondit�;
	
	public 	Scultura(String titolo,String Artista,double altezza,double larghezza,double profondit�) {
		super(titolo,Artista);
		this.altezza=altezza;
		this.larghezza=larghezza;
		this.profondit�=profondit�;
	}
	
	public double getIngombro() {
		return altezza*larghezza*profondit�;
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
