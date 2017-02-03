/**
 * 
 */
package zaliczenie;
import java.util.Random;
/**
 * @author Paweł
 *
 */
public class zaliczenie {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random random = new Random();		
		int rozmiar = random.nextInt(10)+10;
		int max1 = 0; 
		int	max2 = 0;
		int sumaw = 0;
		int sumak = 0;
		int komorki = 0;
		
		int[][] tab1 = new int[rozmiar][rozmiar]; 
		for (int i = 0; i<tab1.length; i++){
     		for (int j = 0; j<tab1[i].length; j++){
     			if(i != j){
     				tab1[i][j] = random.nextInt(100)+100;
     			}
     			else{
     				if(random.nextInt(101) <= 35){
     					tab1[i][j] = 1;
     				}
     				else{
     					tab1[i][j] = -1;
     				}
     			}
     			if(tab1[i][j] > max1){
 					max1 = tab1[i][j];
 					if(max1>max2){
 						
						int chwilowa = 0;
						chwilowa = max1;
						max1 = max2;
						max2 = chwilowa;
					}
				}
     			
				if( i % 2 == 0) {
 					sumaw += tab1[i][j];
 				}
				if( j % 2 == 1){
 					sumak += tab1[i][j];
 				}
 				if(tab1[i][j] < j*i){
 					komorki++;
 				}
     		}
		}
		boolean[][] tab2 = new boolean[rozmiar][rozmiar];
		int sum = 0;
		for (int i = 0; i<tab2.length; i++){
     		for (int j = 0; j<tab2[i].length; j++){
				if(random.nextInt(2) == 0){
					tab2[i][j] = false;
				}
				else{
					tab2[i][j] = true;
					sum += tab1[i][j];
				}
     		}
		}
		double stosunek = (double)sumaw/sumak;
		
		System.out.printf("Suma elementów dla których odpowiednia wartość w drugiej tabeli zapisana jest true %d.\n", sum);
		System.out.printf("Dwie największe liczby zapisane w tabeli: %d i %d.\n", max1, max2);
		System.out.printf("Stosunek sumy liczb leżących w komórkach o parzystych indeksach wierszy i nieparzystych indeksach kolumn: %.3f.\n", stosunek);
		System.out.printf("Liczba komórek, których wartość jest mniejsza od iloczynu indeksu wiesza i kolumny tej komórki: %d.", komorki);
	
		}
}
