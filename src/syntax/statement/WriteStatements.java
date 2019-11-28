package syntax.statement;

import java.util.LinkedList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.*;
import visitor.Visitor;

public class WriteStatements extends Statement {

  private LinkedList<Expr> exprs;

  public WriteStatements(int leftLocation, int rightLocation, LinkedList<Expr> exprs) {
    super(leftLocation, rightLocation);
    this.exprs = exprs;
  }

  /**
   * @return the exprs
   */
  public LinkedList<Expr> getExprs() {
    return exprs;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }
  
}