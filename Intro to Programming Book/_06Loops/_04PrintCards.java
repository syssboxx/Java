package _06Loops;

public class _04PrintCards {

	
	public static void main(String[] args) {

		String cardName = "";
		String cardColor = "";

		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1: cardColor= "������";
				break;
			case 2: cardColor= "����";
				break;
			case 3: cardColor= "����";
				break;
			case 4: cardColor= "����";
				break;
			}
			for (int j = 2; j <= 14; j++) {
				
				switch (j) {
				case 2: cardName = "2";
						break;
				case 3: cardName = "3";
						break;
				case 4: cardName = "4";
						break;
				case 5: cardName = "5";
						break;
				case 6: cardName = "6";
						break;
				case 7: cardName = "7";
						break;
				case 8: cardName = "8";
						break;
				case 9: cardName = "9";
						break;
				case 10: cardName = "10";
						break;
				case 11: cardName = "���";
						break;
				case 12: cardName = "����";
						break;
				case 13: cardName = "���";
						break;
				case 14: cardName = "����";
						break;
				}
				
				System.out.println(cardName +" "+cardColor);
			}
			System.out.println();
		}

	}

}
