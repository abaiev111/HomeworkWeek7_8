package com.gmail.com;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    static final List<UserModel> listUsers = new ArrayList<>();

    // login: log0, password: pass0;
    // login: log1, password: pass1;
    // login: log2, password: pass2;
    // login: log3, password: pass3;
    // login: log4, password: pass4;
    static {
        UserModel userModel;
        for (int i = 0; i < 5; i++) {
            userModel = new UserModel("log" + i, "name" + i, "pass" + i);
            listUsers.add(userModel);
        }
    }
}
