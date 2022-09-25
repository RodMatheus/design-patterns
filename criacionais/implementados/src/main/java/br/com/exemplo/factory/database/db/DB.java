package br.com.exemplo.factory.database.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
