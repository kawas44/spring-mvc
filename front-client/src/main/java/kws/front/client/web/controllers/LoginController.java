package kws.front.client.web.controllers;

import javax.servlet.http.HttpSession;
import kws.front.client.web.controllers.client.HomeController;
import kws.front.client.web.forms.LoginForm;
import kws.front.client.web.validators.LoginFormValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processLogin(
            HttpSession session,
            LoginForm loginForm, BindingResult errors) {

        new LoginFormValidator().validate(loginForm, errors);
        if (errors.hasErrors()) {
            return "login";
        }

        // store info in session
        session.setAttribute("loginName", loginForm.getUsername());

        // redirect to home page
        UriComponents uriBuilder = MvcUriComponentsBuilder.
                fromController(HomeController.class).build();
        return "redirect:" + uriBuilder.encode().toUriString();
    }

}
