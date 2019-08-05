package at.tugraz.ist.cc;

import at.tugraz.ist.cc.interfaces.CodeGenerationInterface;
import at.tugraz.ist.cc.interfaces.TypeCheckerInterface;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ErrorCollector;

import java.io.*;
import static org.hamcrest.CoreMatchers.equalTo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ByteCodePublicTest {


    void compareFiles(String output, String reference) throws IOException
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
                if(!((line_ref.contains(".limit stack") && line_out.contains(".limit stack"))||
                        (line_ref.contains(".limit locals") && line_out.contains(".limit locals"))))
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



    private final String path = "test/input/bytecode/";
    private String folder = "";
	boolean debug = true;
    CodeGenerationInterface codeGeneration = new CodeGeneration();

	
    @Test
    public void testPass01() throws IOException {

        folder = "SimpleJovaTest";
        codeGeneration.createCode(path + folder + "/simple.jova");

        String out_file = "";//"test/output/bytecode/SimpleJovaTest/Simple.j";
        String ref_file = "";//"test/ref/bytecode/SimpleJovaTest/Simple.j";
        String src_outFile = "test/output/bytecode/"+folder+"/";
        String src_refFile = "test/ref/bytecode/"+folder+"/";

        File output_folder = new File("test/output/bytecode/"+folder);
        File[] listOfFiles_out = output_folder.listFiles();

        File reference_folder = new File("test/ref/bytecode/"+folder);
        File[] listOfFiles_ref = reference_folder.listFiles();


        //Assert.assertEquals("Error: Missing Files",listOfFiles_ref.length, listOfFiles_out.length);

        for (int i = 0; i < listOfFiles_out.length; i++) {
            if (listOfFiles_out[i].isFile()) {
                System.out.println("Check " + listOfFiles_out[i].getName());
                out_file = src_outFile + listOfFiles_out[i].getName();
                ref_file = src_refFile + listOfFiles_out[i].getName();
                compareFiles(out_file,ref_file);
            }
        }








        //int result = typeChecker.checkTypes(path + "pass01.jova", debug);
        //assertEquals(0, result);
    }

}
