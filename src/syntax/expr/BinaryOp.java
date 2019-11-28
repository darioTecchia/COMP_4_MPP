package syntax.expr;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.AstNode;

public abstract class BinaryOp extends AstNode {

  public BinaryOp(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

}