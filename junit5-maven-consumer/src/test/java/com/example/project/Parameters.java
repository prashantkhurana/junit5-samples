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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
public class Parameters {

    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    @Tag("my tag")
    void myFirstTest(TestInfo testInfo) {
        assertEquals("My 1st JUnit 5 test! 😎", testInfo.getDisplayName(),
                () -> "TestInfo is injected correctly");
        assertTrue(testInfo.getTags().contains("my tag"));
    }

}
