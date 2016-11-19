package domain;

import dao.PersonRepository;
import dao.AddressRepository;

public class App 
{
    public static void main( String[] args )
    {
    	PersonRepository repo = new PersonRepository();
    	AddressRepository addressRepo = new AddressRepository();
    	Person jan = new Person();
    	
    	System.out.println("test cik");
    	System.out.println("test2");
    	
    	jan.setName("jan");
    	jan.setSurname("kowalski");
    	jan.setAge(30);
    	
    	repo.add(jan);
        System.out.println( "koniec!" );
    }
}
