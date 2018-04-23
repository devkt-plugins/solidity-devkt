package me.serce.devkt.solidity.lang;

import org.ice1000.devkt.openapi.ui.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public interface SolidityIcons {
	@NotNull
	Icon SOLIDITY_FILE = IconLoader.getIcon("/icons/sol-file.png");
	@NotNull
	Icon SOLIDITY_FILE_DARK = IconLoader.getIcon("/icons/sol-file_dark.png");
	@NotNull
	Icon SOLIDITY_ENUM = IconLoader.getIcon("/icons/sol-enum.png");
	@NotNull
	Icon SOLIDITY_METHOD = IconLoader.getIcon("/icons/sol-method.png");
	@NotNull
	Icon SOLIDITY_STATE_VAR = IconLoader.getIcon("/icons/sol-state-var.png");
	@NotNull
	Icon SOLIDITY_CONTRACT = IconLoader.getIcon("/icons/sol-contract.png");
}
