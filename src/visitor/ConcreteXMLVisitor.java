package visitor;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import syntax.*;
import syntax.expr.*;
import syntax.type.*;
import syntax.statement.*;
import syntax.expr.unaryexpr.*;
import syntax.expr.binaryexpr.arithop.*;
import syntax.expr.binaryexpr.relop.*;

public class ConcreteXMLVisitor implements Visitor<Element, Document> {

  @Override
  public Element visit(Program program, Document arg) {
    System.out.println("Program");
    return null;
  }

  @Override
  public Element visit(Global global, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(Function function, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ParDecl parDecl, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(VarDecl varDecl, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(VarInitValue varInitValue, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(PrimitiveType primitiveType, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ArrayType arrayType, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(FunctionType functionType, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(IfThenStatement ifThenStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(IfThenElseStatement ifThenElseStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ForStatement forStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(AssignStatement assignStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(FunctionCallStatement functionCallStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ReadStatement readStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(WriteStatements writeStatements, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ReturnStatement returnStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(LocalStatement localStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(NilConst nilConst, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(BooleanConst booleanConst, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(IntegerConst integerConst, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(FloatConst floatConst, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(StringConst stringConst, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ArrayElemAssignStatement arrayElemAssignStatement, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ArrayRead arrayRead, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(FunctionCall functionCall, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(MinusOp minusOp, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(PlusOp plusOp, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(TimesOp timesOp, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(DivOp divOp, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(AndRelop andRelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(GreaterThanRelop greaterThanRelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(OrRelop orRelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(GreaterThanERelop greaterThanERelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(LessThenRelop lessThenRelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(LessThenERelop lessThenERelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(EqualsRelop equalsRelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(NotEqualsRelop notEqualsRelop, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(UminusExpr uminusExpr, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(NotExpr notExpr, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(SharpExpr sharpExpr, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(Id id, Document arg) {
    System.out.println();
    return null;
  }

  @Override
  public Element visit(ArrayConst arrayConst, Document arg) {
    System.out.println();
    return null;
  }

}