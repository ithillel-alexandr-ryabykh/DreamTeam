package org.hillel.it.dreamteam.persistance.repository.impl.file;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hillel.it.dreamteam.model.entity.BaseEntity;

public abstract class FileBaseRepository<T extends BaseEntity> {
	protected HashMap<Integer, T> storage;
	protected int nextId = 1;

	public void save(T entityObject) {
		if (entityObject.getId() == 0) {
			entityObject.setId(nextId);
			storage.put(nextId, entityObject);
			nextId++;
		} else {
			storage.replace(entityObject.getId(), entityObject);
		}
		FileRepository.getInstance().serialize();

	}

	public void delete(T entityObject) {
		storage.remove(entityObject.getId());
		FileRepository.getInstance().serialize();
	}

	public T findById(int id) {
		return storage.get(id);
	}

	public List<T> findAll() {
		return new ArrayList<>(storage.values());
	}

	public HashMap<Integer, T> getStorage() {
		return storage;
	}

	public void setStorage(HashMap<Integer, T> storage) {
		this.storage = storage;
	}

}
