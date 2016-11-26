package dao;

import java.util.List;

import domain.Address;
import domain.Person;

public interface IAddressRepository 
	extends IRepository<Address>
	{

	public List<Address> byPerson(Person person);
}
