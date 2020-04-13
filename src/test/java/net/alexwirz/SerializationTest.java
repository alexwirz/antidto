package net.alexwirz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SerializationTest {
    @Test
    void canSerialize() throws JsonProcessingException {
        var objectMapper = new ObjectMapper();
        var testObject = new SimpleObject("foo", 42);
        var json = objectMapper.writeValueAsString(testObject);
        assertThat(json).isEqualToIgnoringCase("{\"foo\":\"foo\",\"bar\":42}");
    }

    @Test
    void canDeserialize() throws JsonProcessingException {
        var objectMapper = new ObjectMapper();
        var testObject = new SimpleObject("foo", 42);
        var json = objectMapper.writeValueAsString(testObject);
        var readValue = objectMapper.readValue(json, SimpleObject.class);
        assertThat(readValue).isEqualTo(testObject);
    }
}