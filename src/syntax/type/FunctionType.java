package syntax.type;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class FunctionType extends Type {

  private ArrayList<Type> types;

  public FunctionType(Location leftLocation, Location rightLocation, ArrayList<Type> types) {
    super(leftLocation, rightLocation);
    this.types = types;
  }

  public FunctionType(Location leftLocation, Location rightLocation) {
    super(leftLocation, rightLocation);
    this.types =  new ArrayList<>();
  }

  /**
   * @return the types
   */
  public ArrayList<Type> getTypes() {
    return types;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

  
}