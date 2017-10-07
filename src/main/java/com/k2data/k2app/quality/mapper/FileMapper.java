package com.k2data.k2app.quality.mapper;

import com.k2data.k2app.quality.domain.po.File;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by chenjingsi on 17-6-26.
 */

@Mapper
public interface FileMapper {
    int insert(File gvoFile);
}
