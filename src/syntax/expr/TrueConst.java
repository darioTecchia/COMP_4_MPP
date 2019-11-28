package syntax.expr;

import syntax.Leaf;
import visitor.Visitor;

public class TrueConst extends BooleanConst implements Leaf<Boolean> {

  public TrueConst(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

  @Override
  public Boolean getValue() {
    return true;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}