import java.lang.*;
import java.util.*;

class p24{
	
	public static void main(String args[]){

		for(int i = 1; i <= 5; i++){
			
			System.out.print(i+" ");
			
			for(int j = 1; j <= i; j++){
				
				if(j == 2){
					
					System.out.print((i+4)+" ");
				}
				
				if(j == 3){
					
					System.out.print((i+7)+" ");
				}
				
				if(j == 4){
					
					System.out.print((i+9)+" ");
				}
				
				if(j == 5){
					
					System.out.print((i+10)+" ");
				}

			}
			
			System.out.println();
		}
	}
}