package syntax.expr;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.AstNode;

public abstract class UnaryOp extends AstNode {

  public UnaryOp(Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
  }

}