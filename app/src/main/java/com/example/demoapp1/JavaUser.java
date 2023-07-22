package com.example.demoapp1;

import java.util.Objects;

public class JavaUser {

    private final String firstName;
    private final String lastName;

    public JavaUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        JavaUser that = (JavaUser) obj;

        return (that == this) || Objects.equals(this.getFirstName(), that.getFirstName())
                && Objects.equals(this.getLastName(), that.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
