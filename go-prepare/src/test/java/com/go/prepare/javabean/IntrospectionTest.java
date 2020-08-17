package com.go.prepare.javabean;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyEditorSupport;
import java.util.stream.Stream;

public class IntrospectionTest {



    @Test
    public void personIntrospectionTest() throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
        Stream.of(beanInfo.getPropertyDescriptors())
                .forEach(propertyDescriptor -> {
                    Class<?> propertyClass = propertyDescriptor.getPropertyType();
                    if (propertyClass == Integer.class) {
                        propertyDescriptor.setPropertyEditorClass(StringToIntegralPropertyEditor.class);
                    }
                });

    }


    static class StringToIntegralPropertyEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            setValue(Integer.valueOf(text));
        }
    }

}
