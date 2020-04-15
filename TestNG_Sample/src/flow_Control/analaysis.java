package flow_Control;

import org.testng.annotations.Test;

public class analaysis {
		@Test(priority=3)
		public void test_analysis() {
		System.out.println("I am exected 3rd");
		}
		@Test(priority=1)
		public void test_analys() {
			System.out.println("i am executed 1st");
			}
		@Test(priority=2)
		public void test_analy()
		{
			System.out.println("i am executed 2nd");
		}
}
