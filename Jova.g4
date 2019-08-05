grammar Jova;

@lexer::header {
	package at.tugraz.ist.cc.antlr.gen;
}
@parser::header {
	package at.tugraz.ist.cc.antlr.gen;
    import java.util.*;
}

// Do not remove/change the WS lexer rule as defined below
WS : [ \n\t\r] -> channel(HIDDEN);

KEY_CLASS          : 'class';
KEY_IF             : 'if';
KEY_ELSE           : 'else';
KEY_WHILE          : 'while';
KEY_RETURN         : 'return';
KEY_NEW            : 'new';
KEY_NIX            : 'nix';
ASSIGN             : '=';
RELOP              : '<=' | '<' | '>=' | '>' | '==' | '!=';
MULOP              : '*' | '/' | '%';
AND                : '&&';
OR                 : '||';
SIGN               : '+' | '-';
NOT                : '!';
DOTOP              : '.';
fragment OPERATORS : '<' | '>' | '=' | '+' | '-' | '/' | '%' | '*' | '|' | '&';
INT                : '0' | DIGIT DIGIT0*;
fragment DIGIT     : [1-9];
fragment DIGIT0    : [0-9];
BOOL               : 'true' | 'false';
AMOD               : 'private' | 'public';
PRIMITIVE_TYPE     : 'int' | 'String' | 'bool';
CLASS_TYPE         : [A-Z](LETTER | DIGIT0 | '_')*;
ID                 : [a-z](LETTER | DIGIT0 | '_')*;
fragment LETTER    : [a-zA-Z];
LITERAL            : '"'([a-z0-9A-Z] | '_' | '\\' | OPERATORS | PUNCT | ' ')*'"';
fragment PUNCT     : '.' | ',' | ';' | ':' | '!' | '?' ;

//Syntax
program       : class_decls EOF;
type          : PRIMITIVE_TYPE
              | CLASS_TYPE;



class_decls   : class_decl+;
class_decl    : class_head class_body;
class_head    : KEY_CLASS CLASS_TYPE;
class_body    : '{' member_decls method_decls '}';

member_decls  : member_decls  member_decl
              |;

member_decl   : AMOD declaration;


method_decls  : method_decls method_decl
              |;

method_decl   : method_head method_body;
method_head   : AMOD type ID method_params;
method_params : '(' param_list? ')';

param_list    : param                                      #param_list_element_first
              | param_list ',' param                       #param_list_element
              ;
param         : type ID;


method_body   : '{' declarations stmt ret_stmt '}';        // ?

declarations  : declaration*;

declaration   : type id_list ';';
id_list       : ID
              | id_list ',' ID;

stmt          : stmt if_stmt
              | stmt while_stmt
              | stmt assignment ';'
              |;

assignment    : member_access  ASSIGN ( object_alloc | expr );

ret_stmt      : KEY_RETURN expr ';';                       // todo

if_stmt       : KEY_IF '(' expr ')' ifBlock=compound_stmt  // todo
              | KEY_IF '(' expr ')' ifBlock=compound_stmt  // todo
                KEY_ELSE elseBlock=compound_stmt;          // todo

while_stmt    : KEY_WHILE '(' expr ')' wBlock=compound_stmt;      // todo

member_access : ID DOTOP member_access                     #MemberAccessElement
              | ID                                         #MemberAccessLast
              ;

object_alloc  : KEY_NEW CLASS_TYPE;

compound_stmt : '{' stmt '}';                              // ?

expr          : operand                                    #ExpOperand  // todo
              | lhs=expr MULOP rhs=expr                    #ExpOpMul    // todo
              | lhs=expr SIGN  rhs=expr                    #ExpOpSign   // todo
              | lhs=expr RELOP rhs=expr                    #ExpOpRel    // todo
              | lhs=expr OR    rhs=expr                    #ExpOpOr     // todo
              | lhs=expr AND   rhs=expr                    #ExpOpAnd    // todo
              ;

operand       : INT                                        #OpInt       // base
              | BOOL                                       #OpBool      // base
              | LITERAL                                    #OpLiteral   // base
              | KEY_NIX                                    #OpNix       // base
              | NOT operand                                #OpNot       // todo base
              | SIGN operand                               #OpSign      // todo todo
              | id_operand                                 #OpId        // ?
              | '(' expr ')'                               #OpExp       // base
              ;

id_operand    : member_access '(' arg_list ')'             #IdOperandCallable
              | member_access                              #IdOperandVariable
              ;

arg_list      : args?;

args          : expr
              | args ',' expr;



