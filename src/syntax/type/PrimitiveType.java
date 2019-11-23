package syntax.type;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class PrimitiveType extends Type {

  private String kind;

  public PrimitiveType(String kind, Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
    this.kind = kind;
  }

  /**
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}