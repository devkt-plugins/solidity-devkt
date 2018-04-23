// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static me.serce.devkt.solidity.lang.core.SolidityTokenTypes.*;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.serce.devkt.solidity.lang.psi.*;

public class SolStatementImpl extends ASTWrapperPsiElement implements SolStatement {

  public SolStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SolBlock getBlock() {
    return findChildByClass(SolBlock.class);
  }

  @Override
  @Nullable
  public SolBreakSt getBreakSt() {
    return findChildByClass(SolBreakSt.class);
  }

  @Override
  @Nullable
  public SolContinueSt getContinueSt() {
    return findChildByClass(SolContinueSt.class);
  }

  @Override
  @Nullable
  public SolDoWhileStatement getDoWhileStatement() {
    return findChildByClass(SolDoWhileStatement.class);
  }

  @Override
  @Nullable
  public SolEmitStatement getEmitStatement() {
    return findChildByClass(SolEmitStatement.class);
  }

  @Override
  @Nullable
  public SolExpression getExpression() {
    return findChildByClass(SolExpression.class);
  }

  @Override
  @Nullable
  public SolForStatement getForStatement() {
    return findChildByClass(SolForStatement.class);
  }

  @Override
  @Nullable
  public SolIfStatement getIfStatement() {
    return findChildByClass(SolIfStatement.class);
  }

  @Override
  @Nullable
  public SolInlineAssemblyStatement getInlineAssemblyStatement() {
    return findChildByClass(SolInlineAssemblyStatement.class);
  }

  @Override
  @Nullable
  public SolPlaceholderStatement getPlaceholderStatement() {
    return findChildByClass(SolPlaceholderStatement.class);
  }

  @Override
  @Nullable
  public SolReturnSt getReturnSt() {
    return findChildByClass(SolReturnSt.class);
  }

  @Override
  @Nullable
  public SolReturnTupleStatement getReturnTupleStatement() {
    return findChildByClass(SolReturnTupleStatement.class);
  }

  @Override
  @Nullable
  public SolThrowSt getThrowSt() {
    return findChildByClass(SolThrowSt.class);
  }

  @Override
  @Nullable
  public SolTupleStatement getTupleStatement() {
    return findChildByClass(SolTupleStatement.class);
  }

  @Override
  @Nullable
  public SolVariableDefinition getVariableDefinition() {
    return findChildByClass(SolVariableDefinition.class);
  }

  @Override
  @Nullable
  public SolWhileStatement getWhileStatement() {
    return findChildByClass(SolWhileStatement.class);
  }

}
