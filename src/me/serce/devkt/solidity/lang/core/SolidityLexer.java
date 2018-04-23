package me.serce.devkt.solidity.lang.core;

import me.serce.devkt.solidity.lang._SolidityLexer;
import org.jetbrains.kotlin.com.intellij.lexer.FlexAdapter;

public class SolidityLexer extends FlexAdapter {
	public SolidityLexer() {
		super(new _SolidityLexer());
	}
}
