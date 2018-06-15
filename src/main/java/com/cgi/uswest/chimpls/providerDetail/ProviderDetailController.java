package com.cgi.uswest.chimpls.providerDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/providerdetail") // This means URL's start with /demo (after Application path)
public class ProviderDetailController {
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private ProviderDetailRepository providerDetailRepository;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<ProviderDetail> getAllProviderDetails() {
		// This returns a JSON or XML with the users
		return providerDetailRepository.findAll();
	}

}