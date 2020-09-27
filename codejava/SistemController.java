package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins="http:localhost:8080")
@Controller
public class SistemController {
	@Autowired
	private SistemService service;
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Personel> PersonelListesi=service.listAll();
		model.addAttribute("PersonelListesi",PersonelListesi);
		
		return "index";
	}
	@RequestMapping("/new")
	public String showNewPersonelForm(Model model) {
		Personel personel=new Personel();
		model.addAttribute("personel",personel);
		
		return "ypersonel";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String savePersonel(@ModelAttribute("personel")Personel personel) {
		service.save(personel);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{idpersonel}")
	public ModelAndView showEditPersonelPage(@PathVariable(name="idpersonel")long idpersonel) {
		ModelAndView mav=new ModelAndView("gPersonel");
		Personel personel=service.get(idpersonel);
		mav.addObject("personel",personel);
		
		return mav;
	}
	@RequestMapping("/delete/{idpersonel}")
	public String deletePersonel(@PathVariable(name="idpersonel")long idpersonel) {
		service.delete(idpersonel);
		
		return "redirect:/";
	}
	
	
	
	

}
