/**
 * 
 */
package com.athina.data.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.athina.data.model.EntityDocument;

/**
 * @author euro
 *
 */
@Service
public class DocumentDAOImpl implements DocumentDAO {

	@Autowired()
	MongoOperations mongoOperations;

	@Override
	public boolean saveDocument(EntityDocument application) {
		mongoOperations.save(application);
		return true;
	}

}
