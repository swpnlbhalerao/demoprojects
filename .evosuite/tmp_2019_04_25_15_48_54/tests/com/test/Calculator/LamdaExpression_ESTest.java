/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 25 10:19:09 GMT 2019
 */

package com.test.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import com.test.Calculator.LamdaExpression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LamdaExpression_ESTest extends LamdaExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LamdaExpression lamdaExpression0 = new LamdaExpression();
      int int0 = lamdaExpression0.functionEx(1384);
      assertEquals(534808576, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LamdaExpression lamdaExpression0 = new LamdaExpression();
      int int0 = lamdaExpression0.functionEx(2332);
      assertEquals((-432263040), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LamdaExpression lamdaExpression0 = new LamdaExpression();
      int int0 = lamdaExpression0.functionEx((-1));
      assertEquals(0, int0);
  }
}