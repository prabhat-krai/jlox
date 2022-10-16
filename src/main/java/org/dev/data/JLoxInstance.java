package org.dev.data;

import java.util.HashMap;
import java.util.Map;

public class JLoxInstance {

  private LoxClass klass;

  public JLoxInstance(LoxClass klass) {
    this.klass = klass;
  }

  @Override
  public String toString() {
    return klass.name + " instance";
  }
}
