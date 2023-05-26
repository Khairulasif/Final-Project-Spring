package com.example.FinalProject.empdto;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ForTimeSerialize extends JsonDeserializer<LocalTime> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

    @Override
    public LocalTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {

            String timeStr = p.getValueAsString();
            return LocalTime.parse(timeStr, formatter);
        }

}
