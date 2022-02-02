package LAB2;

import java.util.Scanner;

public class Lab2P2 {

   public static void main(String[] args) {
	  int n ;
	  Scanner scanf = new Scanner(System.in);
      System.out.print("Please enter your value : ");
      
      n = scanf.nextInt();
      scanf.close();
      
      System.out.print(" ");	
      System.out.println("-----------------------");
      
      
		for ( int i = 2 ; i <= n ; i++){
			int j = 2;
			if(i == 2 ) {
				System.out.println(i + "= Prime Number");
			}else if(i == 3) {
				System.out.println(i + "= Prime Number");
			}else {
				if(i % j == 0) {
				System.out.print(i + "= Not Prime : Divide by ");
					for ( j = 2; j < i ; j++) {
						if(i % j == 0) {
							if(j == 2) {
								System.out.print( j );
							}
						System.out.print("," + j );
						}
					}
				System.out.println("");
				}
				else if(i % 3 == 0) {
					System.out.print(i + "= Not Prime : Divide by ");
						for ( j = 2; j < i ; j++) {
							if(i % j == 0) {
								if(j == 2) {
									System.out.print( j );
								}
							System.out.print("," + j );
							}
						}
					System.out.println("");
					}
				else if(i % 5 == 0) {
					System.out.print(i + "= Not Prime : Divide by ");
						for ( j = 2; j < i ; j++) {
							if(i % j == 0) {
								if(j == 2) {
									System.out.print( j );
								}
							System.out.print("," + j );
							}
						}
					System.out.println("");
					}
				else {
				System.out.println(i + "= Prime Number");
				}
				}
		}
			
	}

}