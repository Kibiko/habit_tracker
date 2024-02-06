package com.solo.habit_tracker.models;

import com.solo.habit_tracker.components.EncryptionUtil;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.print.attribute.Attribute;

@Converter
public class Encrypt implements AttributeConverter<String, String> {

    @Autowired
    EncryptionUtil encryptionUtil;

    @Override
    public String convertToDatabaseColumn(String message){
        return encryptionUtil.encrypt(message);
    }

    @Override
    public String convertToEntityAttribute(String message){
        return encryptionUtil.decrypt(message);
    }
}
