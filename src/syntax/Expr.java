package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;

public abstract class Expr extends AstNode {

  public Expr(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

}
