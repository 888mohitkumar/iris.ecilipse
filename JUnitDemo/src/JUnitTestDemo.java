import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestDemo {

	public static int beforClass = 1;

	public static int afterClass = 1;

	public static int setClass = 1;
	public static int tearClass = 1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass value is ::" + beforClass++);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass value is ::" + afterClass++);
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp value is ::" + setClass++);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown value is ::" + tearClass++);
	}

	@Test
	public void test() {
		System.out.println("                                           Test case 1");
		// fail("Not yet implemented");
	}

	@Test
	public void test2() {
		System.out.println("                                           Test case 2");
	}
}
