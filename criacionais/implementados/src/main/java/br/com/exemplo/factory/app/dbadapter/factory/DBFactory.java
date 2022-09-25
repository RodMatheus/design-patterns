package br.com.exemplo.factory.app.dbadapter.factory;

import br.com.exemplo.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
