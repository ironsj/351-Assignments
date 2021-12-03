import org.junit.*;

import static edu.gvsu.mipsunit.munit.MUnit.Register.*;
import static edu.gvsu.mipsunit.munit.MUnit.*;

public class BranchTest {


    /******************************************************************
     *
     * Test makes10
     *
     *****************************************************************/

    @Test 
    public void makes10_aIs10() {
	run("makes10", 10, 3);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs101() {
	run("makes10", 9, 10);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs102() {
	run("makes10", 9, 9);
	Assert.assertEquals(0, get(v0));
    }
    
    @Test 
    public void makes10_aIs103() {
	run("makes10", 1, 9);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs104() {
	run("makes10", 10, 1);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs105() {
	run("makes10", 10, 10);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs106() {
	run("makes10", 8, 2);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs107() {
	run("makes10", 8, 3);
	Assert.assertEquals(0, get(v0));
    }
    
    @Test 
    public void makes10_aIs108() {
	run("makes10", 10, 42);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs109() {
	run("makes10", 12, -2);
	Assert.assertEquals(1, get(v0));
    }
    
    @Test 
    public void makes10_aIs1010() {
	run("makes10", 12, -5);
	Assert.assertEquals(0, get(v0));
    }

    // Write more tests!


    /******************************************************************
     *
     * Test dateFashion
     *
     *****************************************************************/

    @Test 
    public void dateFashion_youOk_dateStylish() {
	run("dateFashion", 5, 10);
	Assert.assertEquals(2, get(v0));
    }
    
    @Test 
    public void dateFashion_youOk_dateStylish1() {
	run("dateFashion", 5, 2);
	Assert.assertEquals(0, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish2() {
	run("dateFashion", 5, 5);
	Assert.assertEquals(1, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish3() {
	run("dateFashion", 3, 3);
	Assert.assertEquals(1, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish4() {
	run("dateFashion", 10, 2);
	Assert.assertEquals(0, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish5() {
	run("dateFashion", 2, 9);
	Assert.assertEquals(0, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish6() {
	run("dateFashion", 9, 9);
	Assert.assertEquals(2, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish7() {
	run("dateFashion", 10, 5);
	Assert.assertEquals(2, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish8() {
	run("dateFashion", 2, 2);
	Assert.assertEquals(0, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish9() {
	run("dateFashion", 3, 7);
	Assert.assertEquals(1, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish10() {
	run("dateFashion", 2, 7);
	Assert.assertEquals(0, get(v0));
    }
    
    
    @Test 
    public void dateFashion_youOk_dateStylish11() {
	run("dateFashion", 6, 2);
	Assert.assertEquals(0, get(v0));
    }

    // Write more tests!


} // end class

