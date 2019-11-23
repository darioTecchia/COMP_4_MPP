package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

/**
 * NilConst
 */
public class NilConst extends Expr implements Leaf<Object> {

  public NilConst(Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

  @Override
  public Object getValue() {
    return null;
  }

  
  
}