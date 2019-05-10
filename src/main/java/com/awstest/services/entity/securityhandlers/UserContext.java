package com.awstest.services.entity.securityhandlers;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class UserContext {
	
	private String username;
	private String email;
}
