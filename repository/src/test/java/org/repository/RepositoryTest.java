package org.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    void getMaxId() {
        assertEquals(Repository.getMaxId(), Integer.MAX_VALUE);
    }

    @Test
    void getMaxId2() {
        assertEquals(Repository.getMaxId(), Integer.MIN_VALUE);
    }
}