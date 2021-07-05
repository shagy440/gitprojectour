package com.cg.myproject.dao;
import java.util.List;
import com.cg.myproject.domain.Store;


public interface StoreDAO {


	public void save(Store project);

	public List<Store> findAll();

	public void update(Store project);
	
	public void delete(int id);

}

