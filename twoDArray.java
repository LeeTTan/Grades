
public class twoDArray {
	public static void main(String[] args) {
		String [][] messageForDad = {{"Lee is better than", "Dad is better than"},
		{"Dad", "Lee"}
		};

		//messageForDad[1][1]="false";
		//messageForDad[0][0]==true;
		System.out.println(messageForDad[0][0]+ messageForDad[1][0]);
		System.out.println(messageForDad[0][1]+ messageForDad[1][1]);
		if(messageForDad[0][1]+messageForDad[1][1]==messageForDad[0][1]+ messageForDad[1][1]) {
			System.out.print("..... False this is not true");
		}
		else if(messageForDad[0][0]+messageForDad[1][0]==messageForDad[0][0]+ messageForDad[1][0]){
			System.out.print(".... This is indeed true");
		}
	}

}
