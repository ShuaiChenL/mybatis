package com.shanghai.uofst.model;

import lombok.Data;

/**
 * @Author chenshuai
 * @data 2019/3/23 17:28
 */
@Data
public class Course extends BaseModel {
    private static final long serialVersionUID = -8035953895041685970L;
    /** 课程id*/
    private String courseId;
    /** 课程名称 */
    private String title;
    /** 院系 */
    private String deptName;
    /** 学分 */
    private String credits;
}
