package com.github.sbaudoin.sonar.plugins.yaml.checks;

import junit.framework.TestCase;

public class CommentsCheckTest extends TestCase {
    public void testCheck() {
        assertNotNull(new CommentsCheck());
    }
}