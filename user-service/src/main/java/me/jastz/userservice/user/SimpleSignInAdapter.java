package me.jastz.userservice.user;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Created by zhiwen on 2017/8/25.
 */
public class SimpleSignInAdapter implements SignInAdapter {
    @Override
    public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
        //TODO 根据userId 判断用户是否绑定手机及设置密码，没有：跳转到设置手机、密码页面，有：跳转到首页
        return null;
    }
}
