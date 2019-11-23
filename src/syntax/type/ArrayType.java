package syntax.type;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.Type;
import visitor.Visitor;

public class ArrayType extends Type {

  private Type type;

  public ArrayType(Location leftLocation, Location rightLocation, Type type) {
    super(leftLocation, rightLocation);
    this.type = type;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }
  
}