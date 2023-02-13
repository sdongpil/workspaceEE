package com.itwill.hellomart.product;

import java.util.List;

public class ProductService {
	private ProductDao productDao;
	
	public ProductService () throws Exception{
		productDao=new ProductDao();
	}
	public int insert(Product product) throws Exception{
		return productDao.insert(product);
	}
	public int update(Product product) throws Exception{
		return productDao.update(product);
	}
	public int delete(int p_no) throws Exception{
		return productDao.delete(p_no);
	}
	public Product findByPrimartKey(int p_no) throws Exception{
		return productDao.findByPrimaryKey(p_no);
	}
	public List<Product> findAll() throws Exception{
		return productDao.findAll();
	}
	public Product findByName(String p_name)throws Exception{
		return productDao.findByName(p_name);
	}
	public List<Product> searchByName(String p_name)throws Exception{
		return productDao.searchByName(p_name);
	}
}
