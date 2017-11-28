// Generated from Simple.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SimpleParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SimpleParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleParser.TypeContext ctx);
}