package net.alexwirz;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@JsonSerialize(using = Serializer.class)
public interface JsonMappable {
    ObjectNode mapAsJsonNode(ObjectNode objectNode, JsonNodeFactory jsonNodeFactory);
}
