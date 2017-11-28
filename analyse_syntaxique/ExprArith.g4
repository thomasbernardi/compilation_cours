grammar ExprArith;

expr: additionExpr ;
additionExpr: multiplyExpr ('+' multiplyExpr | '-' multiplyExpr)*;
multiplyExpr: atomExpr ('*' atomExpr | '/' atomExpr)*;
atomExpr: Number | '(' additionExpr ')' | '-' atomExpr;
Number: ('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9')+;
WS: [ \t\r\n]+ -> skip ;