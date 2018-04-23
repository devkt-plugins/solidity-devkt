// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolAssemblyItem extends PsiElement {

  @Nullable
  SolAssemblyAssignment getAssemblyAssignment();

  @Nullable
  SolAssemblyBlock getAssemblyBlock();

  @Nullable
  SolAssemblyFor getAssemblyFor();

  @Nullable
  SolAssemblyFunctionDefinition getAssemblyFunctionDefinition();

  @Nullable
  SolAssemblyIf getAssemblyIf();

  @Nullable
  SolAssemblyLocalDefinition getAssemblyLocalDefinition();

  @Nullable
  SolAssemblySwitch getAssemblySwitch();

  @Nullable
  SolFunctionalAssemblyAssignment getFunctionalAssemblyAssignment();

  @Nullable
  SolFunctionalAssemblyExpression getFunctionalAssemblyExpression();

  @Nullable
  SolLabelDefinition getLabelDefinition();

  @Nullable
  SolLinkerSymbol getLinkerSymbol();

  @Nullable
  SolNumberLiteral getNumberLiteral();

  @Nullable
  SolSubAssembly getSubAssembly();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getHexLiteral();

  @Nullable
  PsiElement getStringLiteral();

}
