package com.k2data.k2app.quality.controller;

import com.k2data.k2app.quality.service.FileService;
import com.k2data.k2app.quality.utils.DateUtil;
import com.k2data.k2app.quality.utils.PathUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.UUID;


/**
 * create by chenjingsi
 * 2017-06-22
 */
@RestController
@Log4j2
@RequestMapping("/upload")
@ResponseBody
public class UploadController {

    @Autowired
    private FileService fileService;

    /***
         * 上传文件 用@RequestParam注解来指定表单上的file为MultipartFile
         *
         * @param file
         * @return
         */
        @RequestMapping(value = "",method = RequestMethod.POST)
        @ResponseBody
        public String fileUpload(HttpServletRequest request,@RequestParam("file") MultipartFile file,
                                 @RequestParam("projectId") String projectId) {
            // 判断文件是否为空
            if (!file.isEmpty()) {
                try {
                    // 文件保存路径
                    String filePath = PathUtil.getWebInfPath() + "CSV/"
                            + DateUtil.getDateTime()+"-"+
                            file.getOriginalFilename();

                    // 转存文件
                    File newFile = new File(filePath);

                    file.transferTo(newFile);

                    com.k2data.k2app.quality.domain.po.File gvoFile = new com.k2data.k2app.quality.domain.po.File();
                    gvoFile.setFileId(UUID.randomUUID().toString());
                    gvoFile.setFileName(newFile.getName());
                    gvoFile.setFilePath(filePath);
                    gvoFile.setProjectId(projectId);
                    gvoFile.setCreateTime(new Date());

                    fileService.insert(gvoFile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return "0";
        }


}
