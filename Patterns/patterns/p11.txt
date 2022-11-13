import java.lang.*;
import java.util.*;

class p11{
	
	public static void main(String args[]){
		
		
		for(int i = 1; i <= 6; i++){
			
			int alpha = 65;
			for(int j = i; j <= 6; j++){
			
				System.out.print((char)alpha+" ");
				alpha++;
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 6; i++){
			
			int alpha = 65;
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)alpha+" ");
				alpha++;
			}
			System.out.println();
		}
	}
}