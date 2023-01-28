package mes.practical.UnitTestingExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mes.practical.UnitTestingExample.Service.FirstSevice;

@SpringBootTest(classes = UnitTestingExampleApplicationTests.class)
class UnitTestingExampleApplicationTests {

	FirstSevice firstSevice = new FirstSevice();

	@Test
	void checkForNumberAddition() {
		int output = firstSevice.addTwoNumbers(1, 2);
		assertEquals(output, 3);
	}

}
