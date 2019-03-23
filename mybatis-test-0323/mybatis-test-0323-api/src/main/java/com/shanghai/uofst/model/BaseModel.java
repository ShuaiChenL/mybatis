package com.shanghai.uofst.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author chenshuai
 * @data 2019/3/23 17:31
 */
@Data
public class BaseModel implements Serializable {
    private static final long serialVersionUID = -1818261420805139222L;

    /** ID */
    private Long id;
}
