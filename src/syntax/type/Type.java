package syntax.type;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.*;

public abstract class Type extends AstNode {

  public Type(Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
  }

  
}