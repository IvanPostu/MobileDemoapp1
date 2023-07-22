package com.example.demoapp1

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class KotlinUserTest {

    @Test
    fun testProperties() {
        val user = KotlinUser("first", "last");
        assertThat(user.firstName).isEqualTo("first");
        assertThat(user.lastName).isEqualTo("last");
    }

    @Test
    fun testEquals() {
        val user1 = KotlinUser("first", "last");
        val user2 = KotlinUser("first", "last");

        assertThat(user1.equals(user2))
            .isEqualTo(user2.equals(user1))
            .isEqualTo(user1.equals(user1))
            .isEqualTo(user2.equals(user2))
            .isTrue;

        assertThat(user1 == user2)
            .isEqualTo(user2 == user1)
            .isEqualTo(user1 == user1)
            .isEqualTo(user2 == user2)
            .isTrue;
    }

}