package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.IRepositoryCatalog;
import dao.PersonRepository;
import dao.AddressRepository;
import dao.RepositoryCatalog;
import dao.mappers.PersonMapper;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			Connection connection = DriverManager.getConnection(""
					+ "jdbc:hsqldb:hsql://localhost/workdb");
			
			IRepositoryCatalog catalogOf = new RepositoryCatalog(connection);

			Person janek = new Person();
			janek.setName("janek");
			janek.setSurname("kowalski");
			janek.setAge(30);
			catalogOf.people().add(janek);
			catalogOf.saveAndClose();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "koniec!" );
    }
}
