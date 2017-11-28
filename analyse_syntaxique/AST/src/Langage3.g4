grammar Langage3;

constant returns [Expression value]:
    input = Number {$value = new Number(Integer.parseInt($input.text));}
    | 'true' {$value = new True();}
    | 'false' {$value = new False();};

expression returns [Expression value]:
        e1 = constant {$value = $e1.value;}
        | e2 = Var {$value = new Variable($e2.text);}
        | '-' e3 = expression {$value = new Neg($e3.value);}
        | 'not' e4 = expression {$value = new Not($e4.value);}
        | e5 = expression '+' e6 = expression {$value = new Add($e5.value, $e6.value);}
        | e7 = expression '-' e8 = expression {$value = new Sub($e7.value, $e8.value);}
        | e9 = expression '*' e10 = expression {$value = new Mul($e9.value, $e10.value);}
        | e11 = expression '/' e12 = expression {$value = new Div($e11.value, $e12.value);}
        | e13 = expression 'and' e14 = expression {$value = new And($e13.value, $e14.value);}
        | e15 = expression 'or' e16 = expression {$value = new Or($e15.value, $e16.value);}
        | e17 = expression '<' e18 = expression {$value = new Lt($e17.value, $e18.value);}
        | e19 = expression '<=' e20 = expression {$value = new Leq($e19.value, $e20.value);}
        | e21 = expression '=' e22 = expression {$value = new Eq($e21.value, $e22.value);}
        | e23 = expression '!=' e24 = expression {$value = new Neq($e23.value, $e24.value);}
        | e25 = expression '>=' e26 = expression {$value = new Geq($e25.value, $e26.value);}
        | e27 = expression '>' e28 = expression {$value = new Gt($e27.value, $e28.value);}
        | 'read' a1 = arguments {$value = new EvaluatedRead($a1.value);}
        | 'write' a2 = arguments {$value = new EvaluatedWrite($a2.value);}
        | name = Var a3 = arguments {$value = new EvaluatedFunction($name.text, $a3.value);}
        | array = expression '['index = expression']' {$value = new ArrayAccess($array.value, $index.value);}
        | 'new' 'array' 'of' t = type '[' i = expression ']' {$value = new NewArray($t.value, $i.value);};

arguments returns [ArrayList<Expression> value]
    @init {$value = new ArrayList<Expression>();} :
        '(' (e = expression {$value.add($e.value);})* ')';

type returns [Type value] :
        'integer' {$value = new IntegerType();}
        | 'boolean' {$value = new BooleanType();}
        | 'arrayof' t = type {$value = new ArrayType($t.value);};

instruction returns [Instruction value] :
        v = Var ':' '=' e1 = expression {$value = new VariableAssignment($v.text, $e1.value);}
        | array = expression '[' index = expression ']' ':' '=' val = expression
                {$value = new ArrayAssignment($array.value, $index.value, $val.value);}
        | 'if' condition = expression 'then' ifTrue = instruction 'else' ifFalse = instruction
                {$value = new IfStatement($condition.value, $ifTrue.value, $ifFalse.value);}
        | 'while' condition2 = expression 'do' inst = instruction
                {$value = new WhileLoop($condition2.value, $inst.value);}
        | 'read' a1 = arguments {$value = new Read($a1.value);}
        | 'write' a2 = arguments {$value = new Write($a2.value);}
        | name = Var a3 = arguments {$value = new Function($name.text, $a3.value);}
        | 'skip' {$value = new Skip();}
        | i1 = instruction ';' i2 = instruction {$value = new RecursedInstruction($i1.value, $i2.value);};

functDefinition returns [FunctionDefinition value] :
        v = Var '(' (args = typedVariables)?')' ':' t = type
        ('var' lcls = typedVariables)? inst = instruction
        {$value = new FunctionDefinition($v.text, $args.value, $t.value, $lcls.value, $inst.value);};
definitions returns [ArrayList<FunctionDefinition> value]
            @init {$value = new ArrayList<FunctionDefinition>();} :
            (f = functDefinition {$value.add($f.value);})+;

prg returns [Program value] :
        ('var' v = typedVariables)? (f = definitions)? i = instruction
        {$value = new Program($v.value, $f.value, $i.value);};

typedVariables returns [ArrayList<TypedVariable> value]
            @init {$value = new ArrayList<TypedVariable>();} :
            (v = variable {$value.add($v.value);})+;
variable returns [TypedVariable value] :
        v = Var ':' t = type {$value = new TypedVariable($t.value, $v.text);};

Var : ('a'..'z'|'A'..'Z')+;

Number : [0-9]+;

WS : [ \t\r\n]+ -> skip;