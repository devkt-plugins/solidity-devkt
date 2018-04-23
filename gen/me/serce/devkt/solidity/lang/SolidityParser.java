// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang;

import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.Marker;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;

import static me.serce.devkt.solidity.lang.core.SolidityTokenTypes.*;
import static org.jetbrains.kotlin.com.intellij.lang.parser.GeneratedParserUtilBase.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SolidityParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ASSEMBLY_ASSIGNMENT) {
      r = AssemblyAssignment(b, 0);
    }
    else if (t == ASSEMBLY_BLOCK) {
      r = AssemblyBlock(b, 0);
    }
    else if (t == ASSEMBLY_CASE) {
      r = AssemblyCase(b, 0);
    }
    else if (t == ASSEMBLY_FOR) {
      r = AssemblyFor(b, 0);
    }
    else if (t == ASSEMBLY_FUNCTION_DEFINITION) {
      r = AssemblyFunctionDefinition(b, 0);
    }
    else if (t == ASSEMBLY_IF) {
      r = AssemblyIf(b, 0);
    }
    else if (t == ASSEMBLY_ITEM) {
      r = AssemblyItem(b, 0);
    }
    else if (t == ASSEMBLY_LOCAL_DEFINITION) {
      r = AssemblyLocalDefinition(b, 0);
    }
    else if (t == ASSEMBLY_SWITCH) {
      r = AssemblySwitch(b, 0);
    }
    else if (t == BLOCK) {
      r = Block(b, 0);
    }
    else if (t == BOOLEAN_LITERAL) {
      r = BooleanLiteral(b, 0);
    }
    else if (t == BREAK_ST) {
      r = BreakSt(b, 0);
    }
    else if (t == CONSTRUCTOR_DEFINITION) {
      r = ConstructorDefinition(b, 0);
    }
    else if (t == CONTINUE_ST) {
      r = ContinueSt(b, 0);
    }
    else if (t == CONTRACT_DEFINITION) {
      r = ContractDefinition(b, 0);
    }
    else if (t == DO_WHILE_STATEMENT) {
      r = DoWhileStatement(b, 0);
    }
    else if (t == EMIT_STATEMENT) {
      r = EmitStatement(b, 0);
    }
    else if (t == ENUM_DEFINITION) {
      r = EnumDefinition(b, 0);
    }
    else if (t == ENUM_VALUE) {
      r = EnumValue(b, 0);
    }
    else if (t == EVENT_DEFINITION) {
      r = EventDefinition(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0, -1);
    }
    else if (t == FOR_STATEMENT) {
      r = ForStatement(b, 0);
    }
    else if (t == FUNCTION_CALL_ARGUMENTS) {
      r = FunctionCallArguments(b, 0);
    }
    else if (t == FUNCTION_DEFINITION) {
      r = FunctionDefinition(b, 0);
    }
    else if (t == FUNCTION_MODIFIER) {
      r = FunctionModifier(b, 0);
    }
    else if (t == FUNCTIONAL_ASSEMBLY_ASSIGNMENT) {
      r = FunctionalAssemblyAssignment(b, 0);
    }
    else if (t == FUNCTIONAL_ASSEMBLY_EXPRESSION) {
      r = FunctionalAssemblyExpression(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == IMPORT_ALIAS) {
      r = ImportAlias(b, 0);
    }
    else if (t == IMPORT_DIRECTIVE) {
      r = ImportDirective(b, 0);
    }
    else if (t == IMPORT_PATH) {
      r = ImportPath(b, 0);
    }
    else if (t == INDEXED_PARAMETER_LIST) {
      r = IndexedParameterList(b, 0);
    }
    else if (t == INHERITANCE_SPECIFIER) {
      r = InheritanceSpecifier(b, 0);
    }
    else if (t == INLINE_ASSEMBLY_STATEMENT) {
      r = InlineAssemblyStatement(b, 0);
    }
    else if (t == LABEL_DEFINITION) {
      r = LabelDefinition(b, 0);
    }
    else if (t == LINKER_SYMBOL) {
      r = LinkerSymbol(b, 0);
    }
    else if (t == MAP_EXPRESSION) {
      r = MapExpression(b, 0);
    }
    else if (t == MODIFIER_DEFINITION) {
      r = ModifierDefinition(b, 0);
    }
    else if (t == NEW_EXPRESSION) {
      r = NewExpression(b, 0);
    }
    else if (t == NUMBER_LITERAL) {
      r = NumberLiteral(b, 0);
    }
    else if (t == NUMBER_TYPE) {
      r = NumberType(b, 0);
    }
    else if (t == NUMBER_UNIT) {
      r = NumberUnit(b, 0);
    }
    else if (t == PARAMETER_DEF) {
      r = ParameterDef(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = ParameterList(b, 0);
    }
    else if (t == PLACEHOLDER_STATEMENT) {
      r = PlaceholderStatement(b, 0);
    }
    else if (t == PRAGMA_DIRECTIVE) {
      r = PragmaDirective(b, 0);
    }
    else if (t == RETURN_ST) {
      r = ReturnSt(b, 0);
    }
    else if (t == RETURN_TUPLE_STATEMENT) {
      r = ReturnTupleStatement(b, 0);
    }
    else if (t == SEQ_EXPRESSION) {
      r = SeqExpression(b, 0);
    }
    else if (t == STATE_MUTABILITY) {
      r = StateMutability(b, 0);
    }
    else if (t == STATE_VARIABLE_DECLARATION) {
      r = StateVariableDeclaration(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STORAGE_LOCATION) {
      r = StorageLocation(b, 0);
    }
    else if (t == STRUCT_DEFINITION) {
      r = StructDefinition(b, 0);
    }
    else if (t == SUB_ASSEMBLY) {
      r = SubAssembly(b, 0);
    }
    else if (t == THROW_ST) {
      r = ThrowSt(b, 0);
    }
    else if (t == TUPLE_STATEMENT) {
      r = TupleStatement(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = TypeName(b, 0, -1);
    }
    else if (t == USER_DEFINED_TYPE_NAME) {
      r = UserDefinedTypeName(b, 0);
    }
    else if (t == USING_FOR_DECLARATION) {
      r = UsingForDeclaration(b, 0);
    }
    else if (t == VAR_LITERAL) {
      r = VarLiteral(b, 0);
    }
    else if (t == VARIABLE_DECLARATION) {
      r = VariableDeclaration(b, 0);
    }
    else if (t == VARIABLE_DEFINITION) {
      r = VariableDefinition(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = WhileStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return SourceUnit(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_TYPE_NAME, BYTES_ARRAY_TYPE_NAME, ELEMENTARY_TYPE_NAME, FUNCTION_TYPE_NAME,
      MAPPING_TYPE_NAME, TYPE_NAME, USER_DEFINED_LOCATION_TYPE_NAME, USER_DEFINED_TYPE_NAME),
    create_token_set_(AND_EXPRESSION, AND_OP_EXPRESSION, ASSIGNMENT_EXPRESSION, CALL_EXPRESSION,
      COMP_EXPRESSION, EQ_EXPRESSION, EXPONENT_EXPRESSION, EXPRESSION,
      FUNCTIONAL_ASSEMBLY_EXPRESSION, FUNCTION_CALL_EXPRESSION, INCREMENT_EXPRESSION, INDEX_ACCESS_EXPRESSION,
      INLINE_ARRAY_EXPRESSION, MAP_EXPRESSION, MEMBER_ACCESS_EXPRESSION, MULT_DIV_EXPRESSION,
      NEW_EXPRESSION, OR_EXPRESSION, OR_OP_EXPRESSION, PAREN_EXPRESSION,
      PLUS_MIN_EXPRESSION, PRIMARY_EXPRESSION, SEQ_EXPRESSION, SHIFT_EXPRESSION,
      TERNARY_EXPRESSION, UNARY_EXPRESSION, XOR_OP_EXPRESSION),
  };

  /* ********************************************************** */
  // 'return' | 'address' | 'byte' | 'break' | 'continue' | 'function'
  static boolean AmbiguousAssemblyBytecode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AmbiguousAssemblyBytecode")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "return");
    if (!r) r = consumeToken(b, "address");
    if (!r) r = consumeToken(b, "byte");
    if (!r) r = consumeToken(b, "break");
    if (!r) r = consumeToken(b, "continue");
    if (!r) r = consumeToken(b, "function");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=:' Identifier
  public static boolean AssemblyAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyAssignment")) return false;
    if (!nextTokenIs(b, RIGHT_ASSEMBLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_ASSIGNMENT, null);
    r = consumeTokens(b, 1, RIGHT_ASSEMBLY, IDENTIFIER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{' AssemblyItem* '}'
  public static boolean AssemblyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_BLOCK, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, AssemblyBlock_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AssemblyItem*
  private static boolean AssemblyBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyBlock_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AssemblyItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssemblyBlock_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'case' FunctionalAssemblyAssignmentOrIdentifier AssemblyBlock
  public static boolean AssemblyCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyCase")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_CASE, "<assembly case>");
    r = consumeToken(b, "case");
    p = r; // pin = 1
    r = r && report_error_(b, FunctionalAssemblyAssignmentOrIdentifier(b, l + 1));
    r = p && AssemblyBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'for' ( AssemblyBlock | FunctionalAssemblyExpression)
  //     FunctionalAssemblyExpression ( AssemblyBlock | FunctionalAssemblyExpression) AssemblyBlock
  public static boolean AssemblyFor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyFor")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_FOR, "<assembly for>");
    r = consumeToken(b, "for");
    p = r; // pin = 1
    r = r && report_error_(b, AssemblyFor_1(b, l + 1));
    r = p && report_error_(b, FunctionalAssemblyExpression(b, l + 1)) && r;
    r = p && report_error_(b, AssemblyFor_3(b, l + 1)) && r;
    r = p && AssemblyBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AssemblyBlock | FunctionalAssemblyExpression
  private static boolean AssemblyFor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyFor_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssemblyBlock(b, l + 1);
    if (!r) r = FunctionalAssemblyExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssemblyBlock | FunctionalAssemblyExpression
  private static boolean AssemblyFor_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyFor_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssemblyBlock(b, l + 1);
    if (!r) r = FunctionalAssemblyExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'function' Identifier '(' IdentifierOrList? ')'
  //     ( '->' IdentifierOrList )? AssemblyBlock
  public static boolean AssemblyFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyFunctionDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_FUNCTION_DEFINITION, "<assembly function definition>");
    r = consumeToken(b, "function");
    p = r; // pin = 1
    r = r && report_error_(b, consumeTokens(b, -1, IDENTIFIER, LPAREN));
    r = p && report_error_(b, AssemblyFunctionDefinition_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && report_error_(b, AssemblyFunctionDefinition_5(b, l + 1)) && r;
    r = p && AssemblyBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // IdentifierOrList?
  private static boolean AssemblyFunctionDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyFunctionDefinition_3")) return false;
    IdentifierOrList(b, l + 1);
    return true;
  }

  // ( '->' IdentifierOrList )?
  private static boolean AssemblyFunctionDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyFunctionDefinition_5")) return false;
    AssemblyFunctionDefinition_5_0(b, l + 1);
    return true;
  }

  // '->' IdentifierOrList
  private static boolean AssemblyFunctionDefinition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyFunctionDefinition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && IdentifierOrList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' FunctionalAssemblyAssignmentOrIdentifier AssemblyBlock
  public static boolean AssemblyIf(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyIf")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_IF, "<assembly if>");
    r = consumeToken(b, "if");
    p = r; // pin = 1
    r = r && report_error_(b, FunctionalAssemblyAssignmentOrIdentifier(b, l + 1));
    r = p && AssemblyBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AssemblyBlock
  //   | FunctionalAssemblyExpression
  //   | AssemblyLocalDefinition
  //   | FunctionalAssemblyAssignment
  //   | AssemblyAssignment
  //   | LabelDefinition
  //   | AssemblyIf
  //   | AssemblySwitch
  //   | AssemblyFunctionDefinition
  //   | AssemblyFor
  //   | SubAssembly
  //   | LinkerSymbol
  //   | NumberLiteral
  //   | StringLiteral
  //   | HexLiteral
  //   | Identifier
  public static boolean AssemblyItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_ITEM, "<assembly item>");
    r = AssemblyBlock(b, l + 1);
    if (!r) r = FunctionalAssemblyExpression(b, l + 1);
    if (!r) r = AssemblyLocalDefinition(b, l + 1);
    if (!r) r = FunctionalAssemblyAssignment(b, l + 1);
    if (!r) r = AssemblyAssignment(b, l + 1);
    if (!r) r = LabelDefinition(b, l + 1);
    if (!r) r = AssemblyIf(b, l + 1);
    if (!r) r = AssemblySwitch(b, l + 1);
    if (!r) r = AssemblyFunctionDefinition(b, l + 1);
    if (!r) r = AssemblyFor(b, l + 1);
    if (!r) r = SubAssembly(b, l + 1);
    if (!r) r = LinkerSymbol(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = HexLiteral(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // let IdentifierOrList ':=' FunctionalAssemblyAssignmentOrIdentifier
  public static boolean AssemblyLocalDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblyLocalDefinition")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_LOCAL_DEFINITION, null);
    r = consumeToken(b, LET);
    p = r; // pin = 1
    r = r && report_error_(b, IdentifierOrList(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_ASSEMBLY)) && r;
    r = p && FunctionalAssemblyAssignmentOrIdentifier(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'switch' FunctionalAssemblyAssignmentOrIdentifier AssemblyCase* ( 'default' AssemblyBlock )?
  public static boolean AssemblySwitch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblySwitch")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSEMBLY_SWITCH, "<assembly switch>");
    r = consumeToken(b, "switch");
    p = r; // pin = 1
    r = r && report_error_(b, FunctionalAssemblyAssignmentOrIdentifier(b, l + 1));
    r = p && report_error_(b, AssemblySwitch_2(b, l + 1)) && r;
    r = p && AssemblySwitch_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AssemblyCase*
  private static boolean AssemblySwitch_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblySwitch_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AssemblyCase(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssemblySwitch_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( 'default' AssemblyBlock )?
  private static boolean AssemblySwitch_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblySwitch_3")) return false;
    AssemblySwitch_3_0(b, l + 1);
    return true;
  }

  // 'default' AssemblyBlock
  private static boolean AssemblySwitch_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssemblySwitch_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "default");
    r = r && AssemblyBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnfinishedBlock '}'
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnfinishedBlock(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // booleanLiteral
  public static boolean BooleanLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanLiteral")) return false;
    if (!nextTokenIs(b, BOOLEANLITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BOOLEANLITERAL);
    exit_section_(b, m, BOOLEAN_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // break
  public static boolean BreakSt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakSt")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    exit_section_(b, m, BREAK_ST, r);
    return r;
  }

  /* ********************************************************** */
  // !('}')
  static boolean ClosedBracketRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosedBracketRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constructor ParameterList
  //                          ( FunctionCallExpression | FunctionModifier )*
  //                          Block
  public static boolean ConstructorDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDefinition")) return false;
    if (!nextTokenIs(b, CONSTRUCTOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_DEFINITION, null);
    r = consumeToken(b, CONSTRUCTOR);
    p = r; // pin = 1
    r = r && report_error_(b, ParameterList(b, l + 1));
    r = p && report_error_(b, ConstructorDefinition_2(b, l + 1)) && r;
    r = p && Block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( FunctionCallExpression | FunctionModifier )*
  private static boolean ConstructorDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDefinition_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ConstructorDefinition_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConstructorDefinition_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FunctionCallExpression | FunctionModifier
  private static boolean ConstructorDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallExpression(b, l + 1);
    if (!r) r = FunctionModifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // continue
  public static boolean ContinueSt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueSt")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, CONTINUE_ST, r);
    return r;
  }

  /* ********************************************************** */
  // ( contract | library | interface ) Identifier
  //                      ( is InheritanceSpecifier (',' InheritanceSpecifier )* )?
  //                      '{' ContractPart* '}'
  public static boolean ContractDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONTRACT_DEFINITION, "<contract definition>");
    r = ContractDefinition_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, ContractDefinition_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LBRACE)) && r;
    r = p && report_error_(b, ContractDefinition_4(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // contract | library | interface
  private static boolean ContractDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTRACT);
    if (!r) r = consumeToken(b, LIBRARY);
    if (!r) r = consumeToken(b, INTERFACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( is InheritanceSpecifier (',' InheritanceSpecifier )* )?
  private static boolean ContractDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_2")) return false;
    ContractDefinition_2_0(b, l + 1);
    return true;
  }

  // is InheritanceSpecifier (',' InheritanceSpecifier )*
  private static boolean ContractDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && InheritanceSpecifier(b, l + 1);
    r = r && ContractDefinition_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' InheritanceSpecifier )*
  private static boolean ContractDefinition_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ContractDefinition_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ContractDefinition_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' InheritanceSpecifier
  private static boolean ContractDefinition_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && InheritanceSpecifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ContractPart*
  private static boolean ContractDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ContractPart(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ContractDefinition_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // StateVariableDeclaration | UsingForDeclaration
  //              | StructDefinition | ModifierDefinition | FunctionDefinition | EventDefinition | EnumDefinition
  //              | ConstructorDefinition
  static boolean ContractPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractPart")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StateVariableDeclaration(b, l + 1);
    if (!r) r = UsingForDeclaration(b, l + 1);
    if (!r) r = StructDefinition(b, l + 1);
    if (!r) r = ModifierDefinition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    if (!r) r = EventDefinition(b, l + 1);
    if (!r) r = EnumDefinition(b, l + 1);
    if (!r) r = ConstructorDefinition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decimalNumber
  static boolean DecimalNumber(PsiBuilder b, int l) {
    return consumeToken(b, DECIMALNUMBER);
  }

  /* ********************************************************** */
  // do Statement while '(' Expression ')'
  public static boolean DoWhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileStatement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DO_WHILE_STATEMENT, null);
    r = consumeToken(b, DO);
    p = r; // pin = 1
    r = r && report_error_(b, Statement(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, WHILE, LPAREN)) && r;
    r = p && report_error_(b, Expression(b, l + 1, -1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ElementaryTypeName
  static boolean ElementaryTypeNameExpression(PsiBuilder b, int l) {
    return ElementaryTypeName(b, l + 1);
  }

  /* ********************************************************** */
  // emit FunctionCallExpression
  public static boolean EmitStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmitStatement")) return false;
    if (!nextTokenIs(b, EMIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EMIT_STATEMENT, null);
    r = consumeToken(b, EMIT);
    p = r; // pin = 1
    r = r && FunctionCallExpression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // enum Identifier '{' EnumValue? (',' EnumValue)* '}'
  public static boolean EnumDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DEFINITION, null);
    r = consumeTokens(b, 1, ENUM, IDENTIFIER, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, EnumDefinition_3(b, l + 1));
    r = p && report_error_(b, EnumDefinition_4(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // EnumValue?
  private static boolean EnumDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_3")) return false;
    EnumValue(b, l + 1);
    return true;
  }

  // (',' EnumValue)*
  private static boolean EnumDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EnumDefinition_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumDefinition_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' EnumValue
  private static boolean EnumDefinition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && EnumValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean EnumValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumValue")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUM_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // event Identifier IndexedParameterList anonymous? ';'
  public static boolean EventDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EventDefinition")) return false;
    if (!nextTokenIs(b, EVENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EVENT_DEFINITION, null);
    r = consumeTokens(b, 1, EVENT, IDENTIFIER);
    p = r; // pin = 1
    r = r && report_error_(b, IndexedParameterList(b, l + 1));
    r = p && report_error_(b, EventDefinition_3(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // anonymous?
  private static boolean EventDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EventDefinition_3")) return false;
    consumeToken(b, ANONYMOUS);
    return true;
  }

  /* ********************************************************** */
  // Expression
  static boolean ExpressionStatement(PsiBuilder b, int l) {
    return Expression(b, l + 1, -1);
  }

  /* ********************************************************** */
  // DoWhileStatement | PlaceholderStatement | ContinueSt | BreakSt | ReturnSt | ThrowSt | EmitStatement | SimpleStatement
  static boolean FinishedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinishedStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = DoWhileStatement(b, l + 1);
    if (!r) r = PlaceholderStatement(b, l + 1);
    if (!r) r = ContinueSt(b, l + 1);
    if (!r) r = BreakSt(b, l + 1);
    if (!r) r = ReturnSt(b, l + 1);
    if (!r) r = ThrowSt(b, l + 1);
    if (!r) r = EmitStatement(b, l + 1);
    if (!r) r = SimpleStatement(b, l + 1);
    exit_section_(b, l, m, r, false, UntilSemicolonRecover_parser_);
    return r;
  }

  /* ********************************************************** */
  // fixedNumber
  static boolean FixedNumber(PsiBuilder b, int l) {
    return consumeToken(b, FIXEDNUMBER);
  }

  /* ********************************************************** */
  // for '(' (SimpleStatement)? ';' (Expression)? ';' (ExpressionStatement)? ')' Statement
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, null);
    r = consumeTokens(b, 1, FOR, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, ForStatement_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, SEMICOLON)) && r;
    r = p && report_error_(b, ForStatement_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, SEMICOLON)) && r;
    r = p && report_error_(b, ForStatement_6(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && Statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (SimpleStatement)?
  private static boolean ForStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_2")) return false;
    ForStatement_2_0(b, l + 1);
    return true;
  }

  // (SimpleStatement)
  private static boolean ForStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SimpleStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression)?
  private static boolean ForStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_4")) return false;
    ForStatement_4_0(b, l + 1);
    return true;
  }

  // (Expression)
  private static boolean ForStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ExpressionStatement)?
  private static boolean ForStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_6")) return false;
    ForStatement_6_0(b, l + 1);
    return true;
  }

  // (ExpressionStatement)
  private static boolean ForStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MapExpression | Expression? ( ',' Expression )*
  public static boolean FunctionCallArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_ARGUMENTS, "<function call arguments>");
    r = MapExpression(b, l + 1);
    if (!r) r = FunctionCallArguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Expression? ( ',' Expression )*
  private static boolean FunctionCallArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallArguments_1_0(b, l + 1);
    r = r && FunctionCallArguments_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean FunctionCallArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1_0")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // ( ',' Expression )*
  private static boolean FunctionCallArguments_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionCallArguments_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionCallArguments_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Expression
  private static boolean FunctionCallArguments_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function Identifier? ParameterList
  //                      ( FunctionCallExpression | FunctionModifier )*
  //                      ( returns ParameterList )? ( ';' | Block )
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, null);
    r = consumeToken(b, FUNCTION);
    p = r; // pin = 1
    r = r && report_error_(b, FunctionDefinition_1(b, l + 1));
    r = p && report_error_(b, ParameterList(b, l + 1)) && r;
    r = p && report_error_(b, FunctionDefinition_3(b, l + 1)) && r;
    r = p && report_error_(b, FunctionDefinition_4(b, l + 1)) && r;
    r = p && FunctionDefinition_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Identifier?
  private static boolean FunctionDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // ( FunctionCallExpression | FunctionModifier )*
  private static boolean FunctionDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionDefinition_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDefinition_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FunctionCallExpression | FunctionModifier
  private static boolean FunctionDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallExpression(b, l + 1);
    if (!r) r = FunctionModifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( returns ParameterList )?
  private static boolean FunctionDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_4")) return false;
    FunctionDefinition_4_0(b, l + 1);
    return true;
  }

  // returns ParameterList
  private static boolean FunctionDefinition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURNS);
    r = r && ParameterList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' | Block
  private static boolean FunctionDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = Block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StateMutability | external | public | internal | private | Identifier
  public static boolean FunctionModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_MODIFIER, "<function modifier>");
    r = StateMutability(b, l + 1);
    if (!r) r = consumeToken(b, EXTERNAL);
    if (!r) r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IdentifierOrList ':=' FunctionalAssemblyAssignmentOrIdentifier
  public static boolean FunctionalAssemblyAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionalAssemblyAssignment")) return false;
    if (!nextTokenIs(b, "<functional assembly assignment>", LPAREN, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTIONAL_ASSEMBLY_ASSIGNMENT, "<functional assembly assignment>");
    r = IdentifierOrList(b, l + 1);
    r = r && consumeToken(b, LEFT_ASSEMBLY);
    p = r; // pin = 2
    r = r && FunctionalAssemblyAssignmentOrIdentifier(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FunctionalAssemblyExpression | NumberLiteral | Identifier
  static boolean FunctionalAssemblyAssignmentOrIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionalAssemblyAssignmentOrIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionalAssemblyExpression(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (AmbiguousAssemblyBytecode | Identifier) '(' AssemblyItem? ( ',' AssemblyItem )* ')'
  public static boolean FunctionalAssemblyExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionalAssemblyExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTIONAL_ASSEMBLY_EXPRESSION, "<functional assembly expression>");
    r = FunctionalAssemblyExpression_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && FunctionalAssemblyExpression_2(b, l + 1);
    r = r && FunctionalAssemblyExpression_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AmbiguousAssemblyBytecode | Identifier
  private static boolean FunctionalAssemblyExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionalAssemblyExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AmbiguousAssemblyBytecode(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssemblyItem?
  private static boolean FunctionalAssemblyExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionalAssemblyExpression_2")) return false;
    AssemblyItem(b, l + 1);
    return true;
  }

  // ( ',' AssemblyItem )*
  private static boolean FunctionalAssemblyExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionalAssemblyExpression_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionalAssemblyExpression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionalAssemblyExpression_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' AssemblyItem
  private static boolean FunctionalAssemblyExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionalAssemblyExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AssemblyItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // hexLiteral
  static boolean HexLiteral(PsiBuilder b, int l) {
    return consumeToken(b, HEXLITERAL);
  }

  /* ********************************************************** */
  // hexNumber
  static boolean HexNumber(PsiBuilder b, int l) {
    return consumeToken(b, HEXNUMBER);
  }

  /* ********************************************************** */
  // Identifier ( ',' Identifier)*
  static boolean IdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && IdentifierList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' Identifier)*
  private static boolean IdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!IdentifierList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IdentifierList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Identifier
  private static boolean IdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentifierList | '(' IdentifierList ')'
  static boolean IdentifierOrList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierOrList")) return false;
    if (!nextTokenIs(b, "", LPAREN, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifierList(b, l + 1);
    if (!r) r = IdentifierOrList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' IdentifierList ')'
  private static boolean IdentifierOrList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierOrList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && IdentifierList(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if '(' Expression ')' Statement ( else Statement )?
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, null);
    r = consumeTokens(b, 1, IF, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && report_error_(b, Statement(b, l + 1)) && r;
    r = p && IfStatement_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( else Statement )?
  private static boolean IfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5")) return false;
    IfStatement_5_0(b, l + 1);
    return true;
  }

  // else Statement
  private static boolean IfStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean ImportAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportAlias")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IMPORT_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // ImportDirectivePart ';'
  public static boolean ImportDirective(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirective")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDirectivePart(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, IMPORT_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // import ( ImportPath (as ImportAlias)?
  //         | ('*' | UserDefinedTypeName) (as ImportAlias)? 'from' ImportPath
  //         | '{' ImportRuleSet '}' 'from' ImportPath )
  static boolean ImportDirectivePart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, IMPORT);
    p = r; // pin = 1
    r = r && ImportDirectivePart_1(b, l + 1);
    exit_section_(b, l, m, r, p, UntilSemicolonRecover_parser_);
    return r || p;
  }

  // ImportPath (as ImportAlias)?
  //         | ('*' | UserDefinedTypeName) (as ImportAlias)? 'from' ImportPath
  //         | '{' ImportRuleSet '}' 'from' ImportPath
  private static boolean ImportDirectivePart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDirectivePart_1_0(b, l + 1);
    if (!r) r = ImportDirectivePart_1_1(b, l + 1);
    if (!r) r = ImportDirectivePart_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ImportPath (as ImportAlias)?
  private static boolean ImportDirectivePart_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportPath(b, l + 1);
    r = r && ImportDirectivePart_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (as ImportAlias)?
  private static boolean ImportDirectivePart_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_0_1")) return false;
    ImportDirectivePart_1_0_1_0(b, l + 1);
    return true;
  }

  // as ImportAlias
  private static boolean ImportDirectivePart_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && ImportAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('*' | UserDefinedTypeName) (as ImportAlias)? 'from' ImportPath
  private static boolean ImportDirectivePart_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDirectivePart_1_1_0(b, l + 1);
    r = r && ImportDirectivePart_1_1_1(b, l + 1);
    r = r && consumeToken(b, "from");
    r = r && ImportPath(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | UserDefinedTypeName
  private static boolean ImportDirectivePart_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULT);
    if (!r) r = UserDefinedTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (as ImportAlias)?
  private static boolean ImportDirectivePart_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1_1")) return false;
    ImportDirectivePart_1_1_1_0(b, l + 1);
    return true;
  }

  // as ImportAlias
  private static boolean ImportDirectivePart_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && ImportAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' ImportRuleSet '}' 'from' ImportPath
  private static boolean ImportDirectivePart_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ImportRuleSet(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && consumeToken(b, "from");
    r = r && ImportPath(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringLiteral
  public static boolean ImportPath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportPath")) return false;
    if (!nextTokenIs(b, STRINGLITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringLiteral(b, l + 1);
    exit_section_(b, m, IMPORT_PATH, r);
    return r;
  }

  /* ********************************************************** */
  // UserDefinedTypeName (as ImportAlias)? ( ',' UserDefinedTypeName (as ImportAlias)? )*
  static boolean ImportRuleSet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = UserDefinedTypeName(b, l + 1);
    r = r && ImportRuleSet_1(b, l + 1);
    r = r && ImportRuleSet_2(b, l + 1);
    exit_section_(b, l, m, r, false, ClosedBracketRecover_parser_);
    return r;
  }

  // (as ImportAlias)?
  private static boolean ImportRuleSet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_1")) return false;
    ImportRuleSet_1_0(b, l + 1);
    return true;
  }

  // as ImportAlias
  private static boolean ImportRuleSet_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && ImportAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' UserDefinedTypeName (as ImportAlias)? )*
  private static boolean ImportRuleSet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ImportRuleSet_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportRuleSet_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' UserDefinedTypeName (as ImportAlias)?
  private static boolean ImportRuleSet_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && UserDefinedTypeName(b, l + 1);
    r = r && ImportRuleSet_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (as ImportAlias)?
  private static boolean ImportRuleSet_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_2_0_2")) return false;
    ImportRuleSet_2_0_2_0(b, l + 1);
    return true;
  }

  // as ImportAlias
  private static boolean ImportRuleSet_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && ImportAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ( TypeName indexed?  Identifier? (',' TypeName indexed?  Identifier?)* )? ')'
  public static boolean IndexedParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && IndexedParameterList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, INDEXED_PARAMETER_LIST, r);
    return r;
  }

  // ( TypeName indexed?  Identifier? (',' TypeName indexed?  Identifier?)* )?
  private static boolean IndexedParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1")) return false;
    IndexedParameterList_1_0(b, l + 1);
    return true;
  }

  // TypeName indexed?  Identifier? (',' TypeName indexed?  Identifier?)*
  private static boolean IndexedParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1, -1);
    r = r && IndexedParameterList_1_0_1(b, l + 1);
    r = r && IndexedParameterList_1_0_2(b, l + 1);
    r = r && IndexedParameterList_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indexed?
  private static boolean IndexedParameterList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1_0_1")) return false;
    consumeToken(b, INDEXED);
    return true;
  }

  // Identifier?
  private static boolean IndexedParameterList_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1_0_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // (',' TypeName indexed?  Identifier?)*
  private static boolean IndexedParameterList_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!IndexedParameterList_1_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IndexedParameterList_1_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' TypeName indexed?  Identifier?
  private static boolean IndexedParameterList_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeName(b, l + 1, -1);
    r = r && IndexedParameterList_1_0_3_0_2(b, l + 1);
    r = r && IndexedParameterList_1_0_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indexed?
  private static boolean IndexedParameterList_1_0_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1_0_3_0_2")) return false;
    consumeToken(b, INDEXED);
    return true;
  }

  // Identifier?
  private static boolean IndexedParameterList_1_0_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedParameterList_1_0_3_0_3")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // UserDefinedTypeName ( '(' Expression ( ',' Expression )* ')' )?
  public static boolean InheritanceSpecifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InheritanceSpecifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UserDefinedTypeName(b, l + 1);
    r = r && InheritanceSpecifier_1(b, l + 1);
    exit_section_(b, m, INHERITANCE_SPECIFIER, r);
    return r;
  }

  // ( '(' Expression ( ',' Expression )* ')' )?
  private static boolean InheritanceSpecifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InheritanceSpecifier_1")) return false;
    InheritanceSpecifier_1_0(b, l + 1);
    return true;
  }

  // '(' Expression ( ',' Expression )* ')'
  private static boolean InheritanceSpecifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InheritanceSpecifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Expression(b, l + 1, -1);
    r = r && InheritanceSpecifier_1_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' Expression )*
  private static boolean InheritanceSpecifier_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InheritanceSpecifier_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InheritanceSpecifier_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InheritanceSpecifier_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Expression
  private static boolean InheritanceSpecifier_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InheritanceSpecifier_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assembly AssemblyBlock
  public static boolean InlineAssemblyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineAssemblyStatement")) return false;
    if (!nextTokenIs(b, ASSEMBLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INLINE_ASSEMBLY_STATEMENT, null);
    r = consumeToken(b, ASSEMBLY);
    p = r; // pin = 1
    r = r && AssemblyBlock(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Identifier ':'
  public static boolean LabelDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, LABEL_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // 'linkerSymbol' '(' StringLiteral ')'
  public static boolean LinkerSymbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkerSymbol")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LINKER_SYMBOL, "<linker symbol>");
    r = consumeToken(b, "linkerSymbol");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LPAREN));
    r = p && report_error_(b, StringLiteral(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{' MapExpressionClause (',' MapExpressionClause )* '}'
  public static boolean MapExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapExpression")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAP_EXPRESSION, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, MapExpressionClause(b, l + 1));
    r = p && report_error_(b, MapExpression_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' MapExpressionClause )*
  private static boolean MapExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapExpression_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MapExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapExpression_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' MapExpressionClause
  private static boolean MapExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MapExpressionClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ':' Expression
  static boolean MapExpressionClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapExpressionClause")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, IDENTIFIER, COLON);
    p = r; // pin = 2
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // modifier Identifier ParameterList? Block
  public static boolean ModifierDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifierDefinition")) return false;
    if (!nextTokenIs(b, MODIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER_DEFINITION, null);
    r = consumeTokens(b, 1, MODIFIER, IDENTIFIER);
    p = r; // pin = 1
    r = r && report_error_(b, ModifierDefinition_2(b, l + 1));
    r = p && Block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ParameterList?
  private static boolean ModifierDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifierDefinition_2")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // new ( Identifier | PrimitiveLiteral )
  public static boolean NewExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && NewExpression_1(b, l + 1);
    exit_section_(b, m, NEW_EXPRESSION, r);
    return r;
  }

  // Identifier | PrimitiveLiteral
  private static boolean NewExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = PrimitiveLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( HexNumber | DecimalNumber | FixedNumber | ScientificNumber) NumberUnit?
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LITERAL, "<number literal>");
    r = NumberLiteral_0(b, l + 1);
    r = r && NumberLiteral_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // HexNumber | DecimalNumber | FixedNumber | ScientificNumber
  private static boolean NumberLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = HexNumber(b, l + 1);
    if (!r) r = DecimalNumber(b, l + 1);
    if (!r) r = FixedNumber(b, l + 1);
    if (!r) r = ScientificNumber(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NumberUnit?
  private static boolean NumberLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral_1")) return false;
    NumberUnit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // intNumType | uIntNumType | byteNumType | fixedNumType | uFixedNumType
  public static boolean NumberType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_TYPE, "<number type>");
    r = consumeToken(b, INTNUMTYPE);
    if (!r) r = consumeToken(b, UINTNUMTYPE);
    if (!r) r = consumeToken(b, BYTENUMTYPE);
    if (!r) r = consumeToken(b, FIXEDNUMTYPE);
    if (!r) r = consumeToken(b, UFIXEDNUMTYPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // wei | szabo | finney | ether
  //              | seconds | minutes | hours | days | weeks | years
  public static boolean NumberUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberUnit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_UNIT, "<number unit>");
    r = consumeToken(b, WEI);
    if (!r) r = consumeToken(b, SZABO);
    if (!r) r = consumeToken(b, FINNEY);
    if (!r) r = consumeToken(b, ETHER);
    if (!r) r = consumeToken(b, SECONDS);
    if (!r) r = consumeToken(b, MINUTES);
    if (!r) r = consumeToken(b, HOURS);
    if (!r) r = consumeToken(b, DAYS);
    if (!r) r = consumeToken(b, WEEKS);
    if (!r) r = consumeToken(b, YEARS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeName (constant StorageLocation? | StorageLocation constant?)? Identifier?
  public static boolean ParameterDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_DEF, "<parameter def>");
    r = TypeName(b, l + 1, -1);
    r = r && ParameterDef_1(b, l + 1);
    r = r && ParameterDef_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (constant StorageLocation? | StorageLocation constant?)?
  private static boolean ParameterDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1")) return false;
    ParameterDef_1_0(b, l + 1);
    return true;
  }

  // constant StorageLocation? | StorageLocation constant?
  private static boolean ParameterDef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterDef_1_0_0(b, l + 1);
    if (!r) r = ParameterDef_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constant StorageLocation?
  private static boolean ParameterDef_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTANT);
    r = r && ParameterDef_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageLocation?
  private static boolean ParameterDef_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1_0_0_1")) return false;
    StorageLocation(b, l + 1);
    return true;
  }

  // StorageLocation constant?
  private static boolean ParameterDef_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StorageLocation(b, l + 1);
    r = r && ParameterDef_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constant?
  private static boolean ParameterDef_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1_0_1_1")) return false;
    consumeToken(b, CONSTANT);
    return true;
  }

  // Identifier?
  private static boolean ParameterDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // '(' ( ParameterDef (',' ParameterDef)* )? ')'
  public static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ParameterList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // ( ParameterDef (',' ParameterDef)* )?
  private static boolean ParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1")) return false;
    ParameterList_1_0(b, l + 1);
    return true;
  }

  // ParameterDef (',' ParameterDef)*
  private static boolean ParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterDef(b, l + 1);
    r = r && ParameterList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ParameterDef)*
  private static boolean ParameterList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParameterList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ParameterDef
  private static boolean ParameterList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ParameterDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '_'
  public static boolean PlaceholderStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PlaceholderStatement")) return false;
    if (!nextTokenIs(b, PLACEHOLDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLACEHOLDER);
    exit_section_(b, m, PLACEHOLDER_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // PragmaPart ';'
  public static boolean PragmaDirective(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaDirective")) return false;
    if (!nextTokenIs(b, PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PragmaPart(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PRAGMA_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // pragma Identifier pragmaAll
  static boolean PragmaPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaPart")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, PRAGMA, IDENTIFIER, PRAGMAALL);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, UntilSemicolonRecover_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // intNumType | uIntNumType | byteNumType | bytesNumType | fixedNumType | uFixedNumType | booleanLiteral | address | string | bool
  static boolean PrimitiveLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimitiveLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTNUMTYPE);
    if (!r) r = consumeToken(b, UINTNUMTYPE);
    if (!r) r = consumeToken(b, BYTENUMTYPE);
    if (!r) r = consumeToken(b, BYTESNUMTYPE);
    if (!r) r = consumeToken(b, FIXEDNUMTYPE);
    if (!r) r = consumeToken(b, UFIXEDNUMTYPE);
    if (!r) r = consumeToken(b, BOOLEANLITERAL);
    if (!r) r = consumeToken(b, ADDRESS);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BOOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // return Expression?
  public static boolean ReturnSt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnSt")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_ST, null);
    r = consumeToken(b, RETURN);
    p = r; // pin = 1
    r = r && ReturnSt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Expression?
  private static boolean ReturnSt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnSt_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // return SeqExpression ';'
  public static boolean ReturnTupleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnTupleStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && SeqExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RETURN_TUPLE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // scientificNumber
  static boolean ScientificNumber(PsiBuilder b, int l) {
    return consumeToken(b, SCIENTIFICNUMBER);
  }

  /* ********************************************************** */
  // '(' ','? Expression (',' Expression)* ','? ')'
  public static boolean SeqExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && SeqExpression_1(b, l + 1);
    r = r && Expression(b, l + 1, -1);
    r = r && SeqExpression_3(b, l + 1);
    r = r && SeqExpression_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SEQ_EXPRESSION, r);
    return r;
  }

  // ','?
  private static boolean SeqExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // (',' Expression)*
  private static boolean SeqExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SeqExpression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SeqExpression_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Expression
  private static boolean SeqExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean SeqExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // VariableDefinition | ExpressionStatement
  static boolean SimpleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleStatement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinition(b, l + 1);
    if (!r) r = ExpressionStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PragmaDirective | ImportDirective | ContractDefinition | Expression)*
  static boolean SourceUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceUnit")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SourceUnit_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SourceUnit", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PragmaDirective | ImportDirective | ContractDefinition | Expression
  private static boolean SourceUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceUnit_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PragmaDirective(b, l + 1);
    if (!r) r = ImportDirective(b, l + 1);
    if (!r) r = ContractDefinition(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pure | constant | view | payable
  public static boolean StateMutability(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateMutability")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATE_MUTABILITY, "<state mutability>");
    r = consumeToken(b, PURE);
    if (!r) r = consumeToken(b, CONSTANT);
    if (!r) r = consumeToken(b, VIEW);
    if (!r) r = consumeToken(b, PAYABLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeName (VisibilityModifiers constant | constant? VisibilityModifiers? ) Identifier ('=' Expression)? ';'
  public static boolean StateVariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATE_VARIABLE_DECLARATION, "<state variable declaration>");
    r = TypeName(b, l + 1, -1);
    r = r && StateVariableDeclaration_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && StateVariableDeclaration_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VisibilityModifiers constant | constant? VisibilityModifiers?
  private static boolean StateVariableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StateVariableDeclaration_1_0(b, l + 1);
    if (!r) r = StateVariableDeclaration_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VisibilityModifiers constant
  private static boolean StateVariableDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VisibilityModifiers(b, l + 1);
    r = r && consumeToken(b, CONSTANT);
    exit_section_(b, m, null, r);
    return r;
  }

  // constant? VisibilityModifiers?
  private static boolean StateVariableDeclaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StateVariableDeclaration_1_1_0(b, l + 1);
    r = r && StateVariableDeclaration_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constant?
  private static boolean StateVariableDeclaration_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_1_0")) return false;
    consumeToken(b, CONSTANT);
    return true;
  }

  // VisibilityModifiers?
  private static boolean StateVariableDeclaration_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_1_1")) return false;
    VisibilityModifiers(b, l + 1);
    return true;
  }

  // ('=' Expression)?
  private static boolean StateVariableDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_3")) return false;
    StateVariableDeclaration_3_0(b, l + 1);
    return true;
  }

  // '=' Expression
  private static boolean StateVariableDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IfStatement | WhileStatement | ForStatement | Block | InlineAssemblyStatement | TupleStatement | ReturnTupleStatement | FinishedStatement ';'
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = IfStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = Block(b, l + 1);
    if (!r) r = InlineAssemblyStatement(b, l + 1);
    if (!r) r = TupleStatement(b, l + 1);
    if (!r) r = ReturnTupleStatement(b, l + 1);
    if (!r) r = Statement_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FinishedStatement ';'
  private static boolean Statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FinishedStatement(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // memory | storage
  public static boolean StorageLocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StorageLocation")) return false;
    if (!nextTokenIs(b, "<storage location>", MEMORY, STORAGE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STORAGE_LOCATION, "<storage location>");
    r = consumeToken(b, MEMORY);
    if (!r) r = consumeToken(b, STORAGE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stringLiteral
  static boolean StringLiteral(PsiBuilder b, int l) {
    return consumeToken(b, STRINGLITERAL);
  }

  /* ********************************************************** */
  // struct Identifier '{'
  //                      ( VariableDeclaration ';' (VariableDeclaration ';')* )? '}'
  public static boolean StructDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefinition")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DEFINITION, null);
    r = consumeTokens(b, 1, STRUCT, IDENTIFIER, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, StructDefinition_3(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( VariableDeclaration ';' (VariableDeclaration ';')* )?
  private static boolean StructDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefinition_3")) return false;
    StructDefinition_3_0(b, l + 1);
    return true;
  }

  // VariableDeclaration ';' (VariableDeclaration ';')*
  private static boolean StructDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDeclaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && StructDefinition_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (VariableDeclaration ';')*
  private static boolean StructDefinition_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefinition_3_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StructDefinition_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructDefinition_3_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VariableDeclaration ';'
  private static boolean StructDefinition_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefinition_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDeclaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'assembly' Identifier AssemblyBlock
  public static boolean SubAssembly(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubAssembly")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SUB_ASSEMBLY, "<sub assembly>");
    r = consumeToken(b, "assembly");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && AssemblyBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // throw
  public static boolean ThrowSt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowSt")) return false;
    if (!nextTokenIs(b, THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW);
    exit_section_(b, m, THROW_ST, r);
    return r;
  }

  /* ********************************************************** */
  // VariableDeclaration '=' SeqExpression ';'
  //     | SeqExpression '=' SeqExpression ';'
  //     | SeqExpression '=' Expression ';'
  public static boolean TupleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_STATEMENT, "<tuple statement>");
    r = TupleStatement_0(b, l + 1);
    if (!r) r = TupleStatement_1(b, l + 1);
    if (!r) r = TupleStatement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VariableDeclaration '=' SeqExpression ';'
  private static boolean TupleStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDeclaration(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && SeqExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // SeqExpression '=' SeqExpression ';'
  private static boolean TupleStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SeqExpression(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && SeqExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // SeqExpression '=' Expression ';'
  private static boolean TupleStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SeqExpression(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' Statement*
  static boolean UnfinishedBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnfinishedBlock")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && UnfinishedBlock_1(b, l + 1);
    exit_section_(b, l, m, r, p, UntilBraceRecover_parser_);
    return r || p;
  }

  // Statement*
  private static boolean UnfinishedBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnfinishedBlock_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnfinishedBlock_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // !('}')
  static boolean UntilBraceRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UntilBraceRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(';')
  static boolean UntilSemicolonRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UntilSemicolonRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier ( '.' Identifier )*
  public static boolean UserDefinedTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedTypeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && UserDefinedTypeName_1(b, l + 1);
    exit_section_(b, m, USER_DEFINED_TYPE_NAME, r);
    return r;
  }

  // ( '.' Identifier )*
  private static boolean UserDefinedTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedTypeName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UserDefinedTypeName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UserDefinedTypeName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' Identifier
  private static boolean UserDefinedTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UserDefinedTypeName StorageLocation
  static boolean UserDefinedWithLocationTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedWithLocationTypeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UserDefinedTypeName(b, l + 1);
    r = r && StorageLocation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UserDefinedTypeName
  static boolean UserDefinedWithoutLocationTypeName(PsiBuilder b, int l) {
    return UserDefinedTypeName(b, l + 1);
  }

  /* ********************************************************** */
  // using UserDefinedTypeName for ('*' | TypeName) ';'
  public static boolean UsingForDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UsingForDeclaration")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USING_FOR_DECLARATION, null);
    r = consumeToken(b, USING);
    p = r; // pin = 1
    r = r && report_error_(b, UserDefinedTypeName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, FOR)) && r;
    r = p && report_error_(b, UsingForDeclaration_3(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '*' | TypeName
  private static boolean UsingForDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UsingForDeclaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULT);
    if (!r) r = TypeName(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean VarLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLiteral")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VAR_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // var declarationList | TypeName StorageLocation? Identifier
  public static boolean VariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = VariableDeclaration_0(b, l + 1);
    if (!r) r = VariableDeclaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var declarationList
  private static boolean VariableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && declarationList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeName StorageLocation? Identifier
  private static boolean VariableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1, -1);
    r = r && VariableDeclaration_1_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageLocation?
  private static boolean VariableDeclaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_1_1")) return false;
    StorageLocation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // VariableDeclaration ( '=' Expression )?
  public static boolean VariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION, "<variable definition>");
    r = VariableDeclaration(b, l + 1);
    r = r && VariableDefinition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '=' Expression )?
  private static boolean VariableDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1")) return false;
    VariableDefinition_1_0(b, l + 1);
    return true;
  }

  // '=' Expression
  private static boolean VariableDefinition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // public | internal | private
  static boolean VisibilityModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisibilityModifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, PRIVATE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // while '(' Expression ')' Statement
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, null);
    r = consumeTokens(b, 1, WHILE, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && Statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '(' ( (Identifier | '_') ','? | ',' )*  ')'
  static boolean declarationList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && declarationList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( (Identifier | '_') ','? | ',' )*
  private static boolean declarationList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declarationList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declarationList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (Identifier | '_') ','? | ','
  private static boolean declarationList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarationList_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Identifier | '_') ','?
  private static boolean declarationList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarationList_1_0_0_0(b, l + 1);
    r = r && declarationList_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | '_'
  private static boolean declarationList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, PLACEHOLDER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean declarationList_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationList_1_0_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: BINARY(TernaryExpression)
  // 1: POSTFIX(IncrementExpression)
  // 2: ATOM(FunctionCallExpression)
  // 3: POSTFIX(CallExpression)
  // 4: POSTFIX(IndexAccessExpression)
  // 5: ATOM(ParenExpression)
  // 6: ATOM(UnaryExpression)
  // 7: BINARY(ExponentExpression)
  // 8: BINARY(MultDivExpression)
  // 9: BINARY(PlusMinExpression)
  // 10: BINARY(ShiftExpression)
  // 11: BINARY(AndOpExpression)
  // 12: BINARY(XorOpExpression)
  // 13: BINARY(OrOpExpression)
  // 14: BINARY(CompExpression)
  // 15: BINARY(EqExpression)
  // 16: BINARY(AndExpression)
  // 17: BINARY(OrExpression)
  // 18: BINARY(AssignmentExpression)
  // 19: POSTFIX(MemberAccessExpression)
  // 20: ATOM(InlineArrayExpression)
  // 21: ATOM(PrimaryExpression)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = FunctionCallExpression(b, l + 1);
    if (!r) r = ParenExpression(b, l + 1);
    if (!r) r = UnaryExpression(b, l + 1);
    if (!r) r = InlineArrayExpression(b, l + 1);
    if (!r) r = PrimaryExpression(b, l + 1);
    p = r;
    r = r && Expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, QUESTION)) {
        r = report_error_(b, Expression(b, l, 0));
        r = TernaryExpression_1(b, l + 1) && r;
        exit_section_(b, l, m, TERNARY_EXPRESSION, r, true, null);
      }
      else if (g < 1 && IncrementExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INCREMENT_EXPRESSION, r, true, null);
      }
      else if (g < 3 && CallExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPRESSION, r, true, null);
      }
      else if (g < 4 && IndexAccessExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INDEX_ACCESS_EXPRESSION, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, EXPONENT)) {
        r = Expression(b, l, 7);
        exit_section_(b, l, m, EXPONENT_EXPRESSION, r, true, null);
      }
      else if (g < 8 && MultDivExpression_0(b, l + 1)) {
        r = Expression(b, l, 8);
        exit_section_(b, l, m, MULT_DIV_EXPRESSION, r, true, null);
      }
      else if (g < 9 && PlusMinExpression_0(b, l + 1)) {
        r = Expression(b, l, 9);
        exit_section_(b, l, m, PLUS_MIN_EXPRESSION, r, true, null);
      }
      else if (g < 10 && ShiftExpression_0(b, l + 1)) {
        r = Expression(b, l, 10);
        exit_section_(b, l, m, SHIFT_EXPRESSION, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, AND)) {
        r = Expression(b, l, 11);
        exit_section_(b, l, m, AND_OP_EXPRESSION, r, true, null);
      }
      else if (g < 12 && consumeTokenSmart(b, CARET)) {
        r = Expression(b, l, 12);
        exit_section_(b, l, m, XOR_OP_EXPRESSION, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, OR)) {
        r = Expression(b, l, 13);
        exit_section_(b, l, m, OR_OP_EXPRESSION, r, true, null);
      }
      else if (g < 14 && CompExpression_0(b, l + 1)) {
        r = Expression(b, l, 14);
        exit_section_(b, l, m, COMP_EXPRESSION, r, true, null);
      }
      else if (g < 15 && EqExpression_0(b, l + 1)) {
        r = Expression(b, l, 15);
        exit_section_(b, l, m, EQ_EXPRESSION, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, ANDAND)) {
        r = Expression(b, l, 16);
        exit_section_(b, l, m, AND_EXPRESSION, r, true, null);
      }
      else if (g < 17 && consumeTokenSmart(b, OROR)) {
        r = Expression(b, l, 17);
        exit_section_(b, l, m, OR_EXPRESSION, r, true, null);
      }
      else if (g < 18 && AssignmentExpression_0(b, l + 1)) {
        r = Expression(b, l, 18);
        exit_section_(b, l, m, ASSIGNMENT_EXPRESSION, r, true, null);
      }
      else if (g < 19 && parseTokensSmart(b, 0, DOT, IDENTIFIER)) {
        r = true;
        exit_section_(b, l, m, MEMBER_ACCESS_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // ':' Expression
  private static boolean TernaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '++' | '--'
  private static boolean IncrementExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncrementExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INC);
    if (!r) r = consumeTokenSmart(b, DEC);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Identifier '(' FunctionCallArguments? ')') |
  //                            ( ( PrimaryExpression | NewExpression | TypeName  ) ( ( '.' Identifier ) | ( '[' Expression? ']' ) )* '(' FunctionCallArguments? ')' )
  public static boolean FunctionCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_EXPRESSION, "<function call expression>");
    r = FunctionCallExpression_0(b, l + 1);
    if (!r) r = FunctionCallExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier '(' FunctionCallArguments? ')'
  private static boolean FunctionCallExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, IDENTIFIER, LPAREN);
    r = r && FunctionCallExpression_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCallArguments?
  private static boolean FunctionCallExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_0_2")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  // ( PrimaryExpression | NewExpression | TypeName  ) ( ( '.' Identifier ) | ( '[' Expression? ']' ) )* '(' FunctionCallArguments? ')'
  private static boolean FunctionCallExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallExpression_1_0(b, l + 1);
    r = r && FunctionCallExpression_1_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && FunctionCallExpression_1_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // PrimaryExpression | NewExpression | TypeName
  private static boolean FunctionCallExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrimaryExpression(b, l + 1);
    if (!r) r = NewExpression(b, l + 1);
    if (!r) r = TypeName(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( '.' Identifier ) | ( '[' Expression? ']' ) )*
  private static boolean FunctionCallExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionCallExpression_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionCallExpression_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( '.' Identifier ) | ( '[' Expression? ']' )
  private static boolean FunctionCallExpression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallExpression_1_1_0_0(b, l + 1);
    if (!r) r = FunctionCallExpression_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' Identifier
  private static boolean FunctionCallExpression_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' Expression? ']'
  private static boolean FunctionCallExpression_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && FunctionCallExpression_1_1_0_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean FunctionCallExpression_1_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0_1_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // FunctionCallArguments?
  private static boolean FunctionCallExpression_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_3")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  // ( ( '.' Identifier ) | ( '[' Expression ']' ) )* '(' FunctionCallArguments? ')' ('(' FunctionCallArguments? ')')*
  private static boolean CallExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallExpression_0_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && CallExpression_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && CallExpression_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( '.' Identifier ) | ( '[' Expression ']' ) )*
  private static boolean CallExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CallExpression_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallExpression_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( '.' Identifier ) | ( '[' Expression ']' )
  private static boolean CallExpression_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallExpression_0_0_0_0(b, l + 1);
    if (!r) r = CallExpression_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' Identifier
  private static boolean CallExpression_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' Expression ']'
  private static boolean CallExpression_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCallArguments?
  private static boolean CallExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_2")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  // ('(' FunctionCallArguments? ')')*
  private static boolean CallExpression_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CallExpression_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallExpression_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '(' FunctionCallArguments? ')'
  private static boolean CallExpression_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && CallExpression_0_4_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCallArguments?
  private static boolean CallExpression_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_4_0_1")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  // '[' Expression? ']'
  private static boolean IndexAccessExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexAccessExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && IndexAccessExpression_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean IndexAccessExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexAccessExpression_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // '(' Expression ')'
  public static boolean ParenExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenExpression")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPRESSION, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('!' | '~' | delete | '++' | '--' | '+' | '-') Expression
  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, UNARY_EXPRESSION, "<unary expression>");
    r = UnaryExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '!' | '~' | delete | '++' | '--' | '+' | '-'
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NOT);
    if (!r) r = consumeTokenSmart(b, TILDE);
    if (!r) r = consumeTokenSmart(b, DELETE);
    if (!r) r = consumeTokenSmart(b, INC);
    if (!r) r = consumeTokenSmart(b, DEC);
    if (!r) r = consumeTokenSmart(b, PLUS);
    if (!r) r = consumeTokenSmart(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | '/' | '%'
  private static boolean MultDivExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultDivExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, MULT);
    if (!r) r = consumeTokenSmart(b, DIV);
    if (!r) r = consumeTokenSmart(b, PERCENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' | '-'
  private static boolean PlusMinExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PlusMinExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PLUS);
    if (!r) r = consumeTokenSmart(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<' | '>>'
  private static boolean ShiftExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LSHIFT);
    if (!r) r = consumeTokenSmart(b, RSHIFT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<' | '>' | '<=' | '>='
  private static boolean CompExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LESS);
    if (!r) r = consumeTokenSmart(b, MORE);
    if (!r) r = consumeTokenSmart(b, LESSEQ);
    if (!r) r = consumeTokenSmart(b, MOREEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // '==' | '!='
  private static boolean EqExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, EQ);
    if (!r) r = consumeTokenSmart(b, NEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' | '|=' | '^=' | '&=' | '<<=' | '>>=' | '+=' | '-=' | '*=' | '/=' | '%='
  private static boolean AssignmentExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ASSIGN);
    if (!r) r = consumeTokenSmart(b, OR_ASSIGN);
    if (!r) r = consumeTokenSmart(b, XOR_ASSIGN);
    if (!r) r = consumeTokenSmart(b, AND_ASSIGN);
    if (!r) r = consumeTokenSmart(b, LSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, RSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, PLUS_ASSIGN);
    if (!r) r = consumeTokenSmart(b, MINUS_ASSIGN);
    if (!r) r = consumeTokenSmart(b, MULT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, DIV_ASSIGN);
    if (!r) r = consumeTokenSmart(b, PERCENT_ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' Expression (',' Expression)* ']'
  public static boolean InlineArrayExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineArrayExpression")) return false;
    if (!nextTokenIsSmart(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && Expression(b, l + 1, -1);
    r = r && InlineArrayExpression_2(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, INLINE_ARRAY_EXPRESSION, r);
    return r;
  }

  // (',' Expression)*
  private static boolean InlineArrayExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineArrayExpression_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InlineArrayExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InlineArrayExpression_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Expression
  private static boolean InlineArrayExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineArrayExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VarLiteral
  //                   | BooleanLiteral
  //                   | NumberLiteral
  //                   | HexLiteral
  //                   | StringLiteral
  //                   | ElementaryTypeNameExpression
  public static boolean PrimaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = VarLiteral(b, l + 1);
    if (!r) r = BooleanLiteral(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = HexLiteral(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = ElementaryTypeNameExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: TypeName
  // Operator priority table:
  // 0: ATOM(ElementaryTypeName)
  // 1: ATOM(MappingTypeName)
  // 2: ATOM(UserDefinedLocationTypeName)
  // 3: ATOM(BytesArrayTypeName)
  // 4: POSTFIX(ArrayTypeName)
  // 5: ATOM(FunctionTypeName)
  public static boolean TypeName(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "TypeName")) return false;
    addVariant(b, "<type name>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type name>");
    r = ElementaryTypeName(b, l + 1);
    if (!r) r = MappingTypeName(b, l + 1);
    if (!r) r = UserDefinedLocationTypeName(b, l + 1);
    if (!r) r = BytesArrayTypeName(b, l + 1);
    if (!r) r = FunctionTypeName(b, l + 1);
    p = r;
    r = r && TypeName_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean TypeName_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "TypeName_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 4 && ArrayTypeName_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARRAY_TYPE_NAME, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // address | bool | string | var | NumberType
  public static boolean ElementaryTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElementaryTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENTARY_TYPE_NAME, "<elementary type name>");
    r = consumeTokenSmart(b, ADDRESS);
    if (!r) r = consumeTokenSmart(b, BOOL);
    if (!r) r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, VAR);
    if (!r) r = NumberType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // mapping '(' (BytesArrayTypeName | ElementaryTypeName  ) '=>' TypeName ')'
  public static boolean MappingTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MappingTypeName")) return false;
    if (!nextTokenIsSmart(b, MAPPING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAPPING_TYPE_NAME, null);
    r = consumeTokensSmart(b, 1, MAPPING, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, MappingTypeName_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, TO)) && r;
    r = p && report_error_(b, TypeName(b, l + 1, -1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // BytesArrayTypeName | ElementaryTypeName
  private static boolean MappingTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MappingTypeName_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BytesArrayTypeName(b, l + 1);
    if (!r) r = ElementaryTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UserDefinedWithLocationTypeName | UserDefinedWithoutLocationTypeName
  public static boolean UserDefinedLocationTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedLocationTypeName")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, USER_DEFINED_LOCATION_TYPE_NAME, null);
    r = UserDefinedWithLocationTypeName(b, l + 1);
    if (!r) r = UserDefinedWithoutLocationTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // bytesNumType StorageLocation?
  public static boolean BytesArrayTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BytesArrayTypeName")) return false;
    if (!nextTokenIsSmart(b, BYTESNUMTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BYTESNUMTYPE);
    r = r && BytesArrayTypeName_1(b, l + 1);
    exit_section_(b, m, BYTES_ARRAY_TYPE_NAME, r);
    return r;
  }

  // StorageLocation?
  private static boolean BytesArrayTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BytesArrayTypeName_1")) return false;
    StorageLocation(b, l + 1);
    return true;
  }

  // '[' Expression? ']' StorageLocation?
  private static boolean ArrayTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && ArrayTypeName_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    r = r && ArrayTypeName_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean ArrayTypeName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // StorageLocation?
  private static boolean ArrayTypeName_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0_3")) return false;
    StorageLocation(b, l + 1);
    return true;
  }

  // function ParameterList ( internal | external | StateMutability )*
  //                    ( returns ParameterList )?
  public static boolean FunctionTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName")) return false;
    if (!nextTokenIsSmart(b, FUNCTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE_NAME, null);
    r = consumeTokenSmart(b, FUNCTION);
    p = r; // pin = 1
    r = r && report_error_(b, ParameterList(b, l + 1));
    r = p && report_error_(b, FunctionTypeName_2(b, l + 1)) && r;
    r = p && FunctionTypeName_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( internal | external | StateMutability )*
  private static boolean FunctionTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionTypeName_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionTypeName_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // internal | external | StateMutability
  private static boolean FunctionTypeName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INTERNAL);
    if (!r) r = consumeTokenSmart(b, EXTERNAL);
    if (!r) r = StateMutability(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( returns ParameterList )?
  private static boolean FunctionTypeName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_3")) return false;
    FunctionTypeName_3_0(b, l + 1);
    return true;
  }

  // returns ParameterList
  private static boolean FunctionTypeName_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, RETURNS);
    r = r && ParameterList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser ClosedBracketRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ClosedBracketRecover(b, l + 1);
    }
  };
  final static Parser UntilBraceRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return UntilBraceRecover(b, l + 1);
    }
  };
  final static Parser UntilSemicolonRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return UntilSemicolonRecover(b, l + 1);
    }
  };
}
