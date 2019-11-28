package syntax.expr;

import syntax.Leaf;
import visitor.Visitor;

public class FalseConst extends BooleanConst implements Leaf<Boolean> {

  public FalseConst(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

  @Override
  public Boolean getValue() {
    return false;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}