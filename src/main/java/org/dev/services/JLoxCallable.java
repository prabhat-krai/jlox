package org.dev.services;

import java.util.List;

interface JLoxCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
