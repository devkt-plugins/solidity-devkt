package me.serce.devkt.solidity.lang.psi;

import me.serce.devkt.solidity.lang.SolidityFileType;
import me.serce.devkt.solidity.lang.SolidityLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.extapi.psi.PsiFileBase;
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.FileType;
import org.jetbrains.kotlin.com.intellij.psi.FileViewProvider;

public class SolidityFile extends PsiFileBase {
	public SolidityFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, SolidityLanguage.INSTANCE);
	}

	@Override
	public @NotNull
	FileType getFileType() {
		return SolidityFileType.INSTANCE;
	}
}
