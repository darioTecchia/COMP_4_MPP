package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;

public abstract class Expr extends AstNode {

  public Expr(Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
  }

}
