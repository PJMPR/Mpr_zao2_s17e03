package domain;

import dao.AddressRepository;
import dao.PersonRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PersonRepository repo = new PersonRepository();
    	AddressRepository repo2 = new AddressRepository();

        System.out.println( "koniec!" );
    }
}
