package com.shanghai.uofst.dao.course;

import com.shanghai.uofst.ClassRoom;
import com.shanghai.uofst.model.Course;
import org.apache.ibatis.annotations.Param;

/**
 * @Author chenshuai
 * @data 2019/3/23 16:22
 */
public interface CourseDao {
    /**
     * 根据id查找课程信息
     * @param id
     * @return
     */
    Course findCourseById(@Param("id") Long id);
}
