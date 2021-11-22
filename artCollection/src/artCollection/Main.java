package artCollection;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner( System.in);
		System.out.println("Inserisci il nome della collezione");
		String nome=input.next();
		System.out.println("Inserisci il luogo dove si trova la collezione");
		String luogo=input.next();
		Collezione collezione=new Collezione(nome,luogo);
		int n=0;

		do {
			System.out.println("MENU");
			System.out.println("Premi 0 per uscire");
			System.out.println("Premi 1 per aggiungere un'opera d'arte alla collezione");
			System.out.println("Premi 2 per accedere ad un opera d'arte");
			System.out.println("Premi 3 per stampare la collezione");
			n= input.nextInt();

			switch(n) {
			case 0:
				System.out.println("Ciao!");
				break;
			case 1:
				System.out.println("Vuoi creare un quadro(inserisci 0) o una scultura(inserisci qualsiasiasi altro numero)?");
				int y=input.nextInt();
				OD opera;

				if(y==0) {
					System.out.println("Inserisci il nome dell'opera");
					String nomeO=input.next();
					System.out.println("Inserisci il nome dell'artista");
					String nomeA=input.next();
					try {
						System.out.println("Inserisci l'altezza dell'opera");
						double alt=input.nextDouble();
						System.out.println("Inserisci la larghezza dell'opera");
						double larg=input.nextDouble();
						opera=new Quadro(nomeO,nomeA,alt,larg);
						collezione.aggiungiOpera(opera);
					}catch(InputMismatchException e) {
						System.out.println("Hai inserito dati errati");
						input =new Scanner( System.in);
					}
				}
				else {
					System.out.println("Inserisci il nome dell'opera");
					String nomeO=input.next();
					System.out.println("Inserisci il nome dell'artista");
					String nomeA=input.next();
					try {
						System.out.println("Inserisci l'altezza dell'opera");
						double alt=input.nextDouble();
						System.out.println("Inserisci la larghezza dell'opera");
						double larg=input.nextDouble();
						System.out.println("Inserisci la profondità dell'opera");
						double prof=input.nextDouble();
						opera=new Scultura(nomeO,nomeA,alt,larg,prof);
						collezione.aggiungiOpera(opera);
					}catch(InputMismatchException e){
						System.out.println("Hai inserito dati errati");
						input =new Scanner( System.in);
					}
				}
				break;
			case 2:
				System.out.println("Inserici il nome dell'opera a cui accedere");
				String nomeOpera=input.next();
				OD x=collezione.accediAdOpera(nomeOpera);
				if(x==null)
					System.out.println("Non vi è alcuna opera con questo nome");
				else
					if(x instanceof Quadro)
						System.out.println("L'opera è un quadro dipinto da "+x.getArtista()+" chiamato "+x.getTitolo()+"\ninoltre essa occupa "+x.getIngombro()+" metri quadri");
					else
						System.out.println("L'opera è una scultura scolpita da  "+x.getArtista()+" chiamata "+x.getTitolo()+"\ninoltre essa occupa "+x.getIngombro()+" metri cubi");
				break;
			case 3:
				collezione.stampaCollezione();
			}

		}while(n!=0);

	}

}
