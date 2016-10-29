package domain;

import dao.AdresRepository;

public class App2 {

/**
 * Hello world!
 *
 */


    public static void main( String[] args )
    {
    	AdresRepository repo = new AdresRepository();
    	AdresRepository addressRepo = new AdresRepository();
    	Person jan = new Person();
    	
    	jan.setName("jan");
    	jan.setSurname("kowalski");
    	jan.setAge(30);
    	
    	repo.add(jan);
        System.out.println( "koniec!" );
    }
}
