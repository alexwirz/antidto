package net.alexwirz;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class Serializer extends StdSerializer<JsonMappable> {
    protected Serializer() {
        super(JsonMappable.class);
    }

    @Override
    public void serialize(JsonMappable jsonMappable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        var objectMapper = new ObjectMapper();
        var objectNode = objectMapper.createObjectNode();
        jsonMappable.mapAsJsonNode(objectNode);
        objectNode.serialize(jsonGenerator, serializerProvider);
    }
}
