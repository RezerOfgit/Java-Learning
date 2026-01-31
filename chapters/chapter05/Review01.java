public class Review01{
	public static void main(String [] args){
		int k = 1;
		int score = 0;
		switch (k) {
		    case 1:
		        score += 10; // score = score + 10£»->10
		    case 2:
		        score += 20; // score = score + 20£»->30
		    case 3:
		        score += 30; // score = score + 30£»->60
		        break;
		}
		System.out.println(score); // ½á¹ûÊÇ60
	}
}