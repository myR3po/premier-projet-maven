package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
	public static final String TITRE = "titre";
	public static final String ENVIRONNEMENT = "environnement";
	
	public static void main(String[] args) {
		String titre = ResourceBundle.getBundle("application").getString(App.TITRE);
		String asciiArt1 = FigletFont.convertOneLine(titre);
		System.out.println(asciiArt1);

		String environnement = ResourceBundle.getBundle("application").getString(App.ENVIRONNEMENT);
		System.out.println("Environnement : " + environnement);
	}
}
