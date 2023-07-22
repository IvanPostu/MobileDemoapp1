package com.example.demoapp1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class JavaUserTest {

    @Test
    public void readUserProperties() {
        JavaUser user = new JavaUser("TestFirstName", "TestLastName");

        assertThat(user.getFirstName()).isEqualTo("TestFirstName");
        assertThat(user.getLastName()).isEqualTo("TestLastName");
    }

    @Test
    public void testEquals() {
        JavaUser user1 = new JavaUser("TestFirstName", "TestLastName");
        JavaUser user2 = new JavaUser("TestFirstName", "TestLastName");

        assertThat(user1.equals(user2))
                .isEqualTo(user2.equals(user1))
                .isEqualTo(user2.equals(user2))
                .isEqualTo(user1.equals(user1))
                .isTrue();
    }

}
