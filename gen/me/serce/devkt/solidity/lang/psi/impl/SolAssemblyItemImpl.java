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

public class SolAssemblyItemImpl extends ASTWrapperPsiElement implements SolAssemblyItem {

  public SolAssemblyItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitAssemblyItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SolAssemblyAssignment getAssemblyAssignment() {
    return findChildByClass(SolAssemblyAssignment.class);
  }

  @Override
  @Nullable
  public SolAssemblyBlock getAssemblyBlock() {
    return findChildByClass(SolAssemblyBlock.class);
  }

  @Override
  @Nullable
  public SolAssemblyFor getAssemblyFor() {
    return findChildByClass(SolAssemblyFor.class);
  }

  @Override
  @Nullable
  public SolAssemblyFunctionDefinition getAssemblyFunctionDefinition() {
    return findChildByClass(SolAssemblyFunctionDefinition.class);
  }

  @Override
  @Nullable
  public SolAssemblyIf getAssemblyIf() {
    return findChildByClass(SolAssemblyIf.class);
  }

  @Override
  @Nullable
  public SolAssemblyLocalDefinition getAssemblyLocalDefinition() {
    return findChildByClass(SolAssemblyLocalDefinition.class);
  }

  @Override
  @Nullable
  public SolAssemblySwitch getAssemblySwitch() {
    return findChildByClass(SolAssemblySwitch.class);
  }

  @Override
  @Nullable
  public SolFunctionalAssemblyAssignment getFunctionalAssemblyAssignment() {
    return findChildByClass(SolFunctionalAssemblyAssignment.class);
  }

  @Override
  @Nullable
  public SolFunctionalAssemblyExpression getFunctionalAssemblyExpression() {
    return findChildByClass(SolFunctionalAssemblyExpression.class);
  }

  @Override
  @Nullable
  public SolLabelDefinition getLabelDefinition() {
    return findChildByClass(SolLabelDefinition.class);
  }

  @Override
  @Nullable
  public SolLinkerSymbol getLinkerSymbol() {
    return findChildByClass(SolLinkerSymbol.class);
  }

  @Override
  @Nullable
  public SolNumberLiteral getNumberLiteral() {
    return findChildByClass(SolNumberLiteral.class);
  }

  @Override
  @Nullable
  public SolSubAssembly getSubAssembly() {
    return findChildByClass(SolSubAssembly.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
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
