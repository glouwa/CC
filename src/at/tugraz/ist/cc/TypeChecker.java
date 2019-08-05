package at.tugraz.ist.cc;

import at.tugraz.ist.cc.antlr.gen.JovaLexer;
import at.tugraz.ist.cc.antlr.gen.JovaParser;
import at.tugraz.ist.cc.interfaces.TypeCheckerInterface;
import at.tugraz.ist.cc.io.DebugGenerator;
import at.tugraz.ist.cc.typechecking.TypeCheckTreeVisitor;
import at.tugraz.ist.cc.typechecking.TypeTable;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class TypeChecker implements TypeCheckerInterface {

    public TypeTable typeTable = null;

    public int checkTypes(String file_path, boolean debug)
    {
        LexicalAndSyntaxAnalyzer lsa = new LexicalAndSyntaxAnalyzer();

        lsa.checkSyntax(file_path, false);

        try {
            return typeCheck(new ANTLRFileStream(file_path), debug);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return 0;
    }

    private int typeCheck(ANTLRFileStream fileStream, boolean debug) {

        DebugGenerator.getInstance().clear();

        JovaLexer jovaLexer = new JovaLexer(fileStream);
        CommonTokenStream jovaTokens = new CommonTokenStream(jovaLexer);
        JovaParser jovaParser = new JovaParser(jovaTokens);

        ParseTree cst = jovaParser.program();

        TypeCheckTreeVisitor visitor = new TypeCheckTreeVisitor();
        visitor.visit(cst);
        this.typeTable = visitor.typeTable;

        visitor.errors.print();

        if (visitor.errors.size() == 0) {
            System.out.println();
            visitor.warnings.print();
            DebugGenerator.getInstance().printTCDebug();
        }

        return visitor.errors.size();
    }
}
