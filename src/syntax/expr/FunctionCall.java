package syntax.expr;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.Expr;
import visitor.Visitor;

public class FunctionCall extends Expr {

  private Id id;
  private ArrayList<Expr> exprs;

  public FunctionCall(Location leftLocation, Location rightLocation, Id id, ArrayList<Expr> exprs) {
    super(leftLocation, rightLocation);
    this.id = id;
    this.exprs = exprs;
  }

  /**
   * @return the exprs
   */
  public ArrayList<Expr> getExprs() {
    return exprs;
  }

  /**
   * @return the id
   */
  public Id getId() {
    return id;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}