package io.microservice.EurekaClient.genericController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/generic")
public class FrontController {

    @GetMapping("/{user}")
    public String getGenericMessage(@PathVariable String user){
        return "Welcome "+user+"\n"+"Time: "+new Date();
    }
}
