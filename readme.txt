Group1 - Task 1

Stefan Sgouridis   (1160445)   sgouridis@student.tugraz.at
Michael Glatzhofer (0230699)   michael.glatzhofer@student.tugraz.at
Elena Mashkina     (1131606)   mashkina@student.tugraz.at
Dominik Mocher     (1230114)   dominik.mocher@student.tugraz.at


Description of the Program:
---------------------------
A lexical- and syntax-analyzer was implemented. Supplied with an input file, the Analyzer checks 
whether the program is lexically and syntactically correct. Otherwise, ...

Usage: java at.tugraz.ist.cc.LexicalAndSyntaxAnalyzer.lexer <path_to_input_file> <debug>
	   java at.tugraz.ist.cc.LexicalAndSyntaxAnalyzer.checkSyntax <path_to_input_file> <debug>


-------------------
Remarks for task 1:
-------------------
General remarks:
----------------
- this is a general remark concerning our implementation
-
-

Changes  made:
--------------
- definition of lexer rules within the grammar Jova.g4
- changed order of lexer rules
- definition of parser rules within the grammar Jova.g4
- changed order of expression rules for operator precedence
- changed param_list to kleene operator to simplify output generator
- parsetreelisterner created to generate proper output
- custom error listener created to generate proper output


Known limitations:
------------------
- test/parser/fail04 and test/parser/fail06 produces slightly different error messages.
  if the first error is corrected, the result is equal to ref files
-

Implemented BONUS tasks:
------------------------
-

Percentage of participation:
----------------------------
Stefan Sgouridis      25 %
Michael Glatzhofer    25 %
Elena Mashkina        25 %
Dominik Mocher        25 %


-------------------
Remarks for task 2:
-------------------
General remarks:
----------------
We assume Strings are objects, so:
    String s; s = nix;
is a valid statement.

Changes  made:
--------------
we splitted the task in 4 visitors:
- TypeCheckTreeVisitor main visitor, uses other visitors
  add classes to symboltable, adds methods and field to classes.
  creates symboltable for each function, and prepares it with global objects
- DeclarationVisitor adds all ID's of a expression like  Type id1, id2... to the symboltable.
- MemberAccessVisitorDefref/MemberAccessVisitorSymbol tool visitors for memberaccess
- there is also a visitor base class 'BasicJovaVisitor' which contains the simple parts like
  getting the type of literals, and null checks for rules with ? operator

Known limitations:
------------------
public testcases only differ in one empty line between TCDebug tables

Implemented BONUS tasks:
------------------------
---

Percentage of participation:
----------------------------
Stefan Sgouridis      25 %
Michael Glatzhofer    25 %
Elena Mashkina        25 %
Dominik Mocher        25 %


-------------------
Remarks for task 3:
-------------------
...
