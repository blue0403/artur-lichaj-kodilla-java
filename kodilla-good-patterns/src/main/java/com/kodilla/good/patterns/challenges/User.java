package com.kodilla.good.patterns.challenges;

public class User {
    private String username;
    private String realName;
    private String surname;

    public User(final String username, final String realName, final String surname) {
        this.username = username;
        this.realName = realName;
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}
