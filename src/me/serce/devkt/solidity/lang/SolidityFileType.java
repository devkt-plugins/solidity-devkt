package me.serce.devkt.solidity.lang;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType;

import javax.swing.*;

public class SolidityFileType extends LanguageFileType {
	public static @NotNull
	SolidityFileType INSTANCE = new SolidityFileType();

	private SolidityFileType() {
		super(SolidityLanguage.INSTANCE);
	}

	@Override
	public @NotNull
	String getName() {
		return "Solidity";
	}

	@Override
	public @NotNull
	String getDescription() {
		return "Solidity file";
	}

	@Override
	public @NotNull
	String getDefaultExtension() {
		return "sol";
	}

	@Override
	public @NotNull
	Icon getIcon() {
		return SolidityIcons.SOLIDITY_FILE_DARK;
	}
}
