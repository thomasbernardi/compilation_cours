// Generated from Langage.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangageParser}.
 */
public interface LangageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangageParser#uop}.
	 * @param ctx the parse tree
	 */
	void enterUop(LangageParser.UopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#uop}.
	 * @param ctx the parse tree
	 */
	void exitUop(LangageParser.UopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(LangageParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(LangageParser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LangageParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LangageParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LangageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LangageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(LangageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(LangageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(LangageParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(LangageParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LangageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LangageParser.VariableContext ctx);
}