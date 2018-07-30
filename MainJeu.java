import java.util.*;
/*IFTENE NADA*/
public class MainJeu {

		public int nombreDeJoueurs;
		static int nombreDeFois;
		public ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
		public Jeu jeu;
		public Main(){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("\n\n Saisir le nombre de joueurs :  \n ****************************************************");
			String s = sc1.nextLine();
			this.nombreDeJoueurs=Integer.parseInt(s);
			System.out.println("\n\n Saisir le nombre de fois qu'il faut jouer :  \n ****************************************************");
		    s= sc1.nextLine();
		    this.nombreDeFois=Integer.parseInt(s);
		    for (int i=0;i<nombreDeJoueurs;i++){
		    	System.out.println("Le nom du joueur : "+i);
		    	Scanner sc2 = new Scanner(System.in);
		    	Joueur joueur = new Joueur (sc2.nextLine(),0);
		    	this.joueurs.add(joueur);
		    }
		    this.jeu= new Jeu(nombreDeJoueurs,nombreDeFois,joueurs);
		}
		//@SuppressWarnings("oracle.jdeveloper.java.semant ic-warning")
		
		
		public static void main(String[] args) {
			Main m = new Main();
			m.jeu.jouer();
			for (Joueur joueur : m.jeu.joueurs){
				System.out.println("nom joueur : "+joueur.getNom()+"  finale score : "+joueur.getScore());
				
			}
			System.out.println("\n Le gagnant est : "+m.jeu.leGagnant().getNom()+" avec un score de : "+m.jeu.leGagnant().getScore());
		// TODO Auto-generated method stub

	}

}
