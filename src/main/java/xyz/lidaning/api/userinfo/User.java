package xyz.lidaning.api.userinfo;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String openid;
}
