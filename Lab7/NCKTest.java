import org.junit.*;

import static edu.gvsu.mipsunit.munit.MUnit.Register.*;
import static edu.gvsu.mipsunit.munit.MUnit.*;

public class NCKTest {

    @Before
    public void before() {
    set(v0, 1337);
    }

    /******************************************************************
     *
     * Test makes10
     *
     *****************************************************************/

    @Test 
    public void nCk_5_3() {
    run("nCk", 5, 3);
    Assert.assertEquals(10, get(v0));
    }

    @Test 
    public void nCk_100_4() {
    run("nCk", 100, 4);
    Assert.assertEquals(3921225, get(v0));
    }
    
    @Test 
    public void nCk_8_8() {
    run("nCk", 8, 8);
    Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void nCk_18_4() {
    run("nCk", 18, 4);
    Assert.assertEquals(3060, get(v0));
    }
    
    @Test 
    public void nCk_3_4() {
    run("nCk", 3, 4);
    Assert.assertEquals(-1, get(v0));
    }
    
    @Test 
    public void nCk_5000_0() {
    run("nCk", 5000, 0);
    Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void nCk_32767_0() {
    run("nCk", 32767, 0);
    Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void nCk_65535_0() {
    run("nCk", 65535, 0);
    Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void nCk_65537_1() {
    run("nCk", 65537, 1);
    Assert.assertEquals(65537, get(v0));
    }
    
    @Test 
    public void nCk_neg1_6() {
    run("nCk", -1, 6);
    Assert.assertEquals(-1, get(v0));
    }
    
    @Test 
    public void nCk_6_neg1() {
    run("nCk", 6, -1);
    Assert.assertEquals(-1, get(v0));
    }
    

    /******************************************************************
     *
     * Write many more tests!  * Test Edge Cases *
     *
     *****************************************************************/
    
} // end class


