
public class Output {

	public static void main(String[] args) {
		
		for(int i=1;i<50;i++) {
			
			String out = "";
			
			if(i%3==0) { out+="Fizz"; }
			if(i%5==0) { out+="Buzz"; }
			
			if(out.equals("")) { out = Integer.toString(i);}
			
			System.out.println(out);
			
		}
		
		
	}
	
}
