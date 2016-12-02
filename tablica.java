public class tablica {
public static void main(String[] args) {
int [] tablica = new int [100];
			Random generator = new Random();
		for(int i = 0; i<tablica.length; i++) {
			tablica [i] = generator.nextInt();
		
		}
		int suma = 0;
		for(int i = 0; i<tablica.length; i++) {
			suma += tablica [i];
		}
		System.out.println("Suma = " +suma);
		
		int srednia = 0;
		srednia = suma/tablica.length;
		System.out.println("Srednia = " +srednia);
		
		int min = 0;
		for(int i = 0; i<tablica.length; i++) {
			if (min > tablica[i]) {
				min = tablica[i];
			}
		}
		System.out.println("Min = " +min);
		
		int max = 0;
		for(int i = 0; i<tablica.length; i++) {
			if (max < tablica[i]) {
				max = tablica[i];
			}
		}
		System.out.println("Max = " +max);
	}
}
