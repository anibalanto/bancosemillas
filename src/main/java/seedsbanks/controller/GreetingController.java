package main.java.seedsbanks.controller;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public @ResponseBody ArrayList greeting(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	ArrayList list = new ArrayList();
    	/*list.add(new Seed(counter.incrementAndGet(), String.format(template, name+"1")));
    	list.add(new Seed(counter.incrementAndGet(), String.format(template, name+"2")));
    	list.add(new Seed(counter.incrementAndGet(), String.format(template, name+"3")));
    	list.add(new Seed(counter.incrementAndGet(), String.format(template, name+"4")));
    	list.add(new Seed(counter.incrementAndGet(), String.format(template, name+"5")));*/
        return list;
    }
}
