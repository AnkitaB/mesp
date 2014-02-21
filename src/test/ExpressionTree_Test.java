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
			//System.out.println(x.eval(vm, fm)); // 78.53981633974483
			double result= x.eval(vm, fm);
			double delta = 0.0009;
			Assert.assertEquals(78.53981633974483, result, delta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}

		//vm.setValue("r", 10);
		//System.out.println(x.eval(vm, fm)); // 314.1592653589793
		
	}

}
