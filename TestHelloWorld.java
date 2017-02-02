import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {
	private ByteArrayInputStream bais;
	private ByteArrayOutputStream baos;

	private PrintStream originalOut = System.out;
	private InputStream originalIn = System.in;

	@Before
	public void setTemporaryStreams() {
		// bais = new ByteArrayInputStream("Hi".getBytes()); //No need for input capture yet
		baos = new ByteArrayOutputStream();

		System.setIn(bais);
		System.setOut(new PrintStream(baos));
	}

	@After
	public void restoreStreams() {
		System.setIn(originalIn);
		System.setOut(originalOut);
	}

	@Test
	public void TestNoArg() {
		HelloWorld.main(null);
		String correctOutput = "Hello, World!";
		assertEquals(correctOutput, baos.toString().trim());
	}

	@Test
	public void TestNameArg() {
		String correct = "Hello, Matt!";
		HelloWorld.main(new String[] { "Matt" });

		assertEquals(correct, baos.toString().trim());
	}

}
