/**
 * 
 */
package com.athina.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.athina.data.model.EntityModel;
import com.athina.data.service.DocumentService;

/**
 * @author euro
 *
 */
@RestController
public class SaveDocumentController {

	@Autowired
	private DocumentService documentService;

	@RequestMapping(name = "/saveDocument", method = RequestMethod.POST, consumes = { "application/json" })
	public @ResponseBody String saveDocument(@RequestBody EntityModel entityModel) {
		documentService.saveEntityByUID(entityModel);
		return "Document Saved Successfully";
	}

}
