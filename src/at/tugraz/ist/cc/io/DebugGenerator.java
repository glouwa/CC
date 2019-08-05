package at.tugraz.ist.cc.io;

import java.util.List;

/**
 * @author cct 
 * Singleton class to generate and print the debug table for assignment 2
 * (type checking).
 */
public class DebugGenerator {

    private static StringBuilder bob_the_builder;
    private static final String var_debug_format = "%n%-20s|%-10s|%-43s|%-4s";
    private static final String op_debug_format = "%n%-6s|%-10s|%-10s|%-10s|%-4s|%-28s";
    private static String var_debug_str = "";
    private static String op_debug_str = "";

    private static DebugGenerator instance = null;

    private DebugGenerator() {
    }

    public static DebugGenerator getInstance() {
        if (instance == null) {
            instance = new DebugGenerator();
        }
        return instance;
    }

    /**
     * Adds variable informations for type checker debug to var_debug_str using
     * a format String and the given var_debug_format. If the variable is a
     * member variable (i.e. is not defined inside a method scope) fct_id should
     * be an empty String and param_types either null or an empty List<String>.
     * 
     * @param id
     *            the variable's ID
     * @param type
     *            the full name of the variable's type
     * @param class_id
     *            the full name of the class associated with the variable
     * @param fct_id
     *            the full method name in which the variable has been defined
     * @param param_types
     *            a List<String> with the full names of the parameter types of
     *            the aforementioned method
     * @param line
     *            line number where the variable is defined in the source code
     */
    public void addVariableTCDebug(String id, String type, String class_id, String fct_id, List<String> param_types,
            int line) {
        bob_the_builder = new StringBuilder();
        if (!fct_id.equals("")) {
            bob_the_builder.append(class_id).append(".").append(fct_id).append("(");

            if ((param_types != null) && (param_types.size() != 0)) {
                for (String param_type : param_types)
                    bob_the_builder.append(param_type).append(" ");
                bob_the_builder.deleteCharAt(bob_the_builder.length() - 1);
            }
            bob_the_builder.append(")");
        } else
            bob_the_builder.append(class_id);
        var_debug_str += String.format(var_debug_format, id, type, bob_the_builder.toString(), Integer.toString(line));
    }

    /**
     * Adds information about an operator for type checker debug to
     * op_debug_str. For unary operators/return/conditions lhs_type is expected
     * to be an empty String. The op_string should contain the whole expression
     * (including potential subexpressions).
     *
     * @param operator
     *            the operator symbol (e.g. "+", "==", "return")
     * @param lhs_type
     *            the full name of the left-hand side operand's type
     * @param rhs_type
     *            the full name of the right-hand side operand's type
     * @param result_type
     *            the full name of the operator's resulting type
     * @param line
     *            line number where the operator occurs in the source code
     * @param op_string
     *            the source code of the whole expression
     */
    public void addOperatorTCDebug(String operator, String lhs_type, String rhs_type, String result_type, int line,
            String op_string) {
        op_debug_str += String.format(op_debug_format, operator, lhs_type, rhs_type, result_type,
                Integer.toString(line), op_string);
    }

    public void clear()
    {
        var_debug_str = "";
        op_debug_str = "";
    }

    /**
     * Prints the type checker debug Strings (var_debug_str, 
     * op_debug_str) to standard out in a formatted way. In addition resets 
     * var_debug_str and op_debug_str to an empty String.
     */
    public void printTCDebug() {

    	final StringBuilder separator = new StringBuilder();
    	bob_the_builder = new StringBuilder();
        separator.append(String.format("%n"));
        
        for (int i = 0; i < 8; ++i)
           separator.append("----------");
        
        bob_the_builder.append(separator.toString());

        bob_the_builder.append(String.format(var_debug_format, "ID", "type", "scope", "line"));
      
        bob_the_builder.append(separator.toString());
        bob_the_builder.append(var_debug_str);

        bob_the_builder.append(String.format("%n")).append(separator);
        
        bob_the_builder.append(String.format(op_debug_format, "OP", "lhs", "rhs", "result", "line", "OP-string"));

        bob_the_builder.append(separator.toString());
        bob_the_builder.append(op_debug_str);
        System.out.print(bob_the_builder.toString());
        var_debug_str = "";
        op_debug_str = "";
    }
}


