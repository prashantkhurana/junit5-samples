package com.example.project;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class UserComparableTest implements ComparableContractTest<User> {

    @Override
    public User createSmallerValue() {
        return new User("John", "Doe", 10);
    }

    @Override
    public User createLargerValue() {
        return new User("John", "Lewis", 20);
    }

}
