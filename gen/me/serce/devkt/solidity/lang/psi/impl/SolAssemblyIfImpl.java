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

public class SolAssemblyIfImpl extends ASTWrapperPsiElement implements SolAssemblyIf {

  public SolAssemblyIfImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitAssemblyIf(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SolAssemblyBlock getAssemblyBlock() {
    return findChildByClass(SolAssemblyBlock.class);
  }

  @Override
  @Nullable
  public SolFunctionalAssemblyExpression getFunctionalAssemblyExpression() {
    return findChildByClass(SolFunctionalAssemblyExpression.class);
  }

  @Override
  @Nullable
  public SolNumberLiteral getNumberLiteral() {
    return findChildByClass(SolNumberLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
