// Generated from Langage3.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Langage3Parser extends Parser {
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
		RULE_constant = 0, RULE_expression = 1, RULE_arguments = 2, RULE_type = 3, 
		RULE_instruction = 4, RULE_functDefinition = 5, RULE_definitions = 6, 
		RULE_prg = 7, RULE_typedVariables = 8, RULE_variable = 9;
	public static final String[] ruleNames = {
		"constant", "expression", "arguments", "type", "instruction", "functDefinition", 
		"definitions", "prg", "typedVariables", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'-'", "'not'", "'+'", "'*'", "'/'", "'and'", 
		"'or'", "'<'", "'<='", "'='", "'!='", "'>='", "'>'", "'read'", "'write'", 
		"'['", "']'", "'new'", "'array'", "'of'", "'('", "')'", "'integer'", "'boolean'", 
		"'arrayof'", "':'", "'if'", "'then'", "'else'", "'while'", "'do'", "'skip'", 
		"';'", "'var'"
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
	public String getGrammarFileName() { return "Langage3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Langage3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConstantContext extends ParserRuleContext {
		public Expression value;
		public Token input;
		public TerminalNode Number() { return getToken(Langage3Parser.Number, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_constant);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				((ConstantContext)_localctx).input = match(Number);
				((ConstantContext)_localctx).value =  new Number(Integer.parseInt((((ConstantContext)_localctx).input!=null?((ConstantContext)_localctx).input.getText():null)));
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(T__0);
				((ConstantContext)_localctx).value =  new True();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(T__1);
				((ConstantContext)_localctx).value =  new False();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression value;
		public ExpressionContext e5;
		public ExpressionContext e7;
		public ExpressionContext e9;
		public ExpressionContext e11;
		public ExpressionContext e13;
		public ExpressionContext e15;
		public ExpressionContext e17;
		public ExpressionContext e19;
		public ExpressionContext e21;
		public ExpressionContext e23;
		public ExpressionContext e25;
		public ExpressionContext e27;
		public ExpressionContext array;
		public ConstantContext e1;
		public Token e2;
		public ExpressionContext e3;
		public ExpressionContext e4;
		public ArgumentsContext a1;
		public ArgumentsContext a2;
		public Token name;
		public ArgumentsContext a3;
		public TypeContext t;
		public ExpressionContext i;
		public ExpressionContext e6;
		public ExpressionContext e8;
		public ExpressionContext e10;
		public ExpressionContext e12;
		public ExpressionContext e14;
		public ExpressionContext e16;
		public ExpressionContext e18;
		public ExpressionContext e20;
		public ExpressionContext e22;
		public ExpressionContext e24;
		public ExpressionContext e26;
		public ExpressionContext e28;
		public ExpressionContext index;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode Var() { return getToken(Langage3Parser.Var, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitExpression(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(29);
				((ExpressionContext)_localctx).e1 = constant();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).e1.value;
				}
				break;
			case 2:
				{
				setState(32);
				((ExpressionContext)_localctx).e2 = match(Var);
				((ExpressionContext)_localctx).value =  new Variable((((ExpressionContext)_localctx).e2!=null?((ExpressionContext)_localctx).e2.getText():null));
				}
				break;
			case 3:
				{
				setState(34);
				match(T__2);
				setState(35);
				((ExpressionContext)_localctx).e3 = expression(19);
				((ExpressionContext)_localctx).value =  new Neg(((ExpressionContext)_localctx).e3.value);
				}
				break;
			case 4:
				{
				setState(38);
				match(T__3);
				setState(39);
				((ExpressionContext)_localctx).e4 = expression(18);
				((ExpressionContext)_localctx).value =  new Not(((ExpressionContext)_localctx).e4.value);
				}
				break;
			case 5:
				{
				setState(42);
				match(T__15);
				setState(43);
				((ExpressionContext)_localctx).a1 = arguments();
				((ExpressionContext)_localctx).value =  new EvaluatedRead(((ExpressionContext)_localctx).a1.value);
				}
				break;
			case 6:
				{
				setState(46);
				match(T__16);
				setState(47);
				((ExpressionContext)_localctx).a2 = arguments();
				((ExpressionContext)_localctx).value =  new EvaluatedWrite(((ExpressionContext)_localctx).a2.value);
				}
				break;
			case 7:
				{
				setState(50);
				((ExpressionContext)_localctx).name = match(Var);
				setState(51);
				((ExpressionContext)_localctx).a3 = arguments();
				((ExpressionContext)_localctx).value =  new EvaluatedFunction((((ExpressionContext)_localctx).name!=null?((ExpressionContext)_localctx).name.getText():null), ((ExpressionContext)_localctx).a3.value);
				}
				break;
			case 8:
				{
				setState(54);
				match(T__19);
				setState(55);
				match(T__20);
				setState(56);
				match(T__21);
				setState(57);
				((ExpressionContext)_localctx).t = type();
				setState(58);
				match(T__17);
				setState(59);
				((ExpressionContext)_localctx).i = expression(0);
				setState(60);
				match(T__18);
				((ExpressionContext)_localctx).value =  new NewArray(((ExpressionContext)_localctx).t.value, ((ExpressionContext)_localctx).i.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e5 = _prevctx;
						_localctx.e5 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(66);
						match(T__4);
						setState(67);
						((ExpressionContext)_localctx).e6 = expression(18);
						((ExpressionContext)_localctx).value =  new Add(((ExpressionContext)_localctx).e5.value, ((ExpressionContext)_localctx).e6.value);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e7 = _prevctx;
						_localctx.e7 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(71);
						match(T__2);
						setState(72);
						((ExpressionContext)_localctx).e8 = expression(17);
						((ExpressionContext)_localctx).value =  new Sub(((ExpressionContext)_localctx).e7.value, ((ExpressionContext)_localctx).e8.value);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e9 = _prevctx;
						_localctx.e9 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(76);
						match(T__5);
						setState(77);
						((ExpressionContext)_localctx).e10 = expression(16);
						((ExpressionContext)_localctx).value =  new Mul(((ExpressionContext)_localctx).e9.value, ((ExpressionContext)_localctx).e10.value);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e11 = _prevctx;
						_localctx.e11 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(81);
						match(T__6);
						setState(82);
						((ExpressionContext)_localctx).e12 = expression(15);
						((ExpressionContext)_localctx).value =  new Div(((ExpressionContext)_localctx).e11.value, ((ExpressionContext)_localctx).e12.value);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e13 = _prevctx;
						_localctx.e13 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(86);
						match(T__7);
						setState(87);
						((ExpressionContext)_localctx).e14 = expression(14);
						((ExpressionContext)_localctx).value =  new And(((ExpressionContext)_localctx).e13.value, ((ExpressionContext)_localctx).e14.value);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e15 = _prevctx;
						_localctx.e15 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(91);
						match(T__8);
						setState(92);
						((ExpressionContext)_localctx).e16 = expression(13);
						((ExpressionContext)_localctx).value =  new Or(((ExpressionContext)_localctx).e15.value, ((ExpressionContext)_localctx).e16.value);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e17 = _prevctx;
						_localctx.e17 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(96);
						match(T__9);
						setState(97);
						((ExpressionContext)_localctx).e18 = expression(12);
						((ExpressionContext)_localctx).value =  new Lt(((ExpressionContext)_localctx).e17.value, ((ExpressionContext)_localctx).e18.value);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e19 = _prevctx;
						_localctx.e19 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(101);
						match(T__10);
						setState(102);
						((ExpressionContext)_localctx).e20 = expression(11);
						((ExpressionContext)_localctx).value =  new Leq(((ExpressionContext)_localctx).e19.value, ((ExpressionContext)_localctx).e20.value);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e21 = _prevctx;
						_localctx.e21 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(106);
						match(T__11);
						setState(107);
						((ExpressionContext)_localctx).e22 = expression(10);
						((ExpressionContext)_localctx).value =  new Eq(((ExpressionContext)_localctx).e21.value, ((ExpressionContext)_localctx).e22.value);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e23 = _prevctx;
						_localctx.e23 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(111);
						match(T__12);
						setState(112);
						((ExpressionContext)_localctx).e24 = expression(9);
						((ExpressionContext)_localctx).value =  new Neq(((ExpressionContext)_localctx).e23.value, ((ExpressionContext)_localctx).e24.value);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e25 = _prevctx;
						_localctx.e25 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(116);
						match(T__13);
						setState(117);
						((ExpressionContext)_localctx).e26 = expression(8);
						((ExpressionContext)_localctx).value =  new Geq(((ExpressionContext)_localctx).e25.value, ((ExpressionContext)_localctx).e26.value);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e27 = _prevctx;
						_localctx.e27 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						match(T__14);
						setState(122);
						((ExpressionContext)_localctx).e28 = expression(7);
						((ExpressionContext)_localctx).value =  new Gt(((ExpressionContext)_localctx).e27.value, ((ExpressionContext)_localctx).e28.value);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.array = _prevctx;
						_localctx.array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(126);
						match(T__17);
						setState(127);
						((ExpressionContext)_localctx).index = expression(0);
						setState(128);
						match(T__18);
						((ExpressionContext)_localctx).value =  new ArrayAccess(((ExpressionContext)_localctx).array.value, ((ExpressionContext)_localctx).index.value);
						}
						break;
					}
					} 
				}
				setState(135);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> value;
		public ExpressionContext e;
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
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arguments);
		((ArgumentsContext)_localctx).value =  new ArrayList<Expression>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__22);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << Var) | (1L << Number))) != 0)) {
				{
				{
				setState(137);
				((ArgumentsContext)_localctx).e = expression(0);
				_localctx.value.add(((ArgumentsContext)_localctx).e.value);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__23);
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
		public Type value;
		public TypeContext t;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__24);
				((TypeContext)_localctx).value =  new IntegerType();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__25);
				((TypeContext)_localctx).value =  new BooleanType();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__26);
				setState(152);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).value =  new ArrayType(((TypeContext)_localctx).t.value);
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
		public Instruction value;
		public InstructionContext i1;
		public Token v;
		public ExpressionContext e1;
		public ExpressionContext array;
		public ExpressionContext index;
		public ExpressionContext val;
		public ExpressionContext condition;
		public InstructionContext ifTrue;
		public InstructionContext ifFalse;
		public ExpressionContext condition2;
		public InstructionContext inst;
		public ArgumentsContext a1;
		public ArgumentsContext a2;
		public Token name;
		public ArgumentsContext a3;
		public InstructionContext i2;
		public TerminalNode Var() { return getToken(Langage3Parser.Var, 0); }
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitInstruction(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_instruction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(158);
				((InstructionContext)_localctx).v = match(Var);
				setState(159);
				match(T__27);
				setState(160);
				match(T__11);
				setState(161);
				((InstructionContext)_localctx).e1 = expression(0);
				((InstructionContext)_localctx).value =  new VariableAssignment((((InstructionContext)_localctx).v!=null?((InstructionContext)_localctx).v.getText():null), ((InstructionContext)_localctx).e1.value);
				}
				break;
			case 2:
				{
				setState(164);
				((InstructionContext)_localctx).array = expression(0);
				setState(165);
				match(T__17);
				setState(166);
				((InstructionContext)_localctx).index = expression(0);
				setState(167);
				match(T__18);
				setState(168);
				match(T__27);
				setState(169);
				match(T__11);
				setState(170);
				((InstructionContext)_localctx).val = expression(0);
				((InstructionContext)_localctx).value =  new ArrayAssignment(((InstructionContext)_localctx).array.value, ((InstructionContext)_localctx).index.value, ((InstructionContext)_localctx).val.value);
				}
				break;
			case 3:
				{
				setState(173);
				match(T__28);
				setState(174);
				((InstructionContext)_localctx).condition = expression(0);
				setState(175);
				match(T__29);
				setState(176);
				((InstructionContext)_localctx).ifTrue = instruction(0);
				setState(177);
				match(T__30);
				setState(178);
				((InstructionContext)_localctx).ifFalse = instruction(7);
				((InstructionContext)_localctx).value =  new IfStatement(((InstructionContext)_localctx).condition.value, ((InstructionContext)_localctx).ifTrue.value, ((InstructionContext)_localctx).ifFalse.value);
				}
				break;
			case 4:
				{
				setState(181);
				match(T__31);
				setState(182);
				((InstructionContext)_localctx).condition2 = expression(0);
				setState(183);
				match(T__32);
				setState(184);
				((InstructionContext)_localctx).inst = instruction(6);
				((InstructionContext)_localctx).value =  new WhileLoop(((InstructionContext)_localctx).condition2.value, ((InstructionContext)_localctx).inst.value);
				}
				break;
			case 5:
				{
				setState(187);
				match(T__15);
				setState(188);
				((InstructionContext)_localctx).a1 = arguments();
				((InstructionContext)_localctx).value =  new Read(((InstructionContext)_localctx).a1.value);
				}
				break;
			case 6:
				{
				setState(191);
				match(T__16);
				setState(192);
				((InstructionContext)_localctx).a2 = arguments();
				((InstructionContext)_localctx).value =  new Write(((InstructionContext)_localctx).a2.value);
				}
				break;
			case 7:
				{
				setState(195);
				((InstructionContext)_localctx).name = match(Var);
				setState(196);
				((InstructionContext)_localctx).a3 = arguments();
				((InstructionContext)_localctx).value =  new Function((((InstructionContext)_localctx).name!=null?((InstructionContext)_localctx).name.getText():null), ((InstructionContext)_localctx).a3.value);
				}
				break;
			case 8:
				{
				setState(199);
				match(T__33);
				((InstructionContext)_localctx).value =  new Skip();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionContext(_parentctx, _parentState);
					_localctx.i1 = _prevctx;
					_localctx.i1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instruction);
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					match(T__34);
					setState(205);
					((InstructionContext)_localctx).i2 = instruction(2);
					((InstructionContext)_localctx).value =  new RecursedInstruction(((InstructionContext)_localctx).i1.value, ((InstructionContext)_localctx).i2.value);
					}
					} 
				}
				setState(212);
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

	public static class FunctDefinitionContext extends ParserRuleContext {
		public FunctionDefinition value;
		public Token v;
		public TypedVariablesContext args;
		public TypeContext t;
		public TypedVariablesContext lcls;
		public InstructionContext inst;
		public TerminalNode Var() { return getToken(Langage3Parser.Var, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<TypedVariablesContext> typedVariables() {
			return getRuleContexts(TypedVariablesContext.class);
		}
		public TypedVariablesContext typedVariables(int i) {
			return getRuleContext(TypedVariablesContext.class,i);
		}
		public FunctDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterFunctDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitFunctDefinition(this);
		}
	}

	public final FunctDefinitionContext functDefinition() throws RecognitionException {
		FunctDefinitionContext _localctx = new FunctDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			((FunctDefinitionContext)_localctx).v = match(Var);
			setState(214);
			match(T__22);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(215);
				((FunctDefinitionContext)_localctx).args = typedVariables();
				}
			}

			setState(218);
			match(T__23);
			setState(219);
			match(T__27);
			setState(220);
			((FunctDefinitionContext)_localctx).t = type();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(221);
				match(T__35);
				setState(222);
				((FunctDefinitionContext)_localctx).lcls = typedVariables();
				}
			}

			setState(225);
			((FunctDefinitionContext)_localctx).inst = instruction(0);
			((FunctDefinitionContext)_localctx).value =  new FunctionDefinition((((FunctDefinitionContext)_localctx).v!=null?((FunctDefinitionContext)_localctx).v.getText():null), ((FunctDefinitionContext)_localctx).args.value, ((FunctDefinitionContext)_localctx).t.value, ((FunctDefinitionContext)_localctx).lcls.value, ((FunctDefinitionContext)_localctx).inst.value);
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

	public static class DefinitionsContext extends ParserRuleContext {
		public ArrayList<FunctionDefinition> value;
		public FunctDefinitionContext f;
		public List<FunctDefinitionContext> functDefinition() {
			return getRuleContexts(FunctDefinitionContext.class);
		}
		public FunctDefinitionContext functDefinition(int i) {
			return getRuleContext(FunctDefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitDefinitions(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definitions);
		((DefinitionsContext)_localctx).value =  new ArrayList<FunctionDefinition>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(228);
					((DefinitionsContext)_localctx).f = functDefinition();
					_localctx.value.add(((DefinitionsContext)_localctx).f.value);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PrgContext extends ParserRuleContext {
		public Program value;
		public TypedVariablesContext v;
		public DefinitionsContext f;
		public InstructionContext i;
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TypedVariablesContext typedVariables() {
			return getRuleContext(TypedVariablesContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitPrg(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(235);
				match(T__35);
				setState(236);
				((PrgContext)_localctx).v = typedVariables();
				}
			}

			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(239);
				((PrgContext)_localctx).f = definitions();
				}
				break;
			}
			setState(242);
			((PrgContext)_localctx).i = instruction(0);
			((PrgContext)_localctx).value =  new Program(((PrgContext)_localctx).v.value, ((PrgContext)_localctx).f.value, ((PrgContext)_localctx).i.value);
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

	public static class TypedVariablesContext extends ParserRuleContext {
		public ArrayList<TypedVariable> value;
		public VariableContext v;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TypedVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterTypedVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitTypedVariables(this);
		}
	}

	public final TypedVariablesContext typedVariables() throws RecognitionException {
		TypedVariablesContext _localctx = new TypedVariablesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typedVariables);
		((TypedVariablesContext)_localctx).value =  new ArrayList<TypedVariable>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(245);
					((TypedVariablesContext)_localctx).v = variable();
					_localctx.value.add(((TypedVariablesContext)_localctx).v.value);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(250); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TypedVariable value;
		public Token v;
		public TypeContext t;
		public TerminalNode Var() { return getToken(Langage3Parser.Var, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Langage3Listener ) ((Langage3Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((VariableContext)_localctx).v = match(Var);
			setState(253);
			match(T__27);
			setState(254);
			((VariableContext)_localctx).t = type();
			((VariableContext)_localctx).value =  new TypedVariable(((VariableContext)_localctx).t.value, (((VariableContext)_localctx).v!=null?((VariableContext)_localctx).v.getText():null));
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return instruction_sempred((InstructionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean instruction_sempred(InstructionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0086\n\3\f\3\16\3\u0089\13\3\3\4"+
		"\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00cc\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u00d3\n\6\f\6\16\6\u00d6\13\6\3\7\3"+
		"\7\3\7\5\7\u00db\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e2\n\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\6\b\u00ea\n\b\r\b\16\b\u00eb\3\t\3\t\5\t\u00f0\n\t\3\t\5\t\u00f3"+
		"\n\t\3\t\3\t\3\t\3\n\3\n\3\n\6\n\u00fb\n\n\r\n\16\n\u00fc\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\2\4\4\n\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u0120\2\34"+
		"\3\2\2\2\4A\3\2\2\2\6\u008a\3\2\2\2\b\u009d\3\2\2\2\n\u00cb\3\2\2\2\f"+
		"\u00d7\3\2\2\2\16\u00e9\3\2\2\2\20\u00ef\3\2\2\2\22\u00fa\3\2\2\2\24\u00fe"+
		"\3\2\2\2\26\27\7(\2\2\27\35\b\2\1\2\30\31\7\3\2\2\31\35\b\2\1\2\32\33"+
		"\7\4\2\2\33\35\b\2\1\2\34\26\3\2\2\2\34\30\3\2\2\2\34\32\3\2\2\2\35\3"+
		"\3\2\2\2\36\37\b\3\1\2\37 \5\2\2\2 !\b\3\1\2!B\3\2\2\2\"#\7\'\2\2#B\b"+
		"\3\1\2$%\7\5\2\2%&\5\4\3\25&\'\b\3\1\2\'B\3\2\2\2()\7\6\2\2)*\5\4\3\24"+
		"*+\b\3\1\2+B\3\2\2\2,-\7\22\2\2-.\5\6\4\2./\b\3\1\2/B\3\2\2\2\60\61\7"+
		"\23\2\2\61\62\5\6\4\2\62\63\b\3\1\2\63B\3\2\2\2\64\65\7\'\2\2\65\66\5"+
		"\6\4\2\66\67\b\3\1\2\67B\3\2\2\289\7\26\2\29:\7\27\2\2:;\7\30\2\2;<\5"+
		"\b\5\2<=\7\24\2\2=>\5\4\3\2>?\7\25\2\2?@\b\3\1\2@B\3\2\2\2A\36\3\2\2\2"+
		"A\"\3\2\2\2A$\3\2\2\2A(\3\2\2\2A,\3\2\2\2A\60\3\2\2\2A\64\3\2\2\2A8\3"+
		"\2\2\2B\u0087\3\2\2\2CD\f\23\2\2DE\7\7\2\2EF\5\4\3\24FG\b\3\1\2G\u0086"+
		"\3\2\2\2HI\f\22\2\2IJ\7\5\2\2JK\5\4\3\23KL\b\3\1\2L\u0086\3\2\2\2MN\f"+
		"\21\2\2NO\7\b\2\2OP\5\4\3\22PQ\b\3\1\2Q\u0086\3\2\2\2RS\f\20\2\2ST\7\t"+
		"\2\2TU\5\4\3\21UV\b\3\1\2V\u0086\3\2\2\2WX\f\17\2\2XY\7\n\2\2YZ\5\4\3"+
		"\20Z[\b\3\1\2[\u0086\3\2\2\2\\]\f\16\2\2]^\7\13\2\2^_\5\4\3\17_`\b\3\1"+
		"\2`\u0086\3\2\2\2ab\f\r\2\2bc\7\f\2\2cd\5\4\3\16de\b\3\1\2e\u0086\3\2"+
		"\2\2fg\f\f\2\2gh\7\r\2\2hi\5\4\3\rij\b\3\1\2j\u0086\3\2\2\2kl\f\13\2\2"+
		"lm\7\16\2\2mn\5\4\3\fno\b\3\1\2o\u0086\3\2\2\2pq\f\n\2\2qr\7\17\2\2rs"+
		"\5\4\3\13st\b\3\1\2t\u0086\3\2\2\2uv\f\t\2\2vw\7\20\2\2wx\5\4\3\nxy\b"+
		"\3\1\2y\u0086\3\2\2\2z{\f\b\2\2{|\7\21\2\2|}\5\4\3\t}~\b\3\1\2~\u0086"+
		"\3\2\2\2\177\u0080\f\4\2\2\u0080\u0081\7\24\2\2\u0081\u0082\5\4\3\2\u0082"+
		"\u0083\7\25\2\2\u0083\u0084\b\3\1\2\u0084\u0086\3\2\2\2\u0085C\3\2\2\2"+
		"\u0085H\3\2\2\2\u0085M\3\2\2\2\u0085R\3\2\2\2\u0085W\3\2\2\2\u0085\\\3"+
		"\2\2\2\u0085a\3\2\2\2\u0085f\3\2\2\2\u0085k\3\2\2\2\u0085p\3\2\2\2\u0085"+
		"u\3\2\2\2\u0085z\3\2\2\2\u0085\177\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\5\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u0090\7\31\2\2\u008b\u008c\5\4\3\2\u008c\u008d\b\4\1\2\u008d\u008f\3"+
		"\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\32"+
		"\2\2\u0094\7\3\2\2\2\u0095\u0096\7\33\2\2\u0096\u009e\b\5\1\2\u0097\u0098"+
		"\7\34\2\2\u0098\u009e\b\5\1\2\u0099\u009a\7\35\2\2\u009a\u009b\5\b\5\2"+
		"\u009b\u009c\b\5\1\2\u009c\u009e\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0097"+
		"\3\2\2\2\u009d\u0099\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a0\b\6\1\2\u00a0"+
		"\u00a1\7\'\2\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5"+
		"\4\3\2\u00a4\u00a5\b\6\1\2\u00a5\u00cc\3\2\2\2\u00a6\u00a7\5\4\3\2\u00a7"+
		"\u00a8\7\24\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\7"+
		"\36\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\b\6\1\2\u00ae"+
		"\u00cc\3\2\2\2\u00af\u00b0\7\37\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2\7"+
		" \2\2\u00b2\u00b3\5\n\6\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\5\n\6\t\u00b5"+
		"\u00b6\b\6\1\2\u00b6\u00cc\3\2\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\5\4"+
		"\3\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\5\n\6\b\u00bb\u00bc\b\6\1\2\u00bc"+
		"\u00cc\3\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\b"+
		"\6\1\2\u00c0\u00cc\3\2\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c3\5\6\4\2\u00c3"+
		"\u00c4\b\6\1\2\u00c4\u00cc\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6\u00c7\5\6"+
		"\4\2\u00c7\u00c8\b\6\1\2\u00c8\u00cc\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca"+
		"\u00cc\b\6\1\2\u00cb\u009f\3\2\2\2\u00cb\u00a6\3\2\2\2\u00cb\u00af\3\2"+
		"\2\2\u00cb\u00b7\3\2\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d4\3\2\2\2\u00cd\u00ce\f\3"+
		"\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\5\n\6\4\u00d0\u00d1\b\6\1\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\13\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\7\'\2\2\u00d8\u00da\7\31\2\2\u00d9\u00db\5\22\n\2\u00da\u00d9\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\32\2\2\u00dd\u00de"+
		"\7\36\2\2\u00de\u00e1\5\b\5\2\u00df\u00e0\7&\2\2\u00e0\u00e2\5\22\n\2"+
		"\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\5\n\6\2\u00e4\u00e5\b\7\1\2\u00e5\r\3\2\2\2\u00e6\u00e7\5\f\7\2\u00e7"+
		"\u00e8\b\b\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\17\3\2\2\2\u00ed\u00ee"+
		"\7&\2\2\u00ee\u00f0\5\22\n\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00f3\5\16\b\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\5\n\6\2\u00f5\u00f6\b\t\1\2\u00f6"+
		"\21\3\2\2\2\u00f7\u00f8\5\24\13\2\u00f8\u00f9\b\n\1\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\23\3\2\2\2\u00fe\u00ff\7\'\2\2\u00ff\u0100\7\36\2"+
		"\2\u0100\u0101\5\b\5\2\u0101\u0102\b\13\1\2\u0102\25\3\2\2\2\20\34A\u0085"+
		"\u0087\u0090\u009d\u00cb\u00d4\u00da\u00e1\u00eb\u00ef\u00f2\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}