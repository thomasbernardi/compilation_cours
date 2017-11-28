// Generated from Langage2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Langage2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Var=37, Number=38, WS=39;
	public static final int
		RULE_uop = 0, RULE_bop = 1, RULE_constant = 2, RULE_expression = 3, RULE_arguments = 4, 
		RULE_type = 5, RULE_instruction = 6, RULE_functionDefinition = 7, RULE_program = 8, 
		RULE_function = 9, RULE_variable = 10;
	public static final String[] ruleNames = {
		"uop", "bop", "constant", "expression", "arguments", "type", "instruction", 
		"functionDefinition", "program", "function", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'not'", "'+'", "'*'", "'/'", "'and'", "'or'", "'<'", "'<='", 
		"'='", "'!='", "'>='", "'>'", "'true'", "'false'", "'['", "']'", "'new'", 
		"'array'", "'of'", "'('", "')'", "'integer'", "'boolean'", "'arrayof'", 
		"':'", "'if'", "'then'", "'else'", "'while'", "'do'", "'skip'", "';'", 
		"'var'", "'read'", "'write'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Var", "Number", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Langage2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Langage2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UopContext extends ParserRuleContext {
		public UopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterUop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitUop(this);
		}
	}

	public final UopContext uop() throws RecognitionException {
		UopContext _localctx = new UopContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_uop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BopContext extends ParserRuleContext {
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitBop(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(Langage2Parser.Number, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << Number))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode Var() { return getToken(Langage2Parser.Var, 0); }
		public UopContext uop() {
			return getRuleContext(UopContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(29);
				constant();
				}
				break;
			case 2:
				{
				setState(30);
				match(Var);
				}
				break;
			case 3:
				{
				setState(31);
				uop();
				setState(32);
				expression(5);
				}
				break;
			case 4:
				{
				setState(34);
				function();
				setState(35);
				arguments();
				}
				break;
			case 5:
				{
				setState(37);
				match(T__17);
				setState(38);
				match(T__18);
				setState(39);
				match(T__19);
				setState(40);
				type();
				setState(41);
				match(T__15);
				setState(42);
				expression(0);
				setState(43);
				match(T__16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						bop();
						setState(49);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						match(T__15);
						setState(53);
						expression(0);
						setState(54);
						match(T__16);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__20);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__34) | (1L << T__35) | (1L << Var) | (1L << Number))) != 0)) {
				{
				{
				setState(62);
				expression(0);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__24);
				setState(73);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(Langage2Parser.Var, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		return instruction(0);
	}

	private InstructionContext instruction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionContext _localctx = new InstructionContext(_ctx, _parentState);
		InstructionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_instruction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(77);
				match(Var);
				setState(78);
				match(T__25);
				setState(79);
				match(T__9);
				setState(80);
				expression(0);
				}
				break;
			case 2:
				{
				setState(81);
				expression(0);
				setState(82);
				match(T__15);
				setState(83);
				expression(0);
				setState(84);
				match(T__16);
				setState(85);
				match(T__25);
				setState(86);
				match(T__9);
				setState(87);
				expression(0);
				}
				break;
			case 3:
				{
				setState(89);
				match(T__26);
				setState(90);
				expression(0);
				setState(91);
				match(T__27);
				setState(92);
				instruction(0);
				setState(93);
				match(T__28);
				setState(94);
				instruction(5);
				}
				break;
			case 4:
				{
				setState(96);
				match(T__29);
				setState(97);
				expression(0);
				setState(98);
				match(T__30);
				setState(99);
				instruction(4);
				}
				break;
			case 5:
				{
				setState(101);
				function();
				setState(102);
				match(T__20);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__34) | (1L << T__35) | (1L << Var) | (1L << Number))) != 0)) {
					{
					{
					setState(103);
					expression(0);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__21);
				}
				break;
			case 6:
				{
				setState(111);
				match(T__31);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instruction);
					setState(114);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(115);
					match(T__32);
					setState(116);
					instruction(2);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(Langage2Parser.Var, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Var);
			setState(123);
			match(T__20);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Var) {
				{
				{
				setState(124);
				variable();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(T__21);
			setState(131);
			match(T__25);
			setState(132);
			type();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(133);
				match(T__33);
				setState(135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(134);
						variable();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(141);
			instruction(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(143);
				match(T__33);
				setState(145); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(144);
						variable();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(147); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					functionDefinition();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(157);
			instruction(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(Langage2Parser.Var, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << Var))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(Langage2Parser.Var, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage2Listener ) ((Langage2Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Var);
			setState(162);
			match(T__25);
			setState(163);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return instruction_sempred((InstructionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean instruction_sempred(InstructionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\7\6B\n\6\f\6\16\6E\13\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\b\5\bs\n\b\3\b\3\b\3\b\7\bx\n\b"+
		"\f\b\16\b{\13\b\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\6\t\u008a\n\t\r\t\16\t\u008b\5\t\u008e\n\t\3\t\3\t\3\n\3"+
		"\n\6\n\u0094\n\n\r\n\16\n\u0095\5\n\u0098\n\n\3\n\7\n\u009b\n\n\f\n\16"+
		"\n\u009e\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\2\4\b\16\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\6\3\2\3\4\4\2\3\3\5\17\4\2\20\21((\3\2%\'\2\u00b2"+
		"\2\30\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b/\3\2\2\2\n?\3\2\2\2\fL\3\2\2"+
		"\2\16r\3\2\2\2\20|\3\2\2\2\22\u0097\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3"+
		"\3\2\2\2\30\31\t\2\2\2\31\3\3\2\2\2\32\33\t\3\2\2\33\5\3\2\2\2\34\35\t"+
		"\4\2\2\35\7\3\2\2\2\36\37\b\5\1\2\37\60\5\6\4\2 \60\7\'\2\2!\"\5\2\2\2"+
		"\"#\5\b\5\7#\60\3\2\2\2$%\5\24\13\2%&\5\n\6\2&\60\3\2\2\2\'(\7\24\2\2"+
		"()\7\25\2\2)*\7\26\2\2*+\5\f\7\2+,\7\22\2\2,-\5\b\5\2-.\7\23\2\2.\60\3"+
		"\2\2\2/\36\3\2\2\2/ \3\2\2\2/!\3\2\2\2/$\3\2\2\2/\'\3\2\2\2\60<\3\2\2"+
		"\2\61\62\f\6\2\2\62\63\5\4\3\2\63\64\5\b\5\7\64;\3\2\2\2\65\66\f\4\2\2"+
		"\66\67\7\22\2\2\678\5\b\5\289\7\23\2\29;\3\2\2\2:\61\3\2\2\2:\65\3\2\2"+
		"\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?C\7\27\2\2@B\5\b"+
		"\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\30"+
		"\2\2G\13\3\2\2\2HM\7\31\2\2IM\7\32\2\2JK\7\33\2\2KM\5\f\7\2LH\3\2\2\2"+
		"LI\3\2\2\2LJ\3\2\2\2M\r\3\2\2\2NO\b\b\1\2OP\7\'\2\2PQ\7\34\2\2QR\7\f\2"+
		"\2Rs\5\b\5\2ST\5\b\5\2TU\7\22\2\2UV\5\b\5\2VW\7\23\2\2WX\7\34\2\2XY\7"+
		"\f\2\2YZ\5\b\5\2Zs\3\2\2\2[\\\7\35\2\2\\]\5\b\5\2]^\7\36\2\2^_\5\16\b"+
		"\2_`\7\37\2\2`a\5\16\b\7as\3\2\2\2bc\7 \2\2cd\5\b\5\2de\7!\2\2ef\5\16"+
		"\b\6fs\3\2\2\2gh\5\24\13\2hl\7\27\2\2ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2lj"+
		"\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\30\2\2ps\3\2\2\2qs\7\"\2\2"+
		"rN\3\2\2\2rS\3\2\2\2r[\3\2\2\2rb\3\2\2\2rg\3\2\2\2rq\3\2\2\2sy\3\2\2\2"+
		"tu\f\3\2\2uv\7#\2\2vx\5\16\b\4wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z\17\3\2\2\2{y\3\2\2\2|}\7\'\2\2}\u0081\7\27\2\2~\u0080\5\26\f\2\177~"+
		"\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\30\2\2\u0085\u0086\7"+
		"\34\2\2\u0086\u008d\5\f\7\2\u0087\u0089\7$\2\2\u0088\u008a\5\26\f\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\5\16\b\2\u0090\21\3\2\2\2\u0091\u0093\7$\2"+
		"\2\u0092\u0094\5\26\f\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009c\3\2\2\2\u0099\u009b\5\20\t\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\16\b\2\u00a0"+
		"\23\3\2\2\2\u00a1\u00a2\t\5\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\'\2\2\u00a4"+
		"\u00a5\7\34\2\2\u00a5\u00a6\5\f\7\2\u00a6\27\3\2\2\2\20/:<CLlry\u0081"+
		"\u008b\u008d\u0095\u0097\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}