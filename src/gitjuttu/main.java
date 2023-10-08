package gitjuttu;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int euro = 5;
		
		
		while(euro>0) {
			euro--;
		
            int randomNumber1 = random.nextInt(10) + 1;
            int randomNumber2 = random.nextInt(10) + 1;
            int randomNumber3 = random.nextInt(10) + 1;
            System.out.println("Sinulla on " + euro + " euroa ja joka peli maksaa euron.");
            System.out.println("tulokset:");
            System.out.println("Numero 1: " + randomNumber1);
            System.out.println("Numero 2: " + randomNumber2);
            System.out.println("Numero 3: " + randomNumber3);
            
            
            int sevens = 0;

            if (randomNumber1 == 7) {
                sevens++;
            }
            if (randomNumber2 == 7) {
                sevens++;
            }
            if (randomNumber3 == 7) {
                sevens++;
             
             
                
            int voitot = 0;
            
            if (sevens == 1) {
            voitot = 3;
             } else if (sevens == 2) {
                    voitot = 5;
                } else if (sevens == 3) {
                    voitot = 10;
                }

                if (voitot > 0) {
                    System.out.println("Voitit " + voitot);
                    euro += voitot;
                } else {
                    System.out.println("Hävisit.");
                }
            }

		}
		
		

	}

}
