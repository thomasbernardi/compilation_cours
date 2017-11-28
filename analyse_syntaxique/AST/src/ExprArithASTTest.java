import org.antlr.v4.runtime.*;

public class ExprArithASTTest {

    public static void main(String[] args) {
        ANTLRInputStream stream = new ANTLRInputStream(args[0]);
        ExprArithASTLexer lexer = new ExprArithASTLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprArithASTParser parser = new ExprArithASTParser(tokens);
        System.out.println(parser.expr().value.eval());
//        Add hi = new Add(new Cte(1), new Cte(1));
//        System.out.println(hi.print());
    }
}
