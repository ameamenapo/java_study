package text.section_09;

public class SwitchSyntax_1 {

	public static void main(String[] args) {
		int ranking = 1;//順位
		
		switch(ranking) {
			case 1 -> System.out.println("金メダル");
			case 2 -> System.out.println("銀メダル");
			case 3 -> System.out.println("銅メダル");
			default -> System.out.println("参加賞");
		}

	}

}
