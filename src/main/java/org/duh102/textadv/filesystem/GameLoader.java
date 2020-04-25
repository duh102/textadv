package org.duh102.textadv.filesystem;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class GameLoader {
    private ObjectMapper mapper;
    public GameLoader(ObjectMapper mapper) {
        this.mapper = mapper;
    }
    public GameLoader() {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
}
