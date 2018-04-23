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

public class SolIfStatementImpl extends ASTWrapperPsiElement implements SolIfStatement {

  public SolIfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SolExpression getExpression() {
    return findChildByClass(SolExpression.class);
  }

  @Override
  @NotNull
  public List<SolStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolStatement.class);
  }

}
