public class Point
{
	protected double abscisse;
	protected double ordonnee;

	public void initialiser(double x, double y)
	{
		abscisse = x;
		ordonnee = y;
	}

	public void deplacer(double x, double y)
	{
		abscisse += x;
		ordonnee += y;
	}

	public void afficher()
	{
		System.out.print("\nJe suis un point de coordonnees " + abscisse + " et " + ordonnee);
	}
}