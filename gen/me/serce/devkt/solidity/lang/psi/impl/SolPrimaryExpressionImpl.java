// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static me.serce.devkt.solidity.lang.core.SolidityTokenTypes.*;
import me.serce.devkt.solidity.lang.psi.*;

public class SolPrimaryExpressionImpl extends SolExpressionImpl implements SolPrimaryExpression {

  public SolPrimaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SolBooleanLiteral getBooleanLiteral() {
    return findChildByClass(SolBooleanLiteral.class);
  }

  @Override
  @Nullable
  public SolElementaryTypeName getElementaryTypeName() {
    return findChildByClass(SolElementaryTypeName.class);
  }

  @Override
  @Nullable
  public SolNumberLiteral getNumberLiteral() {
    return findChildByClass(SolNumberLiteral.class);
  }

  @Override
  @Nullable
  public SolVarLiteral getVarLiteral() {
    return findChildByClass(SolVarLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getHexLiteral() {
    return findChildByType(HEXLITERAL);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRINGLITERAL);
  }

}
