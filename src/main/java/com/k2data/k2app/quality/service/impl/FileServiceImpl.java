package com.k2data.k2app.quality.service.impl;

import com.k2data.k2app.quality.domain.po.File;
import com.k2data.k2app.quality.mapper.FileMapper;
import com.k2data.k2app.quality.service.FileService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenjingsi on 17-6-26.
 */
@Service
@Log4j2
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public int insert(File gvoFile) {
        return fileMapper.insert(gvoFile);
    }
}
