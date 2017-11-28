import org.antlr.v4.runtime.*;

public class ExprArithASTTest {

    public static void main(String[] args) {
        ANTLRInputStream stream = new ANTLRInputStream(args[0]);
        LangageLexer lexer = new LangageLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangageParser parser = new LangageParser(tokens);
        //System.out.println(parser.expr().value.eval());
//
    }
}
