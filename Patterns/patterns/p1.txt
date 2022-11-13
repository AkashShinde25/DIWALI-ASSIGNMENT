import java.lang.*;
import java.util.*;

class p1{
	
	public static void main(String args[]){
		
		int i;
		int j;
		
		for(i = 1; i <= 5; i++){
			
			for(j = i; j <= 5; j++){
				
				System.out.print(" ");
				
			}
			
			for(j = 1; j <= 9; j++){
					
				if( j == i || i == 5 || j == 1 ){
					
					System.out.print(" * ");
				
				}
				else{
					
					System.out.print("   ");
				}
				
			}
			
			System.out.println();
		}
	}
}