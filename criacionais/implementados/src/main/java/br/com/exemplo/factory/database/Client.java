package br.com.exemplo.factory.database;

import br.com.exemplo.factory.database.db.DB;
import br.com.exemplo.factory.database.factory.DBSimpleFactory;
import br.com.exemplo.factory.database.factory.DatabaseType;

public class Client {
	public static void main(String[] args) {
		System.out.println("### DATABASE ORACLE");
		DB oracle = DBSimpleFactory.getDatabase(DatabaseType.ORACLE);
		oracle.query("SELECT * FROM users");
		oracle.update("UPDATE users SET NAME = 'Peter' WHERE ID = 1");
		
		System.out.println("### DATABASE POSTGRESQL");
		DB postgres = DBSimpleFactory.getDatabase(DatabaseType.POSTGRESQL);
		postgres.query("SELECT * FROM animals");
		postgres.update("UPDATE animals SET NAME = 'Turtle' WHERE ID = 1");
	}
}