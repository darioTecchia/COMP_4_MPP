package syntax;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class IfThenElseStatement extends Statement {

  private Expr expr;
  private ArrayList<Statement> thenStatements;
  private ArrayList<Statement> elseStatements;

  public IfThenElseStatement(Location leftLocation, Location rightLocation, Expr expr, ArrayList<Statement> thenStatements, ArrayList<Statement> elseStatements) {
    super(leftLocation, rightLocation);
    this.expr = expr;
    this.thenStatements = thenStatements;
    this.elseStatements = elseStatements;
  }

  /**
   * @return the expr
   */
  public Expr getExpr() {
    return expr;
  }

  /**
   * @return the elseStatements
   */
  public ArrayList<Statement> getElseStatements() {
    return elseStatements;
  }

  /**
   * @return the thenStatements
   */
  public ArrayList<Statement> getThenStatements() {
    return thenStatements;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

  
}