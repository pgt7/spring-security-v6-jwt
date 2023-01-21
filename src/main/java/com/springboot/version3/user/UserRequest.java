package com.springboot.version3.user;

import lombok.Data;

/**
 * @author P.GHAFARBEIGI
 * @version 1.0
 * @since 1/21/2023
 */

@Data
public class UserRequest {

    private String email;

    private String password;
}
