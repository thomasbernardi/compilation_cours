import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by thomas on 04/10/2017.
 */
public class PPtoUPPTest {
    public static void main(String[] args) {
        String prg = "testPrg.txt";
        FileInputStream inputFile = null;
        ANTLRInputStream stream;
        try {
            inputFile = new FileInputStream(prg);
            stream = new ANTLRInputStream(inputFile);
        } catch (IOException e) {
            System.out.println("File not found, interpreting input " +
                    "as program definition");
            stream = new ANTLRInputStream(prg);
        }
        LangageLexer lexer = new LangageLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangageParser parser = new LangageParser(tokens);
        PPProg pp = parser.prg().value;
        UPPProg upp = pp.toUPP();
        RTLProg rtl = upp.toRTL();
        //System.out.println(parser.expr().value.eval());

    }
}
