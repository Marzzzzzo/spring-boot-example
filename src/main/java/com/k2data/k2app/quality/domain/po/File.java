package com.k2data.k2app.quality.domain.po;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by chenjingsi on 17-6-26.
 */
@Setter
@Getter
@NoArgsConstructor
public class File {
    private String fileId;
    private String projectId;
    private String fileName;
    private String filePath;
    private Date createTime;
}
