package net.codejava;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SistemService {
	
	@Autowired
	private SistemRepository repo;
	
	public List<Personel> listAll(){
		return repo.findAll();
	}
	public void save(Personel personel) {
		repo.save(personel);
	}
	public Personel get(long idpersonel) {
		return repo.findById(idpersonel).get();
	}
	public void delete(long idpersonel) {
		repo.deleteById(idpersonel);
	}
	

}
