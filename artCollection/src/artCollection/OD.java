package artCollection;

public abstract class OD {
	protected String titolo, artista;

	public abstract boolean equals(Object o);
	public abstract double getIngombro();
	
	public OD(String titolo,String artista) {
		this.titolo=titolo;
		this.artista=artista;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getArtista() {
		return artista;
	}

}
