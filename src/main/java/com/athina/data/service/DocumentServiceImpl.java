package com.athina.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athina.data.db.DocumentDAO;
import com.athina.data.model.EntityDocument;
import com.athina.data.model.EntityModel;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentDAO documentDAO;

	@Override
	public boolean saveEntityByUID(EntityModel entity) {
		return documentDAO
				.saveDocument(new EntityDocument(entity.getDocumentUID(), entity.getEntityState(), entity.getData()));
	}

}
