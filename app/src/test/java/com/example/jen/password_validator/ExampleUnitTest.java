package com.example.jen.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest extends passwordValidator{
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void validateCorrect() throws Exception {
        validate1("Hello");
        validate1("greetHin435");
    }
    public void validateCorrect2() throws Exception {
        validate2("Hello");
          validate2("greetHin435");
    }



}