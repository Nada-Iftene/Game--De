/*IFTENE NADA*/
public class Joueur {
	public String nom;
	public int score;
	
	public Joueur(String nom,int score){
		this.nom=nom;
		this.score=score;
	}
	
	public void score(){
		De de = new De();
		System.out.println("ancien score de "+this.getNom()+" : "+this.getScore());
		this.score= this.score+de.lancerDe();
		System.out.println("nouveau score de "+this.getNom()+" : "+this.getScore());
		}
	
	public int getScore(){
		return score;
	}
	public String getNom(){
		return nom;
	}

}
