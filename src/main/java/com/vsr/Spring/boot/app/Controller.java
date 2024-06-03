package com.vsr.Spring.boot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home()
    {
        String str
                = "<html><body><font color=\"red\">"
                + "<h1>WELCOME To VR Academy</h1>"
                + "</font></body></html>";
        return str;
    }

    @RequestMapping(
            method={RequestMethod.GET},
            value={"/vsr"}
    )

    public String info()
    {
        String str2
                = "<html><body><font color=\"green\">"
                + "<h2>VSR Academy is a Computer"
                + " Science portal for Geeks. "
                + "This portal has been "
                + "created to provide well written, "
                + "well thought and well explained "
                + "solutions for selected questions."
                + "</h2></font></body></html>";
        return str2;
    }

}
