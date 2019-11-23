package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class BooleanConst extends Expr implements Leaf<Boolean> {

  private Boolean value;

  public BooleanConst(Location leftLocation, Location rightLocation, Boolean value) {
    super(leftLocation, rightLocation);
    this.value = value;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

  @Override
  public Boolean getValue() {
    return this.value;
  }

}