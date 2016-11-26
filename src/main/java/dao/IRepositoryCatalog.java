package dao;

import java.sql.SQLException;

public interface IRepositoryCatalog {

	public IPersonRepository people();
	public IAddressRepository addresses();
	
	public void saveAndClose() throws SQLException;
	
}
