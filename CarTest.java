package albert.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import albert.Car;

public class CarTest {

	private int expectedWheels;
	private Car myCar;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		expectedWheels = 8;
		myCar = new Car();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		myCar = null;
	}

	@Test
	public void testGetWheels() {
		assertEquals(expectedWheels, myCar.getWheels());
	}

	@Test
	public void testGetWheelsAgain() {
		assertEquals(expectedWheels, myCar.getWheels());
	}

}
