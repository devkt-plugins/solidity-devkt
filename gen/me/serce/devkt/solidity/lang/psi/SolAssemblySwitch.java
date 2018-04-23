// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolAssemblySwitch extends PsiElement {

  @Nullable
  SolAssemblyBlock getAssemblyBlock();

  @NotNull
  List<SolAssemblyCase> getAssemblyCaseList();

  @Nullable
  SolFunctionalAssemblyExpression getFunctionalAssemblyExpression();

  @Nullable
  SolNumberLiteral getNumberLiteral();

  @Nullable
  PsiElement getIdentifier();

}
