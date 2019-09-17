import java.util.*;

public class Ex2_ArrayList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num_palabras;
		int long_max=0;
		String larga="";
		
		
		System.out.println("Escribe una frase: ");
		String frase = s.nextLine();
		
		String[] arrayPalabras = frase.split(" "); //usamos el m�todo split de las arrays para separar la frase en palabras
		
		ArrayList<String> alistPalabras= new ArrayList<String>(); // creamos ArrayList
		
		for (String palabra : arrayPalabras) { //a�adiendo cada palabra al arraylist
			System.out.println(palabra);       //mostramos el arraylist creado
			alistPalabras.add(palabra);
			int long_palabra=palabra.length(); //comparamos longitudes de las palabras para saber cu�l es la m�s larga
			if (long_palabra > long_max) {
				long_max = long_palabra;
				larga=palabra;
			}
			
		}
		num_palabras=alistPalabras.size(); // nos dar� el n�mero de palabras contenidas en la arraylist
		System.out.println("Hay "+num_palabras+" palabras y la palabra m�s larga es \'"+larga+"\'");
	}

}
