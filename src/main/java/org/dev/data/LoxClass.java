package org.dev.data;

import java.util.List;
import java.util.Map;
import org.dev.services.Interpreter;
import org.dev.services.JLoxCallable;

public class LoxClass implements JLoxCallable {
  public final String name;

  public LoxClass(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public Object call(Interpreter interpreter,
      List<Object> arguments) {
    JLoxInstance instance = new JLoxInstance(this);
    return instance;
  }

  @Override
  public int arity() {
    return 0;
  }
}
