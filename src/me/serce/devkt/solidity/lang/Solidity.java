package me.serce.devkt.solidity.lang;

import kotlin.Pair;
import me.serce.devkt.solidity.lang.core.SolElementType;
import me.serce.devkt.solidity.lang.core.SolidityParserDefinition;
import me.serce.devkt.solidity.lang.core.SolidityTokenTypes;
import me.serce.devkt.solidity.lang.psi.SolNumberLiteral;
import org.ice1000.devkt.openapi.AnnotationHolder;
import org.ice1000.devkt.openapi.ColorScheme;
import org.ice1000.devkt.openapi.ExtendedDevKtLanguage;
import org.ice1000.devkt.openapi.PsiUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.TokenType;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;

public class Solidity<T> extends ExtendedDevKtLanguage<T> {

	private static final @NotNull
	Pair<String, String> stringPair = new Pair<>("/*", "*/");

	public Solidity() {
		super(SolidityLanguage.INSTANCE, new SolidityParserDefinition());
	}

	@Override
	public boolean satisfies(String fileName) {
		return fileName.endsWith(".sol");
	}

	@Nullable
	@Override
	public T attributesOf(IElementType type, ColorScheme<? extends T> colorScheme) {
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
	public void annotate(PsiElement element, AnnotationHolder<? super T> document, ColorScheme<? extends T> colorScheme) {
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
	public @NotNull
	Pair<String, String> getBlockComment() {
		return stringPair;
	}

	@Override
	public @NotNull
	String getLineCommentStart() {
		return "//";
	}
}
