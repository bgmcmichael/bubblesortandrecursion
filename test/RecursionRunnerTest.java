import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fenji on 9/27/2016.
 */
public class RecursionRunnerTest {
    RecursionRunner tester = new RecursionRunner();

    @Test
    public void fibonacci() throws Exception {
        assertEquals(0, tester.fibonacci(0, 1, 0));
        System.out.println("test1 pass");

        assertEquals(1, tester.fibonacci(0, 1, 1));
        System.out.println("test2 pass");

        assertEquals(1, tester.fibonacci(0, 1, 2));
        System.out.println("test3 pass");

        assertEquals(2, tester.fibonacci(0, 1, 3));
        System.out.println("test4 pass");

        assertEquals(3, tester.fibonacci(0, 1, 4));
        System.out.println("test5 pass");

        assertEquals(5, tester.fibonacci(0, 1, 5));
        System.out.println("test6 pass");

        assertEquals(8, tester.fibonacci(0, 1, 6));
        System.out.println("test7 pass");

        assertEquals(13, tester.fibonacci(0, 1, 7));
        System.out.println("test8 pass");

        assertEquals(21, tester.fibonacci(0, 1, 8));
        System.out.println("test9 pass");

        assertEquals(34, tester.fibonacci(0, 1, 9));
        System.out.println("test10 pass");
    }

    @Test
    public void factorial() throws Exception {
        assertEquals(1, tester.factorial(0));
        System.out.println("test1 pass");

        assertEquals(1, tester.factorial(1));
        System.out.println("test2 pass");

        assertEquals(2, tester.factorial(2));
        System.out.println("test3 pass");

        assertEquals(6, tester.factorial(3));
        System.out.println("test4 pass");

        assertEquals(24, tester.factorial(4));
        System.out.println("test5 pass");

        assertEquals(120, tester.factorial(5));
        System.out.println("test6 pass");
    }

}