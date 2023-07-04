package org.tnsif.project.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.project.placementmanagement.entities.College;
import org.tnsif.project.placementmanagement.repository.CollegeRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class CollegeService {

	//to inject dependencies automatically create object of repo class
	@Autowired
	private CollegeRepository repo;
	
	//create and update
	public void create(College college)
	{
		repo.save(college);
	}
	
	//retrieve with specific id
	public College retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//retrieve all records
	public List<College> retrieveAll()
	{
		return repo.findAll();
	}
	
	//delete with specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
