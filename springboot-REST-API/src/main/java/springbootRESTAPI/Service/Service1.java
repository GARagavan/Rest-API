package springbootRESTAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import springbootRESTAPI.Entity.Bean;
import springbootRESTAPI.Exception.ResrouceNotFoundException;
import springbootRESTAPI.Repository.Repolayer;



@Service
public class Service1 {
	@Autowired
	Repolayer repo;
	
	//post
	public Bean insert2(Bean bean) {
		return repo.save(bean);
		
	}
	
	//get
	public List<Bean>get2(){
		return repo.findAll();
	}
	
	//Update 
		
		public Bean update(Bean bean, Integer id) {
		Bean b=repo.findById(id).orElseThrow(() -> new ResrouceNotFoundException("bean","id",id));
		b.setPassword(bean.getPassword());
		return repo.save(b);
		
		}
		
	//Delete
		public void delete (Integer id) {
			 repo.deleteById(id);
		}
	
	

}
