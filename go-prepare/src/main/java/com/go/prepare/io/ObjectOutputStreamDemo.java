package com.go.prepare.io;

import com.go.prepare.javabean.User;

import java.io.*;

/**
 * @Author: fhe
 * 努力吧
 * @Date: 2020/8/22 11:44
 */
public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws Exception {

        File file = new File("D://1.txt");

        OutputStream os = new FileOutputStream(file);
        User user = new User();
        user.setName("hello");
        user.setAge(000);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
        objectOutputStream.writeObject(user);
        objectOutputStream.flush();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        User user1 = (User) objectInputStream.readObject();
        System.out.println(user1.getName());
    }

}
