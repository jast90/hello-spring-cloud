package me.jastz.userservice.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by zhiwen on 2017/9/7.
 */
@Controller
public class LoginController {

    @Autowired
    private ConnectionRepository connectionRepository;
    @Autowired
    private ConnectionFactoryLocator connectionFactoryLocator;

    @GetMapping("login")
    public String login(Model model) {
        Map<String, List<Connection<?>>> connections = connectionRepository.findAllConnections();
        model.addAttribute("providerIds", connectionFactoryLocator.registeredProviderIds());
        model.addAttribute("connectionMap", connections);
        return "login/login";
    }

}
