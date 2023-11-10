public class Pointcol extends Point
{
	protected byte couleur;

	public void colorer(byte col)
	{
		this.couleur = col;
	}

	public void afficheCol()
	{
		super.afficher();
		System.out.print("\nJe suis un point de coordonnees " + this.abscisse + " et " + this.ordonnee + " et ma couleur est " + this.couleur);
	}
}