package com.computer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {

    private Store store;
    private Computer computer1;
    private Computer computer2;

    @BeforeEach
    void setUp() {
        store = new Store("Last PC", "Joseito", "8829833", new ArrayList<>());
        computer1 = new Computer("Lenovo", 8, "I5", "Windows 11", 350.95);
        computer2 = new Computer("HP", 32, "i7", "Windows 11", 670.00);
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

    @Test
    public void testGetComputers() {
        assertTrue(store.getComputers().isEmpty());
    }

    @Test
    public void testSetComputers() {
        List<Computer> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        store.setComputers(computers);
        assertEquals(computers, store.getComputers());
    }

    @Test
    void testAddComputer() {
        store.addComputer(computer1);
        assertEquals(1, store.listComputers().size());
        assertTrue(store.listComputers().contains(computer1));
    }

    @Test
    void testRemoveComputer() {
        store.addComputer(computer1);
        store.addComputer(computer2);
        assertTrue(store.removeComputer("Lenovo"));
        assertEquals(1, store.listComputers().size());
        assertFalse(store.listComputers().contains(computer1));
    }
}
