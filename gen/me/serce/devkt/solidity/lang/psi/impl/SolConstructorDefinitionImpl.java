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

public class SolConstructorDefinitionImpl extends ASTWrapperPsiElement implements SolConstructorDefinition {

  public SolConstructorDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitConstructorDefinition(this);
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
  @NotNull
  public List<SolFunctionCallExpression> getFunctionCallExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolFunctionCallExpression.class);
  }

  @Override
  @NotNull
  public List<SolFunctionModifier> getFunctionModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolFunctionModifier.class);
  }

  @Override
  @Nullable
  public SolParameterList getParameterList() {
    return findChildByClass(SolParameterList.class);
  }

}
