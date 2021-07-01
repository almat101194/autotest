package autotest.core.business;

import lombok.Getter;

public class User {
    @Getter
    private final String email;
    @Getter
    private final String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
