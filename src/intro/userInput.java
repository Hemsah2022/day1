package intro;
import  java.util.*; //java util scanner

public class userInput {

	public static void main(String[] args) {

		//user input
		Scanner var = new Scanner(System.in);
		System.out.println("enter name : ");
		String name =var.nextLine();
		System.out.println("enter age : ");
		int age =var.nextInt();
		System.out.println("enter ph : ");
		long ph = var.nextLong();
		System.out.println("enter ur balance : ");
		double balance = var.nextDouble();
		System.out.println(name+" " +age+" " +ph+" " +balance);
		var.close();

	}

}
