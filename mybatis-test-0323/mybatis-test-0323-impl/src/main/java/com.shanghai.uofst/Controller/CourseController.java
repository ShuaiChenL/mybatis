package com.shanghai.uofst.Controller;

import com.shanghai.uofst.manager.CourseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenshuai
 * @data 2019/3/23 14:56
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseManager courseManager;

    @GetMapping(value = "/findCourseById")
    public String findCourseById(@RequestParam("id") Long id) {
        return courseManager.findCourseById(id);
    }
}
