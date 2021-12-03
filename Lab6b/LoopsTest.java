import org.junit.*;

import static edu.gvsu.mipsunit.munit.MUnit.Register.*;
import static edu.gvsu.mipsunit.munit.MUnit.*;

public class LoopsTest {


    /******************************************************************
     *
     * Test max
     *
     ******************************************************************/
     Label array1 = wordData(14, 6, 2, 23, 4, 7, 9, 10, -50);
     Label array2 = wordData(14);
     Label array3 = wordData(14, 6);
     Label array4 = wordData(-5, 0, -1, 32, -12, 1, 40, 64000, 0);
     Label array5 = wordData(100, 101, -102, 255, -300, 7);
     Label array6 = wordData(-5, -4, -6, -1);

    @Test
    public void max_findsMaximum() {
	run("max", array1, 9);
	Assert.assertEquals(23, get(v0));
    }
    
    @Test
    public void max_findsMaximum1() {
	run("max", array2, 1);
	Assert.assertEquals(14, get(v0));
    }
    
    @Test
    public void max_findsMaximum2() {
	run("max", array3, 2);
	Assert.assertEquals(14, get(v0));
    }
    
    @Test
    public void max_findsMaximum3() {
	run("max", array4, 9);
	Assert.assertEquals(64000, get(v0));
    }
    
    @Test
    public void max_findsMaximum4() {
	run("max", array5, 6);
	Assert.assertEquals(255, get(v0));
    }
    
    @Test
    public void max_findsMaximum5() {
	run("max", array6, 4);
	Assert.assertEquals(-1, get(v0));
    }
    

    // Write **a lot** more tests.


    /******************************************************************
     *
     * Test sum67
     *
     ******************************************************************/

    Label sum67_array1 = wordData(1, 2, 2);
    Label sum67_array2 = wordData(1, 2, 2, 6, 99, 99, 7);
    Label sum67_array3 = wordData(6, 7, 1, 6, 7, 7);
    Label sum67_array4 = wordData(11, 6, 7, 11);
    Label sum67_array5 = wordData(2,2,6,7,7);
    Label sum67_array6 = wordData(2,6,5,7,3,4,6,8,7,1);
    Label sum67_array7 = wordData(7);
    Label sum67_array8 = wordData(6);
    Label sum67_array9 = wordData(6,7);
    Label sum67_array10 = wordData(6,1,7);
    Label sum67_array11 = wordData(-1, 0, -5, -7, 11);
    

    @Test
    public void sum67_handlesOneRun() {
	run("sum67", sum67_array1, 3);
	Assert.assertEquals(5, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun1() {
	run("sum67", sum67_array2, 7);
	Assert.assertEquals(5, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun2() {
	run("sum67", sum67_array3, 6);
	Assert.assertEquals(8, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun3() {
	run("sum67", sum67_array4, 4);
	Assert.assertEquals(22, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun4() {
	run("sum67", sum67_array5, 5);
	Assert.assertEquals(11, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun5() {
	run("sum67", sum67_array6, 10);
	Assert.assertEquals(10, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun6() {
	run("sum67", sum67_array7, 1);
	Assert.assertEquals(7, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun7() {
	run("sum67", sum67_array8, 1);
	Assert.assertEquals(0, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun8() {
	run("sum67", sum67_array9, 2);
	Assert.assertEquals(0, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun9() {
	run("sum67", sum67_array10, 3);
	Assert.assertEquals(0, get(v0));
    }
    
    @Test
    public void sum67_handlesOneRun10() {
	run("sum67", sum67_array11, 5);
	Assert.assertEquals(-2, get(v0));
    }
    // Write **a lot** more tests

}
