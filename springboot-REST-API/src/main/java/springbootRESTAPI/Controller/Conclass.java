package springbootRESTAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootRESTAPI.Entity.Bean;
import springbootRESTAPI.Service.Service1;


@RestController
@RequestMapping("/portal")
public class Conclass {
	@Autowired
	Service1 ser;
	
	@PostMapping("/save")
	public Bean insert1(@RequestBody Bean bean) {
		return ser.insert2(bean);
		
	}
	@GetMapping("/getall")
	public List<Bean> get(){
		return ser.get2();
	}
	
	@PutMapping("/{id}")
	public Bean update(@RequestBody Bean bean,@PathVariable(name="id") Integer id ) {
		return ser.update(bean,id);
	}
	
	@DeleteMapping("/{id}")
	public String Delete(@PathVariable Integer id) {
		ser.delete(id);
		return "Deleted";
	}
	

}
