import java.lang.*;
import java.util.*;

class p13{
	
	public static void main(String args[]){
		
		int alpha = 65;
		for(int i = 1; i < 6; i++){
			
			for(int j = i; j <= 6; j++){
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++){
				
				if(j == i || j == 1){
				
					System.out.print((char)alpha+" ");
				}
				
				else{
					
					System.out.print("  ");
				}
				
			}
			alpha++;
			System.out.println();
		}
		
		int bet = 70;
		
		for(int i = 1; i <= 6; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(" ");
			}
			
			for(int j = i; j <= 6; j++){
				
				if( j == i || j == 6 ){
					
					System.out.print((char)bet+" ");
				}
				
				else{
					
					System.out.print("  ");
				}
			}
			bet--;
			System.out.println();
		}
	}
}