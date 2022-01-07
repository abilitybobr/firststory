package com.study.studyTwo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags={"메인화면 API"})
@Slf4j
public class StudyController {

    @GetMapping("/study")
    @ApiOperation(value="Study 하자")
    public String helloWorld() {
        log.info("로그 테스트중입니다.");
        return "Hello World Study";
    }

    @GetMapping("/param/get/test1")
    @ApiOperation(value="이름")
    public String getTest1(@RequestParam String name) {
        log.info("name : {}",name);
        return "name is " + name;
    }

    @PostMapping("/param/post/test1")
    @ApiOperation(value="POST테스트용")
    public String postTest1(@RequestBody String name) {
        log.info("name : {}",name);
        return "name is " + name;
    }

    @PostMapping("/param/post/testList")
    @ApiOperation(value="포스트 배열 테스트용")
    public String postTest1List(@RequestBody List<String> listName) {
        log.info("사이즈 크기 : {}",listName.size());
        return "사이즈 크기 " + listName.size();
    }

}
