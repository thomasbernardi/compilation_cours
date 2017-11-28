import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by thomas on 29/09/2017.
 */
public class LangageAST {
}

abstract class Expression {
    abstract String print();
}

abstract class BOP extends Expression {
    Expression e1, e2;

    BOP(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    String print(String s) {
        return e1.print() + " " + s + " " + e2.print();
    }
}

class Add extends BOP {
    Add(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("+");
    }
}

class Sub extends BOP {
    Sub(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("-");
    }
}

class Mul extends BOP {
    Mul(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("*");
    }
}

class Div extends BOP {
    Div(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("/");
    }
}

class And extends BOP {
    And(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("and");
    }
}

class Or extends BOP {
    Or(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("or");
    }
}

class Lt extends BOP {
    Lt(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("<");
    }
}

class Leq extends BOP {
    Leq(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("<=");
    }
}

class Eq extends BOP {
    Eq(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("=");
    }
}

class Neq extends BOP {
    Neq(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print("!=");
    }
}

class Geq extends BOP {
    Geq(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print(">=");
    }
}

class Gt extends BOP {
    Gt(Expression e1, Expression e2) {
        super(e1, e2);
    }

    String print() {
        return print(">");
    }
}

abstract class UOP extends Expression {
    Expression e;
    UOP(Expression e) {
        this.e = e;
    }

    String print(String s) {
        return s + " " + e;
    }

    abstract String print();
}

class Neg extends UOP {
    Neg(Expression e) {
        super(e);
    }

    String print() {
        return print("-");
    }
}

class Not extends UOP {
    Not(Expression e) {
        super(e);
    }

    String print() {
        return print("not");
    }
}

abstract class Constant extends Expression {
}

class Number extends Constant {
    int n;
    Number(int n) {
        this.n = n;
    }

    String print() {
        return "" + n;
    }
}

class True extends Constant {
    String print() {
        return "true";
    }
}

class False extends Constant {
    String print() {
        return "false";
    }
}

abstract class EvaluatedFunctionCall extends Expression {
    ArrayList<Expression> arguments;

    EvaluatedFunctionCall(ArrayList<Expression> arguments) {
        this.arguments = arguments;
    }
    String argumentString() {
        String result = " ";
        for (Expression argument : arguments) {
            result += argument.print() + " ";
        }

        return result;
    }
}

class EvaluatedRead extends EvaluatedFunctionCall {
    EvaluatedRead(ArrayList<Expression> arguments) {
        super(arguments);
    }

    String print() {
        return "read(" + argumentString() + ")";
    }
}

class EvaluatedWrite extends EvaluatedFunctionCall {
    EvaluatedWrite(ArrayList<Expression> arguments) {
        super(arguments);
    }

    String print() {
        return "write(" + argumentString() + ")";
    }
}

class EvaluatedFunction extends EvaluatedFunctionCall {
    String name;
    EvaluatedFunction(String name, ArrayList<Expression> arguments) {
        super(arguments);
        this.name = name;
    }
    String print() {
        return name + "(" + argumentString() + ")";
    }
}

abstract class VariableAccess extends Expression {
}

class Variable extends VariableAccess {
    String name;
    Variable(String name) {
        this.name = name;
    }

    String print() {
        return name;
    }
}

class ArrayAccess extends VariableAccess {
    Expression name;
    Expression index;
    ArrayAccess(Expression name, Expression index) {
        this.name = name;
        this.index = index;
    }

    String print() {
        return name.print() + "[" + index.print() + "]";
    }
}

class NewArray extends Expression {
    Type type;
    Expression expression;
    NewArray(Type type, Expression expression) {
        this.type = type;
        this.expression = expression;
    }

    String print() {
        return "new array of " + type.print() + "[" + expression.print() + "]";
    }
}

abstract class Type {
    String print(String type) {
        return type;
    }
    abstract String print();
}

class IntegerType extends Type {
    IntegerType() {
    }

    String print() {
        return print("Integer");
    }
}

class BooleanType extends Type {
    BooleanType() {
    }

    String print() {
        return print("Boolean");
    }
}

class ArrayType extends Type {
    Type type;
    ArrayType(Type type) {
        this.type = type;
    }

    String print() {
        return "array of " + type.print();
    }
}

abstract class Instruction {
    abstract String print();
}

class VariableAssignment extends Instruction {
    String name;
    Expression value;

    VariableAssignment(String name, Expression value) {
        this.name = name;
        this.value = value;
    }

    String print() {
        return name + " := " + value.print();
    }
}

class ArrayAssignment extends Instruction {
    Expression array;
    Expression index;
    Expression value;

    ArrayAssignment(Expression array, Expression index, Expression value) {
        this.array = array;
        this.index = index;
        this.value = value;
    }

    String print() {
        return array.print() + "[" + index.print() + "] := " + value.print();
    }
}

class IfStatement extends Instruction {
    Expression condition;
    Instruction ifTrue;
    Instruction ifFalse;

    IfStatement(Expression condition, Instruction ifTrue, Instruction ifFalse) {
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    String print() {
        return "if " + condition.print() + " then " + ifTrue.print() + " else " + ifFalse.print();
    }
}

class WhileLoop extends Instruction {
    Expression condition;
    Instruction instruction;

    WhileLoop(Expression condition, Instruction instruction) {
        this.condition = condition;
        this.instruction = instruction;
    }

    String print() {
        return "while " + condition.print() + " do " + instruction.print();
    }
}

abstract class FunctionCall extends Instruction {
    ArrayList<Expression> arguments;

    FunctionCall(ArrayList<Expression> arguments) {
        this.arguments = arguments;
    }
    String argumentString() {
        String result = " ";
        for (Expression argument : arguments) {
            result += argument.print() + " ";
        }
        return result;
    }
}

class Read extends FunctionCall {
    Read(ArrayList<Expression> arguments) {
        super(arguments);
    }

    String print() {
        return "read(" + argumentString() + ")";
    }
}

class Write extends FunctionCall {
    Write(ArrayList<Expression> arguments) {
        super(arguments);
    }

    String print() {
        return "write(" + argumentString() + ")";
    }
}

class Function extends FunctionCall {
    String name;
    Function(String name, ArrayList<Expression> arguments) {
        super(arguments);
        this.name = name;
    }
    String print() {
        return name + "(" + argumentString() + ")";
    }
}

class Skip extends Instruction {
    Skip() {
    }

    String print() {
        return " skip ";
    }
}

class RecursedInstruction extends Instruction {
    Instruction i1;
    Instruction i2;
    RecursedInstruction(Instruction i1, Instruction i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    String print() {
        return i1.print() + "; " + i2.print();
    }
}

class TypedVariable {
    Type type;
    String name;
    TypedVariable(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    String name() { return name; }

    Type type() { return type; }

    String print() {
        return name + " : " + type.print();
    }
}
class FunctionDefinition {
    String name;
    ArrayList<TypedVariable> args;
    Type returnType;
    ArrayList<TypedVariable> locals;
    Instruction instruction;
    FunctionDefinition(String name, ArrayList<TypedVariable> args, Type returnType,
                       ArrayList<TypedVariable> locals, Instruction instruction) {
        this.name = name;
        this.args = args;
        this.returnType = returnType;
        this.locals = locals;
        this.instruction = instruction;
    }

    String print() {
        String argString = " ";
        String localString = " ";
        String result = "";
        for (TypedVariable element : args) {
            argString += element.print() + " ";
        }

        for (TypedVariable element : locals) {
            localString += element.print() + " ";
        }

        result += name + "(" + argString + ")" + returnType.print();
        if (!locals.isEmpty()) result += localString;
        result += instruction.print();
        return result;
    }
}

class Program {
    ArrayList<TypedVariable> globals;
    ArrayList<FunctionDefinition> functions;
    Instruction instruction;
    Program(ArrayList<TypedVariable> globals, ArrayList<FunctionDefinition> functions, Instruction instruction) {
        this.globals = globals;
        this.functions = functions;
        this.instruction = instruction;
    }

    String print() {
        String result = "";
        String functionString = "";
        if (functions != null) {
            for (FunctionDefinition function : functions) {
                functionString += function.print() + "\n";
            }
        }

        if (globals != null && !globals.isEmpty()) {
            result += "var ";
            for (TypedVariable var : globals) {
                result += var.print() + " ";
            }
            result += "\n";
        }

        result += functionString + "\n" + instruction.print();
        return result;
    }
}
