package quick.start.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void sum() {
		int sum = Calculator.sum(2, 3);
		assertEquals(5, sum);
	}
}
