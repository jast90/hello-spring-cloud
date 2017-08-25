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
        return null;
    }
}
