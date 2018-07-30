import java.util.*;
/*IFTENE NADA*/
public class Jeu {
	public int nombreDeJoueurs;
	public ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	public int nombreDeFois;
	
	
	public Jeu(){
		super();
	}
	public Jeu(int nombreDeJoueurs,int nombreDeFois, ArrayList<Joueur> joueurs){
		this.nombreDeFois=nombreDeFois;
		this.nombreDeJoueurs=nombreDeJoueurs;
		this.joueurs=joueurs;
	}
	
	public void jouer(){
		System.out.println("debut du jeu");
		for (int i =0;i<nombreDeFois;i++){
			for(Joueur joueur : joueurs){
				joueur.score();
			}
		}
		System.out.println("fin de jeu");
	}
	
		public Joueur leGagnant(){
			joueurs.sort(new Comparator<Joueur>(){
				@Override
				public int compare(Joueur joueur2,Joueur joueur1){
					return joueur1.score-joueur2.score;
				}
			});
			return joueurs.get(0);
		}
		public void setNombreDeJoueurs(int nombreDeJoueurs){
			this.nombreDeJoueurs=nombreDeJoueurs;
		}
		public int getNombreDeJoueurs(){
			return nombreDeJoueurs;
		}
		public void setJoueurs(ArrayList<Joueur> joueurs){
			this.joueurs=joueurs;
		}
		public ArrayList<Joueur> getJoueurs(){
			return joueurs;
		}
		
	}


