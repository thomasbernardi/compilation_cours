grammar Langage;

constant returns [PPExpr value]:
    input = Number {$value = new PPCte(Integer.parseInt($input.text));}
    | 'true' {$value = new PPTrue();}
    | 'false' {$value = new PPFalse();};

expression returns [PPExpr value]:
        e1 = constant {$value = $e1.value;}
        | e2 = Var {$value = new PPVar($e2.text);}
        | '-' e3 = expression {$value = new PPInv($e3.value);}
        | 'not' e4 = expression {$value = new PPNot($e4.value);}
        | e5 = expression '+' e6 = expression {$value = new PPAdd($e5.value, $e6.value);}
        | e7 = expression '-' e8 = expression {$value = new PPSub($e7.value, $e8.value);}
        | e9 = expression '*' e10 = expression {$value = new PPMul($e9.value, $e10.value);}
        | e11 = expression '/' e12 = expression {$value = new PPDiv($e11.value, $e12.value);}
        | e13 = expression 'and' e14 = expression {$value = new PPAnd($e13.value, $e14.value);}
        | e15 = expression 'or' e16 = expression {$value = new PPOr($e15.value, $e16.value);}
        | e17 = expression '<' e18 = expression {$value = new PPLt($e17.value, $e18.value);}
        | e19 = expression '<=' e20 = expression {$value = new PPLe($e19.value, $e20.value);}
        | e21 = expression '=' e22 = expression {$value = new PPEq($e21.value, $e22.value);}
        | e23 = expression '!=' e24 = expression {$value = new PPNe($e23.value, $e24.value);}
        | e25 = expression '>=' e26 = expression {$value = new PPGe($e25.value, $e26.value);}
        | e27 = expression '>' e28 = expression {$value = new PPGt($e27.value, $e28.value);}
        | 'read' a1 = arguments {$value = new PPFunCall(new Read(), $a1.value);}
        | 'write' a2 = arguments {$value = new PPFunCall(new Write(), $a2.value);}
        | name = Var a3 = arguments {$value = new PPFunCall(new User($name.text), $a3.value);}
        | array = expression '['index = expression']' {$value = new PPArrayGet($array.value, $index.value);}
        | 'new' 'array' 'of' t = type '[' i = expression ']' {$value = new PPArrayAlloc($t.value, $i.value);};

arguments returns [ArrayList<PPExpr> value]
    @init {$value = new ArrayList<PPExpr>();} :
        '(' (e = expression {$value.add($e.value);})* ')';

type returns [Type value] :
        'integer' {$value = new Int();}
        | 'boolean' {$value = new Bool();}
        | 'arrayof' t = type {$value = new Array($t.value);};

instruction returns [PPInst value] :
        v = Var ':' '=' e1 = expression {$value = new PPAssign($v.text, $e1.value);}
        | array = expression '[' index = expression ']' ':' '=' val = expression
                {$value = new PPArraySet($array.value, $index.value, $val.value);}
        | 'if' condition = expression 'then' ifTrue = instruction 'else' ifFalse = instruction
                {$value = new PPCond($condition.value, $ifTrue.value, $ifFalse.value);}
        | 'while' condition2 = expression 'do' inst = instruction
                {$value = new PPWhile($condition2.value, $inst.value);}
        | 'read' a1 = arguments {$value = new PPProcCall(new Read(), $a1.value);}
        | 'write' a2 = arguments {$value = new PPProcCall(new Write(), $a2.value);}
        | name = Var a3 = arguments {$value = new PPProcCall(new User($name.text), $a3.value);}
        | 'skip' {$value = new PPSkip();}
        | i1 = instruction ';' i2 = instruction {$value = new PPSeq($i1.value, $i2.value);};

functDefinition returns [PPDef value] :
        v = Var '(' (args = typedVariables)?')' ':' t = type
        ('var' lcls = typedVariables)? inst = instruction
        {$value = new PPFun($v.text, $args.value, $lcls.value, $inst.value,  $t.value);};
definitions returns [ArrayList<PPDef> value]
            @init {$value = new ArrayList<PPDef>();} :
            (f = functDefinition {$value.add($f.value);})+;

prg returns [PPProg value] :
        ('var' v = typedVariables)? (f = definitions)? i = instruction
        {$value = new PPProg($v.value, $f.value, $i.value);};

typedVariables returns [ArrayList<Pair<String, Type>> value]
            @init {$value = new ArrayList<Pair<String, Type>>();} :
            (v = variable {$value.add($v.value);})+;
variable returns [Pair<String, Type> value] :
        v = Var ':' t = type {$value = new Pair($v.text, $t.value);};

Var : ('a'..'z'|'A'..'Z')+;

Number : [0-9]+;

WS : [ \t\r\n]+ -> skip;