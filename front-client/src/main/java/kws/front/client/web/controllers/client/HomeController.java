package kws.front.client.web.controllers.client;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/perso")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showClientHomePage(HttpSession session) {
        Object userName = session.getAttribute("loginName");
        //Do stuff with user

        return new ModelAndView("/client/home");
    }

}
