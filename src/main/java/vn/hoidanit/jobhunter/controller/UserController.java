package vn.hoidanit.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.jobhunter.domain.User;
import vn.hoidanit.jobhunter.service.UserService;


@RestController
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
    @GetMapping("/user/create")
    public String createNewUser() {
    	User u = new User();
    	u.setName("sontx");
    	u.setEmail("sontx@gmail.com");
    	u.setPassword("123456");
    	
    	this.userService.handleCreateUser(u);
    	
        return "create user";
    }
}
