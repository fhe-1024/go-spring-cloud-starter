package com.go.prepare.converter;

import com.go.prepare.javabean.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.util.StringUtils;


/**
 * @Author: fhe
 * 努力吧
 * @Date: 2020/8/20 20:26
 * https://cloud.tencent.com/developer/article/1497687
 */
public class UserConverter implements Converter<String, User> {

    @Override
    public User convert(String source) {
        if (StringUtils.isEmpty(source)) {
            return null;
        }
        String[] userString = StringUtils.delimitedListToStringArray(source, ":");
        User user = new User();
        user.setName(userString[0]);
        user.setAge(Integer.parseInt(userString[1]));
        return user;
    }


//    Spring提供了3种converter接口,分别是Converter、ConverterFactory和GenericConverter.一般用于1:1, 1:N, N:N的source->target类型转化。
//
//    Converter接口         ：使用最简单，最不灵活
//    ConverterFactory接口  ：使用较复杂，比较灵活
//    GenericConverter接口  ：使用最复杂，也最灵活
//


    public static void main(String[] args) {
        UserConverter userConverter = new UserConverter();
        User user = userConverter.convert("fhe:1");
        System.out.println(user);

        SerializingConverter serializingConverter = new SerializingConverter();
        byte[] bytes = serializingConverter.convert("fhe");
        System.out.println(bytes[0]);

//        CharacterToNumberFactory
    }

}
