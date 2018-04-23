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

public class SolContractDefinitionImpl extends ASTWrapperPsiElement implements SolContractDefinition {

  public SolContractDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitContractDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SolConstructorDefinition> getConstructorDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolConstructorDefinition.class);
  }

  @Override
  @NotNull
  public List<SolEnumDefinition> getEnumDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolEnumDefinition.class);
  }

  @Override
  @NotNull
  public List<SolEventDefinition> getEventDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolEventDefinition.class);
  }

  @Override
  @NotNull
  public List<SolFunctionDefinition> getFunctionDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolFunctionDefinition.class);
  }

  @Override
  @NotNull
  public List<SolInheritanceSpecifier> getInheritanceSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolInheritanceSpecifier.class);
  }

  @Override
  @NotNull
  public List<SolModifierDefinition> getModifierDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolModifierDefinition.class);
  }

  @Override
  @NotNull
  public List<SolStateVariableDeclaration> getStateVariableDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolStateVariableDeclaration.class);
  }

  @Override
  @NotNull
  public List<SolStructDefinition> getStructDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolStructDefinition.class);
  }

  @Override
  @NotNull
  public List<SolUsingForDeclaration> getUsingForDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolUsingForDeclaration.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
