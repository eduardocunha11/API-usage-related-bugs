package com.opensymphony.websquad.example;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import org.apache.commons.beanutils.Converter;
import com.opensymphony.websquad.WSConverter;

public class DateConverter implements WSConverter {
    public Object convert(Class clazz, Object o) {
        if (clazz.isAssignableFrom(String.class)) {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            try {
                return sdf.parse((String) o);
            } catch (ParseException e) {
            }
        }
        return new Date();
    }
}
