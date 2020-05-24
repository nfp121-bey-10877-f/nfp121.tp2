package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		float celsius = 0;
		int[] tabFahrenheit = new int[args.length];
		
		for(int i=0; i<args.length; i++){
		  tabFahrenheit[i] = Integer.parseInt(args[i]);
		}
		for(int i=0; i<args.length;i++){
		  celsius=fahrenheitEnCelsius(tabFahrenheit[i]);
		  System.out.println(tabFahrenheit[i] + "\u00B0F -> " + celsius + "\u00B0C");
		}																
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
		return (f-32)*5/9;
	}

}
