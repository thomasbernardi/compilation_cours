// Generated from Langage2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Langage2Parser}.
 */
public interface Langage2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#uop}.
	 * @param ctx the parse tree
	 */
	void enterUop(Langage2Parser.UopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#uop}.
	 * @param ctx the parse tree
	 */
	void exitUop(Langage2Parser.UopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(Langage2Parser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(Langage2Parser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(Langage2Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(Langage2Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Langage2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Langage2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Langage2Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Langage2Parser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Langage2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Langage2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(Langage2Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(Langage2Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(Langage2Parser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(Langage2Parser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Langage2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Langage2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Langage2Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Langage2Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Langage2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Langage2Parser.VariableContext ctx);
}