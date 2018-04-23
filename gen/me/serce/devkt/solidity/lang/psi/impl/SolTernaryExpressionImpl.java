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

public class SolTernaryExpressionImpl extends SolExpressionImpl implements SolTernaryExpression {

  public SolTernaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitTernaryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SolExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolExpression.class);
  }

}
