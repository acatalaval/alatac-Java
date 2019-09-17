import java.util.*;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> mynums =new ArrayList<Integer>();
		int n1;
		boolean fin=false;
		int suma=0;
		
		do {
			System.out.println("Introduzca un número entre 1 y 10:");
			n1=s.nextInt();
			if (n1==0) {
				System.out.print("Fin entrada de números \n");
				fin=true;
				break;
			} else if ((n1>0)&&(n1<=10)) {
				mynums.add(n1);	
				suma=suma+n1;
				} else {
						System.out.print("Número incorrecto. Debe ser del 1 al 10.");			
						}
		} while (fin=true);
		
		for (int i : mynums) {
			System.out.println(i);
		}
		System.out.println("Nuestra Arraylist contiene: " + mynums.toString() + "\n"); 
		
		System.out.println("Hemos creado un Arraylist de "+ mynums.size() +" elementos, que suman "+suma+" y los valores pares son:");
		
		for (int i : mynums) {
			if (i%2==0)
			System.out.println(i);
		}
		
	}
	
}
