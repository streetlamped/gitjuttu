package gitjuttu;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		

            int randomNumber1 = random.nextInt(10) + 1;
            int randomNumber2 = random.nextInt(10) + 1;
            int randomNumber3 = random.nextInt(10) + 1;
        	
            System.out.println(randomNumber1);
            System.out.println(randomNumber2);
            System.out.println(randomNumber3);

            if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
                System.out.println("Voitit.");
            } else {
                System.out.println("Hävisit.");
            }
        
		
		

	}

}
