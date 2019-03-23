package com.shanghai.uofst.manager.impl;

import com.shanghai.uofst.dao.course.CourseDao;
import com.shanghai.uofst.manager.CourseManager;
import com.shanghai.uofst.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author chenshuai
 * @data 2019/3/23 15:32
 */
@Service("courseManager")
public class CourseManagerImpl implements CourseManager {
    @Autowired
    private CourseDao courseDao;

    @Override
    public String findCourseById(Long id) {
        Course course = courseDao.findCourseById(id);
        return " id : " + course.getId()
                + "\n courseId : " + course.getCourseId()
                + "\n title : " + course.getCourseId()
                + "\n dept_name : " + course.getDeptName()
                + "\n credits : " + course.getCredits();
    }
}
