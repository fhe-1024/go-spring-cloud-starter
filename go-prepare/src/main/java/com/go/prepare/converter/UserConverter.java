package com.go.prepare.converter;

import com.go.prepare.javabean.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;


/**
 * @Author: fhe
 * 努力吧
 * @Date: 2020/8/20 20:26
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


    public static void main(String[] args) {
        UserConverter userConverter = new UserConverter();
        User user = userConverter.convert("fhe:1");
        System.out.println(user);
    }

}
