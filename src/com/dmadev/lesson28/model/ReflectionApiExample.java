package com.dmadev.lesson28.model;

import java.lang.reflect.*;

public class ReflectionApiExample {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user=new User(25L,"Scott", 24);
        testFields(user);
        testMethods(user);
//        Class<? extends User> userClass = user.getClass();
//        Class<User> userClass1 = User.class;
//        System.out.println(userClass==userClass1);
//        testConstructor();
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User bill = constructor.newInstance(5L, "Bill");
        System.out.println(bill);
    }

    private static void testFields(Object object) throws IllegalAccessException {
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(object);
            System.out.println(declaredField.getModifiers());
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
            System.out.println(value);
        }
    }

    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getName = user.getClass().getDeclaredMethod("setName", String.class);
        getName.invoke(user,"ScottModify");
        System.out.println(user);

        //        System.out.println(getName.invoke(user));


    }

    private class Test1{

    }

    private static class Test3{

    }

    private enum Test2{
        ONE,TWO
    }
}
