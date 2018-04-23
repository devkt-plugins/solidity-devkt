package me.serce.devkt.solidity.lang.core;

import me.serce.devkt.solidity.lang.SolidityLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;

import static me.serce.devkt.solidity.lang.core.SolidityTokenTypes.*;

public class SolElementType extends IElementType {
	public SolElementType(@NotNull String debugName) {
		super(debugName, SolidityLanguage.INSTANCE);
	}

	public static final @NotNull
	TokenSet COMMENTS = TokenSet.create(LINECOMMENT, DOCCOMMENT);
	public static final @NotNull
	TokenSet NUMBERS = TokenSet.create(HEXNUMBER, DECIMALNUMBER, FIXEDNUMBER, SCIENTIFICNUMBER, NUMBERUNIT);
	public static final @NotNull
	TokenSet KEYWORDS = TokenSet.create(IMPORT,
			AS,
			PRAGMA,
			NEW,
			DELETE,
			EMIT,
			CONSTRUCTOR,
			CONTRACT,
			LIBRARY,
			INTERFACE,
			IS,
			STRUCT,
			FUNCTION,
			ENUM,
			PUBLIC,
			PRIVATE,
			INTERNAL,
			EXTERNAL,
			CONSTANT,
			PAYABLE,
			PURE,
			VIEW,
			IF,
			ELSE,
			FOR,
			WHILE,
			DO,
			BREAK,
			CONTINUE,
			THROW,
			USING,
			RETURN,
			RETURNS,
			MAPPING,
			EVENT,
			ANONYMOUS,
			MODIFIER,
			ASSEMBLY,
			BYTENUMTYPE,
			BYTESNUMTYPE,
			FIXEDNUMTYPE,
			INTNUMTYPE,
			UFIXEDNUMTYPE,
			UINTNUMTYPE,
			STRING,
			BOOL,
			ADDRESS,
			VAR,
			STORAGE,
			MEMORY,
			WEI,
			ETHER,
			SZABO,
			FINNEY,
			SECONDS,
			MINUTES,
			HOURS,
			DAYS,
			WEEKS,
			YEARS);
	public static final @NotNull
	TokenSet STRINGS = TokenSet.create(STRINGLITERAL);
	public static final @NotNull
	TokenSet OPERATORS = TokenSet.create(NOT,
			ASSIGN,
			PLUS_ASSIGN,
			MINUS_ASSIGN,
			MULT_ASSIGN,
			DIV_ASSIGN,
			PERCENT_ASSIGN,
			PLUS,
			MINUS,
			MULT,
			DIV,
			EXPONENT,
			CARET,
			LESS,
			MORE,
			LESSEQ,
			MOREEQ,
			AND,
			ANDAND,
			OR,
			OROR,
			EQ,
			NEQ,
			TO,
			INC,
			DEC,
			TILDE,
			PERCENT,
			LSHIFT,
			RSHIFT,
			LEFT_ASSEMBLY,
			RIGHT_ASSEMBLY);
}
