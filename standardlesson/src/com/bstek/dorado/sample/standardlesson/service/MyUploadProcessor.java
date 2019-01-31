package com.bstek.dorado.sample.standardlesson.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.bstek.dorado.uploader.UploadProcessor;

public class MyUploadProcessor implements UploadProcessor {
	   
    @Override
    public Object process(MultipartFile file, HttpServletRequest req,
            HttpServletResponse res) {
        //在这里简单的做个输出，在实际应用中可以做复杂的业务操作     
        System.out.println("文件已经上传！！！");
        return null;
    }
}
