grammar Simple;

program : 'var' variable ;

variable : Var ':' type ;

type : 'integer' | 'boolean' ;

Var : ('a'..'z'|'A'..'Z')+ ;

WS : [ \t\r\n]+ -> skip ;