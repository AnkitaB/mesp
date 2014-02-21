package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.graphbuilder.math.Expression;
import com.graphbuilder.math.ExpressionTree;
import com.graphbuilder.math.FuncMap;
import com.graphbuilder.math.VarMap;

public class ExpressionTree_Test {

	@Test
	public void areaOfCircleTest() {
		try {
			String s = "pi*r^2";
			Expression x = ExpressionTree.parse(s);

			VarMap vm = new VarMap(false /* case sensitive */);
			vm.setValue("pi", Math.PI);
			vm.setValue("r", 5);

			FuncMap fm = null; // no functions in expression

			System.out.println(x); // (pi*(r^2))
			
			double result= x.eval(vm, fm);
			double delta = 0.0009;
			Assert.assertEquals(78.53981633974483, result, delta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}

		
		
	}
	
	@Test
	public void addSubNumbersTest() {
		try {
			String s = "x-y+z";
			Expression x = ExpressionTree.parse(s);

			VarMap vm = new VarMap(false);
			vm.setValue("x",5);
			vm.setValue("y", 4);
			vm.setValue("z", 2);

			FuncMap fm = null; // no functions in expression

			
			double result= x.eval(vm, fm);
			double delta = 0.0;
			System.out.println(result);
			Assert.assertEquals(3, result, delta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
		
		@Test
		public void powerTest() {
			try {
				String s = "(1 + x)^2";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("x",5);
				
				FuncMap fm = null; // no functions in expression

				
				double result= x.eval(vm, fm);
				double delta = 0.0;
				System.out.println(result);
				Assert.assertEquals(36.0, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				fail("Not yet implemented");
			}
		
	}
		

		@Test
		public void maxTest() {
			try {
				String s = "max(-10,0,20)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				//vm.setValue("pi",Math.PI);
				
				FuncMap fm = new FuncMap(); // max func
				fm.loadDefaultFunctions();
				
				System.out.println("In max");
				
				double result= x.eval(vm, fm);
				double delta = 0.001;
				System.out.println("Max Result:"+result);
				Assert.assertEquals(20, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				fail("Not yet implemented");
			}
		
	}


		@Test
		public void sineTest() {
			try {
				String s = "sin(x)+sin(y)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("x",90);
				vm.setValue("y",45);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In sine");
				
				double result= x.eval(vm, fm);
				double delta = 0.001;
				System.out.println("Max Result:"+result);
				Assert.assertEquals(1.74490018813, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		

		@Test
		public void avgTest() {
			try {
				String s = "avg(5.0,10.0,15.0)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("x",5.0);
				vm.setValue("x",10.0);
				vm.setValue("x",15.0);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In avg");
				
				double result= x.eval(vm, fm);
				double delta = 0.001;
				System.out.println("Max Result:"+result);
				Assert.assertEquals(10, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		
		@Test
		public void logTest() {
			try {
				String s = "log(a+b)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("a",10);
				vm.setValue("b", 20);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In sine");
				
				double result= x.eval(vm, fm);
				double delta = 0.001;
				System.out.println("Max Result:"+result);
				Assert.assertEquals(1.47712125, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
}
