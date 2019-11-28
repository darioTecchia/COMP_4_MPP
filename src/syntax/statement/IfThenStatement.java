package syntax.statement;


import visitor.Visitor;
import syntax.*;

public class IfThenStatement extends Statement {

  private Expr expr;

  public IfThenStatement(int leftLocation, int rightLocation, Expr expr) {
    super(leftLocation, rightLocation);
    this.expr = expr;
  }

  /**
   * @return the expr
   */
  public Expr getExpr() {
    return expr;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

  
}