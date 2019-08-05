package at.tugraz.ist.cc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
public class TypeCheckErrorListener
{
    String name;
    private ArrayList<String> errors = new ArrayList<String>();

    public TypeCheckErrorListener(String name) {
        this.name = name;
    }

    public int size() {
        return errors.size();
    }

    public void print(){
        System.out.print("Number of " + name + ": " + errors.size() + "\n");
        errors.forEach(e -> System.out.print(e));
    }

    public void add(Token t, String msg){
        this.errors.add(String.format("  #%d: %s (line %d)\n", errors.size() + 1, msg, t.getLine()));
    }
}