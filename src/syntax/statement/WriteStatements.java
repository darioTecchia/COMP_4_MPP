package syntax.statement;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.*;
import visitor.Visitor;

public class WriteStatements extends Statement {

  private ArrayList<Expr> exprs;

  public WriteStatements(Location leftLocation, Location rightLocation, ArrayList<Expr> exprs) {
    super(leftLocation, rightLocation);
    this.exprs = exprs;
  }

  /**
   * @return the exprs
   */
  public ArrayList<Expr> getExprs() {
    return exprs;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }
  
}