package org.tact.base.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/base")
public class BaseController {
	
	private static final Logger _log = LoggerFactory.getLogger(BaseController.class);
	
	/**
	 * 
	 * @return
	 * 
	 * possible urls:
	 * 		/
	 * 		http://localhost:8035/base
	 * 
	 */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public <T> T listUsers() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        
        _log.info("listUsers");
        
        return (T) map;
    }
}
