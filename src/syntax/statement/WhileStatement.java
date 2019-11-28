package syntax.statement;

import java.util.LinkedList;


import syntax.Statement;
import visitor.Visitor;

public class WhileStatement extends Statement {

  private LinkedList<Statement> statements;

  public WhileStatement(int leftLocation, int rightLocation, LinkedList<Statement> statements) {
    super(leftLocation, rightLocation);
    this.statements = statements;
  }

  /**
   * @return the statements
   */
  public LinkedList<Statement> getStatements() {
    return statements;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return null;
  }

}