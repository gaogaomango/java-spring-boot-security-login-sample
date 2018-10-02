package com.example.securitylogin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
	
	private Long userId;
	private String userName;
	private String encrytedPassowrd;
	
	@Override
	public String toString() {
		return this.userName + "/" + this.encrytedPassowrd;
	}
	
}
