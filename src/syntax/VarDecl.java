package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;
import syntax.type.*;

public class VarDecl extends AstNode {

  private Id id;
  private Type type;
  private VarInitValue varInitValue;

  public VarDecl(Location leftLocation, Location rightLocation, Id id, Type type, VarInitValue varInitValue) {
    super(leftLocation, rightLocation);
    this.id = id;
    this.type = type;
    this.varInitValue = varInitValue;
  }

  /**
   * @return the id
   */
  public Id getId() {
    return id;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * @return the varInitValue
   */
  public VarInitValue getVarInitValue() {
    return varInitValue;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}
