package text.section_09;

public class AgeBasedFee {

	public static void main(String[] args) {
		String age = "30代";
		String fee = "3000円";
				
		switch(age) {
		case "10代" ->  fee = "1000円";
		case "20代" ->  fee = "2000円";
		case "30代" ->  fee = "3000円";
		default ->  fee = "500円";
		}
		
		 
		System.out.println(age + "の料金は" + fee + "です。");

	}

}
