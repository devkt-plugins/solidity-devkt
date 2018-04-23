// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolStatement extends PsiElement {

  @Nullable
  SolBlock getBlock();

  @Nullable
  SolBreakSt getBreakSt();

  @Nullable
  SolContinueSt getContinueSt();

  @Nullable
  SolDoWhileStatement getDoWhileStatement();

  @Nullable
  SolEmitStatement getEmitStatement();

  @Nullable
  SolExpression getExpression();

  @Nullable
  SolForStatement getForStatement();

  @Nullable
  SolIfStatement getIfStatement();

  @Nullable
  SolInlineAssemblyStatement getInlineAssemblyStatement();

  @Nullable
  SolPlaceholderStatement getPlaceholderStatement();

  @Nullable
  SolReturnSt getReturnSt();

  @Nullable
  SolReturnTupleStatement getReturnTupleStatement();

  @Nullable
  SolThrowSt getThrowSt();

  @Nullable
  SolTupleStatement getTupleStatement();

  @Nullable
  SolVariableDefinition getVariableDefinition();

  @Nullable
  SolWhileStatement getWhileStatement();

}
