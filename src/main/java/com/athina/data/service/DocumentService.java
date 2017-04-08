/**
 * 
 */
package com.athina.data.service;

import org.springframework.stereotype.Service;

import com.athina.data.model.EntityModel;

/**
 * @author euro
 *
 */
@Service
public interface DocumentService {
	
	boolean saveEntityByUID(EntityModel entity);

}
