package net.alexwirz;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Objects;

public class SimpleObject implements JsonMappable {
    private final String foo;
    private final int bar;

    @JsonCreator
    public SimpleObject(@JsonProperty("foo") String foo, @JsonProperty("bar") int bar) {
        this.foo = foo;
        this.bar = bar;
    }

    @Override
    public void mapAsJsonNode(ObjectNode objectNode) {
        objectNode.put("foo", foo);
        objectNode.put("bar", bar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleObject that = (SimpleObject) o;
        return bar == that.bar &&
                Objects.equals(foo, that.foo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo, bar);
    }
}
