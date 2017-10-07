package com.k2data.k2app.quality.service.impl;

import com.k2data.k2app.quality.domain.po.Project;
import com.k2data.k2app.quality.mapper.ProjectMapper;
import com.k2data.k2app.quality.service.ProjectService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by 陈静思 on 2016/12/29.
 */
@Service
@Log4j2
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> selectAllProject() {
        return projectMapper.selectAllProject();
    }

    @Override
    public int insertProject(Project project) {
        return projectMapper.insertProject(project);
    }
}