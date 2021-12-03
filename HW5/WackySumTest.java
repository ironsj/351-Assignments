import org.junit.*;

import static edu.gvsu.mipsunit.munit.MUnit.Register.*;
import static edu.gvsu.mipsunit.munit.MUnit.*;

public class WackySumTest {

    @Before
    public void before() {
    set(v0, 1337);
    }

    /******************************************************************
     *
     * Test wackySum
     *
     *****************************************************************/

    @Test 
    public void wacky_3_7_2() {
    run("wackySum", 3, 7, 2);
    Assert.assertEquals(27, get(v0));
    }

    @Test 
    public void wacky_21_26_1() {
    run("wackySum", 21, 26, 1);
    Assert.assertEquals(336, get(v0));
    }

    @Test 
    public void wacky_33_42_2() {
    run("wackySum", 33, 42, 2);
    Assert.assertEquals(285, get(v0));
    }
    
    @Test 
    public void wacky_12_14_13() {
    run("wackySum", 12, 14, 13);
    Assert.assertEquals(40, get(v0));
    }
    
    @Test 
    public void wacky_30_91_34() {
    run("wackySum", 30, 91, 34);
    Assert.assertEquals(290, get(v0));
    }
    
    @Test 
    public void wacky_63_74_72() {
    run("wackySum", 63, 74, 72);
    Assert.assertEquals(96, get(v0));
    }
    
    @Test 
    public void wacky_92_27_67() {
    run("wackySum", 92, 27, 67);
    Assert.assertEquals(0, get(v0));
    }
    
    @Test 
    public void wacky_47_93_1() {
    run("wackySum", 47, 93, 1);
    Assert.assertEquals(7478, get(v0));
    }

    /******************************************************************
     *
     * Write many more tests!  * Test Edge Cases *
     *
     *****************************************************************/
    
} // end class


