package com.aptara.inc.dao;

import com.aptara.inc.model.Stock;

public interface StockDao {
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findStockCode(String stockid);
	

}
