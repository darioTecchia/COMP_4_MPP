package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class StringConst extends Expr implements Leaf<String> {

  private String value;

  public StringConst(Location leftLocation, Location rightLocation, String value) {
    super(leftLocation, rightLocation);
    this.value = value;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

  @Override
  public String getValue() {
    return this.value;
  }

}