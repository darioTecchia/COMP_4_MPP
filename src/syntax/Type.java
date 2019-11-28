package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;

public abstract class Type extends AstNode {

  public Type(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

  
}