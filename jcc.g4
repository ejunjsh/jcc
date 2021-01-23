grammar jcc;

// Syntax Specification ==> Context-free Grammar
prog : main_class class_declaration*;
main_class : 'class' identifier '{' main_method '}';
main_method : 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}';

class_declaration : 'class' IDENTIFIER '{' class_inner_body '}';
class_inner_body : field_declaration* method_declaration* ;

field_declaration
	: type_of_variable identifier SC;

identifier:
	IDENTIFIER;

method_declaration : type_of_variable identifier '(' parameter_list ')' '{' method_inner_body '}';

method_inner_body
	: field_declaration*
	statement*
	return_statement;

statement
	: '{' statement* '}' #blockStatement
	| 'do' statement 'while' '(' expression ')' SC #doWhileStatement
	| 'while' '(' expression ')'
		statement #whileStatement
	| 'if' '(' expression ')'
		statement
	 ('else'
		statement)? #ifStatement
	| identifier '=' expression SC #assignStatement
	| identifier '[' expression ']' '=' expression SC #assignArrayStatement
	| 'System.out.println' '(' expression ')' SC #printStatement
	| 'break' SC #breakStatement
	| 'continue' SC #breakStatement
	;
return_statement
	: 'return' expression SC ;

parameter_list : parameters? ;
parameters : parameter ( ',' parameter )*;
parameter : type_of_variable identifier;

expression
	:   '(' expression ')' #braquetedExpression
	|   expression '.' 'length' '(' ')' #stringLengthExpression
	|	expression '.' 'charAt''(' expression ')' #stringCharAtExpression
	|   'new' identifier '(' ')' #newCallExpression
	|	expression '.' call_a_method ('.' call_a_method)?	#methodCallExpression
	| 	expression '.' IDENTIFIER #variableCallExpression
    |	'-' expression #minusExpression
    |   'new' 'int' '[' expression ']' #arrayCreateExpression
    |	expression '[' expression ']'  #arraySelectExpression
    | 	expression '.' 'length' #arrayLengthExpression
    |   expression '*' expression #multiplicationExpression
    |	expression '/' expression #divisionExpression
    |   expression '+' expression #sumExpression
    |   expression '-' expression #substractionExpression
    |   expression '<' expression #lessThanExpression
    |   expression '==' expression #equalExpression
    |   expression ('&&' || '||' ) expression #comparisonExpression
    |	'!' expression #notExpression
    |	integer #integerExpression
    |	bool #boolExpression
	|	cha #charExpression
    |	string #stringExpression
    |  	identifier #identifierExpression
    |   'this' #thisExpression;

call_a_method
	: identifier '(' (expression (',' expression)*)? ')' ;

integer
	:   INTEGER;
bool:
       	BOOLEAN;
cha:
	   	CHAR;
string:
		STRING;

type_of_variable
	: identifier
	| int_type
	| int_array_type
	| char_type
	| boolean_type
	| string_type ;
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
IDENTIFIER
	: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
WS
	: [ \t\r\n]+ -> skip;