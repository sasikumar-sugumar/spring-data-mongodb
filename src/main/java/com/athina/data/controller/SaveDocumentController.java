/**
 * 
 */
package com.athina.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author euro
 *
 */
@RestController
public class SaveDocumentController {
	
	
	@RequestMapping(name = "/saveDocument" ,method = RequestMethod.POST )
	public String saveDocument(){
		
		
		return "Document Saved Successfully";
	}

}
