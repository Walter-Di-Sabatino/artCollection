package artCollection;
import java.util.*;

public class Collezione {
	
	private Vector<OD> opere=new Vector<OD>();
	private String nome;
	private String luogo;
	
	
	public Collezione(String nome,String luogo) {
		this.nome=nome;
		this.luogo=luogo;
	}
	
	public void aggiungiOpera(OD opera) {
		opere.add(opera);
	}
	
	public OD accediAdOpera(String nomeOpera) {
		for(int i=0;i<opere.size();i++) {
			if(nomeOpera.equals(opere.get(i).getTitolo())) {
				return opere.get(i);
			}
		}
		return null;
	}
	
	public void stampaCollezione() {
		int i=1;
		for(OD x:opere) {
			if(x instanceof Quadro)
			System.out.println("L'opera "+i+" è un quadro dipinto da "+x.getArtista()+" chiamato "+x.getTitolo()+"\ninoltre essa occupa "+x.getIngombro()+" metri quadri");
			else
				System.out.println("L'opera "+i+" è una scultura scolpita da "+x.getArtista()+" chiamata "+x.getTitolo()+"\ninoltre essa occupa "+x.getIngombro()+" metri cubi");
		}
	}
	
	public boolean confrontaOpera(OD opera) {
		for(int i=0;i<opere.size();i++)
			if(opera.equals(opere.get(i)))
				return true;
			
		return false;
	}
}
