package homework_4.week.kodloma.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import homework_4.week.kodloma.io.Devs.dataAccess.abstracts.LanguageRepository;
import homework_4.week.kodloma.io.Devs.entities.concretes.Language;

@Repository // bu sınıf bir dataAcsess nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository {
	
	
       List<Language> languages=new ArrayList<Language>();
	
	
	public InMemoryLanguageRepository() {
		
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Pyhton"));
	}



	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}
	




	@Override
	public void delete(int id) {
		languages.remove(getByid(id));
		
	}



	@Override
	public void add(Language language)  {
	    
	       languages.add(language);
	         
	}



	@Override
	public Language getByid(int id) {
		for(Language lng:languages) {
			if(lng.getId()==id) {
				return lng;
		   }
		
		}
		return null;
	}



	@Override
	public void update(Language language,int id) {
	    Language language1=getByid(id);
		 language1.setName(language.getName());
		
		
		
		
	}







	
	
	
	
	

}
