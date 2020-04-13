package net.alexwirz;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonMedia {
    private final ObjectNode root;
    private final JsonNodeFactory nodeFactory;

    public JsonMedia(ObjectNode root, JsonNodeFactory nodeFactory) {
        this.root = root;
        this.nodeFactory = nodeFactory;
    }
}
