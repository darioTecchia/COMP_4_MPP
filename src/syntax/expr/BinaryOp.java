package syntax.expr;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.AstNode;

public abstract class BinaryOp extends AstNode {

  public BinaryOp(Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
  }

}