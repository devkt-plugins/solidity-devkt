// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolContractDefinition extends PsiElement {

  @NotNull
  List<SolConstructorDefinition> getConstructorDefinitionList();

  @NotNull
  List<SolEnumDefinition> getEnumDefinitionList();

  @NotNull
  List<SolEventDefinition> getEventDefinitionList();

  @NotNull
  List<SolFunctionDefinition> getFunctionDefinitionList();

  @NotNull
  List<SolInheritanceSpecifier> getInheritanceSpecifierList();

  @NotNull
  List<SolModifierDefinition> getModifierDefinitionList();

  @NotNull
  List<SolStateVariableDeclaration> getStateVariableDeclarationList();

  @NotNull
  List<SolStructDefinition> getStructDefinitionList();

  @NotNull
  List<SolUsingForDeclaration> getUsingForDeclarationList();

  @Nullable
  PsiElement getIdentifier();

}
