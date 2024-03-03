package com.township;

class User {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    @Override
    public String toString() {
        return name; // Return the name of the user
    }
    public User(String name) {
        this.name = name;
    }
    public void login() {
        // Implementation
    }

    public void register() {
        // Implementation
    }

    public void getProfile() {
        // Implementation
    }

    public void updateProfile() {
        // Implementation
    }

    public void forgotPassword() {
        // Implementation
    }
}
