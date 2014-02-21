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
				String s = "sin(x)+sin(y+z)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("x",90);
				vm.setValue("y",45);
				vm.setValue("z", 30);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In sine");
				
				double result= x.eval(vm, fm);
				double delta = 0.001;
				System.out.println("Max Result:"+result);
				Assert.assertEquals(0.50621502819, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		

		@Test
		public void avgTest() {
			try {
				String s = "avg(5.0,10.0,15.0)+min(10,20)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
			
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In avg");
				
				double result= x.eval(vm, fm);
				double delta = 0.001;
				System.out.println("Avg Result:"+result);
				Assert.assertEquals(20, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		
		@Test
		public void logTest() {
			try {
				String s = "log(a+b)+log(c)/log(d)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("a",10);
				vm.setValue("b", 20);
				vm.setValue("c", 10);
				vm.setValue("d", 20);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In Log");
				
				double result= x.eval(vm, fm);
				double delta = 0.001;
				System.out.println("Log Result:"+result);
				Assert.assertEquals(2.24574304156, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		
		@Test
		public void powTest() {
			try {
				String s = "pow(a,b)-pow(c,d)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("a",5);
				vm.setValue("b", 2);
				vm.setValue("c", 2);
				vm.setValue("d", 5);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In Pow");
				
				double result= x.eval(vm, fm);
				double delta = 0.00;
				System.out.println("Pow Result:"+result);
				Assert.assertEquals(-7.0, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		
		@Test
		public void factorialTest() {
			try {
				String s = "fact(a*b-c)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("a",3);
				vm.setValue("b", 2);
				vm.setValue("c", 1);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In Factorial");
				
				double result= x.eval(vm, fm);
				double delta = 0.00;
				System.out.println("Factorial Result:"+result);
				Assert.assertEquals(120, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		
		@Test
		public void ceilTest() {
			try {
				String s = "ceil(a*b+c-d)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("a",3.2);
				vm.setValue("b", 2.7);
				vm.setValue("c", 1.8);
				vm.setValue("d", 18.9);
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In Celing");
				
				double result= x.eval(vm, fm);
				double delta = 0.00;
				System.out.println("Ceiling Result:"+result);
				Assert.assertEquals(-8.00, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}
		
		@Test
		public void sumOfSqrtTest() {
			try {
				String s = "sum(sqrt(a),b,c)";
				Expression x = ExpressionTree.parse(s);

				VarMap vm = new VarMap(false);
				vm.setValue("a",4);
				vm.setValue("b", -2);
				vm.setValue("c", 7);
				
				
				FuncMap fm = new FuncMap(); // no functions in expression
				fm.loadDefaultFunctions();
				
				
				
				System.out.println("In Sum of Square Root");
				
				double result= x.eval(vm, fm);
				double delta = 0.00;
				System.out.println("Sum of Sqrt Result:"+result);
				Assert.assertEquals(7.0, result, delta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				fail("Not yet implemented");
			}
		
	}


@Test
public void cosSineHTest() {
	try {
		String s = "cosh( x ) + sinh ( y )";
		Expression x = ExpressionTree.parse(s);

		VarMap vm = new VarMap(false);
		vm.setValue("x",90);
		vm.setValue("y", 45);
		
		
		
		FuncMap fm = new FuncMap(); // no functions in expression
		fm.loadDefaultFunctions();
		
		
		
		System.out.println("In Cosh + Sinh");
		
		double result= x.eval(vm, fm);
		double delta = 0.001;
		System.out.println("Sinh + Cosh:"+result);
		Assert.assertEquals(6.102016471589175E38, result, delta);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		fail("Not yet implemented");
	}

}

@Test
public void expTest() {
	try {
		String s = "(exp(x)+exp(-x))/2";
		Expression x = ExpressionTree.parse(s);

		VarMap vm = new VarMap(false);
		vm.setValue("x",10);
		
		FuncMap fm = new FuncMap(); // no functions in expression
		fm.loadDefaultFunctions();
		
		
		
		System.out.println("In exp");
		
		double result= x.eval(vm, fm);
		double delta = 0.001;
		System.out.println("Exp:"+result);
		Assert.assertEquals(11013.232920103324, result, delta);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		fail("Not yet implemented");
	}

}

@Test
public void roundTest() {
	try {
		String s = "round(a)+round(b+c)";
		Expression x = ExpressionTree.parse(s);

		VarMap vm = new VarMap(false);
		vm.setValue("a",-10.5);
		vm.setValue("b",5.8);
		vm.setValue("c",3.4);
		
		FuncMap fm = new FuncMap(); // no functions in expression
		fm.loadDefaultFunctions();
		
		
		
		System.out.println("In Round");
		
		double result= x.eval(vm, fm);
		double delta = 0.001;
		System.out.println("Round:"+result);
		Assert.assertEquals(-1.0, result, delta);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		fail("Not yet implemented");
	}

}
}
