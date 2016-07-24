/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.example.project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class JUnit5Annotations {
    
    @BeforeAll
    static void initAll() {
        System.out.println("Before all");
    }
    
    @BeforeEach
    void init() {
        System.out.println("Before each");
    }
    
    @Test
    @DisplayName("this is my first test !😳")
    void firstTest() {
        System.out.println("First test");
    }
    
    @Test
    @Tag("Test#2")
    void secondTest() {
        System.out.println("Second test");
    }
    
    @Test
    void failingTest() {
        Assertions.fail("a failing test");
    }
    
    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
    }
    
    @AfterEach
    void tearDown() {
       System.out.println("After each");

    }
    
    @AfterAll
    static void tearDownAll() {
        System.out.println("After all");
    }
}
