package at.tugraz.ist.cc;

/**
 * Created by achillisd on 24.05.16.
 */

import at.tugraz.ist.cc.interfaces.CodeGenerationInterface;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ErrorCollector;

import java.io.*;

public class ByteCodeUnitTest {

    private final String input_path = "test/input/bytecode/";
    private final String output_path = "test/output/bytecode/";
    private final String ref_path = "test/ref/bytecode/";
    private String folder = "";
    boolean debug = true;
    CodeGenerationInterface codeGeneration = new CodeGeneration();


    @Test
    public void testPass01() throws IOException {
        String test_name = "pass01";
        codeGeneration.createCode(input_path+test_name+"/"+test_name+".jova");
        try {
            printLinuxCommand("ant jasmin-all -Dpath=\"test/output/bytecode/"+test_name+"\"");
            printLinuxCommand2("java -classpath test/output/bytecode/"+test_name+"/ Main", output_path+"/"+test_name+"/"+test_name+".out");
            compareOutputFiles("test/output/bytecode/"+test_name+"/"+test_name+".out","test/ref/bytecode/"+test_name+"/"+test_name+".out");
        }
        catch (Exception ex) {
            System.out.println(ex);
            Assert.assertFalse(true);
        }
    }

    @Test
    public void testPass02() throws IOException {
        String test_name = "pass02";
        codeGeneration.createCode(input_path+test_name+"/"+test_name+".jova");
        try {
            printLinuxCommand("ant jasmin-all -Dpath=\"test/output/bytecode/"+test_name+"\"");
            printLinuxCommand2("java -classpath test/output/bytecode/"+test_name+"/ Main", output_path+"/"+test_name+"/"+test_name+".out");
            compareOutputFiles("test/output/bytecode/"+test_name+"/"+test_name+".out","test/ref/bytecode/"+test_name+"/"+test_name+".out");
        }
        catch (Exception ex) {
            System.out.println(ex);
            Assert.assertFalse(true);
        }
    }

    @Test
    public void testPass03() throws IOException {
        String test_name = "pass03";
        codeGeneration.createCode(input_path+test_name+"/"+test_name+".jova");
        try {
            printLinuxCommand("ant jasmin-all -Dpath=\"test/output/bytecode/"+test_name+"\"");
            printLinuxCommand2("java -classpath test/output/bytecode/"+test_name+"/ Main", output_path+"/"+test_name+"/"+test_name+".out");
            compareOutputFiles("test/output/bytecode/"+test_name+"/"+test_name+".out","test/ref/bytecode/"+test_name+"/"+test_name+".out");
        }
        catch (Exception ex) {
            System.out.println(ex);
            Assert.assertFalse(true);
        }
    }

    @Test
    public void testPass04() throws IOException {
        String test_name = "pass04";
        codeGeneration.createCode(input_path+test_name+"/"+test_name+".jova");
        try {
            printLinuxCommand("ant jasmin-all -Dpath=\"test/output/bytecode/"+test_name+"\"");
            printLinuxCommand2("java -classpath test/output/bytecode/"+test_name+"/ Main", output_path+"/"+test_name+"/"+test_name+".out");
            compareOutputFiles("test/output/bytecode/"+test_name+"/"+test_name+".out","test/ref/bytecode/"+test_name+"/"+test_name+".out");
        }
        catch (Exception ex) {
            System.out.println(ex);
            Assert.assertFalse(true);
        }
    }

    @Test
    public void testPass05() throws IOException {
        String test_name = "pass05";
        codeGeneration.createCode(input_path+test_name+"/"+test_name+".jova");
        try {
            printLinuxCommand("ant jasmin-all -Dpath=\"test/output/bytecode/"+test_name+"\"");
            printLinuxCommand2("java -classpath test/output/bytecode/"+test_name+"/ Main", output_path+"/"+test_name+"/"+test_name+".out");
            compareOutputFiles("test/output/bytecode/"+test_name+"/"+test_name+".out","test/ref/bytecode/"+test_name+"/"+test_name+".out");
        }
        catch (Exception ex) {
            System.out.println(ex);
            Assert.assertFalse(true);
        }
    }

    private void printLinuxCommand(String command) throws Exception
    { System.out.println("Linux command: " + command);
        String line;
        Process process = Runtime.getRuntime().exec(command);
        Reader r = new InputStreamReader(process.getInputStream());
        BufferedReader in = new BufferedReader(r);
        while((line = in.readLine()) != null) System.out.println(line);
        in.close();
    }

    private void printLinuxCommand2(String command, String filename) throws Exception
    {
        FileWriter fw = new FileWriter(filename);
        String line;
        Process process = Runtime.getRuntime().exec(command);
        Reader r = new InputStreamReader(process.getInputStream());
        BufferedReader in = new BufferedReader(r);
        while((line = in.readLine()) != null) fw.write(line+"\n");
        fw.close();
        in.close();
    }

    private void compareOutputFiles(String output, String reference) throws IOException
    {
        LineNumberReader br_out = new LineNumberReader(new FileReader(output));
        LineNumberReader br_ref = new LineNumberReader(new FileReader(reference));


        try {
            String line_out = br_out.readLine();
            String line_ref = br_ref.readLine();

            while (line_ref != null) {


                if(!line_out.isEmpty()) {
                    System.out.println("Compare Line Nr: " +br_ref.getLineNumber());
                    System.out.println("Expected       : " + line_ref);
                    System.out.println("Actual         : " + line_out);
                    System.out.println();
                }

                Assert.assertEquals("Error in " + br_out.getLineNumber(), line_ref, line_out);


                if(line_out != null)
                    line_out = br_out.readLine();
                line_ref = br_ref.readLine();
            }
        }finally {
            br_out.close();
            br_ref.close();
        }
    }



}
