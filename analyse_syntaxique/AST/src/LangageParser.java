// Generated from Langage.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Function=37, Word=38, 
		Number=39, WS=40;
	public static final int
		RULE_uop = 0, RULE_bop = 1, RULE_constant = 2, RULE_expression = 3, RULE_type = 4, 
		RULE_instruction = 5, RULE_functionDefinition = 6, RULE_program = 7, RULE_variable = 8;
	public static final String[] ruleNames = {
		"uop", "bop", "constant", "expression", "type", "instruction", "functionDefinition", 
		"program", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'not'", "'+'", "'*'", "'/'", "'and'", "'or'", "'<'", "'<='", 
		"'='", "'!='", "'>='", "'>'", "'true'", "'false'", "'('", "')'", "'['", 
		"']'", "'newarrayof'", "'integer'", "'boolean'", "'arrayof'", "':='", 
		"']:='", "'if'", "'then'", "'else'", "'while'", "'do'", "'skip'", "';'", 
		"'f('", "'):'", "'var'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Function", "Word", "Number", "WS"
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
	public String getGrammarFileName() { return "Langage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangageParser(TokenStream input) {
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
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterUop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitUop(this);
		}
	}

	public final UopContext uop() throws RecognitionException {
		UopContext _localctx = new UopContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_uop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
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
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitBop(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
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
		public TerminalNode Number() { return getToken(LangageParser.Number, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
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
		public TerminalNode Word() { return getToken(LangageParser.Word, 0); }
		public UopContext uop() {
			return getRuleContext(UopContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Function() { return getToken(LangageParser.Function, 0); }
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
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitExpression(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case Number:
				{
				setState(25);
				constant();
				}
				break;
			case Word:
				{
				setState(26);
				match(Word);
				}
				break;
			case T__0:
			case T__1:
				{
				setState(27);
				uop();
				setState(28);
				expression(5);
				}
				break;
			case Function:
				{
				setState(30);
				match(Function);
				setState(31);
				match(T__15);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << Function) | (1L << Word) | (1L << Number))) != 0)) {
					{
					{
					setState(32);
					expression(0);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				match(T__16);
				}
				break;
			case T__19:
				{
				setState(39);
				match(T__19);
				setState(40);
				type();
				setState(41);
				match(T__17);
				setState(42);
				expression(0);
				setState(43);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
						match(T__17);
						setState(53);
						expression(0);
						setState(54);
						match(T__18);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__22);
				setState(64);
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
		public TerminalNode Word() { return getToken(LangageParser.Word, 0); }
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
		public TerminalNode Function() { return getToken(LangageParser.Function, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitInstruction(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_instruction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(68);
				match(Word);
				setState(69);
				match(T__23);
				setState(70);
				expression(0);
				}
				break;
			case 2:
				{
				setState(71);
				expression(0);
				setState(72);
				match(T__17);
				setState(73);
				expression(0);
				setState(74);
				match(T__24);
				setState(75);
				expression(0);
				}
				break;
			case 3:
				{
				setState(77);
				match(T__25);
				setState(78);
				expression(0);
				setState(79);
				match(T__26);
				setState(80);
				instruction(0);
				setState(81);
				match(T__27);
				setState(82);
				instruction(5);
				}
				break;
			case 4:
				{
				setState(84);
				match(T__28);
				setState(85);
				expression(0);
				setState(86);
				match(T__29);
				setState(87);
				instruction(4);
				}
				break;
			case 5:
				{
				setState(89);
				match(Function);
				setState(90);
				match(T__15);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << Function) | (1L << Word) | (1L << Number))) != 0)) {
					{
					{
					setState(91);
					expression(0);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(T__16);
				}
				break;
			case 6:
				{
				setState(98);
				match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
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
					setState(101);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(102);
					match(T__31);
					setState(103);
					instruction(2);
					}
					} 
				}
				setState(108);
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
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__32);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Word) {
				{
				{
				setState(110);
				variable();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__33);
			setState(117);
			type();
			setState(118);
			match(T__34);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					variable();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(125);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__34);
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(128);
					variable();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(133);
				functionDefinition();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(LangageParser.Word, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Word);
			setState(142);
			match(T__35);
			setState(143);
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
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0094\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5$\n\5\f\5\16\5"+
		"\'\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\3\6\5\6D\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7\3\7\5\7f\n\7\3\7\3"+
		"\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\b\3\b"+
		"\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\t\3\t\6\t\u0084\n\t\r\t\16"+
		"\t\u0085\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\2\4\b\f\13\2\4\6\b\n\f\16\20\22\2\5\3\2\3\4\4\2\3\3\5\17\4\2\20\21"+
		"))\2\u009e\2\24\3\2\2\2\4\26\3\2\2\2\6\30\3\2\2\2\b/\3\2\2\2\nC\3\2\2"+
		"\2\fe\3\2\2\2\16o\3\2\2\2\20\u0081\3\2\2\2\22\u008f\3\2\2\2\24\25\t\2"+
		"\2\2\25\3\3\2\2\2\26\27\t\3\2\2\27\5\3\2\2\2\30\31\t\4\2\2\31\7\3\2\2"+
		"\2\32\33\b\5\1\2\33\60\5\6\4\2\34\60\7(\2\2\35\36\5\2\2\2\36\37\5\b\5"+
		"\7\37\60\3\2\2\2 !\7\'\2\2!%\7\22\2\2\"$\5\b\5\2#\"\3\2\2\2$\'\3\2\2\2"+
		"%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(\60\7\23\2\2)*\7\26\2\2*+\5"+
		"\n\6\2+,\7\24\2\2,-\5\b\5\2-.\7\25\2\2.\60\3\2\2\2/\32\3\2\2\2/\34\3\2"+
		"\2\2/\35\3\2\2\2/ \3\2\2\2/)\3\2\2\2\60<\3\2\2\2\61\62\f\6\2\2\62\63\5"+
		"\4\3\2\63\64\5\b\5\7\64;\3\2\2\2\65\66\f\4\2\2\66\67\7\24\2\2\678\5\b"+
		"\5\289\7\25\2\29;\3\2\2\2:\61\3\2\2\2:\65\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?D\7\27\2\2@D\7\30\2\2AB\7\31\2\2BD\5\n"+
		"\6\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2D\13\3\2\2\2EF\b\7\1\2FG\7(\2\2GH\7"+
		"\32\2\2Hf\5\b\5\2IJ\5\b\5\2JK\7\24\2\2KL\5\b\5\2LM\7\33\2\2MN\5\b\5\2"+
		"Nf\3\2\2\2OP\7\34\2\2PQ\5\b\5\2QR\7\35\2\2RS\5\f\7\2ST\7\36\2\2TU\5\f"+
		"\7\7Uf\3\2\2\2VW\7\37\2\2WX\5\b\5\2XY\7 \2\2YZ\5\f\7\6Zf\3\2\2\2[\\\7"+
		"\'\2\2\\`\7\22\2\2]_\5\b\5\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a"+
		"c\3\2\2\2b`\3\2\2\2cf\7\23\2\2df\7!\2\2eE\3\2\2\2eI\3\2\2\2eO\3\2\2\2"+
		"eV\3\2\2\2e[\3\2\2\2ed\3\2\2\2fl\3\2\2\2gh\f\3\2\2hi\7\"\2\2ik\5\f\7\4"+
		"jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\r\3\2\2\2nl\3\2\2\2os\7#\2\2"+
		"pr\5\22\n\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2"+
		"\2vw\7$\2\2wx\5\n\6\2x|\7%\2\2y{\5\22\n\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\5\f\7\2\u0080\17\3\2\2\2"+
		"\u0081\u0083\7%\2\2\u0082\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\3\2\2\2\u0087"+
		"\u0089\5\16\b\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\5\f\7\2\u008e\21\3\2\2\2\u008f\u0090\7(\2\2\u0090\u0091\7&\2\2"+
		"\u0091\u0092\5\n\6\2\u0092\23\3\2\2\2\16%/:<C`els|\u0085\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}