package com.k2data.k2app.quality.service;


import com.k2data.k2app.quality.domain.po.Project;

import java.util.List;

/**
 * Created by Chenjingsi
 * 2017-06-22
 */
public interface ProjectService {

    List<Project> selectAllProject();

    int insertProject(Project project);
}
