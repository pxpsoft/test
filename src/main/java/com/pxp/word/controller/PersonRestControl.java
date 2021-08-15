package com.pxp.word.controller;



import com.pxp.word.entity.Person;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class PersonRestControl
{

   // @GetMapping("getPerson")
    public String getPerson(){


        Person person=new Person("pxp",35,2414);

        return person.toString();


    }



    @GetMapping("")
    public Person get(){

        Person person=new Person("pxp",35,2414);
        System.out.println(person);
        return person;

    }


    @GetMapping("getPersonPoById")
    public Person getPersonPo(@RequestParam(value = "id",defaultValue = "100") int id){
        Person person=new Person("pxp",35,id);
        System.out.println(person);
        return person;
    }


    @PostMapping("")
    public Person postPersonPo(@RequestBody  Person person){
        System.out.println(person);
        return person;
    }

    @PostMapping("postPersonPo")
    public Person postPersonPo2(@RequestBody  Person person){
        System.out.println(person);
        return person;
    }






}
