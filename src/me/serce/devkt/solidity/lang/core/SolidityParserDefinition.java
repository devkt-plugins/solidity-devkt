package me.serce.devkt.solidity.lang.core;

import me.serce.devkt.solidity.lang.SolidityLanguage;
import me.serce.devkt.solidity.lang.SolidityParser;
import me.serce.devkt.solidity.lang.psi.SolidityFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.lang.ParserDefinition;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.lexer.Lexer;
import org.jetbrains.kotlin.com.intellij.openapi.project.Project;
import org.jetbrains.kotlin.com.intellij.psi.FileViewProvider;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiFile;
import org.jetbrains.kotlin.com.intellij.psi.tree.IFileElementType;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;

public class SolidityParserDefinition implements ParserDefinition {
	private static IFileElementType FILE = new IFileElementType("SolidityFileType", SolidityLanguage.INSTANCE);

	@Override
	public @NotNull
	Lexer createLexer(Project project) {
		return new SolidityLexer();
	}

	@Override
	public PsiParser createParser(Project project) {
		return new SolidityParser();
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@Override
	public @NotNull
	TokenSet getCommentTokens() {
		return SolElementType.COMMENTS;
	}

	@Override
	public @NotNull
	TokenSet getStringLiteralElements() {
		return SolElementType.STRINGS;
	}

	@Override
	public @NotNull
	PsiElement createElement(ASTNode astNode) {
		return SolidityTokenTypes.Factory.createElement(astNode);
	}

	@Override
	public PsiFile createFile(FileViewProvider fileViewProvider) {
		return new SolidityFile(fileViewProvider);
	}

	@Override
	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
		return SpaceRequirements.MAY;
	}
}
