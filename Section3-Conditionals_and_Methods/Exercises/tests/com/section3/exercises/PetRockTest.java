package com.section3.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void setName() {
        rocky.setName("Rocky");
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void isUnhappyBeforePlay() throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertEquals(true, rocky.isHappy());

    }
}