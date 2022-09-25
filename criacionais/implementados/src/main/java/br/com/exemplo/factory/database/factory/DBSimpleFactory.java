package br.com.exemplo.factory.database.factory;

import br.com.exemplo.factory.database.db.DB;
import br.com.exemplo.factory.database.db.OracleDB;
import br.com.exemplo.factory.database.db.PostgresDB;

public abstract class DBSimpleFactory {
	
	public static DB getDatabase(final DatabaseType type) {
		return switch(type) {
			case ORACLE -> new OracleDB();
			case POSTGRESQL -> new PostgresDB();
			default -> null;
		};
	}
}