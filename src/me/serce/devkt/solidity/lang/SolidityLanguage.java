package me.serce.devkt.solidity.lang;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.lang.Language;
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType;

public class SolidityLanguage extends Language {
	public static final @NotNull
	SolidityLanguage INSTANCE = new SolidityLanguage();

	private SolidityLanguage() {
		super("Solidity", "text/sol");
	}

	@Override
	public @NotNull
	LanguageFileType getAssociatedFileType() {
		return SolidityFileType.INSTANCE;
	}

	@Override
	public boolean isCaseSensitive() {
		return true;
	}
}
