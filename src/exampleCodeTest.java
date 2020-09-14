import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exampleCodeTest {

	@Test
	void testAdd() {
		assertEquals(792, exampleCode.add(427, 365));
	}

	@Test
	void testSub() {
		assertEquals(42, exampleCode.sub(49, 7));
	}
}
