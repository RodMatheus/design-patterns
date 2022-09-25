package br.com.examplo.factory.app.dbadapter.after.factory;

import br.com.examplo.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
