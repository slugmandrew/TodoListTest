package com.usav.todo.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.usav.todo.MyTodoList";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
