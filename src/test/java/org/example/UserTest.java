package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("패스워드를 초기화한다.")
    void passwordTest() {
        //given
        User user=new User();

        //when
        user.initPassword(()->"abcdefgh");

        //then
        assertThat(user.getPassword()).isNotNull();


    }

    @Test
    @DisplayName("패스워드가 요구사항에 부합되지않아 초기화가 되지 않는다.")
    void passwordTest2() {
        //given
        User user=new User();

        //when
        user.initPassword(()->"ab");

        //then
        assertThat(user.getPassword()).isNull();


    }
}