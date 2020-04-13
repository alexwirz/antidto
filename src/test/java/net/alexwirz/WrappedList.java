package net.alexwirz;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.List;

public class WrappedList implements JsonMappable {
    private final List<String> list = new ArrayList<>();

    public void add(String element) {
        list.add(element);
    }

    @Override
    public ObjectNode mapAsJsonNode(ObjectNode objectNode, JsonNodeFactory jsonNodeFactory) {
        var arrayNode = objectNode.putArray("list");
        this.list.forEach(arrayNode::add);
        return objectNode;
    }
}
