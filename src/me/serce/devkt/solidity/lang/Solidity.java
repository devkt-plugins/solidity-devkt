package me.serce.devkt.solidity.lang;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import me.serce.devkt.solidity.lang.core.SolElementType;
import me.serce.devkt.solidity.lang.core.SolidityParserDefinition;
import me.serce.devkt.solidity.lang.core.SolidityTokenTypes;
import me.serce.devkt.solidity.lang.psi.SolNumberLiteral;
import me.serce.devkt.solidity.lang.psi.SolParameterDef;
import org.ice1000.devkt.openapi.AnnotationHolder;
import org.ice1000.devkt.openapi.ColorScheme;
import org.ice1000.devkt.openapi.ExtendedDevKtLanguage;
import org.ice1000.devkt.openapi.PsiUtils;
import org.ice1000.devkt.openapi.util.CompletionElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.TokenType;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solidity<T> extends ExtendedDevKtLanguage<T> {

	private static final @NotNull Pair<String, String> stringPair = new Pair<>("/*", "*/");

	private static final @NotNull Set<CompletionElement> predefinedCompletions = CollectionsKt.mapTo(Arrays.asList(
			"import",
			"as",
			"pragma",
			"new",
			"delete",
			"emit",
			"constructor",
			"contract",
			"library",
			"interface",
			"is",
			"struct",
			"function",
			"enum",
			"public",
			"private",
			"internal",
			"external",
			"constant",
			"payable",
			"pure",
			"view",
			"if",
			"else",
			"for",
			"while",
			"do",
			"break",
			"continue",
			"throw",
			"using",
			"return",
			"returns",
			"mapping",
			"event",
			"anonymous",
			"modifier",
			"assembly",
			"bytenumtype",
			"bytesnumtype",
			"fixednumtype",
			"intnumtype",
			"ufixednumtype",
			"uintnumtype",
			"string",
			"bool",
			"address",
			"var",
			"storage",
			"memory",
			"wei",
			"ether",
			"szabo",
			"finney",
			"seconds",
			"minutes",
			"hours",
			"days",
			"weeks",
			"years"), new HashSet<>(), CompletionElement::new);

	public Solidity() {
		super(SolidityLanguage.INSTANCE, new SolidityParserDefinition());
	}

	@Override
	public boolean satisfies(@NotNull String fileName) {
		return fileName.endsWith(".sol");
	}

	@Nullable
	@Override
	public T attributesOf(@NotNull IElementType type, @NotNull ColorScheme<? extends T> colorScheme) {
		if (type == SolidityTokenTypes.COMMA) return colorScheme.getComma();
		if (type == SolidityTokenTypes.COLON) return colorScheme.getColon();
		if (type == SolidityTokenTypes.SEMICOLON) return colorScheme.getSemicolon();
		else if (type == SolidityTokenTypes.LINECOMMENT) return colorScheme.getLineComments();
		else if (type == SolidityTokenTypes.DOCCOMMENT) return colorScheme.getDocComments();
		else if (type == SolidityTokenTypes.STRINGLITERAL) return colorScheme.getString();
		else if (SolElementType.NUMBERS.contains(type)) return colorScheme.getNumbers();
		else if (SolElementType.OPERATORS.contains(type)) return colorScheme.getOperators();
		else if (SolElementType.KEYWORDS.contains(type)) return colorScheme.getKeywords();
		else return super.attributesOf(type, colorScheme);
	}

	@Override
	public @NotNull Set<CompletionElement> getInitialCompletionElementList() {
		return predefinedCompletions;
	}

	@Override
	public boolean shouldAddAsCompletion(@NotNull PsiElement element) {
		return element instanceof SolParameterDef;
	}

	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder<? super T> document, @NotNull ColorScheme<? extends T> colorScheme) {
		super.annotate(element, document, colorScheme);
		if (element instanceof SolNumberLiteral) {
			document.highlight(element, colorScheme.getNumbers());
			return;
		}
		function:
		{
			PsiElement prevSibling = element.getPrevSibling();
			if (prevSibling == null) break function;
			if (PsiUtils.getNodeType(prevSibling) == TokenType.WHITE_SPACE) prevSibling = prevSibling.getPrevSibling();
			if (prevSibling == null) break function;
			if (PsiUtils.getNodeType(prevSibling) == SolidityTokenTypes.FUNCTION)
				document.highlight(element, colorScheme.getFunction());
		}
		clazz:
		{
			PsiElement prevSibling = element.getPrevSibling();
			if (prevSibling == null) break clazz;
			if (PsiUtils.getNodeType(prevSibling) == TokenType.WHITE_SPACE) prevSibling = prevSibling.getPrevSibling();
			if (prevSibling == null) break clazz;
			if (PsiUtils.getNodeType(prevSibling) == SolidityTokenTypes.CONTRACT)
				document.highlight(element, colorScheme.getNamespace());
		}
	}

	@Override
	public @NotNull Pair<String, String> getBlockComment() {
		return stringPair;
	}

	@Override
	public @NotNull String getLineCommentStart() {
		return "//";
	}
}
