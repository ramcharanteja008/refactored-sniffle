import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		//InputReader reader = new InpurReader(System.in);

		int t=sc.nextInt(); //t is for testcases
		
		while(t>0){
			t--;
			Scanner sci= new Scanner(System.in);
			String inp=sci.nextLine();
			int lovely=0;
			for(int i=0;i<inp.length()-3;i++){
				String temp=""+inp.charAt(i)+inp.charAt(i+1)+inp.charAt(i+2)+inp.charAt(i+3);
				char tempArray[]= temp.toCharArray();
				Arrays.sort(tempArray);
				temp=String.valueOf(tempArray);
				if(temp.equals("cefh")){
					lovely++;
				}
			}

			if(lovely==0)
				System.out.println("Normal");
			else
				System.out.println("lovely"+" "+lovely);
		}
	}
}