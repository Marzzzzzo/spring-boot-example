package com.k2data.k2app.quality.mapper;

import com.k2data.k2app.quality.domain.po.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProjectMapper {

    List<Project> selectAllProject();

    int insertProject(Project project);
}