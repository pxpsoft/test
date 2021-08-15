package com.pxp.word.controller;

import com.pxp.word.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 视图控制器
 */

@Controller
public class ViewControl {


    @RequestMapping("/view")
    public String view() {
        return "view";

    }


    @RequestMapping("/data")
    public ModelAndView data() {

        ModelAndView modelAndView = new ModelAndView("data");
        modelAndView.addObject("str1", "sfsdf");
        modelAndView.addObject("str2", "sfsd32f");
        return modelAndView;
    }

    //http://localhost:8080/param?name=pxp&id=125
    @RequestMapping("/param")
    public ModelAndView param(@RequestParam(value = "id", required = false, defaultValue = "0") int id, @RequestParam(value = "name", required = false, defaultValue = "name") String name) {

        ModelAndView modelAndView = new ModelAndView("param");
        modelAndView.addObject("id", id);

        modelAndView.addObject("name", name);


        return modelAndView;

    }

    @RequestMapping("/paramPerson")
    public ModelAndView paramPerson(@RequestParam(value = "id", required = false, defaultValue = "0") int id, @RequestParam(value = "age", required = false, defaultValue = "0") int age, @RequestParam(value = "name", required = false, defaultValue = "name") String name) {

        ModelAndView modelAndView = new ModelAndView("person");

        Person person = new Person(name, age, id);

        modelAndView.addObject("person", person);
        return modelAndView;

    }


    @RequestMapping("/path/{id}/{name}/{age}")
    public ModelAndView pathPerson(@PathVariable(required = false) int id, @PathVariable(required = false) String name, @PathVariable(required = false) int age) {

        ModelAndView modelAndView = new ModelAndView("person");

        Person person = new Person(name, age, id);


        System.out.println(person);

        modelAndView.addObject("person", person);
        return modelAndView;

    }


    @RequestMapping("/param/getUser")
    @ResponseBody
    public Person getPerson(){


        System.out.println("sfoklfs");


        Person person=new Person("的看法单反",35,2414);
        return person;


    }




}
