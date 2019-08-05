package at.tugraz.ist.cc.interfaces;

public interface LexicalAndSyntaxAnalyzerInterface {

    public int lexer(String file_path, boolean debug);

    public int checkSyntax(String file_path, boolean debug);

}
