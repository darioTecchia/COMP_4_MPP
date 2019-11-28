package syntax.expr;

import syntax.Expr;

public abstract class BooleanConst extends Expr {

  public BooleanConst(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

}