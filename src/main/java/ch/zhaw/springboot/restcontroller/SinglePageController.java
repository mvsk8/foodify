package ch.zhaw.springboot.restcontroller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller enables proper routing (page refresh and entering URLs
 * directly in the browser's address bar) for the Vue front-end. 
 * 
 * It works by routing error pages to /index.html which allows Vue to handle
 * the routes.
 */
@Controller
public class SinglePageController implements ErrorController{
    @RequestMapping(value = "/error")
    public String error() {
        return "forward:/";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}

/*
 * TODO: Endpoints
 * - [ ] Customer by E-Mail (Simple Login)
 * - [x] Restaurant by Town
 * - [x] Restaurant by Town and Category
 * - [x] Meals by Restaurant
 * - [ ] Create purchase and list
 * - [ ] Add meal to list
 */