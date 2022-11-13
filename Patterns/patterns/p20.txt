import java.lang.*;
import java.util.*;

class p20{

	public static void main(String args[]){
		
		for(int i = 1; i < 7; i++){
			
			for(int j = 1; j <= i; j++){
			
				System.out.print("  ");
			}
			
			for(int j = i; j <= 7; j++){
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		int x = 7;
		for(int i = 1; i <= 7; i++){
			
			for(int j = i; j <= 7; j++){
				
				System.out.print("  ");
			}
			
			for(int j = x; j <= 7; j++){
				
				System.out.print(j+" ");
				
			}
			x--;
			System.out.println();
		}
	}
}