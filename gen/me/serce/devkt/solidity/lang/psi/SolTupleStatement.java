// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolTupleStatement extends PsiElement {

  @NotNull
  List<SolExpression> getExpressionList();

  @Nullable
  SolVariableDeclaration getVariableDeclaration();

}
