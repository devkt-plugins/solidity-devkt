// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolFunctionCallExpression extends SolExpression {

  @NotNull
  List<SolExpression> getExpressionList();

  @Nullable
  SolFunctionCallArguments getFunctionCallArguments();

  @Nullable
  SolTypeName getTypeName();

}
