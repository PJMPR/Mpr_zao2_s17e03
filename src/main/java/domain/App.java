package domain;

import dao.PersonRepository;
import dao.AddressRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PersonRepository repo = new PersonRepository();
    	AddressRepository addressRepo = new AddressRepository();
    	Person jan = new Person();
    	
    	jan.setName("jan");
    	jan.setSurname("kowalski");
    	jan.setAge(30);
    	
    	repo.add(jan);
    	
    	Address dom = new Address();
    	
    	dom.setStreetName("Krakowska");
    	dom.setStreetNumber(13);
    	dom.setCity("Gdańsk");
    	dom.setHouseNumber("5A");
    	dom.setPostcode("80");
    	
    	addressRepo.add(dom);
    	
        System.out.println( "koniec!" );
    }
}
