package com.awstest.services.entity.securityhandlers;

/*import java.io.IOException;
import java.security.InvalidParameterException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.test.awsservices.awshelper.CognitoJWTParser;

@Component*/
public class AuthFilter{ //implements Filter{
	
    /*
     * private static Logger LOGGER = LoggerFactory.getLogger(AuthFilter.class);
     * 
     * private static String AUTH_HEADER = "Authorization"; private static String
     * BEARER = "Bearer ";
     * 
     * @Autowired UserContext ctx;
     * 
     * @Override public void destroy() {
     * 
     * }
     * 
     * @Override public void doFilter(ServletRequest servReq, ServletResponse
     * servResp, FilterChain chain) throws IOException, ServletException {
     * HttpServletRequest httpReq = (HttpServletRequest) servReq;
     * HttpServletResponse httpResp = (HttpServletResponse) servResp; String
     * authHeader = httpReq.getHeader(AUTH_HEADER); String token =
     * getToken(authHeader); if(token != null) { try { JsonNode json =
     * CognitoJWTParser.getPayload(token); LOGGER.info(json.toString()); String
     * userId = json.findValue("sub").asText(); ctx.setUsername(userId);
     * LOGGER.info("User {} with called API: " + httpReq.getRequestURI(),userId);
     * }catch(InvalidParameterException ex) {
     * httpResp.sendError(401,"Corrupt Token"); } }else {
     * httpResp.sendError(401,"Invalid Token"); }
     * 
     * chain.doFilter(httpReq, servResp);
     * 
     * }
     * 
     * @Override public void init(FilterConfig arg0) throws ServletException { //
     * TODO Auto-generated method stub
     * 
     * }
     * 
     * private String getToken(String authHeader) { if(authHeader != null &&
     * authHeader.startsWith(BEARER)) { String token =
     * authHeader.substring(BEARER.length()); return token; }else { return null; }
     * 
     * }
     */

}
