package com.computer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {

    private Store store;

    @BeforeEach
    void setUp() {
        store = new Store("Last PC", "Joseito", "8829833");
    }

    @Test
    public void testGetName() {
        assertEquals("Last PC", store.getName());
    }

    @Test
    public void testSetName() {
        store.setName("Other PC");
        assertEquals("Other PC", store.getName());
    }

    @Test
    public void testGetOwner() {
        assertEquals("Joseito", store.getOwner());
    }

    @Test
    public void testSetOwner() {
        store.setOwner("Robert");
        assertEquals("Robert", store.getOwner());
    }

    @Test
    public void testGetTaxId() {
        assertEquals("8829833", store.getTaxId());
    }
}
