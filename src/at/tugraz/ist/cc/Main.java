package at.tugraz.ist.cc;

import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;
import at.tugraz.ist.cc.interfaces.TypeCheckerInterface;
import at.tugraz.ist.cc.interfaces.CodeGenerationInterface;

public class Main {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("USAGE:");
            System.out.println("param1 (task): lexer|parser|typechecker|bytecode");
            System.out.println("param2: path to the input file (*.jova)");
            System.out.println("param3 (debug): true|false");
            System.exit(-1);
        }

        if (args[0].equals("lexer")) {
            LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
            lexAndSyntax.lexer(args[1], Boolean.parseBoolean(args[2]));
        } else if (args[0].equals("parser")) {
            LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
            lexAndSyntax.checkSyntax(args[1], Boolean.parseBoolean(args[2]));
        } else if (args[0].equals("typechecker") || args[0].equals("typeChecking")) {
            TypeCheckerInterface typeChecker = new TypeChecker();
            typeChecker.checkTypes(args[1], Boolean.parseBoolean(args[2]));
        } else if (args[0].equals("bytecode")) {
            CodeGenerationInterface codeGeneration = new CodeGeneration();
            codeGeneration.createCode(args[1]);
        } else {
            System.out.println("Unknown task name: " + args[0]);
        }
    }

}
