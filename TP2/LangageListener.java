// Generated from Langage.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangageParser}.
 */
public interface LangageListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link LangageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LangageParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LangageParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by {@link LangageParser#functDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctDefinition(LangageParser.FunctDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#functDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctDefinition(LangageParser.FunctDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(LangageParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(LangageParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(LangageParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(LangageParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#typedVariables}.
	 * @param ctx the parse tree
	 */
	void enterTypedVariables(LangageParser.TypedVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#typedVariables}.
	 * @param ctx the parse tree
	 */
	void exitTypedVariables(LangageParser.TypedVariablesContext ctx);
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