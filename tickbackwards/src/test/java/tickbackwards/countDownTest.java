package tickbackwards;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

import junit.framework.TestCase;

public class countDownTest extends TestCase {
	@Test
	public void testCountDown_10s() {
		testCountDown(10);
	}

	@Test
	public void testCountDown_0s() {
		testCountDown(0);
	}

	@Test
	public void testCountDown_negativesecond() {
		testCountDown(-1);
	}

	public void testCountDown(int second) {
		LocalDateTime before = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		CountDownClock countDown = new CountDownClock();
		countDown.countDownTime(second);
		LocalDateTime after = LocalDateTime.now();
		assertEquals(before.getHour(), before.getHour());
		if (second >= 0) {
			assertEquals(second,
					after.getMinute() * 60 + after.getSecond() - before.getMinute() * 60 - before.getSecond());
		}
	}
}
