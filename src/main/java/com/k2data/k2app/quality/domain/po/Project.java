package com.k2data.k2app.quality.domain.po;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by chenjingsi on 17-5-19.
 */
@Setter
@Getter
@NoArgsConstructor
public class Project {

    private String projectId;
    private String projectName;
    private String projectStatus;
    private String projectInfo;
    private Date createTime;
    private Date updateTime;

}
