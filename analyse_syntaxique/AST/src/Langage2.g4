grammar Langage2;

uop : '-' | 'not';

bop : '+' | '-' | '*' | '/' | 'and' | 'or' | '<' | '<=' | '=' | '!=' | '>=' | '>';

constant : Number | 'true'| 'false';

expression : constant | Var | uop expression | expression bop expression
        | function arguments
        | expression '['expression']' | 'new' 'array' 'of' type '[' expression ']';

arguments : '('expression*')' ;
type : 'integer' | 'boolean' | 'arrayof' type;

instruction : Var ':' '=' expression | expression '[' expression ']' ':' '=' expression
        | 'if' expression 'then' instruction 'else' instruction | 'while' expression 'do' instruction
        | function'('expression*')' | 'skip' | instruction ';' instruction ;

functionDefinition : Var '(' variable* ')' ':' type ('var' variable+)? instruction;

program : ('var' variable+)? functionDefinition* instruction;

function: 'read' | 'write' | Var ;

variable : Var ':' type ;
Var : ('a'..'z'|'A'..'Z')+;

Number : [0-9]+;

WS : [ \t\r\n]+ -> skip;