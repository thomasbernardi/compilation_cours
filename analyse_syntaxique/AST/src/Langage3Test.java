import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Langage3Test {

    public static void main(String[] args) {
        ANTLRInputStream stream = new ANTLRInputStream(args[0]);
        Langage3Lexer lexer = new Langage3Lexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Langage3Parser parser = new Langage3Parser(tokens);
        System.out.println(parser.prg().value.print());
//        Add hi = new Add(new Cte(1), new Cte(1));
//        System.out.println(hi.print());
    }
}
