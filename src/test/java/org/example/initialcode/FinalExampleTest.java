package org.example.initialcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinalExampleTest {

    private FinalExample finalExample;

    @BeforeEach
    void setup() {
        this.finalExample = new FinalExample();
    }

    @Test
    void shouldCheckNameBeNullOrEmptyOnCreateUser() {
        final String messageNull = this.finalExample.createUser(null,  null, null, null, null, null);
        assertEquals("Name cannot be empty", messageNull);
        final String messageEmpty = this.finalExample.createUser("",  null, null, null, null, null);
        assertEquals("Name cannot be empty",messageEmpty);
    }
    
    @Test
    void shouldCheckEmailBeNullOrNotContainsOnCreateUser() {
        final String messageNull = this.finalExample.createUser("Luis",  null, null, null, null, null);
        assertEquals("Invalid email", messageNull);
        final String messageNotContains = this.finalExample.createUser("Luis",  "n.rodas225gmail.com", null, null, null, null);
        assertEquals("Invalid email",messageNotContains);
    }

    @Test
    void shoudReturnUserCreatedOnCreateUser() {
        final String name = "Luis";
        final String message = this.finalExample.createUser(name, "n.rodas225@gmail.com", null, null, null, null);
        assertEquals("User created: " + name, message);
    }

    @Test
    void shouldCalculateCircleArea() {
        String shape = "circle";
        double ratio = 6;
        double resp = Math.PI * ratio * ratio;
        double area = this.finalExample.calculateArea(shape, ratio);
        assertEquals(resp, area);
    }

    @Test
    void shouldCalculateRectangleArea() {
        String shape = "rectangle";
        double[] dimensions = {5, 12};
        double resp = dimensions[0] * dimensions[1];
        double area = this.finalExample.calculateArea(shape, dimensions);
        assertEquals(resp, area);
    }

    @Test
    void shouldCalculateTriangleArea() {
        String shape = "triangle";
        double[] dimensions = {5, 12};
        double resp = dimensions[0] * dimensions[1] / 2;
        double area = this.finalExample.calculateArea(shape, dimensions);
        assertEquals(resp, area);
    }

}
