package tickbackwards;

import java.util.Scanner;

public class TickBackWards {

	public static void main(String[] args) {
		CountDownClock timer = new CountDownClock();
		Scanner console = new Scanner(System.in);
		System.out.println("Hi customer, this is count down time app.");
		while (true) {
			System.out.println("Please enter your second you want to count down: ");
			getInput(timer, console);
			System.out.println("Do you want to contine Y/N?");
			String strContinue = console.next();
			if (strContinue.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("Thank you for using our app.");
	}

	public static void getInput(CountDownClock timer, Scanner console) {
		String strSecond = console.next();
		while (true) {
			if (isNumeric(strSecond)) {
				timer.countDownTime(Integer.parseInt(strSecond));
				break;
			} else {
				strSecond = requestNumberic(console);
			}
		}
	}

	public static String requestNumberic(Scanner console) {
		System.out.println("Please enter integer number only");
		return console.next();
	}

	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
