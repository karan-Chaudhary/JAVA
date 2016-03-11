
public class Break_demo {

	public static void main(String[] args) {
		
		int[] numbers={45,50,55,60,65,70,80};
		
		for(int x:numbers){
			if(x==60){
				break;
			}
			System.out.println(x);
		}
		
	}

}
