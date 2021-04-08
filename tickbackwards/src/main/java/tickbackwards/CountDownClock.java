package tickbackwards;

public class CountDownClock {
	public void countDownTime(int DECREMENT_BY_SECS) {
		int oneSecond = 1000;
		try {
			System.out.println("Starting count down time...");
			if (DECREMENT_BY_SECS < 0) {
				System.out.println("Please enter positive integer");
			} else {
				for (int i = DECREMENT_BY_SECS; i > 3; i--) {
					Thread.sleep(oneSecond);
				}
				int timeRemaining = 3;
				if (DECREMENT_BY_SECS < 3) {
					timeRemaining = DECREMENT_BY_SECS;
				}
				for (int i = timeRemaining; i > 0; i--) {
					System.out.println(i + " seconds remaining ");
					Thread.sleep(oneSecond);
				}
				System.out.println("Time out");
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
