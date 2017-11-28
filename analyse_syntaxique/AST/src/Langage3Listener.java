// Generated from Langage3.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Langage3Parser}.
 */
public interface Langage3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(Langage3Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(Langage3Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Langage3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Langage3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Langage3Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Langage3Parser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Langage3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Langage3Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(Langage3Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(Langage3Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#functDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctDefinition(Langage3Parser.FunctDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#functDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctDefinition(Langage3Parser.FunctDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(Langage3Parser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(Langage3Parser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(Langage3Parser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(Langage3Parser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#typedVariables}.
	 * @param ctx the parse tree
	 */
	void enterTypedVariables(Langage3Parser.TypedVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#typedVariables}.
	 * @param ctx the parse tree
	 */
	void exitTypedVariables(Langage3Parser.TypedVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Langage3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Langage3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Langage3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Langage3Parser.VariableContext ctx);
}