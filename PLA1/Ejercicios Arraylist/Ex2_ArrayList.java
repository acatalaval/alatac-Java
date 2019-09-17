import java.util.*;

public class Ex2_ArrayList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num_palabras;
		int long_max=0;
		String larga="";
		
		
		System.out.println("Escribe una frase: ");
		String frase = s.nextLine();
		
		String[] arrayPalabras = frase.split(" "); //usamos el método split de las arrays para separar la frase en palabras
		
		ArrayList<String> alistPalabras= new ArrayList<String>(); // creamos ArrayList
		
		for (String palabra : arrayPalabras) { //añadiendo cada palabra al arraylist
			System.out.println(palabra);       //mostramos el array creado
			alistPalabras.add(palabra);        //añadimos valores al arrylist
			int long_palabra=palabra.length(); //comparamos longitudes de las palabras para saber cuál es la más larga
			if (long_palabra > long_max) {
				long_max = long_palabra;
				larga=palabra;
			}
			
		}
		num_palabras=alistPalabras.size(); // nos dará el número de palabras contenidas en la arraylist
		System.out.println("Hay "+num_palabras+" palabras y la palabra más larga es \'"+larga+"\'");
	}

}
