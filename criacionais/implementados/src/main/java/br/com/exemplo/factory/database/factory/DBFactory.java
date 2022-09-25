package br.com.exemplo.factory.database.factory;

import br.com.exemplo.factory.database.db.DB;

public interface DBFactory {
	DB getDatabase();
}
