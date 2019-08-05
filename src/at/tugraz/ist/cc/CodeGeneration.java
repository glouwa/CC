package at.tugraz.ist.cc;

import at.tugraz.ist.cc.antlr.gen.JovaLexer;
import at.tugraz.ist.cc.antlr.gen.JovaParser;
import at.tugraz.ist.cc.typechecking.CodeGeneratorVisitor;
import at.tugraz.ist.cc.interfaces.CodeGenerationInterface;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class CodeGeneration implements CodeGenerationInterface {

    public int createCode(String file_path) {

        TypeChecker typeChecker = new TypeChecker();
        int errors = typeChecker.checkTypes(file_path, false);

        if (errors == 0)
        {
            try
            {
                CodeGeneratorVisitor cgv = new CodeGeneratorVisitor(file_path, typeChecker.typeTable);
                cgv.typeTable = typeChecker.typeTable;

                JovaLexer jovaLexer = new JovaLexer(new ANTLRFileStream(file_path));
                CommonTokenStream jovaTokens = new CommonTokenStream(jovaLexer);
                JovaParser jovaParser = new JovaParser(jovaTokens);

                ParseTree cst = jovaParser.program();
                cgv.visit(cst);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return errors;
    }

}
