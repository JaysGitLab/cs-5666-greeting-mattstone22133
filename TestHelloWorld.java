import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Test;
public class TestHelloWorld{
	
	@Test
	public void testHelloWorldString(){
		//save the system.in and system.out
		PrintStream originalOut = System.out;
		
		//Set up obj to capture the print stream
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		String inputString = "Hello, World!";
		
		HelloWorld.main(null);
		
		//TEST
		assertEquals(" the input stream and output stream did not match", baos.toString().trim(), inputString);

		
		//restore systemoriginal
		System.setOut(originalOut);
	}
}