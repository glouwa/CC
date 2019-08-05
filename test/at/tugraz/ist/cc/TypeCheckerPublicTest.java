package at.tugraz.ist.cc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.tugraz.ist.cc.interfaces.TypeCheckerInterface;

public class TypeCheckerPublicTest {

    private final String path = "test/input/typeChecking/";
	TypeCheckerInterface typeChecker = new TypeChecker();
	boolean debug = true;
	
    @Test
    public void testPass01() {
        int result = typeChecker.checkTypes(path + "pass01.jova", debug);
        assertEquals(0, result);        
    }
    
    @Test
    public void testPass02() {
        int result = typeChecker.checkTypes(path + "pass02.jova", debug);
        assertEquals(0, result);        
    }
    
    @Test
    public void testPass03() {
        int result = typeChecker.checkTypes(path + "pass03.jova", debug);
        assertEquals(0, result);        
    }
    
    @Test
    public void testPass04() {
        int result = typeChecker.checkTypes(path + "pass04.jova", debug);
        assertEquals(0, result);        
    }
    
    @Test
    public void testPass05() {
        int result = typeChecker.checkTypes(path + "pass05.jova", debug);
        assertEquals(0, result);        
    }

    @Test
    public void testPass06own() {
        int result = typeChecker.checkTypes(path + "ownPass06.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testPass07own() {
        int result = typeChecker.checkTypes(path + "ownPass07.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testPass08own() {
        int result = typeChecker.checkTypes(path + "ownPass08.jova", debug);
        assertEquals(0, result);
    }
 
    @Test
    public void testFail01() {
        int result = typeChecker.checkTypes(path + "fail01.jova", debug);
        assertTrue(result > 0);        
    }
    
    @Test
    public void testFail02() {
        int result = typeChecker.checkTypes(path + "fail02.jova", debug);
        assertTrue(result > 0);        
    }
    
    @Test
    public void testFail03() {
        int result = typeChecker.checkTypes(path + "fail03.jova", debug);
        assertTrue(result > 0);       
    }
    
    @Test
    public void testFail04() {
        int result = typeChecker.checkTypes(path + "fail04.jova", debug);
        assertTrue(result > 0);        
    }
    
    @Test
    public void testFail05() {
        int result = typeChecker.checkTypes(path + "fail05.jova", debug);
        assertTrue(result > 0);         
    }
    
    @Test
    public void testFail06() {
        int result = typeChecker.checkTypes(path + "fail06.jova", debug);
        assertTrue(result > 0);         
    }

    @Test
    public void testFail07own() {
        int result = typeChecker.checkTypes(path + "ownFail07.jova", debug);
        assertTrue(result > 0);
    }

    @Test
    public void testFail08own() {
        int result = typeChecker.checkTypes(path + "ownFail08.jova", debug);
        assertTrue(result > 0);
    }

    @Test
    public void testFail09own() {
        int result = typeChecker.checkTypes(path + "ownFail09.jova", debug);
        assertTrue(result > 0);
    }

    @Test
    public void testFail10own() {
        int result = typeChecker.checkTypes(path + "ownFail10.jova", debug);
        assertTrue(result > 0);
    }

    @Test
    public void testFail11own() {
        int result = typeChecker.checkTypes(path + "ownFail11.jova", debug);
        assertTrue(result > 0);
    }
}
