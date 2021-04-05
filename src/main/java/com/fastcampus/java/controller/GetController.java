package com.fastcampus.java.controller;


import com.fastcampus.java.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod
    public String getRequest(){

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")    // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){
        String password = "bbbb";
        System.out.println("id : "+id);
        System.out.println("pwd : "+pwd);

        return id+pwd;
    }

    // localhost:8090/api/multiParameter?account=abcd&email=study@gmail.com&page=10
    @RequestMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        //{ "account" : "", "email" : "", "page" : 0} 부트는 기본적으로 잭슨라이브러리 내장되므로, json 반환
        return searchParam;
    }
}
