package domain;

import dao.PersonRepository;
import dao.AdresRepository;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PersonRepository repo = new PersonRepository();
    	AdresRepository adresrepo = new AdresRepository();
        System.out.println( "koniec!" );
    }
}
