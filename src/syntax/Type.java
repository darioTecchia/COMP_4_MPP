package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;

public abstract class Type extends AstNode {

  public Type(Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
  }

  
}