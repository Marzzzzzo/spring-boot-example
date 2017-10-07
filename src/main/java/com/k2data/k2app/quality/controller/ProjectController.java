package com.k2data.k2app.quality.controller;

import com.k2data.k2app.quality.domain.po.Project;
import com.k2data.k2app.quality.mapper.ProjectMapper;
import com.k2data.k2app.quality.service.ProjectService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * create by chenjingsi
 * 2017-06-22
 */
@RestController
@Log4j2
@RequestMapping("/project")
@ResponseBody
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/get")
    @ResponseBody
    public List<Project> selectAllProject(){
        List<Project> projectList = projectService.selectAllProject();
        return projectList;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insertProject(Project project){
        project.setProjectId(UUID.randomUUID().toString());
        project.setCreateTime(new Date());
        project.setUpdateTime(new Date());
        int result = projectService.insertProject(project);
        return 0;
    }

}
