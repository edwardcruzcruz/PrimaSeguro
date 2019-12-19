import static org.junit.Assert.*;

import org.junit.Test;

public class PrimaTestRecorrido {
	@Test
	public void testPath() {
		Primav4 tester = new Primav4();
		tester.prima(18, 35);
		tester.prima(25, 30);
		tester.prima(25, 25);
		tester.prima(35, 28);
		tester.prima(35, 27);
		tester.prima(45, 30);
		tester.prima(45, 25);
		tester.prima(65, 28);
		tester.prima(65, 22);
		tester.prima(91, 30);
		tester.prima(91, 24);
		tester.prima(64, "o");
		tester.prima("o", 20);
		
	}
	
	@Test
	public void testNodo() {
		Primav4 tester = new Primav4();
		tester.prima(18, 0);
		tester.prima(18, 24);
		tester.prima(18, 30);
		tester.prima(28, 30);
		tester.prima(26, 10);
		tester.prima(36, 28);
		tester.prima(37, 24);
		tester.prima(80, 20);
		tester.prima(70, 26);
		tester.prima(50, 10);
		tester.prima(55, 29);
		tester.prima("o", 30);
		tester.prima(25, 36);
		tester.prima(16, 30);
	}
	@Test
	public void testRamas() {
		Primav4 tester = new Primav4();
		tester.prima(18, 30);
		tester.prima(17, 30);
		tester.prima(24, 30);
		tester.prima("i", 27);
		tester.prima(28, "o");
		tester.prima(25, 30);
		tester.prima(34, 28);
		tester.prima(26, 25);
		tester.prima(34, 29);
		tester.prima(44, 26);
		tester.prima(44, 23);
		tester.prima(64, 23);
		tester.prima(64, 21);
		tester.prima(70, 26);
		tester.prima(71, 21);
	}
}
