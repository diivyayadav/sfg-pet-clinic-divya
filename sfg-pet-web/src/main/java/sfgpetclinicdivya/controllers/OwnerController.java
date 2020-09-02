package sfgpetclinicdivya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//prefixing owner value here..so we dont have to type in during requestmapping of method
@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String ownerIndex(){
        return "owners/index";

        //here we r specifying html page directory
    }
}
