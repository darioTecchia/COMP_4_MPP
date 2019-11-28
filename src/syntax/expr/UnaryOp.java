package syntax.expr;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.AstNode;

public abstract class UnaryOp extends AstNode {

  public UnaryOp(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

}