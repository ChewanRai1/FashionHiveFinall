package com.system.Fashionhive.pojo;

import com.system.Fashionhive.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//user ko pojo
//user pojoo
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo {
    private Integer id;

    private String email;

    private String password;

    public UserPojo(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
