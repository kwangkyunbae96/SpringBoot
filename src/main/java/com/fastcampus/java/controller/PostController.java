package com.fastcampus.java.controller;

import com.fastcampus.java.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {


    //Form 태그
    //ajax 검색 등에 사용된다.
    // http의 post body에 data를 넣겠다.
    //
    @PostMapping("/postMethod")
    public String postMethod(@RequestBody SearchParam searchParam){

        return "OK";
    }

    // PUT, PATCH METHOD
    // POST와 마찬가지로 BODY에 데이터가 들어 있으며, 주로 업데이트에 사용된다.
    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }
    // DELETE, GET과 마찬가지로 주소창에 노출. 삭제할 때 사용
    @DeleteMapping("/deleteMethod")
    public void delete(){

    }
}
