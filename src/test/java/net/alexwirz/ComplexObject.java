package net.alexwirz;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ComplexObject implements JsonMappable {
    private final int foo;
    private final SimpleObject embeddedObject;

    public ComplexObject(int foo, SimpleObject embeddedObject) {
        this.foo = foo;
        this.embeddedObject = embeddedObject;
    }

    @Override
    public ObjectNode mapAsJsonNode(ObjectNode objectNode, JsonNodeFactory jsonNodeFactory) {
        objectNode.put("foo", foo);
        objectNode.set("embeddedObject", embeddedObject.mapAsJsonNode(jsonNodeFactory.objectNode(), jsonNodeFactory));
        return objectNode;
    }

    @Override
    public JsonMedia mapAsJson(JsonMedia jsonMedia) {
        return null;
    }
}
