
//base code for a simple card game
import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {

		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		Random randomNum = new Random();
		int max, min, c1, c2, c3, c4, c5, c6, p1, p2;
		max = 12;
		min = 0;
		c1 = 0;
		c2 = 0;
		c3 = 0;
		c4 = 0;
		c5 = 0;
		c6 = 0;
		p1 = 0;
		p2 = 0;

		// this will generate a random number
		c1 = min + randomNum.nextInt(max);
		c2 = min + randomNum.nextInt(max);
		c3 = min + randomNum.nextInt(max);
		c4 = min + randomNum.nextInt(max);
		c5 = min + randomNum.nextInt(max);
		c6 = min + randomNum.nextInt(max);

		// output test
		System.out.println("Player 1 got these cards: ");
		System.out.println(ranks[c1]);
		System.out.println(ranks[c2]);
		System.out.println(ranks[c3]);
		System.out.println("Player 2 got these cards: ");
		System.out.println(ranks[c4]);
		System.out.println(ranks[c5]);
		System.out.println(ranks[c6]);

		p1 = value[c1] + value[c2] + value[c3];
		System.out.println("Player 1 has " +p1+ " points.");

		p2 = value[c4] + value[c5] + value[c6];
		System.out.println("Player 2 has " +p2+ " points.");

		if (p1 > 21)
		{
			p1 = 0;
			System.out.println("Oh no! Player 1 busted!");
		}

		if (p2 > 21)
		{
			p2 = 0;
			System.out.println("Oh no! Player 2 busted!");
		}

		if (p1 > p2){
			System.out.println("Player 1 won!");
		}
		
		if (p2 > p1){
			System.out.println("Player 2 won!");
		}
		
		if (p1 == p2){
			System.out.println("It's a tie!");
		}

	}
}
