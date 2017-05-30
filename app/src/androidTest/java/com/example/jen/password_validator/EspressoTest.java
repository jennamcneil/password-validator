package com.example.jen.password_validator;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;


import static android.support.test.espresso.matcher.ViewMatchers.withText

/**
 * Created by Jen on 2017-05-27.
 */

public class EspressoTest {
    private String strongWord, weakWord;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void weakString(){
        weakWord = ("greenthumb");
    }

    @Before
    public void strongString(){
        strongWord = ("h85E5h5!!");
    }

    @Test
    public void weakTest(){
        onView(withId(R.id.editText)).perform(typeText(weakWord));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Your password is not strong enough!")));
    }

    @Test
    public void strongTest(){
        onView(withId(R.id.editText)).perform(typeText(strongWord));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Your password is strong enough!")));
    }

}
