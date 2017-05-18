// Generated from /home/tigler/IdeaProjects/Plagiat/grammars/Java.g4 by ANTLR 4.7
package parsers.Java;

import events.EventParser;
import events.ListenerParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
    private ListenerParser listener;
    private String path;

    public void attach(ListenerParser listener) {
        this.listener = listener;
    }

    public void setPath(String path) {
        this.path = path;
    }

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, CATCH = 7, CHAR = 8,
            CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, DO = 13, DOUBLE = 14, ELSE = 15,
            ENUM = 16, EXTENDS = 17, FINAL = 18, FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23,
            IMPLEMENTS = 24, IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29,
            NATIVE = 30, NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36,
            SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42,
            THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, VOLATILE = 49,
            WHILE = 50, IntegerLiteral = 51, FloatingPointLiteral = 52, BooleanLiteral = 53,
            CharacterLiteral = 54, StringLiteral = 55, NullLiteral = 56, LPAREN = 57, RPAREN = 58,
            LBRACE = 59, RBRACE = 60, LBRACK = 61, RBRACK = 62, SEMI = 63, COMMA = 64, DOT = 65,
            ASSIGN = 66, GT = 67, LT = 68, BANG = 69, TILDE = 70, QUESTION = 71, COLON = 72, EQUAL = 73,
            LE = 74, GE = 75, NOTEQUAL = 76, AND = 77, OR = 78, INC = 79, DEC = 80, ADD = 81, SUB = 82,
            MUL = 83, DIV = 84, BITAND = 85, BITOR = 86, CARET = 87, MOD = 88, ADD_ASSIGN = 89,
            SUB_ASSIGN = 90, MUL_ASSIGN = 91, DIV_ASSIGN = 92, AND_ASSIGN = 93, OR_ASSIGN = 94,
            XOR_ASSIGN = 95, MOD_ASSIGN = 96, LSHIFT_ASSIGN = 97, RSHIFT_ASSIGN = 98, URSHIFT_ASSIGN = 99,
            Identifier = 100, AT = 101, ELLIPSIS = 102, WS = 103, COMMENT = 104, LINE_COMMENT = 105;
    public static final int
            RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2,
            RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5,
            RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8,
            RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11,
            RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14,
            RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17,
            RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20,
            RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23,
            RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_interfaceBodyDeclaration = 26,
            RULE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29,
            RULE_interfaceMethodDeclaration = 30, RULE_genericInterfaceMethodDeclaration = 31,
            RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34,
            RULE_variableInitializer = 35, RULE_arrayInitializer = 36, RULE_enumConstantName = 37,
            RULE_typeType = 38, RULE_classOrInterfaceType = 39, RULE_primitiveType = 40,
            RULE_typeArguments = 41, RULE_typeArgument = 42, RULE_qualifiedNameList = 43,
            RULE_formalParameters = 44, RULE_formalParameterList = 45, RULE_formalParameter = 46,
            RULE_lastFormalParameter = 47, RULE_methodBody = 48, RULE_constructorBody = 49,
            RULE_qualifiedName = 50, RULE_literal = 51, RULE_annotation = 52, RULE_annotationName = 53,
            RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56,
            RULE_elementValueArrayInitializer = 57, RULE_annotationTypeDeclaration = 58,
            RULE_annotationTypeBody = 59, RULE_annotationTypeElementDeclaration = 60,
            RULE_annotationTypeElementRest = 61, RULE_annotationMethodOrConstantRest = 62,
            RULE_annotationMethodRest = 63, RULE_annotationConstantRest = 64, RULE_defaultValue = 65,
            RULE_block = 66, RULE_blockStatement = 67, RULE_localVariableDeclarationStatement = 68,
            RULE_localVariableDeclaration = 69, RULE_statement = 70, RULE_catchClause = 71,
            RULE_catchType = 72, RULE_finallyBlock = 73, RULE_resourceSpecification = 74,
            RULE_resources = 75, RULE_resource = 76, RULE_switchBlockStatementGroup = 77,
            RULE_switchLabel = 78, RULE_forControl = 79, RULE_forInit = 80, RULE_enhancedForControl = 81,
            RULE_forUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84,
            RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87,
            RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91,
            RULE_arrayCreatorRest = 92, RULE_classCreatorRest = 93, RULE_explicitGenericInvocation = 94,
            RULE_nonWildcardTypeArguments = 95, RULE_typeArgumentsOrDiamond = 96,
            RULE_nonWildcardTypeArgumentsOrDiamond = 97, RULE_superSuffix = 98, RULE_explicitGenericInvocationSuffix = 99,
            RULE_arguments = 100, RULE_comment = 101;
    public static final String[] ruleNames = {
            "compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration",
            "modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration",
            "typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants",
            "enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList",
            "classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration",
            "methodDeclaration", "genericMethodDeclaration", "constructorDeclaration",
            "genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration",
            "interfaceMemberDeclaration", "constDeclaration", "constantDeclarator",
            "interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators",
            "variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer",
            "enumConstantName", "typeType", "classOrInterfaceType", "primitiveType",
            "typeArguments", "typeArgument", "qualifiedNameList", "formalParameters",
            "formalParameterList", "formalParameter", "lastFormalParameter", "methodBody",
            "constructorBody", "qualifiedName", "literal", "annotation", "annotationName",
            "elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer",
            "annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration",
            "annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest",
            "annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableDeclarationStatement",
            "localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock",
            "resourceSpecification", "resources", "resource", "switchBlockStatementGroup",
            "switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate",
            "parExpression", "expressionList", "statementExpression", "constantExpression",
            "expression", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest",
            "classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments",
            "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix",
            "explicitGenericInvocationSuffix", "arguments", "comment"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'",
            "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'",
            "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'",
            "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'",
            "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'",
            "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'",
            "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'",
            "'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null,
            null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'",
            "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'",
            "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'",
            "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='",
            "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null,
            "'@'", "'...'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
            "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE",
            "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS",
            "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE",
            "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP",
            "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
            "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral",
            "BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral",
            "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA",
            "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL",
            "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL",
            "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN",
            "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN",
            "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT",
            "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
    public String getGrammarFileName() {
        return "Java.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public JavaParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class CompilationUnitContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(JavaParser.EOF, 0);
        }

        public PackageDeclarationContext packageDeclaration() {
            return getRuleContext(PackageDeclarationContext.class, 0);
        }

        public List<ImportDeclarationContext> importDeclaration() {
            return getRuleContexts(ImportDeclarationContext.class);
        }

        public ImportDeclarationContext importDeclaration(int i) {
            return getRuleContext(ImportDeclarationContext.class, i);
        }

        public List<TypeDeclarationContext> typeDeclaration() {
            return getRuleContexts(TypeDeclarationContext.class);
        }

        public TypeDeclarationContext typeDeclaration(int i) {
            return getRuleContext(TypeDeclarationContext.class, i);
        }

        public List<CommentContext> comment() {
            return getRuleContexts(CommentContext.class);
        }

        public CommentContext comment(int i) {
            return getRuleContext(CommentContext.class, i);
        }

        public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compilationUnit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterCompilationUnit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitCompilationUnit(this);
        }
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(205);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                    case 1: {
                        setState(204);
                        packageDeclaration();
                    }
                    break;
                }
                setState(210);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(207);
                                importDeclaration();
                            }
                        }
                    }
                    setState(212);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(216);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la == AT) {
                    {
                        {
                            setState(213);
                            typeDeclaration();
                        }
                    }
                    setState(218);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(222);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMENT || _la == LINE_COMMENT) {
                    {
                        {
                            setState(219);
                            comment();
                        }
                    }
                    setState(224);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(225);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PackageDeclarationContext extends ParserRuleContext {
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<CommentContext> comment() {
            return getRuleContexts(CommentContext.class);
        }

        public CommentContext comment(int i) {
            return getRuleContext(CommentContext.class, i);
        }

        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }

        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class, i);
        }

        public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_packageDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterPackageDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitPackageDeclaration(this);
        }
    }

    public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
        PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_packageDeclaration);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(230);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMENT || _la == LINE_COMMENT) {
                    {
                        {
                            setState(227);
                            comment();
                        }
                    }
                    setState(232);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(236);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AT) {
                    {
                        {
                            setState(233);
                            annotation();
                        }
                    }
                    setState(238);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(239);
                match(PACKAGE);
                setState(240);
                qualifiedName();
                setState(241);
                match(SEMI);
                setState(245);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(242);
                                comment();
                            }
                        }
                    }
                    setState(247);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ImportDeclarationContext extends ParserRuleContext {
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<CommentContext> comment() {
            return getRuleContexts(CommentContext.class);
        }

        public CommentContext comment(int i) {
            return getRuleContext(CommentContext.class, i);
        }

        public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterImportDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitImportDeclaration(this);
        }
    }

    public final ImportDeclarationContext importDeclaration() throws RecognitionException {
        ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_importDeclaration);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(251);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMENT || _la == LINE_COMMENT) {
                    {
                        {
                            setState(248);
                            comment();
                        }
                    }
                    setState(253);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(254);
                match(IMPORT);
                setState(256);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == STATIC) {
                    {
                        setState(255);
                        match(STATIC);
                    }
                }

                setState(258);
                qualifiedName();
                setState(261);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DOT) {
                    {
                        setState(259);
                        match(DOT);
                        setState(260);
                        match(MUL);
                    }
                }

                setState(263);
                match(SEMI);
                setState(267);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(264);
                                comment();
                            }
                        }
                    }
                    setState(269);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeDeclarationContext extends ParserRuleContext {
        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
            return getRuleContexts(ClassOrInterfaceModifierContext.class);
        }

        public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
            return getRuleContext(ClassOrInterfaceModifierContext.class, i);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeDeclaration(this);
        }
    }

    public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
        TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_typeDeclaration);
        int _la;
        try {
            int _alt;
            setState(299);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(273);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
                        {
                            {
                                setState(270);
                                classOrInterfaceModifier();
                            }
                        }
                        setState(275);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(276);
                    classDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(280);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
                        {
                            {
                                setState(277);
                                classOrInterfaceModifier();
                            }
                        }
                        setState(282);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(283);
                    enumDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(287);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
                        {
                            {
                                setState(284);
                                classOrInterfaceModifier();
                            }
                        }
                        setState(289);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(290);
                    interfaceDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(294);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(291);
                                    classOrInterfaceModifier();
                                }
                            }
                        }
                        setState(296);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                    }
                    setState(297);
                    annotationTypeDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(298);
                    match(SEMI);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ModifierContext extends ParserRuleContext {
        public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
            return getRuleContext(ClassOrInterfaceModifierContext.class, 0);
        }

        public ModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitModifier(this);
        }
    }

    public final ModifierContext modifier() throws RecognitionException {
        ModifierContext _localctx = new ModifierContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_modifier);
        int _la;
        try {
            setState(303);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case FINAL:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case STRICTFP:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(301);
                    classOrInterfaceModifier();
                }
                break;
                case NATIVE:
                case SYNCHRONIZED:
                case TRANSIENT:
                case VOLATILE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(302);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0))) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classOrInterfaceModifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterClassOrInterfaceModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitClassOrInterfaceModifier(this);
        }
    }

    public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
        ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
        int _la;
        try {
            setState(307);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(305);
                    annotation();
                }
                break;
                case ABSTRACT:
                case FINAL:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case STRICTFP:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(306);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0))) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableModifierContext extends ParserRuleContext {
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        public VariableModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableModifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableModifier(this);
        }
    }

    public final VariableModifierContext variableModifier() throws RecognitionException {
        VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_variableModifier);
        try {
            setState(311);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FINAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(309);
                    match(FINAL);
                }
                break;
                case AT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(310);
                    annotation();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassDeclarationContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterClassDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitClassDeclaration(this);
        }
    }

    public final ClassDeclarationContext classDeclaration() throws RecognitionException {
        ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_classDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(313);
                match(CLASS);
                setState(314);
                match(Identifier);
                setState(316);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(315);
                        typeParameters();
                    }
                }

                setState(320);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EXTENDS) {
                    {
                        setState(318);
                        match(EXTENDS);
                        setState(319);
                        typeType();
                    }
                }

                setState(324);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IMPLEMENTS) {
                    {
                        setState(322);
                        match(IMPLEMENTS);
                        setState(323);
                        typeList();
                    }
                }

                setState(326);
                classBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeParametersContext extends ParserRuleContext {
        public List<TypeParameterContext> typeParameter() {
            return getRuleContexts(TypeParameterContext.class);
        }

        public TypeParameterContext typeParameter(int i) {
            return getRuleContext(TypeParameterContext.class, i);
        }

        public TypeParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeParameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeParameters(this);
        }
    }

    public final TypeParametersContext typeParameters() throws RecognitionException {
        TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_typeParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(328);
                match(LT);
                setState(329);
                typeParameter();
                setState(334);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(330);
                            match(COMMA);
                            setState(331);
                            typeParameter();
                        }
                    }
                    setState(336);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(337);
                match(GT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeParameterContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public TypeBoundContext typeBound() {
            return getRuleContext(TypeBoundContext.class, 0);
        }

        public TypeParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeParameter(this);
        }
    }

    public final TypeParameterContext typeParameter() throws RecognitionException {
        TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_typeParameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(339);
                match(Identifier);
                setState(342);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EXTENDS) {
                    {
                        setState(340);
                        match(EXTENDS);
                        setState(341);
                        typeBound();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeBoundContext extends ParserRuleContext {
        public List<TypeTypeContext> typeType() {
            return getRuleContexts(TypeTypeContext.class);
        }

        public TypeTypeContext typeType(int i) {
            return getRuleContext(TypeTypeContext.class, i);
        }

        public TypeBoundContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeBound;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeBound(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeBound(this);
        }
    }

    public final TypeBoundContext typeBound() throws RecognitionException {
        TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_typeBound);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(344);
                typeType();
                setState(349);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == BITAND) {
                    {
                        {
                            setState(345);
                            match(BITAND);
                            setState(346);
                            typeType();
                        }
                    }
                    setState(351);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumDeclarationContext extends ParserRuleContext {
        public TerminalNode ENUM() {
            return getToken(JavaParser.ENUM, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        public EnumConstantsContext enumConstants() {
            return getRuleContext(EnumConstantsContext.class, 0);
        }

        public EnumBodyDeclarationsContext enumBodyDeclarations() {
            return getRuleContext(EnumBodyDeclarationsContext.class, 0);
        }

        public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumDeclaration(this);
        }
    }

    public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
        EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_enumDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(352);
                match(ENUM);
                setState(353);
                match(Identifier);
                setState(356);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IMPLEMENTS) {
                    {
                        setState(354);
                        match(IMPLEMENTS);
                        setState(355);
                        typeList();
                    }
                }

                setState(358);
                match(LBRACE);
                setState(360);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier || _la == AT) {
                    {
                        setState(359);
                        enumConstants();
                    }
                }

                setState(363);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(362);
                        match(COMMA);
                    }
                }

                setState(366);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SEMI) {
                    {
                        setState(365);
                        enumBodyDeclarations();
                    }
                }

                setState(368);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumConstantsContext extends ParserRuleContext {
        public List<EnumConstantContext> enumConstant() {
            return getRuleContexts(EnumConstantContext.class);
        }

        public EnumConstantContext enumConstant(int i) {
            return getRuleContext(EnumConstantContext.class, i);
        }

        public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumConstants;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumConstants(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumConstants(this);
        }
    }

    public final EnumConstantsContext enumConstants() throws RecognitionException {
        EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_enumConstants);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(370);
                enumConstant();
                setState(375);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(371);
                                match(COMMA);
                                setState(372);
                                enumConstant();
                            }
                        }
                    }
                    setState(377);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumConstantContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }

        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class, i);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class, 0);
        }

        public EnumConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumConstant;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumConstant(this);
        }
    }

    public final EnumConstantContext enumConstant() throws RecognitionException {
        EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_enumConstant);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(381);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AT) {
                    {
                        {
                            setState(378);
                            annotation();
                        }
                    }
                    setState(383);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(384);
                match(Identifier);
                setState(386);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(385);
                        arguments();
                    }
                }

                setState(389);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LBRACE) {
                    {
                        setState(388);
                        classBody();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumBodyDeclarationsContext extends ParserRuleContext {
        public List<ClassBodyDeclarationContext> classBodyDeclaration() {
            return getRuleContexts(ClassBodyDeclarationContext.class);
        }

        public ClassBodyDeclarationContext classBodyDeclaration(int i) {
            return getRuleContext(ClassBodyDeclarationContext.class, i);
        }

        public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumBodyDeclarations;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumBodyDeclarations(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumBodyDeclarations(this);
        }
    }

    public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
        EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_enumBodyDeclarations);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(391);
                match(SEMI);
                setState(395);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)) | (1L << (COMMENT - 68)) | (1L << (LINE_COMMENT - 68)))) != 0)) {
                    {
                        {
                            setState(392);
                            classBodyDeclaration();
                        }
                    }
                    setState(397);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceDeclarationContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public InterfaceBodyContext interfaceBody() {
            return getRuleContext(InterfaceBodyContext.class, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterInterfaceDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitInterfaceDeclaration(this);
        }
    }

    public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
        InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_interfaceDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(398);
                match(INTERFACE);
                setState(399);
                match(Identifier);
                setState(401);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(400);
                        typeParameters();
                    }
                }

                setState(405);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EXTENDS) {
                    {
                        setState(403);
                        match(EXTENDS);
                        setState(404);
                        typeList();
                    }
                }

                setState(407);
                interfaceBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeListContext extends ParserRuleContext {
        public List<TypeTypeContext> typeType() {
            return getRuleContexts(TypeTypeContext.class);
        }

        public TypeTypeContext typeType(int i) {
            return getRuleContext(TypeTypeContext.class, i);
        }

        public TypeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeList(this);
        }
    }

    public final TypeListContext typeList() throws RecognitionException {
        TypeListContext _localctx = new TypeListContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_typeList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(409);
                typeType();
                setState(414);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(410);
                            match(COMMA);
                            setState(411);
                            typeType();
                        }
                    }
                    setState(416);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassBodyContext extends ParserRuleContext {
        public List<ClassBodyDeclarationContext> classBodyDeclaration() {
            return getRuleContexts(ClassBodyDeclarationContext.class);
        }

        public ClassBodyDeclarationContext classBodyDeclaration(int i) {
            return getRuleContext(ClassBodyDeclarationContext.class, i);
        }

        public ClassBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterClassBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitClassBody(this);
        }
    }

    public final ClassBodyContext classBody() throws RecognitionException {
        ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_classBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(417);
                match(LBRACE);
                setState(421);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)) | (1L << (COMMENT - 68)) | (1L << (LINE_COMMENT - 68)))) != 0)) {
                    {
                        {
                            setState(418);
                            classBodyDeclaration();
                        }
                    }
                    setState(423);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(424);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceBodyContext extends ParserRuleContext {
        public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
            return getRuleContexts(InterfaceBodyDeclarationContext.class);
        }

        public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
            return getRuleContext(InterfaceBodyDeclarationContext.class, i);
        }

        public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterInterfaceBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitInterfaceBody(this);
        }
    }

    public final InterfaceBodyContext interfaceBody() throws RecognitionException {
        InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_interfaceBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                match(LBRACE);
                setState(430);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
                    {
                        {
                            setState(427);
                            interfaceBodyDeclaration();
                        }
                    }
                    setState(432);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(433);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassBodyDeclarationContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public MemberDeclarationContext memberDeclaration() {
            return getRuleContext(MemberDeclarationContext.class, 0);
        }

        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }

        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class, i);
        }

        public CommentContext comment() {
            return getRuleContext(CommentContext.class, 0);
        }

        public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classBodyDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterClassBodyDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitClassBodyDeclaration(this);
        }
    }

    public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
        ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_classBodyDeclaration);
        int _la;
        try {
            int _alt;
            setState(448);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(435);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(437);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == STATIC) {
                        {
                            setState(436);
                            match(STATIC);
                        }
                    }

                    setState(439);
                    block();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(443);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(440);
                                    modifier();
                                }
                            }
                        }
                        setState(445);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
                    }
                    setState(446);
                    memberDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(447);
                    comment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MemberDeclarationContext extends ParserRuleContext {
        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class, 0);
        }

        public GenericMethodDeclarationContext genericMethodDeclaration() {
            return getRuleContext(GenericMethodDeclarationContext.class, 0);
        }

        public FieldDeclarationContext fieldDeclaration() {
            return getRuleContext(FieldDeclarationContext.class, 0);
        }

        public ConstructorDeclarationContext constructorDeclaration() {
            return getRuleContext(ConstructorDeclarationContext.class, 0);
        }

        public GenericConstructorDeclarationContext genericConstructorDeclaration() {
            return getRuleContext(GenericConstructorDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_memberDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMemberDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMemberDeclaration(this);
        }
    }

    public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
        MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_memberDeclaration);
        try {
            setState(459);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(450);
                    methodDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(451);
                    genericMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(452);
                    fieldDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(453);
                    constructorDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(454);
                    genericConstructorDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(455);
                    interfaceDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(456);
                    annotationTypeDeclaration();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(457);
                    classDeclaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(458);
                    enumDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodDeclarationContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class, 0);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public MethodBodyContext methodBody() {
            return getRuleContext(MethodBodyContext.class, 0);
        }

        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class, 0);
        }

        public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodDeclaration(this);
        }
    }

    public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
        MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_methodDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(463);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                    case Identifier: {
                        setState(461);
                        typeType();
                        listener.onEvent(new EventParser("func", EventParser.FUNC_START, _localctx.start.getLine(), path));
                    }
                    break;
                    case VOID: {
                        setState(462);
                        match(VOID);
                        listener.onEvent(new EventParser("func", EventParser.FUNC_START, _localctx.start.getLine(), path));
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(465);
                match(Identifier);
                setState(466);
                formalParameters();
                setState(471);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(467);
                            match(LBRACK);
                            setState(468);
                            match(RBRACK);
                        }
                    }
                    setState(473);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(476);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == THROWS) {
                    {
                        setState(474);
                        match(THROWS);
                        setState(475);
                        qualifiedNameList();
                    }
                }

                setState(480);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case LBRACE: {
                        setState(478);
                        methodBody();
                        listener.onEvent(new EventParser("func", EventParser.FUNC_END, _localctx.start.getLine(), path));
                    }
                    break;
                    case SEMI: {
                        setState(479);
                        match(SEMI);
                        listener.onEvent(new EventParser("func", EventParser.FUNC_END, _localctx.start.getLine(), path));
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GenericMethodDeclarationContext extends ParserRuleContext {
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class, 0);
        }

        public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericMethodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterGenericMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitGenericMethodDeclaration(this);
        }
    }

    public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
        GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_genericMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(482);
                typeParameters();
                setState(483);
                methodDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstructorDeclarationContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class, 0);
        }

        public ConstructorBodyContext constructorBody() {
            return getRuleContext(ConstructorBodyContext.class, 0);
        }

        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class, 0);
        }

        public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constructorDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterConstructorDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitConstructorDeclaration(this);
        }
    }

    public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
        ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_constructorDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(485);
                match(Identifier);
                setState(486);
                formalParameters();
                setState(489);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == THROWS) {
                    {
                        setState(487);
                        match(THROWS);
                        setState(488);
                        qualifiedNameList();
                    }
                }

                setState(491);
                constructorBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GenericConstructorDeclarationContext extends ParserRuleContext {
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public ConstructorDeclarationContext constructorDeclaration() {
            return getRuleContext(ConstructorDeclarationContext.class, 0);
        }

        public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericConstructorDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterGenericConstructorDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitGenericConstructorDeclaration(this);
        }
    }

    public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
        GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(493);
                typeParameters();
                setState(494);
                constructorDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FieldDeclarationContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterFieldDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitFieldDeclaration(this);
        }
    }

    public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
        FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_fieldDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(496);
                typeType();
                setState(497);
                variableDeclarators();
                setState(498);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
        public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
            return getRuleContext(InterfaceMemberDeclarationContext.class, 0);
        }

        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }

        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class, i);
        }

        public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceBodyDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterInterfaceBodyDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitInterfaceBodyDeclaration(this);
        }
    }

    public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
        InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_interfaceBodyDeclaration);
        try {
            int _alt;
            setState(508);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case CLASS:
                case DOUBLE:
                case ENUM:
                case FINAL:
                case FLOAT:
                case INT:
                case INTERFACE:
                case LONG:
                case NATIVE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case SHORT:
                case STATIC:
                case STRICTFP:
                case SYNCHRONIZED:
                case TRANSIENT:
                case VOID:
                case VOLATILE:
                case LT:
                case Identifier:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(503);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(500);
                                    modifier();
                                }
                            }
                        }
                        setState(505);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                    }
                    setState(506);
                    interfaceMemberDeclaration();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(507);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
        public ConstDeclarationContext constDeclaration() {
            return getRuleContext(ConstDeclarationContext.class, 0);
        }

        public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
            return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
        }

        public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
            return getRuleContext(GenericInterfaceMethodDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceMemberDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterInterfaceMemberDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitInterfaceMemberDeclaration(this);
        }
    }

    public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
        InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_interfaceMemberDeclaration);
        try {
            setState(517);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(510);
                    constDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(511);
                    interfaceMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(512);
                    genericInterfaceMethodDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(513);
                    interfaceDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(514);
                    annotationTypeDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(515);
                    classDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(516);
                    enumDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstDeclarationContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public List<ConstantDeclaratorContext> constantDeclarator() {
            return getRuleContexts(ConstantDeclaratorContext.class);
        }

        public ConstantDeclaratorContext constantDeclarator(int i) {
            return getRuleContext(ConstantDeclaratorContext.class, i);
        }

        public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterConstDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitConstDeclaration(this);
        }
    }

    public final ConstDeclarationContext constDeclaration() throws RecognitionException {
        ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_constDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(519);
                typeType();
                setState(520);
                constantDeclarator();
                setState(525);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(521);
                            match(COMMA);
                            setState(522);
                            constantDeclarator();
                        }
                    }
                    setState(527);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(528);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstantDeclaratorContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constantDeclarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterConstantDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitConstantDeclarator(this);
        }
    }

    public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
        ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_constantDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(530);
                match(Identifier);
                setState(535);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(531);
                            match(LBRACK);
                            setState(532);
                            match(RBRACK);
                        }
                    }
                    setState(537);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(538);
                match(ASSIGN);
                setState(539);
                variableInitializer();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class, 0);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class, 0);
        }

        public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interfaceMethodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterInterfaceMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitInterfaceMethodDeclaration(this);
        }
    }

    public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
        InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(543);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                    case Identifier: {
                        setState(541);
                        typeType();
                    }
                    break;
                    case VOID: {
                        setState(542);
                        match(VOID);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(545);
                match(Identifier);
                setState(546);
                formalParameters();
                setState(551);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(547);
                            match(LBRACK);
                            setState(548);
                            match(RBRACK);
                        }
                    }
                    setState(553);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(556);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == THROWS) {
                    {
                        setState(554);
                        match(THROWS);
                        setState(555);
                        qualifiedNameList();
                    }
                }

                setState(558);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
            return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
        }

        public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericInterfaceMethodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener)
                ((JavaListener) listener).enterGenericInterfaceMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitGenericInterfaceMethodDeclaration(this);
        }
    }

    public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
        GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(560);
                typeParameters();
                setState(561);
                interfaceMethodDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclaratorsContext extends ParserRuleContext {
        public List<VariableDeclaratorContext> variableDeclarator() {
            return getRuleContexts(VariableDeclaratorContext.class);
        }

        public VariableDeclaratorContext variableDeclarator(int i) {
            return getRuleContext(VariableDeclaratorContext.class, i);
        }

        public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableDeclarators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableDeclarators(this);
        }
    }

    public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
        VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_variableDeclarators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(563);
                variableDeclarator();
                setState(568);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(564);
                            match(COMMA);
                            setState(565);
                            variableDeclarator();
                        }
                    }
                    setState(570);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclaratorContext extends ParserRuleContext {
        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableDeclarator(this);
        }
    }

    public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
        VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_variableDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(571);
                variableDeclaratorId();
                setState(574);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASSIGN) {
                    {
                        setState(572);
                        match(ASSIGN);
                        listener.onEvent(new EventParser("=", EventParser.ASSIGMENT, _localctx.start.getLine(),
                                _localctx.start.getTokenSource().getSourceName()));
                        setState(573);
                        variableInitializer();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclaratorIdContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaratorId;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableDeclaratorId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableDeclaratorId(this);
        }
    }

    public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
        VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_variableDeclaratorId);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(576);
                match(Identifier);
                setState(581);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LBRACK) {
                    {
                        {
                            setState(577);
                            match(LBRACK);
                            setState(578);
                            match(RBRACK);
                        }
                    }
                    setState(583);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableInitializerContext extends ParserRuleContext {
        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableInitializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableInitializer(this);
        }
    }

    public final VariableInitializerContext variableInitializer() throws RecognitionException {
        VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_variableInitializer);
        try {
            setState(586);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(584);
                    arrayInitializer();
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case NEW:
                case SHORT:
                case SUPER:
                case THIS:
                case VOID:
                case IntegerLiteral:
                case FloatingPointLiteral:
                case BooleanLiteral:
                case CharacterLiteral:
                case StringLiteral:
                case NullLiteral:
                case LPAREN:
                case LT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case ADD:
                case SUB:
                case Identifier:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(585);
                    expression(0);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayInitializerContext extends ParserRuleContext {
        public List<VariableInitializerContext> variableInitializer() {
            return getRuleContexts(VariableInitializerContext.class);
        }

        public VariableInitializerContext variableInitializer(int i) {
            return getRuleContext(VariableInitializerContext.class, i);
        }

        public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayInitializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayInitializer(this);
        }
    }

    public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
        ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_arrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(588);
                match(LBRACE);
                setState(600);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
                    {
                        setState(589);
                        variableInitializer();
                        setState(594);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(590);
                                        match(COMMA);
                                        setState(591);
                                        variableInitializer();
                                    }
                                }
                            }
                            setState(596);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
                        }
                        setState(598);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA) {
                            {
                                setState(597);
                                match(COMMA);
                            }
                        }

                    }
                }

                setState(602);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumConstantNameContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumConstantName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterEnumConstantName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitEnumConstantName(this);
        }
    }

    public final EnumConstantNameContext enumConstantName() throws RecognitionException {
        EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_enumConstantName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(604);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeTypeContext extends ParserRuleContext {
        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
        }

        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public TypeTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeType(this);
        }
    }

    public final TypeTypeContext typeType() throws RecognitionException {
        TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_typeType);
        try {
            int _alt;
            setState(622);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(606);
                    classOrInterfaceType();
                    setState(611);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 63, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(607);
                                    match(LBRACK);
                                    setState(608);
                                    match(RBRACK);
                                }
                            }
                        }
                        setState(613);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 63, _ctx);
                    }
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(614);
                    primitiveType();
                    setState(619);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 64, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(615);
                                    match(LBRACK);
                                    setState(616);
                                    match(RBRACK);
                                }
                            }
                        }
                        setState(621);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 64, _ctx);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public List<TypeArgumentsContext> typeArguments() {
            return getRuleContexts(TypeArgumentsContext.class);
        }

        public TypeArgumentsContext typeArguments(int i) {
            return getRuleContext(TypeArgumentsContext.class, i);
        }

        public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classOrInterfaceType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterClassOrInterfaceType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitClassOrInterfaceType(this);
        }
    }

    public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
        ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_classOrInterfaceType);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(624);
                match(Identifier);
                setState(626);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 66, _ctx)) {
                    case 1: {
                        setState(625);
                        typeArguments();
                    }
                    break;
                }
                setState(635);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(628);
                                match(DOT);
                                setState(629);
                                match(Identifier);
                                setState(631);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 67, _ctx)) {
                                    case 1: {
                                        setState(630);
                                        typeArguments();
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    setState(637);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrimitiveTypeContext extends ParserRuleContext {
        public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primitiveType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterPrimitiveType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitPrimitiveType(this);
        }
    }

    public final PrimitiveTypeContext primitiveType() throws RecognitionException {
        PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_primitiveType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(638);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeArgumentsContext extends ParserRuleContext {
        public List<TypeArgumentContext> typeArgument() {
            return getRuleContexts(TypeArgumentContext.class);
        }

        public TypeArgumentContext typeArgument(int i) {
            return getRuleContext(TypeArgumentContext.class, i);
        }

        public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeArguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeArguments(this);
        }
    }

    public final TypeArgumentsContext typeArguments() throws RecognitionException {
        TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_typeArguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(640);
                match(LT);
                setState(641);
                typeArgument();
                setState(646);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(642);
                            match(COMMA);
                            setState(643);
                            typeArgument();
                        }
                    }
                    setState(648);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(649);
                match(GT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeArgumentContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeArgument;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeArgument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeArgument(this);
        }
    }

    public final TypeArgumentContext typeArgument() throws RecognitionException {
        TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_typeArgument);
        int _la;
        try {
            setState(657);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(651);
                    typeType();
                }
                break;
                case QUESTION:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(652);
                    match(QUESTION);
                    setState(655);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == EXTENDS || _la == SUPER) {
                        {
                            setState(653);
                            _la = _input.LA(1);
                            if (!(_la == EXTENDS || _la == SUPER)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(654);
                            typeType();
                        }
                    }

                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QualifiedNameListContext extends ParserRuleContext {
        public List<QualifiedNameContext> qualifiedName() {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i) {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualifiedNameList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterQualifiedNameList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitQualifiedNameList(this);
        }
    }

    public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
        QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_qualifiedNameList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(659);
                qualifiedName();
                setState(664);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(660);
                            match(COMMA);
                            setState(661);
                            qualifiedName();
                        }
                    }
                    setState(666);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FormalParametersContext extends ParserRuleContext {
        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class, 0);
        }

        public FormalParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterFormalParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitFormalParameters(this);
        }
    }

    public final FormalParametersContext formalParameters() throws RecognitionException {
        FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_formalParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(667);
                match(LPAREN);
                setState(669);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la == Identifier || _la == AT) {
                    {
                        setState(668);
                        formalParameterList();
                    }
                }

                setState(671);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FormalParameterListContext extends ParserRuleContext {
        public List<FormalParameterContext> formalParameter() {
            return getRuleContexts(FormalParameterContext.class);
        }

        public FormalParameterContext formalParameter(int i) {
            return getRuleContext(FormalParameterContext.class, i);
        }

        public LastFormalParameterContext lastFormalParameter() {
            return getRuleContext(LastFormalParameterContext.class, 0);
        }

        public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameterList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterFormalParameterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitFormalParameterList(this);
        }
    }

    public final FormalParameterListContext formalParameterList() throws RecognitionException {
        FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_formalParameterList);
        int _la;
        try {
            int _alt;
            setState(686);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(673);
                    formalParameter();
                    setState(678);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 74, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(674);
                                    match(COMMA);
                                    setState(675);
                                    formalParameter();
                                }
                            }
                        }
                        setState(680);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 74, _ctx);
                    }
                    setState(683);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(681);
                            match(COMMA);
                            setState(682);
                            lastFormalParameter();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(685);
                    lastFormalParameter();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FormalParameterContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        public FormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterFormalParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitFormalParameter(this);
        }
    }

    public final FormalParameterContext formalParameter() throws RecognitionException {
        FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_formalParameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(691);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(688);
                            variableModifier();
                        }
                    }
                    setState(693);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(694);
                typeType();
                setState(695);
                variableDeclaratorId();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LastFormalParameterContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lastFormalParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterLastFormalParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitLastFormalParameter(this);
        }
    }

    public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
        LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_lastFormalParameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(700);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(697);
                            variableModifier();
                        }
                    }
                    setState(702);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(703);
                typeType();
                setState(704);
                match(ELLIPSIS);
                setState(705);
                variableDeclaratorId();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodBodyContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public MethodBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodBody(this);
        }
    }

    public final MethodBodyContext methodBody() throws RecognitionException {
        MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_methodBody);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(707);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstructorBodyContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constructorBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterConstructorBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitConstructorBody(this);
        }
    }

    public final ConstructorBodyContext constructorBody() throws RecognitionException {
        ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_constructorBody);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(709);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QualifiedNameContext extends ParserRuleContext {
        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualifiedName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterQualifiedName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitQualifiedName(this);
        }
    }

    public final QualifiedNameContext qualifiedName() throws RecognitionException {
        QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_qualifiedName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(711);
                match(Identifier);
                setState(716);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 79, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(712);
                                match(DOT);
                                setState(713);
                                match(Identifier);
                            }
                        }
                    }
                    setState(718);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 79, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LiteralContext extends ParserRuleContext {
        public TerminalNode IntegerLiteral() {
            return getToken(JavaParser.IntegerLiteral, 0);
        }

        public TerminalNode FloatingPointLiteral() {
            return getToken(JavaParser.FloatingPointLiteral, 0);
        }

        public TerminalNode CharacterLiteral() {
            return getToken(JavaParser.CharacterLiteral, 0);
        }

        public TerminalNode StringLiteral() {
            return getToken(JavaParser.StringLiteral, 0);
        }

        public TerminalNode BooleanLiteral() {
            return getToken(JavaParser.BooleanLiteral, 0);
        }

        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitLiteral(this);
        }
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_literal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(719);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationContext extends ParserRuleContext {
        public AnnotationNameContext annotationName() {
            return getRuleContext(AnnotationNameContext.class, 0);
        }

        public ElementValuePairsContext elementValuePairs() {
            return getRuleContext(ElementValuePairsContext.class, 0);
        }

        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        public AnnotationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotation(this);
        }
    }

    public final AnnotationContext annotation() throws RecognitionException {
        AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_annotation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(721);
                match(AT);
                setState(722);
                annotationName();
                setState(729);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(723);
                        match(LPAREN);
                        setState(726);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 80, _ctx)) {
                            case 1: {
                                setState(724);
                                elementValuePairs();
                            }
                            break;
                            case 2: {
                                setState(725);
                                elementValue();
                            }
                            break;
                        }
                        setState(728);
                        match(RPAREN);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationNameContext extends ParserRuleContext {
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationName(this);
        }
    }

    public final AnnotationNameContext annotationName() throws RecognitionException {
        AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_annotationName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(731);
                qualifiedName();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValuePairsContext extends ParserRuleContext {
        public List<ElementValuePairContext> elementValuePair() {
            return getRuleContexts(ElementValuePairContext.class);
        }

        public ElementValuePairContext elementValuePair(int i) {
            return getRuleContext(ElementValuePairContext.class, i);
        }

        public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValuePairs;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterElementValuePairs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitElementValuePairs(this);
        }
    }

    public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
        ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_elementValuePairs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(733);
                elementValuePair();
                setState(738);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(734);
                            match(COMMA);
                            setState(735);
                            elementValuePair();
                        }
                    }
                    setState(740);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValuePairContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValuePair;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterElementValuePair(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitElementValuePair(this);
        }
    }

    public final ElementValuePairContext elementValuePair() throws RecognitionException {
        ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_elementValuePair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(741);
                match(Identifier);
                setState(742);
                match(ASSIGN);
                setState(743);
                elementValue();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValueContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class, 0);
        }

        public ElementValueArrayInitializerContext elementValueArrayInitializer() {
            return getRuleContext(ElementValueArrayInitializerContext.class, 0);
        }

        public ElementValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterElementValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitElementValue(this);
        }
    }

    public final ElementValueContext elementValue() throws RecognitionException {
        ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_elementValue);
        try {
            setState(748);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case NEW:
                case SHORT:
                case SUPER:
                case THIS:
                case VOID:
                case IntegerLiteral:
                case FloatingPointLiteral:
                case BooleanLiteral:
                case CharacterLiteral:
                case StringLiteral:
                case NullLiteral:
                case LPAREN:
                case LT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case ADD:
                case SUB:
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(745);
                    expression(0);
                }
                break;
                case AT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(746);
                    annotation();
                }
                break;
                case LBRACE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(747);
                    elementValueArrayInitializer();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValueArrayInitializerContext extends ParserRuleContext {
        public List<ElementValueContext> elementValue() {
            return getRuleContexts(ElementValueContext.class);
        }

        public ElementValueContext elementValue(int i) {
            return getRuleContext(ElementValueContext.class, i);
        }

        public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValueArrayInitializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterElementValueArrayInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitElementValueArrayInitializer(this);
        }
    }

    public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
        ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_elementValueArrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(750);
                match(LBRACE);
                setState(759);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
                    {
                        setState(751);
                        elementValue();
                        setState(756);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 84, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(752);
                                        match(COMMA);
                                        setState(753);
                                        elementValue();
                                    }
                                }
                            }
                            setState(758);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 84, _ctx);
                        }
                    }
                }

                setState(762);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(761);
                        match(COMMA);
                    }
                }

                setState(764);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public AnnotationTypeBodyContext annotationTypeBody() {
            return getRuleContext(AnnotationTypeBodyContext.class, 0);
        }

        public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationTypeDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationTypeDeclaration(this);
        }
    }

    public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
        AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_annotationTypeDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(766);
                match(AT);
                setState(767);
                match(INTERFACE);
                setState(768);
                match(Identifier);
                setState(769);
                annotationTypeBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationTypeBodyContext extends ParserRuleContext {
        public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
            return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
        }

        public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
            return getRuleContext(AnnotationTypeElementDeclarationContext.class, i);
        }

        public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationTypeBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationTypeBody(this);
        }
    }

    public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
        AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_annotationTypeBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(771);
                match(LBRACE);
                setState(775);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la == Identifier || _la == AT) {
                    {
                        {
                            setState(772);
                            annotationTypeElementDeclaration();
                        }
                    }
                    setState(777);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(778);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
        public AnnotationTypeElementRestContext annotationTypeElementRest() {
            return getRuleContext(AnnotationTypeElementRestContext.class, 0);
        }

        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }

        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class, i);
        }

        public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeElementDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationTypeElementDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationTypeElementDeclaration(this);
        }
    }

    public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
        AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_annotationTypeElementDeclaration);
        try {
            int _alt;
            setState(788);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case CLASS:
                case DOUBLE:
                case ENUM:
                case FINAL:
                case FLOAT:
                case INT:
                case INTERFACE:
                case LONG:
                case NATIVE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case SHORT:
                case STATIC:
                case STRICTFP:
                case SYNCHRONIZED:
                case TRANSIENT:
                case VOLATILE:
                case Identifier:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(783);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 88, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(780);
                                    modifier();
                                }
                            }
                        }
                        setState(785);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 88, _ctx);
                    }
                    setState(786);
                    annotationTypeElementRest();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(787);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationTypeElementRestContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
            return getRuleContext(AnnotationMethodOrConstantRestContext.class, 0);
        }

        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class, 0);
        }

        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class, 0);
        }

        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class, 0);
        }

        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
        }

        public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationTypeElementRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationTypeElementRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationTypeElementRest(this);
        }
    }

    public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
        AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_annotationTypeElementRest);
        try {
            setState(810);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(790);
                    typeType();
                    setState(791);
                    annotationMethodOrConstantRest();
                    setState(792);
                    match(SEMI);
                }
                break;
                case CLASS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(794);
                    classDeclaration();
                    setState(796);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 90, _ctx)) {
                        case 1: {
                            setState(795);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case INTERFACE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(798);
                    interfaceDeclaration();
                    setState(800);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 91, _ctx)) {
                        case 1: {
                            setState(799);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case ENUM:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(802);
                    enumDeclaration();
                    setState(804);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 92, _ctx)) {
                        case 1: {
                            setState(803);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case AT:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(806);
                    annotationTypeDeclaration();
                    setState(808);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 93, _ctx)) {
                        case 1: {
                            setState(807);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
        public AnnotationMethodRestContext annotationMethodRest() {
            return getRuleContext(AnnotationMethodRestContext.class, 0);
        }

        public AnnotationConstantRestContext annotationConstantRest() {
            return getRuleContext(AnnotationConstantRestContext.class, 0);
        }

        public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationMethodOrConstantRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationMethodOrConstantRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationMethodOrConstantRest(this);
        }
    }

    public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
        AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_annotationMethodOrConstantRest);
        try {
            setState(814);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 95, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(812);
                    annotationMethodRest();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(813);
                    annotationConstantRest();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationMethodRestContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public DefaultValueContext defaultValue() {
            return getRuleContext(DefaultValueContext.class, 0);
        }

        public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationMethodRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationMethodRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationMethodRest(this);
        }
    }

    public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
        AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_annotationMethodRest);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(816);
                match(Identifier);
                setState(817);
                match(LPAREN);
                setState(818);
                match(RPAREN);
                setState(820);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DEFAULT) {
                    {
                        setState(819);
                        defaultValue();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationConstantRestContext extends ParserRuleContext {
        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_annotationConstantRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAnnotationConstantRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAnnotationConstantRest(this);
        }
    }

    public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
        AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_annotationConstantRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(822);
                variableDeclarators();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DefaultValueContext extends ParserRuleContext {
        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        public DefaultValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defaultValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterDefaultValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitDefaultValue(this);
        }
    }

    public final DefaultValueContext defaultValue() throws RecognitionException {
        DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_defaultValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(824);
                match(DEFAULT);
                setState(825);
                elementValue();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockContext extends ParserRuleContext {
        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }

        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class, i);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitBlock(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(827);
                match(LBRACE);
                setState(831);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)) | (1L << (COMMENT - 68)) | (1L << (LINE_COMMENT - 68)))) != 0)) {
                    {
                        {
                            setState(828);
                            blockStatement();
                        }
                    }
                    setState(833);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(834);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockStatementContext extends ParserRuleContext {
        public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
            return getRuleContext(LocalVariableDeclarationStatementContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TypeDeclarationContext typeDeclaration() {
            return getRuleContext(TypeDeclarationContext.class, 0);
        }

        public CommentContext comment() {
            return getRuleContext(CommentContext.class, 0);
        }

        public BlockStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_blockStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterBlockStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitBlockStatement(this);
        }
    }

    public final BlockStatementContext blockStatement() throws RecognitionException {
        BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_blockStatement);
        try {
            setState(840);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 98, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(836);
                    localVariableDeclarationStatement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(837);
                    statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(838);
                    typeDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(839);
                    comment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class, 0);
        }

        public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_localVariableDeclarationStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener)
                ((JavaListener) listener).enterLocalVariableDeclarationStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitLocalVariableDeclarationStatement(this);
        }
    }

    public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
        LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_localVariableDeclarationStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(842);
                localVariableDeclaration();
                setState(843);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LocalVariableDeclarationContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_localVariableDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterLocalVariableDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitLocalVariableDeclaration(this);
        }
    }

    public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
        LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_localVariableDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(848);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(845);
                            variableModifier();
                        }
                    }
                    setState(850);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(851);
                typeType();
                setState(852);
                variableDeclarators();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode ASSERT() {
            return getToken(JavaParser.ASSERT, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ParExpressionContext parExpression() {
            return getRuleContext(ParExpressionContext.class, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public ForControlContext forControl() {
            return getRuleContext(ForControlContext.class, 0);
        }

        public FinallyBlockContext finallyBlock() {
            return getRuleContext(FinallyBlockContext.class, 0);
        }

        public List<CatchClauseContext> catchClause() {
            return getRuleContexts(CatchClauseContext.class);
        }

        public CatchClauseContext catchClause(int i) {
            return getRuleContext(CatchClauseContext.class, i);
        }

        public ResourceSpecificationContext resourceSpecification() {
            return getRuleContext(ResourceSpecificationContext.class, 0);
        }

        public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
            return getRuleContexts(SwitchBlockStatementGroupContext.class);
        }

        public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
            return getRuleContext(SwitchBlockStatementGroupContext.class, i);
        }

        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }

        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class, i);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public StatementExpressionContext statementExpression() {
            return getRuleContext(StatementExpressionContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitStatement(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_statement);
        int _la;
        try {
            int _alt;
            setState(958);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 112, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(854);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(855);
                    match(ASSERT);
                    setState(856);
                    expression(0);
                    setState(859);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COLON) {
                        {
                            setState(857);
                            match(COLON);
                            setState(858);
                            expression(0);
                        }
                    }

                    setState(861);
                    match(SEMI);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(863);
                    listener.onEvent(new EventParser("if", EventParser.IF_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    match(IF);
                    setState(864);
                    parExpression();
                    setState(865);
                    statement();
                    listener.onEvent(new EventParser("if", EventParser.IF_END, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(868);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 101, _ctx)) {
                        case 1: {
                            listener.onEvent(new EventParser("else", EventParser.ELSE_START, _localctx.start.getLine(),
                                    _localctx.start.getTokenSource().getSourceName()));
                            setState(866);
                            match(ELSE);
                            setState(867);
                            statement();
                            listener.onEvent(new EventParser("else", EventParser.ELSE_END, _localctx.start.getLine(),
                                    _localctx.start.getTokenSource().getSourceName()));
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    listener.onEvent(new EventParser("for", EventParser.FOR_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(870);
                    match(FOR);
                    setState(871);
                    match(LPAREN);
                    setState(872);
                    forControl();
                    setState(873);
                    match(RPAREN);
                    setState(874);
                    statement();
                    listener.onEvent(new EventParser("for", EventParser.FOR_END, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    listener.onEvent(new EventParser("while", EventParser.WHILE_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(876);
                    match(WHILE);
                    setState(877);
                    parExpression();
                    setState(878);
                    statement();
                    listener.onEvent(new EventParser("while", EventParser.WHILE_END, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    listener.onEvent(new EventParser("dowhile", EventParser.DO_WHILE_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(880);
                    match(DO);
                    setState(881);
                    statement();
                    setState(882);
                    match(WHILE);
                    setState(883);
                    parExpression();
                    setState(884);
                    match(SEMI);
                    listener.onEvent(new EventParser("dowhile", EventParser.DO_WHILE_END, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(886);
                    match(TRY);
                    setState(887);
                    block();
                    setState(897);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CATCH: {
                            setState(889);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(888);
                                        catchClause();
                                    }
                                }
                                setState(891);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while (_la == CATCH);
                            setState(894);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == FINALLY) {
                                {
                                    setState(893);
                                    finallyBlock();
                                }
                            }

                        }
                        break;
                        case FINALLY: {
                            setState(896);
                            finallyBlock();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(899);
                    match(TRY);
                    setState(900);
                    resourceSpecification();
                    setState(901);
                    block();
                    setState(905);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == CATCH) {
                        {
                            {
                                setState(902);
                                catchClause();
                            }
                        }
                        setState(907);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(909);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == FINALLY) {
                        {
                            setState(908);
                            finallyBlock();
                        }
                    }

                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    listener.onEvent(new EventParser("SWITCH", EventParser.SWITCH_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(911);
                    match(SWITCH);
                    setState(912);
                    parExpression();
                    setState(913);
                    match(LBRACE);
                    setState(917);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 107, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(914);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(919);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 107, _ctx);
                    }
                    setState(923);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == CASE || _la == DEFAULT) {
                        {
                            {

                                setState(920);
                                switchLabel();
                            }
                        }
                        setState(925);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(926);
                    match(RBRACE);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(928);
                    match(SYNCHRONIZED);
                    setState(929);
                    parExpression();
                    setState(930);
                    block();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    listener.onEvent(new EventParser("return", EventParser.RETURN, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(932);
                    match(RETURN);
                    setState(934);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
                        {
                            setState(933);
                            expression(0);
                        }
                    }

                    setState(936);
                    match(SEMI);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(937);
                    match(THROW);
                    setState(938);
                    expression(0);
                    setState(939);
                    match(SEMI);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    listener.onEvent(new EventParser("break", EventParser.BREAK, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(941);
                    match(BREAK);
                    setState(943);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Identifier) {
                        {
                            setState(942);
                            match(Identifier);
                        }
                    }

                    setState(945);
                    match(SEMI);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    listener.onEvent(new EventParser("continue", EventParser.CONTINUE, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(946);
                    match(CONTINUE);
                    setState(948);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Identifier) {
                        {
                            setState(947);
                            match(Identifier);
                        }
                    }

                    setState(950);
                    match(SEMI);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(951);
                    match(SEMI);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(952);
                    statementExpression();
                    setState(953);
                    match(SEMI);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(955);
                    match(Identifier);
                    setState(956);
                    match(COLON);
                    setState(957);
                    statement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CatchClauseContext extends ParserRuleContext {
        public CatchTypeContext catchType() {
            return getRuleContext(CatchTypeContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        public CatchClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_catchClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterCatchClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitCatchClause(this);
        }
    }

    public final CatchClauseContext catchClause() throws RecognitionException {
        CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_catchClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(960);
                match(CATCH);
                setState(961);
                match(LPAREN);
                setState(965);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(962);
                            variableModifier();
                        }
                    }
                    setState(967);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(968);
                catchType();
                setState(969);
                match(Identifier);
                setState(970);
                match(RPAREN);
                setState(971);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CatchTypeContext extends ParserRuleContext {
        public List<QualifiedNameContext> qualifiedName() {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i) {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        public CatchTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_catchType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterCatchType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitCatchType(this);
        }
    }

    public final CatchTypeContext catchType() throws RecognitionException {
        CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_catchType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(973);
                qualifiedName();
                setState(978);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == BITOR) {
                    {
                        {
                            setState(974);
                            match(BITOR);
                            setState(975);
                            qualifiedName();
                        }
                    }
                    setState(980);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FinallyBlockContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_finallyBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterFinallyBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitFinallyBlock(this);
        }
    }

    public final FinallyBlockContext finallyBlock() throws RecognitionException {
        FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_finallyBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(981);
                match(FINALLY);
                setState(982);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResourceSpecificationContext extends ParserRuleContext {
        public ResourcesContext resources() {
            return getRuleContext(ResourcesContext.class, 0);
        }

        public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resourceSpecification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterResourceSpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitResourceSpecification(this);
        }
    }

    public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
        ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_resourceSpecification);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(984);
                match(LPAREN);
                setState(985);
                resources();
                setState(987);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SEMI) {
                    {
                        setState(986);
                        match(SEMI);
                    }
                }

                setState(989);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResourcesContext extends ParserRuleContext {
        public List<ResourceContext> resource() {
            return getRuleContexts(ResourceContext.class);
        }

        public ResourceContext resource(int i) {
            return getRuleContext(ResourceContext.class, i);
        }

        public ResourcesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resources;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterResources(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitResources(this);
        }
    }

    public final ResourcesContext resources() throws RecognitionException {
        ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_resources);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(991);
                resource();
                setState(996);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 116, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(992);
                                match(SEMI);
                                setState(993);
                                resource();
                            }
                        }
                    }
                    setState(998);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 116, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResourceContext extends ParserRuleContext {
        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        public ResourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resource;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitResource(this);
        }
    }

    public final ResourceContext resource() throws RecognitionException {
        ResourceContext _localctx = new ResourceContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_resource);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1002);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(999);
                            variableModifier();
                        }
                    }
                    setState(1004);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1005);
                classOrInterfaceType();
                setState(1006);
                variableDeclaratorId();
                setState(1007);
                match(ASSIGN);
                setState(1008);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }

        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class, i);
        }

        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }

        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class, i);
        }

        public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_switchBlockStatementGroup;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterSwitchBlockStatementGroup(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitSwitchBlockStatementGroup(this);
        }
    }

    public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
        SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_switchBlockStatementGroup);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1011);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1010);
                            switchLabel();
                        }
                    }
                    setState(1013);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == CASE || _la == DEFAULT);
                setState(1016);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1015);
                            blockStatement();
                        }
                    }
                    setState(1018);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)) | (1L << (COMMENT - 68)) | (1L << (LINE_COMMENT - 68)))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SwitchLabelContext extends ParserRuleContext {
        public ConstantExpressionContext constantExpression() {
            return getRuleContext(ConstantExpressionContext.class, 0);
        }

        public EnumConstantNameContext enumConstantName() {
            return getRuleContext(EnumConstantNameContext.class, 0);
        }

        public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_switchLabel;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterSwitchLabel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitSwitchLabel(this);
        }
    }

    public final SwitchLabelContext switchLabel() throws RecognitionException {
        SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_switchLabel);
        try {
            setState(1030);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 120, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    listener.onEvent(new EventParser("case", EventParser.CASE_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(1020);
                    match(CASE);
                    setState(1021);
                    constantExpression();
                    setState(1022);
                    match(COLON);
                    listener.onEvent(new EventParser("case", EventParser.CASE_END, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    listener.onEvent(new EventParser("case", EventParser.CASE_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(1024);
                    match(CASE);
                    setState(1025);
                    enumConstantName();
                    setState(1026);
                    match(COLON);
                    listener.onEvent(new EventParser("case", EventParser.CASE_END, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    listener.onEvent(new EventParser("default", EventParser.DEFAULT_START, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                    setState(1028);
                    match(DEFAULT);
                    setState(1029);
                    match(COLON);
                    listener.onEvent(new EventParser("default", EventParser.DEFAULT_END, _localctx.start.getLine(),
                            _localctx.start.getTokenSource().getSourceName()));
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForControlContext extends ParserRuleContext {
        public EnhancedForControlContext enhancedForControl() {
            return getRuleContext(EnhancedForControlContext.class, 0);
        }

        public ForInitContext forInit() {
            return getRuleContext(ForInitContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ForUpdateContext forUpdate() {
            return getRuleContext(ForUpdateContext.class, 0);
        }

        public ForControlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forControl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterForControl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitForControl(this);
        }
    }

    public final ForControlContext forControl() throws RecognitionException {
        ForControlContext _localctx = new ForControlContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_forControl);
        int _la;
        try {
            setState(1044);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 124, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1032);
                    enhancedForControl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1034);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
                        {
                            setState(1033);
                            forInit();
                        }
                    }

                    setState(1036);
                    match(SEMI);
                    setState(1038);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
                        {
                            setState(1037);
                            expression(0);
                        }
                    }

                    setState(1040);
                    match(SEMI);
                    setState(1042);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
                        {
                            setState(1041);
                            forUpdate();
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForInitContext extends ParserRuleContext {
        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public ForInitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forInit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterForInit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitForInit(this);
        }
    }

    public final ForInitContext forInit() throws RecognitionException {
        ForInitContext _localctx = new ForInitContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_forInit);
        try {
            setState(1048);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1046);
                    localVariableDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1047);
                    expressionList();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnhancedForControlContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }

        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class, i);
        }

        public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enhancedForControl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterEnhancedForControl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitEnhancedForControl(this);
        }
    }

    public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
        EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_enhancedForControl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1053);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FINAL || _la == AT) {
                    {
                        {
                            setState(1050);
                            variableModifier();
                        }
                    }
                    setState(1055);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1056);
                typeType();
                setState(1057);
                variableDeclaratorId();
                setState(1058);
                match(COLON);
                setState(1059);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForUpdateContext extends ParserRuleContext {
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public ForUpdateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forUpdate;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterForUpdate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitForUpdate(this);
        }
    }

    public final ForUpdateContext forUpdate() throws RecognitionException {
        ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_forUpdate);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1061);
                expressionList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParExpressionContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ParExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterParExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitParExpression(this);
        }
    }

    public final ParExpressionContext parExpression() throws RecognitionException {
        ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_parExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1063);
                match(LPAREN);
                setState(1064);
                expression(0);
                setState(1065);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionListContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ExpressionListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressionList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterExpressionList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitExpressionList(this);
        }
    }

    public final ExpressionListContext expressionList() throws RecognitionException {
        ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_expressionList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1067);
                expression(0);
                setState(1072);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1068);
                            match(COMMA);
                            setState(1069);
                            expression(0);
                        }
                    }
                    setState(1074);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementExpressionContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statementExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterStatementExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitStatementExpression(this);
        }
    }

    public final StatementExpressionContext statementExpression() throws RecognitionException {
        StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_statementExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1075);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstantExpressionContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constantExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterConstantExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitConstantExpression(this);
        }
    }

    public final ConstantExpressionContext constantExpression() throws RecognitionException {
        ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_constantExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1077);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public PrimaryContext primary() {
            return getRuleContext(PrimaryContext.class, 0);
        }

        public CreatorContext creator() {
            return getRuleContext(CreatorContext.class, 0);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public InnerCreatorContext innerCreator() {
            return getRuleContext(InnerCreatorContext.class, 0);
        }

        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public SuperSuffixContext superSuffix() {
            return getRuleContext(SuperSuffixContext.class, 0);
        }

        public ExplicitGenericInvocationContext explicitGenericInvocation() {
            return getRuleContext(ExplicitGenericInvocationContext.class, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitExpression(this);
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
        int _startState = 174;
        enterRecursionRule(_localctx, 174, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1092);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 128, _ctx)) {
                    case 1: {
                        setState(1080);
                        primary();
                    }
                    break;
                    case 2: {
                        setState(1081);
                        match(NEW);
                        setState(1082);
                        creator();
                    }
                    break;
                    case 3: {
                        setState(1083);
                        match(LPAREN);
                        setState(1084);
                        typeType();
                        setState(1085);
                        match(RPAREN);
                        setState(1086);
                        expression(17);
                    }
                    break;
                    case 4: {
                        setState(1088);
                        _la = _input.LA(1);
                        if (!(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1089);
                        expression(15);
                    }
                    break;
                    case 5: {
                        setState(1090);
                        _la = _input.LA(1);
                        if (!(_la == BANG || _la == TILDE)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1091);
                        expression(14);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1179);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 133, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1177);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 132, _ctx)) {
                                case 1: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1094);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(1095);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1096);
                                    expression(14);
                                }
                                break;
                                case 2: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1097);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(1098);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1099);
                                    expression(13);
                                }
                                break;
                                case 3: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1100);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(1108);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 129, _ctx)) {
                                        case 1: {
                                            setState(1101);
                                            match(LT);
                                            setState(1102);
                                            match(LT);
                                        }
                                        break;
                                        case 2: {
                                            setState(1103);
                                            match(GT);
                                            setState(1104);
                                            match(GT);
                                            setState(1105);
                                            match(GT);
                                        }
                                        break;
                                        case 3: {
                                            setState(1106);
                                            match(GT);
                                            setState(1107);
                                            match(GT);
                                        }
                                        break;
                                    }
                                    setState(1110);
                                    expression(12);
                                }
                                break;
                                case 4: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1111);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(1112);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1113);
                                    expression(11);
                                }
                                break;
                                case 5: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1114);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(1115);
                                    _la = _input.LA(1);
                                    if (!(_la == EQUAL || _la == NOTEQUAL)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1116);
                                    expression(9);
                                }
                                break;
                                case 6: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1117);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(1118);
                                    match(BITAND);
                                    setState(1119);
                                    expression(8);
                                }
                                break;
                                case 7: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1120);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(1121);
                                    match(CARET);
                                    setState(1122);
                                    expression(7);
                                }
                                break;
                                case 8: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1123);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(1124);
                                    match(BITOR);
                                    setState(1125);
                                    expression(6);
                                }
                                break;
                                case 9: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1126);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(1127);
                                    match(AND);
                                    setState(1128);
                                    expression(5);
                                }
                                break;
                                case 10: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1129);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1130);
                                    match(OR);
                                    setState(1131);
                                    expression(4);
                                }
                                break;
                                case 11: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1132);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(1133);
                                    match(QUESTION);
                                    setState(1134);
                                    expression(0);
                                    setState(1135);
                                    match(COLON);
                                    setState(1136);
                                    expression(3);
                                }
                                break;
                                case 12: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1138);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(1139);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1140);
                                    expression(1);
                                }
                                break;
                                case 13: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1141);
                                    if (!(precpred(_ctx, 25)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                                    setState(1142);
                                    match(DOT);
                                    setState(1143);
                                    match(Identifier);
                                }
                                break;
                                case 14: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1144);
                                    if (!(precpred(_ctx, 24)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                                    setState(1145);
                                    match(DOT);
                                    setState(1146);
                                    match(THIS);
                                }
                                break;
                                case 15: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1147);
                                    if (!(precpred(_ctx, 23)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(1148);
                                    match(DOT);
                                    setState(1149);
                                    match(NEW);
                                    setState(1151);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == LT) {
                                        {
                                            setState(1150);
                                            nonWildcardTypeArguments();
                                        }
                                    }

                                    setState(1153);
                                    innerCreator();
                                }
                                break;
                                case 16: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1154);
                                    if (!(precpred(_ctx, 22)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(1155);
                                    match(DOT);
                                    setState(1156);
                                    match(SUPER);
                                    setState(1157);
                                    superSuffix();
                                }
                                break;
                                case 17: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1158);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(1159);
                                    match(DOT);
                                    setState(1160);
                                    explicitGenericInvocation();
                                }
                                break;
                                case 18: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1161);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(1162);
                                    match(LBRACK);
                                    setState(1163);
                                    expression(0);
                                    setState(1164);
                                    match(RBRACK);
                                }
                                break;
                                case 19: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1166);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(1167);
                                    match(LPAREN);
                                    setState(1169);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
                                        {
                                            setState(1168);
                                            expressionList();
                                        }
                                    }

                                    setState(1171);
                                    match(RPAREN);
                                }
                                break;
                                case 20: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1172);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(1173);
                                    _la = _input.LA(1);
                                    if (!(_la == INC || _la == DEC)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                                break;
                                case 21: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1174);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(1175);
                                    match(INSTANCEOF);
                                    setState(1176);
                                    typeType();
                                }
                                break;
                            }
                        }
                    }
                    setState(1181);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 133, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PrimaryContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class, 0);
        }

        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
            return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public PrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterPrimary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitPrimary(this);
        }
    }

    public final PrimaryContext primary() throws RecognitionException {
        PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_primary);
        try {
            setState(1203);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 135, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1182);
                    match(LPAREN);
                    setState(1183);
                    expression(0);
                    setState(1184);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1186);
                    match(THIS);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1187);
                    match(SUPER);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1188);
                    literal();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1189);
                    match(Identifier);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1190);
                    typeType();
                    setState(1191);
                    match(DOT);
                    setState(1192);
                    match(CLASS);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1194);
                    match(VOID);
                    setState(1195);
                    match(DOT);
                    setState(1196);
                    match(CLASS);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(1197);
                    nonWildcardTypeArguments();
                    setState(1201);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case SUPER:
                        case Identifier: {
                            setState(1198);
                            explicitGenericInvocationSuffix();
                        }
                        break;
                        case THIS: {
                            setState(1199);
                            match(THIS);
                            setState(1200);
                            arguments();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CreatorContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public CreatedNameContext createdName() {
            return getRuleContext(CreatedNameContext.class, 0);
        }

        public ClassCreatorRestContext classCreatorRest() {
            return getRuleContext(ClassCreatorRestContext.class, 0);
        }

        public ArrayCreatorRestContext arrayCreatorRest() {
            return getRuleContext(ArrayCreatorRestContext.class, 0);
        }

        public CreatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_creator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterCreator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitCreator(this);
        }
    }

    public final CreatorContext creator() throws RecognitionException {
        CreatorContext _localctx = new CreatorContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_creator);
        try {
            setState(1214);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1205);
                    nonWildcardTypeArguments();
                    setState(1206);
                    createdName();
                    setState(1207);
                    classCreatorRest();
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case Identifier:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1209);
                    createdName();
                    setState(1212);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case LBRACK: {
                            setState(1210);
                            arrayCreatorRest();
                        }
                        break;
                        case LPAREN: {
                            setState(1211);
                            classCreatorRest();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CreatedNameContext extends ParserRuleContext {
        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
            return getRuleContexts(TypeArgumentsOrDiamondContext.class);
        }

        public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
            return getRuleContext(TypeArgumentsOrDiamondContext.class, i);
        }

        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public CreatedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_createdName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterCreatedName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitCreatedName(this);
        }
    }

    public final CreatedNameContext createdName() throws RecognitionException {
        CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_createdName);
        int _la;
        try {
            setState(1231);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1216);
                    match(Identifier);
                    setState(1218);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == LT) {
                        {
                            setState(1217);
                            typeArgumentsOrDiamond();
                        }
                    }

                    setState(1227);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == DOT) {
                        {
                            {
                                setState(1220);
                                match(DOT);
                                setState(1221);
                                match(Identifier);
                                setState(1223);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LT) {
                                    {
                                        setState(1222);
                                        typeArgumentsOrDiamond();
                                    }
                                }

                            }
                        }
                        setState(1229);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1230);
                    primitiveType();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InnerCreatorContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public ClassCreatorRestContext classCreatorRest() {
            return getRuleContext(ClassCreatorRestContext.class, 0);
        }

        public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
            return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class, 0);
        }

        public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_innerCreator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterInnerCreator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitInnerCreator(this);
        }
    }

    public final InnerCreatorContext innerCreator() throws RecognitionException {
        InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_innerCreator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1233);
                match(Identifier);
                setState(1235);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(1234);
                        nonWildcardTypeArgumentsOrDiamond();
                    }
                }

                setState(1237);
                classCreatorRest();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayCreatorRestContext extends ParserRuleContext {
        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayCreatorRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayCreatorRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayCreatorRest(this);
        }
    }

    public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
        ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_arrayCreatorRest);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1239);
                match(LBRACK);
                setState(1267);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case RBRACK: {
                        setState(1240);
                        match(RBRACK);
                        setState(1245);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == LBRACK) {
                            {
                                {
                                    setState(1241);
                                    match(LBRACK);
                                    setState(1242);
                                    match(RBRACK);
                                }
                            }
                            setState(1247);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1248);
                        arrayInitializer();
                    }
                    break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case NEW:
                    case SHORT:
                    case SUPER:
                    case THIS:
                    case VOID:
                    case IntegerLiteral:
                    case FloatingPointLiteral:
                    case BooleanLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case NullLiteral:
                    case LPAREN:
                    case LT:
                    case BANG:
                    case TILDE:
                    case INC:
                    case DEC:
                    case ADD:
                    case SUB:
                    case Identifier: {
                        setState(1249);
                        expression(0);
                        setState(1250);
                        match(RBRACK);
                        setState(1257);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 144, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(1251);
                                        match(LBRACK);
                                        setState(1252);
                                        expression(0);
                                        setState(1253);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1259);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 144, _ctx);
                        }
                        setState(1264);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 145, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(1260);
                                        match(LBRACK);
                                        setState(1261);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1266);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 145, _ctx);
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassCreatorRestContext extends ParserRuleContext {
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class, 0);
        }

        public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classCreatorRest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterClassCreatorRest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitClassCreatorRest(this);
        }
    }

    public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
        ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_classCreatorRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1269);
                arguments();
                setState(1271);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 147, _ctx)) {
                    case 1: {
                        setState(1270);
                        classBody();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExplicitGenericInvocationContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
            return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
        }

        public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_explicitGenericInvocation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterExplicitGenericInvocation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitExplicitGenericInvocation(this);
        }
    }

    public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
        ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_explicitGenericInvocation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1273);
                nonWildcardTypeArguments();
                setState(1274);
                explicitGenericInvocationSuffix();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class, 0);
        }

        public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nonWildcardTypeArguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterNonWildcardTypeArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitNonWildcardTypeArguments(this);
        }
    }

    public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
        NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_nonWildcardTypeArguments);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1276);
                match(LT);
                setState(1277);
                typeList();
                setState(1278);
                match(GT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
        public TypeArgumentsContext typeArguments() {
            return getRuleContext(TypeArgumentsContext.class, 0);
        }

        public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeArgumentsOrDiamond;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeArgumentsOrDiamond(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeArgumentsOrDiamond(this);
        }
    }

    public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
        TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_typeArgumentsOrDiamond);
        try {
            setState(1283);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 148, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1280);
                    match(LT);
                    setState(1281);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1282);
                    typeArguments();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
        }

        public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nonWildcardTypeArgumentsOrDiamond;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener)
                ((JavaListener) listener).enterNonWildcardTypeArgumentsOrDiamond(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitNonWildcardTypeArgumentsOrDiamond(this);
        }
    }

    public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
        NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_nonWildcardTypeArgumentsOrDiamond);
        try {
            setState(1288);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 149, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1285);
                    match(LT);
                    setState(1286);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1287);
                    nonWildcardTypeArguments();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SuperSuffixContext extends ParserRuleContext {
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_superSuffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterSuperSuffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitSuperSuffix(this);
        }
    }

    public final SuperSuffixContext superSuffix() throws RecognitionException {
        SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_superSuffix);
        try {
            setState(1296);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LPAREN:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1290);
                    arguments();
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1291);
                    match(DOT);
                    setState(1292);
                    match(Identifier);
                    setState(1294);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 150, _ctx)) {
                        case 1: {
                            setState(1293);
                            arguments();
                        }
                        break;
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
        public SuperSuffixContext superSuffix() {
            return getRuleContext(SuperSuffixContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_explicitGenericInvocationSuffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterExplicitGenericInvocationSuffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitExplicitGenericInvocationSuffix(this);
        }
    }

    public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
        ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_explicitGenericInvocationSuffix);
        try {
            setState(1302);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SUPER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1298);
                    match(SUPER);
                    setState(1299);
                    superSuffix();
                }
                break;
                case Identifier:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1300);
                    match(Identifier);
                    setState(1301);
                    arguments();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArgumentsContext extends ParserRuleContext {
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public ArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitArguments(this);
        }
    }

    public final ArgumentsContext arguments() throws RecognitionException {
        ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1304);
                match(LPAREN);
                setState(1306);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
                    {
                        setState(1305);
                        expressionList();
                    }
                }

                setState(1308);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CommentContext extends ParserRuleContext {
        public TerminalNode COMMENT() {
            return getToken(JavaParser.COMMENT, 0);
        }

        public TerminalNode LINE_COMMENT() {
            return getToken(JavaParser.LINE_COMMENT, 0);
        }

        public CommentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitComment(this);
        }
    }

    public final CommentContext comment() throws RecognitionException {
        CommentContext _localctx = new CommentContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_comment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1310);
                _la = _input.LA(1);
                if (!(_la == COMMENT || _la == LINE_COMMENT)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 87:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 13);
            case 1:
                return precpred(_ctx, 12);
            case 2:
                return precpred(_ctx, 11);
            case 3:
                return precpred(_ctx, 10);
            case 4:
                return precpred(_ctx, 8);
            case 5:
                return precpred(_ctx, 7);
            case 6:
                return precpred(_ctx, 6);
            case 7:
                return precpred(_ctx, 5);
            case 8:
                return precpred(_ctx, 4);
            case 9:
                return precpred(_ctx, 3);
            case 10:
                return precpred(_ctx, 2);
            case 11:
                return precpred(_ctx, 1);
            case 12:
                return precpred(_ctx, 25);
            case 13:
                return precpred(_ctx, 24);
            case 14:
                return precpred(_ctx, 23);
            case 15:
                return precpred(_ctx, 22);
            case 16:
                return precpred(_ctx, 21);
            case 17:
                return precpred(_ctx, 20);
            case 18:
                return precpred(_ctx, 19);
            case 19:
                return precpred(_ctx, 16);
            case 20:
                return precpred(_ctx, 9);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3k\u0523\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" +
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\5\2\u00d0\n\2\3\2\7" +
                    "\2\u00d3\n\2\f\2\16\2\u00d6\13\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2" +
                    "\3\2\7\2\u00df\n\2\f\2\16\2\u00e2\13\2\3\2\3\2\3\3\7\3\u00e7\n\3\f\3\16" +
                    "\3\u00ea\13\3\3\3\7\3\u00ed\n\3\f\3\16\3\u00f0\13\3\3\3\3\3\3\3\3\3\7" +
                    "\3\u00f6\n\3\f\3\16\3\u00f9\13\3\3\4\7\4\u00fc\n\4\f\4\16\4\u00ff\13\4" +
                    "\3\4\3\4\5\4\u0103\n\4\3\4\3\4\3\4\5\4\u0108\n\4\3\4\3\4\7\4\u010c\n\4" +
                    "\f\4\16\4\u010f\13\4\3\5\7\5\u0112\n\5\f\5\16\5\u0115\13\5\3\5\3\5\7\5" +
                    "\u0119\n\5\f\5\16\5\u011c\13\5\3\5\3\5\7\5\u0120\n\5\f\5\16\5\u0123\13" +
                    "\5\3\5\3\5\7\5\u0127\n\5\f\5\16\5\u012a\13\5\3\5\3\5\5\5\u012e\n\5\3\6" +
                    "\3\6\5\6\u0132\n\6\3\7\3\7\5\7\u0136\n\7\3\b\3\b\5\b\u013a\n\b\3\t\3\t" +
                    "\3\t\5\t\u013f\n\t\3\t\3\t\5\t\u0143\n\t\3\t\3\t\5\t\u0147\n\t\3\t\3\t" +
                    "\3\n\3\n\3\n\3\n\7\n\u014f\n\n\f\n\16\n\u0152\13\n\3\n\3\n\3\13\3\13\3" +
                    "\13\5\13\u0159\n\13\3\f\3\f\3\f\7\f\u015e\n\f\f\f\16\f\u0161\13\f\3\r" +
                    "\3\r\3\r\3\r\5\r\u0167\n\r\3\r\3\r\5\r\u016b\n\r\3\r\5\r\u016e\n\r\3\r" +
                    "\5\r\u0171\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0178\n\16\f\16\16\16\u017b" +
                    "\13\16\3\17\7\17\u017e\n\17\f\17\16\17\u0181\13\17\3\17\3\17\5\17\u0185" +
                    "\n\17\3\17\5\17\u0188\n\17\3\20\3\20\7\20\u018c\n\20\f\20\16\20\u018f" +
                    "\13\20\3\21\3\21\3\21\5\21\u0194\n\21\3\21\3\21\5\21\u0198\n\21\3\21\3" +
                    "\21\3\22\3\22\3\22\7\22\u019f\n\22\f\22\16\22\u01a2\13\22\3\23\3\23\7" +
                    "\23\u01a6\n\23\f\23\16\23\u01a9\13\23\3\23\3\23\3\24\3\24\7\24\u01af\n" +
                    "\24\f\24\16\24\u01b2\13\24\3\24\3\24\3\25\3\25\5\25\u01b8\n\25\3\25\3" +
                    "\25\7\25\u01bc\n\25\f\25\16\25\u01bf\13\25\3\25\3\25\5\25\u01c3\n\25\3" +
                    "\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ce\n\26\3\27\3\27" +
                    "\5\27\u01d2\n\27\3\27\3\27\3\27\3\27\7\27\u01d8\n\27\f\27\16\27\u01db" +
                    "\13\27\3\27\3\27\5\27\u01df\n\27\3\27\3\27\5\27\u01e3\n\27\3\30\3\30\3" +
                    "\30\3\31\3\31\3\31\3\31\5\31\u01ec\n\31\3\31\3\31\3\32\3\32\3\32\3\33" +
                    "\3\33\3\33\3\33\3\34\7\34\u01f8\n\34\f\34\16\34\u01fb\13\34\3\34\3\34" +
                    "\5\34\u01ff\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0208\n\35\3" +
                    "\36\3\36\3\36\3\36\7\36\u020e\n\36\f\36\16\36\u0211\13\36\3\36\3\36\3" +
                    "\37\3\37\3\37\7\37\u0218\n\37\f\37\16\37\u021b\13\37\3\37\3\37\3\37\3" +
                    " \3 \5 \u0222\n \3 \3 \3 \3 \7 \u0228\n \f \16 \u022b\13 \3 \3 \5 \u022f" +
                    "\n \3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u0239\n\"\f\"\16\"\u023c\13\"\3#\3" +
                    "#\3#\5#\u0241\n#\3$\3$\3$\7$\u0246\n$\f$\16$\u0249\13$\3%\3%\5%\u024d" +
                    "\n%\3&\3&\3&\3&\7&\u0253\n&\f&\16&\u0256\13&\3&\5&\u0259\n&\5&\u025b\n" +
                    "&\3&\3&\3\'\3\'\3(\3(\3(\7(\u0264\n(\f(\16(\u0267\13(\3(\3(\3(\7(\u026c" +
                    "\n(\f(\16(\u026f\13(\5(\u0271\n(\3)\3)\5)\u0275\n)\3)\3)\3)\5)\u027a\n" +
                    ")\7)\u027c\n)\f)\16)\u027f\13)\3*\3*\3+\3+\3+\3+\7+\u0287\n+\f+\16+\u028a" +
                    "\13+\3+\3+\3,\3,\3,\3,\5,\u0292\n,\5,\u0294\n,\3-\3-\3-\7-\u0299\n-\f" +
                    "-\16-\u029c\13-\3.\3.\5.\u02a0\n.\3.\3.\3/\3/\3/\7/\u02a7\n/\f/\16/\u02aa" +
                    "\13/\3/\3/\5/\u02ae\n/\3/\5/\u02b1\n/\3\60\7\60\u02b4\n\60\f\60\16\60" +
                    "\u02b7\13\60\3\60\3\60\3\60\3\61\7\61\u02bd\n\61\f\61\16\61\u02c0\13\61" +
                    "\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\7\64\u02cd\n\64" +
                    "\f\64\16\64\u02d0\13\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u02d9" +
                    "\n\66\3\66\5\66\u02dc\n\66\3\67\3\67\38\38\38\78\u02e3\n8\f8\168\u02e6" +
                    "\138\39\39\39\39\3:\3:\3:\5:\u02ef\n:\3;\3;\3;\3;\7;\u02f5\n;\f;\16;\u02f8" +
                    "\13;\5;\u02fa\n;\3;\5;\u02fd\n;\3;\3;\3<\3<\3<\3<\3<\3=\3=\7=\u0308\n" +
                    "=\f=\16=\u030b\13=\3=\3=\3>\7>\u0310\n>\f>\16>\u0313\13>\3>\3>\5>\u0317" +
                    "\n>\3?\3?\3?\3?\3?\3?\5?\u031f\n?\3?\3?\5?\u0323\n?\3?\3?\5?\u0327\n?" +
                    "\3?\3?\5?\u032b\n?\5?\u032d\n?\3@\3@\5@\u0331\n@\3A\3A\3A\3A\5A\u0337" +
                    "\nA\3B\3B\3C\3C\3C\3D\3D\7D\u0340\nD\fD\16D\u0343\13D\3D\3D\3E\3E\3E\3" +
                    "E\5E\u034b\nE\3F\3F\3F\3G\7G\u0351\nG\fG\16G\u0354\13G\3G\3G\3G\3H\3H" +
                    "\3H\3H\3H\5H\u035e\nH\3H\3H\3H\3H\3H\3H\3H\5H\u0367\nH\3H\3H\3H\3H\3H" +
                    "\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\6H\u037c\nH\rH\16H\u037d\3" +
                    "H\5H\u0381\nH\3H\5H\u0384\nH\3H\3H\3H\3H\7H\u038a\nH\fH\16H\u038d\13H" +
                    "\3H\5H\u0390\nH\3H\3H\3H\3H\7H\u0396\nH\fH\16H\u0399\13H\3H\7H\u039c\n" +
                    "H\fH\16H\u039f\13H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03a9\nH\3H\3H\3H\3H\3H" +
                    "\3H\3H\5H\u03b2\nH\3H\3H\3H\5H\u03b7\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03c1" +
                    "\nH\3I\3I\3I\7I\u03c6\nI\fI\16I\u03c9\13I\3I\3I\3I\3I\3I\3J\3J\3J\7J\u03d3" +
                    "\nJ\fJ\16J\u03d6\13J\3K\3K\3K\3L\3L\3L\5L\u03de\nL\3L\3L\3M\3M\3M\7M\u03e5" +
                    "\nM\fM\16M\u03e8\13M\3N\7N\u03eb\nN\fN\16N\u03ee\13N\3N\3N\3N\3N\3N\3" +
                    "O\6O\u03f6\nO\rO\16O\u03f7\3O\6O\u03fb\nO\rO\16O\u03fc\3P\3P\3P\3P\3P" +
                    "\3P\3P\3P\3P\3P\5P\u0409\nP\3Q\3Q\5Q\u040d\nQ\3Q\3Q\5Q\u0411\nQ\3Q\3Q" +
                    "\5Q\u0415\nQ\5Q\u0417\nQ\3R\3R\5R\u041b\nR\3S\7S\u041e\nS\fS\16S\u0421" +
                    "\13S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\3V\3V\3V\7V\u0431\nV\fV\16V\u0434" +
                    "\13V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0447\nY\3" +
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0457\nY\3Y\3Y\3Y\3Y\3Y\3" +
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3" +
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0482\nY\3Y\3Y\3Y\3Y\3Y\3Y\3" +
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0494\nY\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u049c\n" +
                    "Y\fY\16Y\u049f\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z" +
                    "\3Z\3Z\5Z\u04b4\nZ\5Z\u04b6\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u04bf\n[\5[\u04c1" +
                    "\n[\3\\\3\\\5\\\u04c5\n\\\3\\\3\\\3\\\5\\\u04ca\n\\\7\\\u04cc\n\\\f\\" +
                    "\16\\\u04cf\13\\\3\\\5\\\u04d2\n\\\3]\3]\5]\u04d6\n]\3]\3]\3^\3^\3^\3" +
                    "^\7^\u04de\n^\f^\16^\u04e1\13^\3^\3^\3^\3^\3^\3^\3^\7^\u04ea\n^\f^\16" +
                    "^\u04ed\13^\3^\3^\7^\u04f1\n^\f^\16^\u04f4\13^\5^\u04f6\n^\3_\3_\5_\u04fa" +
                    "\n_\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\5b\u0506\nb\3c\3c\3c\5c\u050b\nc\3d" +
                    "\3d\3d\3d\5d\u0511\nd\5d\u0513\nd\3e\3e\3e\3e\5e\u0519\ne\3f\3f\5f\u051d" +
                    "\nf\3f\3f\3g\3g\3g\2\3\u00b0h\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 " +
                    "\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082" +
                    "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a" +
                    "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2" +
                    "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca" +
                    "\u00cc\2\20\6\2  ,,\60\60\63\63\6\2\3\3\24\24#%()\n\2\5\5\7\7\n\n\20\20" +
                    "\26\26\35\35\37\37\'\'\4\2\23\23**\3\2\65:\3\2QT\3\2GH\4\2UVZZ\3\2ST\4" +
                    "\2EFLM\4\2KKNN\4\2DD[e\3\2QR\3\2jk\2\u059b\2\u00cf\3\2\2\2\4\u00e8\3\2" +
                    "\2\2\6\u00fd\3\2\2\2\b\u012d\3\2\2\2\n\u0131\3\2\2\2\f\u0135\3\2\2\2\16" +
                    "\u0139\3\2\2\2\20\u013b\3\2\2\2\22\u014a\3\2\2\2\24\u0155\3\2\2\2\26\u015a" +
                    "\3\2\2\2\30\u0162\3\2\2\2\32\u0174\3\2\2\2\34\u017f\3\2\2\2\36\u0189\3" +
                    "\2\2\2 \u0190\3\2\2\2\"\u019b\3\2\2\2$\u01a3\3\2\2\2&\u01ac\3\2\2\2(\u01c2" +
                    "\3\2\2\2*\u01cd\3\2\2\2,\u01d1\3\2\2\2.\u01e4\3\2\2\2\60\u01e7\3\2\2\2" +
                    "\62\u01ef\3\2\2\2\64\u01f2\3\2\2\2\66\u01fe\3\2\2\28\u0207\3\2\2\2:\u0209" +
                    "\3\2\2\2<\u0214\3\2\2\2>\u0221\3\2\2\2@\u0232\3\2\2\2B\u0235\3\2\2\2D" +
                    "\u023d\3\2\2\2F\u0242\3\2\2\2H\u024c\3\2\2\2J\u024e\3\2\2\2L\u025e\3\2" +
                    "\2\2N\u0270\3\2\2\2P\u0272\3\2\2\2R\u0280\3\2\2\2T\u0282\3\2\2\2V\u0293" +
                    "\3\2\2\2X\u0295\3\2\2\2Z\u029d\3\2\2\2\\\u02b0\3\2\2\2^\u02b5\3\2\2\2" +
                    "`\u02be\3\2\2\2b\u02c5\3\2\2\2d\u02c7\3\2\2\2f\u02c9\3\2\2\2h\u02d1\3" +
                    "\2\2\2j\u02d3\3\2\2\2l\u02dd\3\2\2\2n\u02df\3\2\2\2p\u02e7\3\2\2\2r\u02ee" +
                    "\3\2\2\2t\u02f0\3\2\2\2v\u0300\3\2\2\2x\u0305\3\2\2\2z\u0316\3\2\2\2|" +
                    "\u032c\3\2\2\2~\u0330\3\2\2\2\u0080\u0332\3\2\2\2\u0082\u0338\3\2\2\2" +
                    "\u0084\u033a\3\2\2\2\u0086\u033d\3\2\2\2\u0088\u034a\3\2\2\2\u008a\u034c" +
                    "\3\2\2\2\u008c\u0352\3\2\2\2\u008e\u03c0\3\2\2\2\u0090\u03c2\3\2\2\2\u0092" +
                    "\u03cf\3\2\2\2\u0094\u03d7\3\2\2\2\u0096\u03da\3\2\2\2\u0098\u03e1\3\2" +
                    "\2\2\u009a\u03ec\3\2\2\2\u009c\u03f5\3\2\2\2\u009e\u0408\3\2\2\2\u00a0" +
                    "\u0416\3\2\2\2\u00a2\u041a\3\2\2\2\u00a4\u041f\3\2\2\2\u00a6\u0427\3\2" +
                    "\2\2\u00a8\u0429\3\2\2\2\u00aa\u042d\3\2\2\2\u00ac\u0435\3\2\2\2\u00ae" +
                    "\u0437\3\2\2\2\u00b0\u0446\3\2\2\2\u00b2\u04b5\3\2\2\2\u00b4\u04c0\3\2" +
                    "\2\2\u00b6\u04d1\3\2\2\2\u00b8\u04d3\3\2\2\2\u00ba\u04d9\3\2\2\2\u00bc" +
                    "\u04f7\3\2\2\2\u00be\u04fb\3\2\2\2\u00c0\u04fe\3\2\2\2\u00c2\u0505\3\2" +
                    "\2\2\u00c4\u050a\3\2\2\2\u00c6\u0512\3\2\2\2\u00c8\u0518\3\2\2\2\u00ca" +
                    "\u051a\3\2\2\2\u00cc\u0520\3\2\2\2\u00ce\u00d0\5\4\3\2\u00cf\u00ce\3\2" +
                    "\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\5\6\4\2\u00d2" +
                    "\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2" +
                    "\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\5\b\5\2\u00d8" +
                    "\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2" +
                    "\2\2\u00db\u00e0\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5\u00ccg\2\u00de" +
                    "\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2" +
                    "\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\2\2\3\u00e4" +
                    "\3\3\2\2\2\u00e5\u00e7\5\u00ccg\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2" +
                    "\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ee\3\2\2\2\u00ea" +
                    "\u00e8\3\2\2\2\u00eb\u00ed\5j\66\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2" +
                    "\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0" +
                    "\u00ee\3\2\2\2\u00f1\u00f2\7\"\2\2\u00f2\u00f3\5f\64\2\u00f3\u00f7\7A" +
                    "\2\2\u00f4\u00f6\5\u00ccg\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7" +
                    "\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\5\3\2\2\2\u00f9\u00f7\3\2\2\2" +
                    "\u00fa\u00fc\5\u00ccg\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd" +
                    "\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2" +
                    "\2\2\u0100\u0102\7\33\2\2\u0101\u0103\7(\2\2\u0102\u0101\3\2\2\2\u0102" +
                    "\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\5f\64\2\u0105\u0106\7C" +
                    "\2\2\u0106\u0108\7U\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108" +
                    "\u0109\3\2\2\2\u0109\u010d\7A\2\2\u010a\u010c\5\u00ccg\2\u010b\u010a\3" +
                    "\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e" +
                    "\7\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\5\f\7\2\u0111\u0110\3\2\2\2" +
                    "\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116" +
                    "\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u012e\5\20\t\2\u0117\u0119\5\f\7\2" +
                    "\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b" +
                    "\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u012e\5\30\r\2" +
                    "\u011e\u0120\5\f\7\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f" +
                    "\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124" +
                    "\u012e\5 \21\2\u0125\u0127\5\f\7\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2" +
                    "\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a" +
                    "\u0128\3\2\2\2\u012b\u012e\5v<\2\u012c\u012e\7A\2\2\u012d\u0113\3\2\2" +
                    "\2\u012d\u011a\3\2\2\2\u012d\u0121\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u012c" +
                    "\3\2\2\2\u012e\t\3\2\2\2\u012f\u0132\5\f\7\2\u0130\u0132\t\2\2\2\u0131" +
                    "\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\13\3\2\2\2\u0133\u0136\5j\66" +
                    "\2\u0134\u0136\t\3\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\r" +
                    "\3\2\2\2\u0137\u013a\7\24\2\2\u0138\u013a\5j\66\2\u0139\u0137\3\2\2\2" +
                    "\u0139\u0138\3\2\2\2\u013a\17\3\2\2\2\u013b\u013c\7\13\2\2\u013c\u013e" +
                    "\7f\2\2\u013d\u013f\5\22\n\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f" +
                    "\u0142\3\2\2\2\u0140\u0141\7\23\2\2\u0141\u0143\5N(\2\u0142\u0140\3\2" +
                    "\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0145\7\32\2\2\u0145" +
                    "\u0147\5\"\22\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3" +
                    "\2\2\2\u0148\u0149\5$\23\2\u0149\21\3\2\2\2\u014a\u014b\7F\2\2\u014b\u0150" +
                    "\5\24\13\2\u014c\u014d\7B\2\2\u014d\u014f\5\24\13\2\u014e\u014c\3\2\2" +
                    "\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153" +
                    "\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7E\2\2\u0154\23\3\2\2\2\u0155" +
                    "\u0158\7f\2\2\u0156\u0157\7\23\2\2\u0157\u0159\5\26\f\2\u0158\u0156\3" +
                    "\2\2\2\u0158\u0159\3\2\2\2\u0159\25\3\2\2\2\u015a\u015f\5N(\2\u015b\u015c" +
                    "\7W\2\2\u015c\u015e\5N(\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f" +
                    "\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\27\3\2\2\2\u0161\u015f\3\2\2" +
                    "\2\u0162\u0163\7\22\2\2\u0163\u0166\7f\2\2\u0164\u0165\7\32\2\2\u0165" +
                    "\u0167\5\"\22\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3" +
                    "\2\2\2\u0168\u016a\7=\2\2\u0169\u016b\5\32\16\2\u016a\u0169\3\2\2\2\u016a" +
                    "\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e\7B\2\2\u016d\u016c\3\2" +
                    "\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\5\36\20\2\u0170" +
                    "\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7>" +
                    "\2\2\u0173\31\3\2\2\2\u0174\u0179\5\34\17\2\u0175\u0176\7B\2\2\u0176\u0178" +
                    "\5\34\17\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2" +
                    "\u0179\u017a\3\2\2\2\u017a\33\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e" +
                    "\5j\66\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f" +
                    "\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\7f" +
                    "\2\2\u0183\u0185\5\u00caf\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185" +
                    "\u0187\3\2\2\2\u0186\u0188\5$\23\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2" +
                    "\2\2\u0188\35\3\2\2\2\u0189\u018d\7A\2\2\u018a\u018c\5(\25\2\u018b\u018a" +
                    "\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e" +
                    "\37\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\36\2\2\u0191\u0193\7f\2" +
                    "\2\u0192\u0194\5\22\n\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194" +
                    "\u0197\3\2\2\2\u0195\u0196\7\23\2\2\u0196\u0198\5\"\22\2\u0197\u0195\3" +
                    "\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\5&\24\2\u019a" +
                    "!\3\2\2\2\u019b\u01a0\5N(\2\u019c\u019d\7B\2\2\u019d\u019f\5N(\2\u019e" +
                    "\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2" +
                    "\2\2\u01a1#\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a7\7=\2\2\u01a4\u01a6" +
                    "\5(\25\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7" +
                    "\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7>" +
                    "\2\2\u01ab%\3\2\2\2\u01ac\u01b0\7=\2\2\u01ad\u01af\5\66\34\2\u01ae\u01ad" +
                    "\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1" +
                    "\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7>\2\2\u01b4\'\3\2\2\2" +
                    "\u01b5\u01c3\7A\2\2\u01b6\u01b8\7(\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8" +
                    "\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c3\5\u0086D\2\u01ba\u01bc\5\n\6" +
                    "\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be" +
                    "\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\5*\26\2\u01c1" +
                    "\u01c3\5\u00ccg\2\u01c2\u01b5\3\2\2\2\u01c2\u01b7\3\2\2\2\u01c2\u01bd" +
                    "\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3)\3\2\2\2\u01c4\u01ce\5,\27\2\u01c5" +
                    "\u01ce\5.\30\2\u01c6\u01ce\5\64\33\2\u01c7\u01ce\5\60\31\2\u01c8\u01ce" +
                    "\5\62\32\2\u01c9\u01ce\5 \21\2\u01ca\u01ce\5v<\2\u01cb\u01ce\5\20\t\2" +
                    "\u01cc\u01ce\5\30\r\2\u01cd\u01c4\3\2\2\2\u01cd\u01c5\3\2\2\2\u01cd\u01c6" +
                    "\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd" +
                    "\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce+\3\2\2\2" +
                    "\u01cf\u01d2\5N(\2\u01d0\u01d2\7\62\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0" +
                    "\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\7f\2\2\u01d4\u01d9\5Z.\2\u01d5" +
                    "\u01d6\7?\2\2\u01d6\u01d8\7@\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2" +
                    "\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01de\3\2\2\2\u01db\u01d9" +
                    "\3\2\2\2\u01dc\u01dd\7/\2\2\u01dd\u01df\5X-\2\u01de\u01dc\3\2\2\2\u01de" +
                    "\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e3\5b\62\2\u01e1\u01e3\7A" +
                    "\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3-\3\2\2\2\u01e4\u01e5" +
                    "\5\22\n\2\u01e5\u01e6\5,\27\2\u01e6/\3\2\2\2\u01e7\u01e8\7f\2\2\u01e8" +
                    "\u01eb\5Z.\2\u01e9\u01ea\7/\2\2\u01ea\u01ec\5X-\2\u01eb\u01e9\3\2\2\2" +
                    "\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5d\63\2\u01ee\61" +
                    "\3\2\2\2\u01ef\u01f0\5\22\n\2\u01f0\u01f1\5\60\31\2\u01f1\63\3\2\2\2\u01f2" +
                    "\u01f3\5N(\2\u01f3\u01f4\5B\"\2\u01f4\u01f5\7A\2\2\u01f5\65\3\2\2\2\u01f6" +
                    "\u01f8\5\n\6\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2" +
                    "\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc" +
                    "\u01ff\58\35\2\u01fd\u01ff\7A\2\2\u01fe\u01f9\3\2\2\2\u01fe\u01fd\3\2" +
                    "\2\2\u01ff\67\3\2\2\2\u0200\u0208\5:\36\2\u0201\u0208\5> \2\u0202\u0208" +
                    "\5@!\2\u0203\u0208\5 \21\2\u0204\u0208\5v<\2\u0205\u0208\5\20\t\2\u0206" +
                    "\u0208\5\30\r\2\u0207\u0200\3\2\2\2\u0207\u0201\3\2\2\2\u0207\u0202\3" +
                    "\2\2\2\u0207\u0203\3\2\2\2\u0207\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207" +
                    "\u0206\3\2\2\2\u02089\3\2\2\2\u0209\u020a\5N(\2\u020a\u020f\5<\37\2\u020b" +
                    "\u020c\7B\2\2\u020c\u020e\5<\37\2\u020d\u020b\3\2\2\2\u020e\u0211\3\2" +
                    "\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211" +
                    "\u020f\3\2\2\2\u0212\u0213\7A\2\2\u0213;\3\2\2\2\u0214\u0219\7f\2\2\u0215" +
                    "\u0216\7?\2\2\u0216\u0218\7@\2\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2" +
                    "\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219" +
                    "\3\2\2\2\u021c\u021d\7D\2\2\u021d\u021e\5H%\2\u021e=\3\2\2\2\u021f\u0222" +
                    "\5N(\2\u0220\u0222\7\62\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222" +
                    "\u0223\3\2\2\2\u0223\u0224\7f\2\2\u0224\u0229\5Z.\2\u0225\u0226\7?\2\2" +
                    "\u0226\u0228\7@\2\2\u0227\u0225\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227" +
                    "\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022e\3\2\2\2\u022b\u0229\3\2\2\2\u022c" +
                    "\u022d\7/\2\2\u022d\u022f\5X-\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2" +
                    "\2\u022f\u0230\3\2\2\2\u0230\u0231\7A\2\2\u0231?\3\2\2\2\u0232\u0233\5" +
                    "\22\n\2\u0233\u0234\5> \2\u0234A\3\2\2\2\u0235\u023a\5D#\2\u0236\u0237" +
                    "\7B\2\2\u0237\u0239\5D#\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a" +
                    "\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023bC\3\2\2\2\u023c\u023a\3\2\2\2" +
                    "\u023d\u0240\5F$\2\u023e\u023f\7D\2\2\u023f\u0241\5H%\2\u0240\u023e\3" +
                    "\2\2\2\u0240\u0241\3\2\2\2\u0241E\3\2\2\2\u0242\u0247\7f\2\2\u0243\u0244" +
                    "\7?\2\2\u0244\u0246\7@\2\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247" +
                    "\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248G\3\2\2\2\u0249\u0247\3\2\2\2" +
                    "\u024a\u024d\5J&\2\u024b\u024d\5\u00b0Y\2\u024c\u024a\3\2\2\2\u024c\u024b" +
                    "\3\2\2\2\u024dI\3\2\2\2\u024e\u025a\7=\2\2\u024f\u0254\5H%\2\u0250\u0251" +
                    "\7B\2\2\u0251\u0253\5H%\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254" +
                    "\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2" +
                    "\2\2\u0257\u0259\7B\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259" +
                    "\u025b\3\2\2\2\u025a\u024f\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2" +
                    "\2\2\u025c\u025d\7>\2\2\u025dK\3\2\2\2\u025e\u025f\7f\2\2\u025fM\3\2\2" +
                    "\2\u0260\u0265\5P)\2\u0261\u0262\7?\2\2\u0262\u0264\7@\2\2\u0263\u0261" +
                    "\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266" +
                    "\u0271\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026d\5R*\2\u0269\u026a\7?\2" +
                    "\2\u026a\u026c\7@\2\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b" +
                    "\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u0270" +
                    "\u0260\3\2\2\2\u0270\u0268\3\2\2\2\u0271O\3\2\2\2\u0272\u0274\7f\2\2\u0273" +
                    "\u0275\5T+\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u027d\3\2\2" +
                    "\2\u0276\u0277\7C\2\2\u0277\u0279\7f\2\2\u0278\u027a\5T+\2\u0279\u0278" +
                    "\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0276\3\2\2\2\u027c" +
                    "\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027eQ\3\2\2\2" +
                    "\u027f\u027d\3\2\2\2\u0280\u0281\t\4\2\2\u0281S\3\2\2\2\u0282\u0283\7" +
                    "F\2\2\u0283\u0288\5V,\2\u0284\u0285\7B\2\2\u0285\u0287\5V,\2\u0286\u0284" +
                    "\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289" +
                    "\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\7E\2\2\u028cU\3\2\2\2\u028d" +
                    "\u0294\5N(\2\u028e\u0291\7I\2\2\u028f\u0290\t\5\2\2\u0290\u0292\5N(\2" +
                    "\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u028d" +
                    "\3\2\2\2\u0293\u028e\3\2\2\2\u0294W\3\2\2\2\u0295\u029a\5f\64\2\u0296" +
                    "\u0297\7B\2\2\u0297\u0299\5f\64\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2" +
                    "\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029bY\3\2\2\2\u029c\u029a" +
                    "\3\2\2\2\u029d\u029f\7;\2\2\u029e\u02a0\5\\/\2\u029f\u029e\3\2\2\2\u029f" +
                    "\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\7<\2\2\u02a2[\3\2\2\2\u02a3" +
                    "\u02a8\5^\60\2\u02a4\u02a5\7B\2\2\u02a5\u02a7\5^\60\2\u02a6\u02a4\3\2" +
                    "\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9" +
                    "\u02ad\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac\7B\2\2\u02ac\u02ae\5`\61" +
                    "\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02b1" +
                    "\5`\61\2\u02b0\u02a3\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1]\3\2\2\2\u02b2" +
                    "\u02b4\5\16\b\2\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3" +
                    "\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8" +
                    "\u02b9\5N(\2\u02b9\u02ba\5F$\2\u02ba_\3\2\2\2\u02bb\u02bd\5\16\b\2\u02bc" +
                    "\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2" +
                    "\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c2\5N(\2\u02c2\u02c3" +
                    "\7h\2\2\u02c3\u02c4\5F$\2\u02c4a\3\2\2\2\u02c5\u02c6\5\u0086D\2\u02c6" +
                    "c\3\2\2\2\u02c7\u02c8\5\u0086D\2\u02c8e\3\2\2\2\u02c9\u02ce\7f\2\2\u02ca" +
                    "\u02cb\7C\2\2\u02cb\u02cd\7f\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2" +
                    "\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfg\3\2\2\2\u02d0\u02ce" +
                    "\3\2\2\2\u02d1\u02d2\t\6\2\2\u02d2i\3\2\2\2\u02d3\u02d4\7g\2\2\u02d4\u02db" +
                    "\5l\67\2\u02d5\u02d8\7;\2\2\u02d6\u02d9\5n8\2\u02d7\u02d9\5r:\2\u02d8" +
                    "\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2" +
                    "\2\2\u02da\u02dc\7<\2\2\u02db\u02d5\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc" +
                    "k\3\2\2\2\u02dd\u02de\5f\64\2\u02dem\3\2\2\2\u02df\u02e4\5p9\2\u02e0\u02e1" +
                    "\7B\2\2\u02e1\u02e3\5p9\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4" +
                    "\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5o\3\2\2\2\u02e6\u02e4\3\2\2\2" +
                    "\u02e7\u02e8\7f\2\2\u02e8\u02e9\7D\2\2\u02e9\u02ea\5r:\2\u02eaq\3\2\2" +
                    "\2\u02eb\u02ef\5\u00b0Y\2\u02ec\u02ef\5j\66\2\u02ed\u02ef\5t;\2\u02ee" +
                    "\u02eb\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02efs\3\2\2\2" +
                    "\u02f0\u02f9\7=\2\2\u02f1\u02f6\5r:\2\u02f2\u02f3\7B\2\2\u02f3\u02f5\5" +
                    "r:\2\u02f4\u02f2\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6" +
                    "\u02f7\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02f1\3\2" +
                    "\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02fd\7B\2\2\u02fc" +
                    "\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7>" +
                    "\2\2\u02ffu\3\2\2\2\u0300\u0301\7g\2\2\u0301\u0302\7\36\2\2\u0302\u0303" +
                    "\7f\2\2\u0303\u0304\5x=\2\u0304w\3\2\2\2\u0305\u0309\7=\2\2\u0306\u0308" +
                    "\5z>\2\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309" +
                    "\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d\7>" +
                    "\2\2\u030dy\3\2\2\2\u030e\u0310\5\n\6\2\u030f\u030e\3\2\2\2\u0310\u0313" +
                    "\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313" +
                    "\u0311\3\2\2\2\u0314\u0317\5|?\2\u0315\u0317\7A\2\2\u0316\u0311\3\2\2" +
                    "\2\u0316\u0315\3\2\2\2\u0317{\3\2\2\2\u0318\u0319\5N(\2\u0319\u031a\5" +
                    "~@\2\u031a\u031b\7A\2\2\u031b\u032d\3\2\2\2\u031c\u031e\5\20\t\2\u031d" +
                    "\u031f\7A\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u032d\3\2" +
                    "\2\2\u0320\u0322\5 \21\2\u0321\u0323\7A\2\2\u0322\u0321\3\2\2\2\u0322" +
                    "\u0323\3\2\2\2\u0323\u032d\3\2\2\2\u0324\u0326\5\30\r\2\u0325\u0327\7" +
                    "A\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u032d\3\2\2\2\u0328" +
                    "\u032a\5v<\2\u0329\u032b\7A\2\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2" +
                    "\2\u032b\u032d\3\2\2\2\u032c\u0318\3\2\2\2\u032c\u031c\3\2\2\2\u032c\u0320" +
                    "\3\2\2\2\u032c\u0324\3\2\2\2\u032c\u0328\3\2\2\2\u032d}\3\2\2\2\u032e" +
                    "\u0331\5\u0080A\2\u032f\u0331\5\u0082B\2\u0330\u032e\3\2\2\2\u0330\u032f" +
                    "\3\2\2\2\u0331\177\3\2\2\2\u0332\u0333\7f\2\2\u0333\u0334\7;\2\2\u0334" +
                    "\u0336\7<\2\2\u0335\u0337\5\u0084C\2\u0336\u0335\3\2\2\2\u0336\u0337\3" +
                    "\2\2\2\u0337\u0081\3\2\2\2\u0338\u0339\5B\"\2\u0339\u0083\3\2\2\2\u033a" +
                    "\u033b\7\16\2\2\u033b\u033c\5r:\2\u033c\u0085\3\2\2\2\u033d\u0341\7=\2" +
                    "\2\u033e\u0340\5\u0088E\2\u033f\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341" +
                    "\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2" +
                    "\2\2\u0344\u0345\7>\2\2\u0345\u0087\3\2\2\2\u0346\u034b\5\u008aF\2\u0347" +
                    "\u034b\5\u008eH\2\u0348\u034b\5\b\5\2\u0349\u034b\5\u00ccg\2\u034a\u0346" +
                    "\3\2\2\2\u034a\u0347\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b" +
                    "\u0089\3\2\2\2\u034c\u034d\5\u008cG\2\u034d\u034e\7A\2\2\u034e\u008b\3" +
                    "\2\2\2\u034f\u0351\5\16\b\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352" +
                    "\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2" +
                    "\2\2\u0355\u0356\5N(\2\u0356\u0357\5B\"\2\u0357\u008d\3\2\2\2\u0358\u03c1" +
                    "\5\u0086D\2\u0359\u035a\7\4\2\2\u035a\u035d\5\u00b0Y\2\u035b\u035c\7J" +
                    "\2\2\u035c\u035e\5\u00b0Y\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e" +
                    "\u035f\3\2\2\2\u035f\u0360\7A\2\2\u0360\u03c1\3\2\2\2\u0361\u0362\7\30" +
                    "\2\2\u0362\u0363\5\u00a8U\2\u0363\u0366\5\u008eH\2\u0364\u0365\7\21\2" +
                    "\2\u0365\u0367\5\u008eH\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367" +
                    "\u03c1\3\2\2\2\u0368\u0369\7\27\2\2\u0369\u036a\7;\2\2\u036a\u036b\5\u00a0" +
                    "Q\2\u036b\u036c\7<\2\2\u036c\u036d\5\u008eH\2\u036d\u03c1\3\2\2\2\u036e" +
                    "\u036f\7\64\2\2\u036f\u0370\5\u00a8U\2\u0370\u0371\5\u008eH\2\u0371\u03c1" +
                    "\3\2\2\2\u0372\u0373\7\17\2\2\u0373\u0374\5\u008eH\2\u0374\u0375\7\64" +
                    "\2\2\u0375\u0376\5\u00a8U\2\u0376\u0377\7A\2\2\u0377\u03c1\3\2\2\2\u0378" +
                    "\u0379\7\61\2\2\u0379\u0383\5\u0086D\2\u037a\u037c\5\u0090I\2\u037b\u037a" +
                    "\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e" +
                    "\u0380\3\2\2\2\u037f\u0381\5\u0094K\2\u0380\u037f\3\2\2\2\u0380\u0381" +
                    "\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0384\5\u0094K\2\u0383\u037b\3\2\2" +
                    "\2\u0383\u0382\3\2\2\2\u0384\u03c1\3\2\2\2\u0385\u0386\7\61\2\2\u0386" +
                    "\u0387\5\u0096L\2\u0387\u038b\5\u0086D\2\u0388\u038a\5\u0090I\2\u0389" +
                    "\u0388\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2" +
                    "\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u0390\5\u0094K\2\u038f" +
                    "\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u03c1\3\2\2\2\u0391\u0392\7+" +
                    "\2\2\u0392\u0393\5\u00a8U\2\u0393\u0397\7=\2\2\u0394\u0396\5\u009cO\2" +
                    "\u0395\u0394\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398" +
                    "\3\2\2\2\u0398\u039d\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039c\5\u009eP" +
                    "\2\u039b\u039a\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e" +
                    "\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a1\7>\2\2\u03a1" +
                    "\u03c1\3\2\2\2\u03a2\u03a3\7,\2\2\u03a3\u03a4\5\u00a8U\2\u03a4\u03a5\5" +
                    "\u0086D\2\u03a5\u03c1\3\2\2\2\u03a6\u03a8\7&\2\2\u03a7\u03a9\5\u00b0Y" +
                    "\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03c1" +
                    "\7A\2\2\u03ab\u03ac\7.\2\2\u03ac\u03ad\5\u00b0Y\2\u03ad\u03ae\7A\2\2\u03ae" +
                    "\u03c1\3\2\2\2\u03af\u03b1\7\6\2\2\u03b0\u03b2\7f\2\2\u03b1\u03b0\3\2" +
                    "\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03c1\7A\2\2\u03b4" +
                    "\u03b6\7\r\2\2\u03b5\u03b7\7f\2\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2" +
                    "\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03c1\7A\2\2\u03b9\u03c1\7A\2\2\u03ba\u03bb" +
                    "\5\u00acW\2\u03bb\u03bc\7A\2\2\u03bc\u03c1\3\2\2\2\u03bd\u03be\7f\2\2" +
                    "\u03be\u03bf\7J\2\2\u03bf\u03c1\5\u008eH\2\u03c0\u0358\3\2\2\2\u03c0\u0359" +
                    "\3\2\2\2\u03c0\u0361\3\2\2\2\u03c0\u0368\3\2\2\2\u03c0\u036e\3\2\2\2\u03c0" +
                    "\u0372\3\2\2\2\u03c0\u0378\3\2\2\2\u03c0\u0385\3\2\2\2\u03c0\u0391\3\2" +
                    "\2\2\u03c0\u03a2\3\2\2\2\u03c0\u03a6\3\2\2\2\u03c0\u03ab\3\2\2\2\u03c0" +
                    "\u03af\3\2\2\2\u03c0\u03b4\3\2\2\2\u03c0\u03b9\3\2\2\2\u03c0\u03ba\3\2" +
                    "\2\2\u03c0\u03bd\3\2\2\2\u03c1\u008f\3\2\2\2\u03c2\u03c3\7\t\2\2\u03c3" +
                    "\u03c7\7;\2\2\u03c4\u03c6\5\16\b\2\u03c5\u03c4\3\2\2\2\u03c6\u03c9\3\2" +
                    "\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9" +
                    "\u03c7\3\2\2\2\u03ca\u03cb\5\u0092J\2\u03cb\u03cc\7f\2\2\u03cc\u03cd\7" +
                    "<\2\2\u03cd\u03ce\5\u0086D\2\u03ce\u0091\3\2\2\2\u03cf\u03d4\5f\64\2\u03d0" +
                    "\u03d1\7X\2\2\u03d1\u03d3\5f\64\2\u03d2\u03d0\3\2\2\2\u03d3\u03d6\3\2" +
                    "\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u0093\3\2\2\2\u03d6" +
                    "\u03d4\3\2\2\2\u03d7\u03d8\7\25\2\2\u03d8\u03d9\5\u0086D\2\u03d9\u0095" +
                    "\3\2\2\2\u03da\u03db\7;\2\2\u03db\u03dd\5\u0098M\2\u03dc\u03de\7A\2\2" +
                    "\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0" +
                    "\7<\2\2\u03e0\u0097\3\2\2\2\u03e1\u03e6\5\u009aN\2\u03e2\u03e3\7A\2\2" +
                    "\u03e3\u03e5\5\u009aN\2\u03e4\u03e2\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6" +
                    "\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u0099\3\2\2\2\u03e8\u03e6\3\2" +
                    "\2\2\u03e9\u03eb\5\16\b\2\u03ea\u03e9\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec" +
                    "\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03ec\3\2" +
                    "\2\2\u03ef\u03f0\5P)\2\u03f0\u03f1\5F$\2\u03f1\u03f2\7D\2\2\u03f2\u03f3" +
                    "\5\u00b0Y\2\u03f3\u009b\3\2\2\2\u03f4\u03f6\5\u009eP\2\u03f5\u03f4\3\2" +
                    "\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8" +
                    "\u03fa\3\2\2\2\u03f9\u03fb\5\u0088E\2\u03fa\u03f9\3\2\2\2\u03fb\u03fc" +
                    "\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u009d\3\2\2\2\u03fe" +
                    "\u03ff\7\b\2\2\u03ff\u0400\5\u00aeX\2\u0400\u0401\7J\2\2\u0401\u0409\3" +
                    "\2\2\2\u0402\u0403\7\b\2\2\u0403\u0404\5L\'\2\u0404\u0405\7J\2\2\u0405" +
                    "\u0409\3\2\2\2\u0406\u0407\7\16\2\2\u0407\u0409\7J\2\2\u0408\u03fe\3\2" +
                    "\2\2\u0408\u0402\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u009f\3\2\2\2\u040a" +
                    "\u0417\5\u00a4S\2\u040b\u040d\5\u00a2R\2\u040c\u040b\3\2\2\2\u040c\u040d" +
                    "\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\7A\2\2\u040f\u0411\5\u00b0Y\2" +
                    "\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414" +
                    "\7A\2\2\u0413\u0415\5\u00a6T\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2" +
                    "\u0415\u0417\3\2\2\2\u0416\u040a\3\2\2\2\u0416\u040c\3\2\2\2\u0417\u00a1" +
                    "\3\2\2\2\u0418\u041b\5\u008cG\2\u0419\u041b\5\u00aaV\2\u041a\u0418\3\2" +
                    "\2\2\u041a\u0419\3\2\2\2\u041b\u00a3\3\2\2\2\u041c\u041e\5\16\b\2\u041d" +
                    "\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2" +
                    "\2\2\u0420\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0423\5N(\2\u0423\u0424" +
                    "\5F$\2\u0424\u0425\7J\2\2\u0425\u0426\5\u00b0Y\2\u0426\u00a5\3\2\2\2\u0427" +
                    "\u0428\5\u00aaV\2\u0428\u00a7\3\2\2\2\u0429\u042a\7;\2\2\u042a\u042b\5" +
                    "\u00b0Y\2\u042b\u042c\7<\2\2\u042c\u00a9\3\2\2\2\u042d\u0432\5\u00b0Y" +
                    "\2\u042e\u042f\7B\2\2\u042f\u0431\5\u00b0Y\2\u0430\u042e\3\2\2\2\u0431" +
                    "\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u00ab\3\2" +
                    "\2\2\u0434\u0432\3\2\2\2\u0435\u0436\5\u00b0Y\2\u0436\u00ad\3\2\2\2\u0437" +
                    "\u0438\5\u00b0Y\2\u0438\u00af\3\2\2\2\u0439\u043a\bY\1\2\u043a\u0447\5" +
                    "\u00b2Z\2\u043b\u043c\7!\2\2\u043c\u0447\5\u00b4[\2\u043d\u043e\7;\2\2" +
                    "\u043e\u043f\5N(\2\u043f\u0440\7<\2\2\u0440\u0441\5\u00b0Y\23\u0441\u0447" +
                    "\3\2\2\2\u0442\u0443\t\7\2\2\u0443\u0447\5\u00b0Y\21\u0444\u0445\t\b\2" +
                    "\2\u0445\u0447\5\u00b0Y\20\u0446\u0439\3\2\2\2\u0446\u043b\3\2\2\2\u0446" +
                    "\u043d\3\2\2\2\u0446\u0442\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u049d\3\2" +
                    "\2\2\u0448\u0449\f\17\2\2\u0449\u044a\t\t\2\2\u044a\u049c\5\u00b0Y\20" +
                    "\u044b\u044c\f\16\2\2\u044c\u044d\t\n\2\2\u044d\u049c\5\u00b0Y\17\u044e" +
                    "\u0456\f\r\2\2\u044f\u0450\7F\2\2\u0450\u0457\7F\2\2\u0451\u0452\7E\2" +
                    "\2\u0452\u0453\7E\2\2\u0453\u0457\7E\2\2\u0454\u0455\7E\2\2\u0455\u0457" +
                    "\7E\2\2\u0456\u044f\3\2\2\2\u0456\u0451\3\2\2\2\u0456\u0454\3\2\2\2\u0457" +
                    "\u0458\3\2\2\2\u0458\u049c\5\u00b0Y\16\u0459\u045a\f\f\2\2\u045a\u045b" +
                    "\t\13\2\2\u045b\u049c\5\u00b0Y\r\u045c\u045d\f\n\2\2\u045d\u045e\t\f\2" +
                    "\2\u045e\u049c\5\u00b0Y\13\u045f\u0460\f\t\2\2\u0460\u0461\7W\2\2\u0461" +
                    "\u049c\5\u00b0Y\n\u0462\u0463\f\b\2\2\u0463\u0464\7Y\2\2\u0464\u049c\5" +
                    "\u00b0Y\t\u0465\u0466\f\7\2\2\u0466\u0467\7X\2\2\u0467\u049c\5\u00b0Y" +
                    "\b\u0468\u0469\f\6\2\2\u0469\u046a\7O\2\2\u046a\u049c\5\u00b0Y\7\u046b" +
                    "\u046c\f\5\2\2\u046c\u046d\7P\2\2\u046d\u049c\5\u00b0Y\6\u046e\u046f\f" +
                    "\4\2\2\u046f\u0470\7I\2\2\u0470\u0471\5\u00b0Y\2\u0471\u0472\7J\2\2\u0472" +
                    "\u0473\5\u00b0Y\5\u0473\u049c\3\2\2\2\u0474\u0475\f\3\2\2\u0475\u0476" +
                    "\t\r\2\2\u0476\u049c\5\u00b0Y\3\u0477\u0478\f\33\2\2\u0478\u0479\7C\2" +
                    "\2\u0479\u049c\7f\2\2\u047a\u047b\f\32\2\2\u047b\u047c\7C\2\2\u047c\u049c" +
                    "\7-\2\2\u047d\u047e\f\31\2\2\u047e\u047f\7C\2\2\u047f\u0481\7!\2\2\u0480" +
                    "\u0482\5\u00c0a\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483" +
                    "\3\2\2\2\u0483\u049c\5\u00b8]\2\u0484\u0485\f\30\2\2\u0485\u0486\7C\2" +
                    "\2\u0486\u0487\7*\2\2\u0487\u049c\5\u00c6d\2\u0488\u0489\f\27\2\2\u0489" +
                    "\u048a\7C\2\2\u048a\u049c\5\u00be`\2\u048b\u048c\f\26\2\2\u048c\u048d" +
                    "\7?\2\2\u048d\u048e\5\u00b0Y\2\u048e\u048f\7@\2\2\u048f\u049c\3\2\2\2" +
                    "\u0490\u0491\f\25\2\2\u0491\u0493\7;\2\2\u0492\u0494\5\u00aaV\2\u0493" +
                    "\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u049c\7<" +
                    "\2\2\u0496\u0497\f\22\2\2\u0497\u049c\t\16\2\2\u0498\u0499\f\13\2\2\u0499" +
                    "\u049a\7\34\2\2\u049a\u049c\5N(\2\u049b\u0448\3\2\2\2\u049b\u044b\3\2" +
                    "\2\2\u049b\u044e\3\2\2\2\u049b\u0459\3\2\2\2\u049b\u045c\3\2\2\2\u049b" +
                    "\u045f\3\2\2\2\u049b\u0462\3\2\2\2\u049b\u0465\3\2\2\2\u049b\u0468\3\2" +
                    "\2\2\u049b\u046b\3\2\2\2\u049b\u046e\3\2\2\2\u049b\u0474\3\2\2\2\u049b" +
                    "\u0477\3\2\2\2\u049b\u047a\3\2\2\2\u049b\u047d\3\2\2\2\u049b\u0484\3\2" +
                    "\2\2\u049b\u0488\3\2\2\2\u049b\u048b\3\2\2\2\u049b\u0490\3\2\2\2\u049b" +
                    "\u0496\3\2\2\2\u049b\u0498\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2" +
                    "\2\2\u049d\u049e\3\2\2\2\u049e\u00b1\3\2\2\2\u049f\u049d\3\2\2\2\u04a0" +
                    "\u04a1\7;\2\2\u04a1\u04a2\5\u00b0Y\2\u04a2\u04a3\7<\2\2\u04a3\u04b6\3" +
                    "\2\2\2\u04a4\u04b6\7-\2\2\u04a5\u04b6\7*\2\2\u04a6\u04b6\5h\65\2\u04a7" +
                    "\u04b6\7f\2\2\u04a8\u04a9\5N(\2\u04a9\u04aa\7C\2\2\u04aa\u04ab\7\13\2" +
                    "\2\u04ab\u04b6\3\2\2\2\u04ac\u04ad\7\62\2\2\u04ad\u04ae\7C\2\2\u04ae\u04b6" +
                    "\7\13\2\2\u04af\u04b3\5\u00c0a\2\u04b0\u04b4\5\u00c8e\2\u04b1\u04b2\7" +
                    "-\2\2\u04b2\u04b4\5\u00caf\2\u04b3\u04b0\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4" +
                    "\u04b6\3\2\2\2\u04b5\u04a0\3\2\2\2\u04b5\u04a4\3\2\2\2\u04b5\u04a5\3\2" +
                    "\2\2\u04b5\u04a6\3\2\2\2\u04b5\u04a7\3\2\2\2\u04b5\u04a8\3\2\2\2\u04b5" +
                    "\u04ac\3\2\2\2\u04b5\u04af\3\2\2\2\u04b6\u00b3\3\2\2\2\u04b7\u04b8\5\u00c0" +
                    "a\2\u04b8\u04b9\5\u00b6\\\2\u04b9\u04ba\5\u00bc_\2\u04ba\u04c1\3\2\2\2" +
                    "\u04bb\u04be\5\u00b6\\\2\u04bc\u04bf\5\u00ba^\2\u04bd\u04bf\5\u00bc_\2" +
                    "\u04be\u04bc\3\2\2\2\u04be\u04bd\3\2\2\2\u04bf\u04c1\3\2\2\2\u04c0\u04b7" +
                    "\3\2\2\2\u04c0\u04bb\3\2\2\2\u04c1\u00b5\3\2\2\2\u04c2\u04c4\7f\2\2\u04c3" +
                    "\u04c5\5\u00c2b\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04cd" +
                    "\3\2\2\2\u04c6\u04c7\7C\2\2\u04c7\u04c9\7f\2\2\u04c8\u04ca\5\u00c2b\2" +
                    "\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04c6" +
                    "\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce" +
                    "\u04d2\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d2\5R*\2\u04d1\u04c2\3\2\2" +
                    "\2\u04d1\u04d0\3\2\2\2\u04d2\u00b7\3\2\2\2\u04d3\u04d5\7f\2\2\u04d4\u04d6" +
                    "\5\u00c4c\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2" +
                    "\2\u04d7\u04d8\5\u00bc_\2\u04d8\u00b9\3\2\2\2\u04d9\u04f5\7?\2\2\u04da" +
                    "\u04df\7@\2\2\u04db\u04dc\7?\2\2\u04dc\u04de\7@\2\2\u04dd\u04db\3\2\2" +
                    "\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2" +
                    "\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04f6\5J&\2\u04e3\u04e4\5\u00b0Y\2" +
                    "\u04e4\u04eb\7@\2\2\u04e5\u04e6\7?\2\2\u04e6\u04e7\5\u00b0Y\2\u04e7\u04e8" +
                    "\7@\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04e5\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb" +
                    "\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04f2\3\2\2\2\u04ed\u04eb\3\2" +
                    "\2\2\u04ee\u04ef\7?\2\2\u04ef\u04f1\7@\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f4" +
                    "\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4" +
                    "\u04f2\3\2\2\2\u04f5\u04da\3\2\2\2\u04f5\u04e3\3\2\2\2\u04f6\u00bb\3\2" +
                    "\2\2\u04f7\u04f9\5\u00caf\2\u04f8\u04fa\5$\23\2\u04f9\u04f8\3\2\2\2\u04f9" +
                    "\u04fa\3\2\2\2\u04fa\u00bd\3\2\2\2\u04fb\u04fc\5\u00c0a\2\u04fc\u04fd" +
                    "\5\u00c8e\2\u04fd\u00bf\3\2\2\2\u04fe\u04ff\7F\2\2\u04ff\u0500\5\"\22" +
                    "\2\u0500\u0501\7E\2\2\u0501\u00c1\3\2\2\2\u0502\u0503\7F\2\2\u0503\u0506" +
                    "\7E\2\2\u0504\u0506\5T+\2\u0505\u0502\3\2\2\2\u0505\u0504\3\2\2\2\u0506" +
                    "\u00c3\3\2\2\2\u0507\u0508\7F\2\2\u0508\u050b\7E\2\2\u0509\u050b\5\u00c0" +
                    "a\2\u050a\u0507\3\2\2\2\u050a\u0509\3\2\2\2\u050b\u00c5\3\2\2\2\u050c" +
                    "\u0513\5\u00caf\2\u050d\u050e\7C\2\2\u050e\u0510\7f\2\2\u050f\u0511\5" +
                    "\u00caf\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2\2\2" +
                    "\u0512\u050c\3\2\2\2\u0512\u050d\3\2\2\2\u0513\u00c7\3\2\2\2\u0514\u0515" +
                    "\7*\2\2\u0515\u0519\5\u00c6d\2\u0516\u0517\7f\2\2\u0517\u0519\5\u00ca" +
                    "f\2\u0518\u0514\3\2\2\2\u0518\u0516\3\2\2\2\u0519\u00c9\3\2\2\2\u051a" +
                    "\u051c\7;\2\2\u051b\u051d\5\u00aaV\2\u051c\u051b\3\2\2\2\u051c\u051d\3" +
                    "\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\7<\2\2\u051f\u00cb\3\2\2\2\u0520" +
                    "\u0521\t\17\2\2\u0521\u00cd\3\2\2\2\u009c\u00cf\u00d4\u00da\u00e0\u00e8" +
                    "\u00ee\u00f7\u00fd\u0102\u0107\u010d\u0113\u011a\u0121\u0128\u012d\u0131" +
                    "\u0135\u0139\u013e\u0142\u0146\u0150\u0158\u015f\u0166\u016a\u016d\u0170" +
                    "\u0179\u017f\u0184\u0187\u018d\u0193\u0197\u01a0\u01a7\u01b0\u01b7\u01bd" +
                    "\u01c2\u01cd\u01d1\u01d9\u01de\u01e2\u01eb\u01f9\u01fe\u0207\u020f\u0219" +
                    "\u0221\u0229\u022e\u023a\u0240\u0247\u024c\u0254\u0258\u025a\u0265\u026d" +
                    "\u0270\u0274\u0279\u027d\u0288\u0291\u0293\u029a\u029f\u02a8\u02ad\u02b0" +
                    "\u02b5\u02be\u02ce\u02d8\u02db\u02e4\u02ee\u02f6\u02f9\u02fc\u0309\u0311" +
                    "\u0316\u031e\u0322\u0326\u032a\u032c\u0330\u0336\u0341\u034a\u0352\u035d" +
                    "\u0366\u037d\u0380\u0383\u038b\u038f\u0397\u039d\u03a8\u03b1\u03b6\u03c0" +
                    "\u03c7\u03d4\u03dd\u03e6\u03ec\u03f7\u03fc\u0408\u040c\u0410\u0414\u0416" +
                    "\u041a\u041f\u0432\u0446\u0456\u0481\u0493\u049b\u049d\u04b3\u04b5\u04be" +
                    "\u04c0\u04c4\u04c9\u04cd\u04d1\u04d5\u04df\u04eb\u04f2\u04f5\u04f9\u0505" +
                    "\u050a\u0510\u0512\u0518\u051c";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}