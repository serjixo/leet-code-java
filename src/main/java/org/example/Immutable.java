package org.example;

public final class Immutable {
    private final String foo;

    public Immutable(String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }
}
