package at.tugraz.ist.cc;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

/**
 * Created by riger2311 on 16.03.16.
 */
public class CustomErrorListener implements ANTLRErrorListener {

    public int getNrOfErrors(){
        return errors.size();
    }
    public ArrayList<String> getErrors(){
        return errors;
    }

    private ArrayList<String> errors = new ArrayList<String>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException
            e) {
        errors.add("line " + i + ":" + (i1+1) +" "+ s);

    }

    @Override
    public void reportAmbiguity(Parser parser, DFA
            dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
        //not needed at lexer

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
        //not needed at lexer
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        //not needed at lexer

    }
}
