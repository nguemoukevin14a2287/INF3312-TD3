import java.util.Scanner;

public class Exercice1
{
	public static void main(String[] args) {
		Point point = new Point();
		Scanner sc = new Scanner(System.in);
		double x, y, dx, dy;
		System.out.print("\nEntrer l'abscisse du point:\t");
		x = sc.nextDouble();
		System.out.print("\nEntrer l'ordonnee du point:\t");
		y = sc.nextDouble();
		point.initialiser(x, y);
		point.afficher();

		// Deplacement
		System.out.print("De combien d'unites voulez-vous deplacer sur l'axe des abscisses?\t");
		dx = sc.nextDouble();
		System.out.print("De combien d'unites voulez-vous deplacer sur l'axe des ordonnees?\t");
		dy = sc.nextDouble();
		point.deplacer(dx, dy);
		point.afficher();
	}
}