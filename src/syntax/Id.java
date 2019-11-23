package syntax;

public class Id implements Leaf<String> {

  private String name;

  public Id(String name) {
    this.name = name;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  @Override
  public String getValue() {
    return this.name;
  }

}
