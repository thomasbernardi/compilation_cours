grammar Langage;

uop : '-' | 'not' ;

bop : '+' | '-' | '*' | '/' | 'and' | 'or' | '<' | '<=' | '=' | '!=' | '>=' | '>' ;

constant : Number | 'true' | 'false' ;

expression : constant | Word | uop expression | expression bop expression | Function '('expression*')'
        | expression '['expression']' | 'newarrayof' type '[' expression ']';

type : 'integer' | 'boolean' | 'arrayof' type;

instruction : Word ':=' expression | expression '[' expression ']:=' expression
        | 'if' expression 'then' instruction 'else' instruction | 'while' expression 'do' instruction
        | Function'('expression*')' | 'skip' | instruction ';' instruction ;

functionDefinition : 'f(' variable* '):' type 'var' variable* instruction;

program : 'var' variable+ functionDefinition* instruction;

Function: 'read' | 'write' | 'f' ;

variable : Word ':' type ;
Word : [a-zA-Z]+;

Number : [0-9]+;

WS : [ \t\r\n]+ -> skip;
