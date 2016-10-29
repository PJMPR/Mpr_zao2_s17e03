package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.Person;

public class PersonRepository {

	private String url = "jdbc:hsqldb:hsql://localhost/workdb";
	private Connection connection;
	private String createTableSql = 
			"CREATE TABLE person("
			+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
			+ "name VARCHAR(20),"
			+ "surname VARCHAR(50),"
			+ "age int"
			+ ")";
	private String insertSql = "INSERT INTO person(name, surname, age) VALUES (?,?,?)";
	
	Statement createTable;
	PreparedStatement insert;
	
	public PersonRepository(){
		
		try {
			
			connection = DriverManager.getConnection(url);
			createTable = connection.createStatement();
			insert = connection.prepareStatement(insertSql);
			
			ResultSet rs = connection.getMetaData().getTables(null, null, null, null);
			boolean tableExists = false;
			while(rs.next()){
				if("person".equalsIgnoreCase(rs.getString("TABLE_NAME"))){
					tableExists=true;
					break;
				}
			}
			if(!tableExists)
				createTable.executeUpdate(createTableSql);
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//public void delete(Person p)
	//public void update(Person p)
	//public Person get(int id)
	//public List<Person> getAll()
	// https://github.com/KubaNeumann/jdbcdemo
	
	public void add(Person p){
		try{
			insert.setString(1, p.getName());
			insert.setString(2, p.getSurname());
			insert.setInt(3, p.getAge());
			insert.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
}










