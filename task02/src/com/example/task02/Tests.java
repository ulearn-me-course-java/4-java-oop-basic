package com.example.task02;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Tests {

    private Class<?> getTestedClass() {
        try {
            return Class.forName("com.example.task02.TimeSpan");
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Не найден класс TimeSpan");
        }
    }

    @Test
    public void testFields() {
        for (Field f : getTestedClass().getDeclaredFields()) {
            int modifiers = f.getModifiers();
            Assert.assertTrue(String.format("Поле %s должно быть private", f.getName()), Modifier.isPrivate(modifiers));
        }
    }

    @Test
    public void testConstructor() {
        Arrays.stream(getTestedClass().getDeclaredConstructors())
                .filter(c -> c.getParameterCount() == 3)
                .findAny()
                .orElseThrow(() -> new AssertionError("Не найден конструктор с тремя аргументами"));
    }

    @Test
    public void testAddMethod() {
        Class<?> clazz = getTestedClass();
        try {
            Method method = clazz.getDeclaredMethod("add", clazz);
            Assert.assertEquals("Метод add должен возвращать void", method.getReturnType(), void.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Не найден метод add(TimeUnit)", e);
        }
    }

    @Test
    public void testSubtractMethod() {
        Class<?> clazz = getTestedClass();
        try {
            Method method = clazz.getDeclaredMethod("subtract", clazz);
            Assert.assertEquals("Метод subtract должен возвращать void", method.getReturnType(), void.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Не найден метод subtract(TimeUnit)", e);
        }
    }

    @Test
    public void testToString() {
        try {
            Method toString = getTestedClass().getDeclaredMethod("toString");
            int modifiers = toString.getModifiers();
            Assert.assertTrue("Метод toString должен быть public", Modifier.isPublic(modifiers));
            Assert.assertFalse("Метод toString не должен быть static", Modifier.isStatic(modifiers));

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Не найден метод toString", e);
        }
    }

/*    private void check(int sec, int min, int hours, int s2, int m2, int h2) {
        Assert.assertTrue(new TimeSpan(sec,min,hours).toString().equals(new TimeSpan(s2,m2,h2).toString()));
    }

    @Test
    public void testPlus() throws Exception {
        check(1, 1, 1,1,1,1);
        check(60,0,0,0,1,0);
        check(60,59,0,0,0,1);
        check(60,60,0,0,1,1);
    }*/

}
