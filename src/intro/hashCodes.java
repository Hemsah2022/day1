package intro;

import java.util.Arrays;
import java.util.Scanner;

public class hashCodes {
	public static void main(String[] args) {
			
		 String a = "100";
	      String b = "100";
	      if(a.equals(b))
	      {
	        System.out.println("Equal variables:");
	        System.out.println(a.hashCode() + "\n" + b.hashCode());
	      }
	      
	      // .hashCode do not work for char
	      
	      
	        Scanner var = new Scanner(System.in);
			System.out.println("enter some jebrish to count the character count ");
			String varC =var.nextLine(); 
			char[] charC = varC.toCharArray(); 
			char[] print = new char[charC.length];
			int[] freq = new int[charC.length];
	        int count=0;
	        
			for (int i=0; i<charC.length;i++) {
				
				count=0;
				 
				
				 for (int j=0; j<charC.length; j++) {
					
					   if (j<i && charC[i]==charC[j]  ){
	 
						break;
						
					
					    }
					   if (charC[i]==charC[j]  ){
							 
							count++;
							
						
						    }
					   
				}
				 if (count!=0)
				   System.out.println("number of char "+charC[i]+ " is "+ count);
			}
	      
	      
			 
				
	      
	      
	      
			
	      
	}
}
