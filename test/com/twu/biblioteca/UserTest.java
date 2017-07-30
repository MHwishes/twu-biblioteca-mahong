package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserTest {
    @Test
    public void should_get_detail_for_user() {
        User user = new User("a", "1025383143@qq.com", "18829290322");

        assertThat(user.getUserDetail(),containsString("a"));
        assertThat(user.getUserDetail(),containsString("1025383143@qq.com"));
        assertThat(user.getUserDetail(), containsString("18829290322"));

    }

    @Test
    public void should_get_Login_for_user(){
        User user=new User("123456","0001");
        assertThat(user.getUserLoginInfo(),containsString("12345"));
        assertThat(user.getUserLoginInfo(),containsString("0001"));
    }

}
