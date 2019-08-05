package at.tugraz.ist.cc;

import at.tugraz.ist.cc.antlr.gen.JovaLexer;
import at.tugraz.ist.cc.antlr.gen.JovaParser;
import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;
import at.tugraz.ist.cc.io.PrintIstClassTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.ArrayList;

public class LexicalAndSyntaxAnalyzer implements LexicalAndSyntaxAnalyzerInterface {

    public int lexer(String file_path, boolean debug) {
        int nrOfErrors = 0;

        try {
            JovaLexer jovaLexer = new JovaLexer(new ANTLRFileStream(file_path));

            jovaLexer.removeErrorListeners(); //removes the default error listeners
            CustomErrorListener errorListener = new CustomErrorListener(); //attaches our custom error listener to the lexer
            jovaLexer.addErrorListener(errorListener);

            CommonTokenStream tokens = new CommonTokenStream(jovaLexer); //getting the tokens from the lexer

            //System.out.println(tokens.getNumberOfOnChannelTokens());
            tokens.getNumberOfOnChannelTokens(); //needed, because it's a stream


            //--- tokenizing the lexer char stream ---
            StringBuilder sb = new StringBuilder();
            if (debug) {
                sb.append("1: ");
                boolean nextline = false; // helper variable to exclude empty lines in the debug log

                for (int i = 0; i < tokens.getTokens().size() - 1 /* getNumberOfOnChannelTokens()*/; ++i) { //-1 excludes EOF
                    Token token = tokens.get(i);

                    if (token.getText().equals("\n")) {
                        nextline = true; //on newline, the line number is changed below
                    }
                    if (token.getChannel() == 0) { //excludes white spaces from log
                        if (nextline) {
                            sb.deleteCharAt(sb.length() - 1); // removing the last space
                            sb.append("\n" + token.getLine() + ": "); //organising the debug log according to program lines
                            nextline = false;
                        }
                        //sb.append(jovaLexer.getVocabulary().getDisplayName(token.getType()) + " ");
                        if (jovaLexer.getVocabulary().getSymbolicName(token.getType()) != null) { //needed because of assign and return keywords
                            sb.append(jovaLexer.getVocabulary().getSymbolicName(token.getType()) + " ");
                        } else {
                            sb.append(jovaLexer.getVocabulary().getDisplayName(token.getType()) + " ");
                        }
                    }
                }
            }

            nrOfErrors = errorListener.getNrOfErrors();
            printLexerOutput(debug, errorListener, sb.toString()); //printing lexical errors and debug log if flag is set

        } catch (IOException ex){
            ex.printStackTrace();
        }

        return nrOfErrors;
    }

    public int checkSyntax(String file_path, boolean debug) {

        int nrOfErrors = 0;

        try {
            JovaLexer jovaLexer = new JovaLexer(new ANTLRFileStream(file_path));
            lexer(file_path, false); 
            CommonTokenStream tokens = new CommonTokenStream(jovaLexer);
            JovaParser jovaParser = new JovaParser(tokens);

            jovaParser.removeErrorListeners(); //removes the default error listeners
            CustomErrorListener errorListener = new CustomErrorListener(); //attaches our custom error listener to the lexer
            jovaParser.addErrorListener(errorListener);


            ParseTree pt = jovaParser.program();

            if (debug) {
                StringBuilder sb = new StringBuilder();
                sb.append("1: ");
                boolean nextline = false;

                for (int i = 0; i < tokens.getTokens().size() - 1 /* getNumberOfOnChannelTokens()*/; ++i) { //-1 excludes EOF
                    Token token = tokens.get(i);

                    if (token.getText().equals("\n")) {
                        nextline = true; //on newline, the line number is changed below
                    }
                    if (token.getChannel() == 0) { //excludes white spaces from log
                        if (nextline) {
                            sb.deleteCharAt(sb.length() - 1); // removing the last space
                            sb.append("\n" + token.getLine() + ": "); //organising the debug log according to program lines
                            nextline = false;
                        }
                        //sb.append(jovaLexer.getVocabulary().getDisplayName(token.getType()) + " ");
                        if (jovaLexer.getVocabulary().getSymbolicName(token.getType()) != null) { //needed because of assign and return keywords
                            sb.append(jovaLexer.getVocabulary().getSymbolicName(token.getType()) + " ");
                        } else {
                            sb.append(jovaLexer.getVocabulary().getDisplayName(token.getType()) + " ");
                        }
                    }
                }
                System.out.println(sb.substring(0, sb.length()-1));
            }

            nrOfErrors = errorListener.getNrOfErrors();

            if (nrOfErrors > 0) {
                System.out.println("Number of syntax errors: " + nrOfErrors);
                ArrayList<String> allErrors = errorListener.getErrors();

                for(int i = 0; i < allErrors.size(); ++i){
                    int j = i +1;
                    System.out.println("  #" + j + ": " + allErrors.get(i));
                }
            }
            else if (nrOfErrors == 0)
            {
                System.out.println("Number of syntax errors: " + nrOfErrors);
                System.out.println();

                if (debug) {
                    PrintIstClassTreeVisitor visitor = new PrintIstClassTreeVisitor();
                    visitor.visit(pt);
                    System.out.println(visitor.getParseTreeAsString());
                }
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return nrOfErrors;
    }


    private void printLexerOutput(boolean debug, CustomErrorListener errorListener, String tokenString){

        //--- prints the first newline in the out file ---
        //no idea, why there has to be one...
        System.out.println();

        //--- prints all lexical errors, if there are any ---
        int nrOfErrors = errorListener.getNrOfErrors();

        System.out.println("Number of lexical errors: " + nrOfErrors);
        if (nrOfErrors > 0) {
            ArrayList<String> allErrors = errorListener.getErrors();

            for(int i = 0; i < allErrors.size(); ++i){
                int j = i +1;
                System.out.println("  #" + j + ": " + allErrors.get(i));
            }
        }
        System.out.println(); //newline for better readability in the file

        //--- prints the debug log, if debug flag is true ---
        if(debug){
            System.out.println(tokenString.substring(0, tokenString.length()-1)); //removing the last space
        }
    }

}
