grammar jcc;

// Syntax Specification ==> Context-free Grammar
prog : main_class class_declaration*;
main_class : 'class' IDENTIFIER '{' main_method '}';
main_method : 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}';

class_declaration : 'class' IDENTIFIER '{' class_inner_body '}';
class_inner_body : field_declaration* method_declaration* ;

field_declaration
	: type_of_variable IDENTIFIER SC;

method_declaration : type_of_variable IDENTIFIER '(' parameter_list ')' '{' method_inner_body '}';

method_inner_body
	: field_declaration*
	statement*
	return_statement;

statement
	: '{' statement* '}'
	| 'while' '(' expression ')'
		statement
	| 'do' statement 'while' '(' expression ')' SC
	| 'if' '(' expression ')'
		statement
	 ('else'
		statement)?
	| IDENTIFIER '=' expression SC
	| IDENTIFIER '[' expression ']' '=' expression SC
	| 'System.out.println' '(' expression ')' SC
	| 'break' SC
	| 'continue' SC ;
return_statement
	: 'return' expression SC ;

parameter_list : parameters? ;
parameters : parameter ( ',' parameter )*;
parameter : type_of_variable IDENTIFIER;

expression
	:   expression '.' ( 'length' ('(' ')')? | 'charAt''(' IDENTIFIER ')' )
	|	expression '.' IDENTIFIER call_a_method
    |	'-' expression
    |	expression '[' expression ']'
    |   'new' 'int' '[' expression ']'
    |   'new' IDENTIFIER '(' ')'
    |   expression '*'  expression
    |   expression '/'  expression
    |   expression '+'  expression
    |   expression '-'  expression
    |   expression '<'  expression
    |   expression '==' expression
    |   expression '&&' expression
    |   expression '||' expression
    |	'!' expression
    |	INTEGER
    |   BOOLEAN
    |   CHAR
    |	STRING
    |   IDENTIFIER
    |   '(' expression ')'
    |   'this' ;

call_a_method
	: '(' (expression (',' expression)*)? ')' ;

type_of_variable
	: intentifier_type
	| int_type
	| int_array_type
	| char_type
	| boolean_type
	| string_type ;
intentifier_type
	: IDENTIFIER;
int_type
	: 'int';
int_array_type
	: 'int' '['']' ;
char_type
	: 'char';
boolean_type
	: 'boolean';
string_type
	: 'String';

// Lexical Specification ==> Regular Expressions
LINE_COMMENT
	: '//' ~[\r\n]* -> skip;
COMMENT
	: '/*' .*? '*/' -> skip;

INTEGER
	: ('0'..'9')+ ;
BOOLEAN
	: 'true'
	| 'false';
CHAR
	: '\'' .  '\'';
STRING
	: '"' (~('"'|'\\') )* '"' ;

SC  : ';';
IDENTIFIER : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
WS
	: [ \t\r\n]+ -> skip;