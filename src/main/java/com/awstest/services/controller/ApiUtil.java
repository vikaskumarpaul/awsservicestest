package com.awstest.services.controller;

import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApiUtil {
    public static void setExampleResponse(NativeWebRequest req, String contentType, String example) {
        try {
            HttpServletResponse res = req.getNativeResponse(HttpServletResponse.class);
            res.setCharacterEncoding("UTF-8");
            res.addHeader("Content-Type", contentType);
            res.getWriter().print(example);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    /*
     * public static void setExampleResponse(NativeWebRequest req, String
     * contentType, String example) { try {
     * req.getNativeResponse(HttpServletResponse.class).addHeader("Content-Type",
     * contentType);
     * req.getNativeResponse(HttpServletResponse.class).getOutputStream().print(
     * example); } catch (IOException e) { throw new RuntimeException(e); } }
     */
}