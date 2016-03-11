
public class Continue_Eg {

	public static void main(String[] args) {
		
		 int numbers[]={5,6,7,8,9};
		 /*
		  * Continue statement is used to skip a particular iteration
		  *of the loop 
		  */
		 for(int x:numbers){
			 if(x==7){
				 continue;
				 
			 }
			 System.out.print(x);
			 System.out.println("\n");
		 }
		 

	}

}
