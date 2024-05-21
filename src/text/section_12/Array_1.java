package text.section_12;

public class Array_1 {

	public static void main(String[] args) {
		String[] nameArray = new String[5];
		int[] scoreArray = { 70, 85, 80, 95,90 };
		
		for( int i = 0; i < scoreArray.length; i++ ) {
			System.out.println(scoreArray[i]);
		}
		
		for( int score : scoreArray) {
			System.out.println(score);
		}

	}

}
