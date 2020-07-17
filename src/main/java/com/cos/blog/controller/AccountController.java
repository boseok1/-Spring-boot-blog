package com.cos.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.blog.dto.SendRequestDto;
import com.cos.blog.dto.WithDrawRequestDto;
import com.cos.blog.model.Account;
import com.cos.blog.service.AccountService;
 

@Controller
public class AccountController {
       
	@Autowired
	  private AccountService accountService;
	
	@GetMapping("/account")
         public @ResponseBody List<Account> findAll() {
		System.out.println("계좌정보를보자 = " +accountService.계좌정보보기());
	
		      return accountService.계좌정보보기();
	}
	

    	   @PutMapping("/send")
    	   public @ResponseBody String send(SendRequestDto dto) {		
    		
   		           accountService.송금(dto);
   		       
			    	   return "<h1>송금이 완료되었습니다</h1>";
         }
         
         @PutMapping("/withdraw")
         public @ResponseBody String withDraw(WithDrawRequestDto dto) {
        	 		accountService.인출(dto);
		        	 return "<h1>출금이 완료되었습니다</h1>";
         }
}


