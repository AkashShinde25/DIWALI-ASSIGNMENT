import java.lang.*;
import java.util.*;

class p10{
	
	public static void main(String args[]){
		
		int alpha = 65;
		for(int i = 1; i <= 6; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)alpha+" ");
			}
			
			System.out.println();
			alpha++;
			
		}
	}
}