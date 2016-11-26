package dao;

import java.sql.Connection;
import java.sql.SQLException;

import dao.mappers.PersonMapper;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog {

	IPersonRepository peopleRepo;
	IAddressRepository addressRepo;
	IUnitOfWork uow;
	Connection connection;
	
	public RepositoryCatalog(Connection connection) throws SQLException {
		this.connection = connection;
		uow = new UnitOfWork(connection);
		peopleRepo = new PersonRepository(connection, new PersonMapper(), uow);
		
	}

	public IPersonRepository people() {
		return peopleRepo;
	}

	public IAddressRepository addresses() {
		return addressRepo;
	}

	public void saveAndClose() throws SQLException {
		uow.saveChanges();
		connection.close();
		connection=null;
		
	}

}
