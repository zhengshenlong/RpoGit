package com.user.controller;

import javafx.beans.binding.ObjectExpression;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class StudentController {

          @RequestMapping("hello")
          public Object  hello(){
              return  "zsl";
      }

}
