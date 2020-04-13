package net.alexwirz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.node.ObjectNode;

@JsonSerialize(using = Serializer.class)
public interface JsonMappable {
    void mapAsJsonNode(ObjectNode objectNode);
}
