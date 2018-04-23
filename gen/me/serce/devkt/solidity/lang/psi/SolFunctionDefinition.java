// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolFunctionDefinition extends PsiElement {

  @Nullable
  SolBlock getBlock();

  @NotNull
  List<SolFunctionCallExpression> getFunctionCallExpressionList();

  @NotNull
  List<SolFunctionModifier> getFunctionModifierList();

  @NotNull
  List<SolParameterList> getParameterListList();

  @Nullable
  PsiElement getIdentifier();

}
