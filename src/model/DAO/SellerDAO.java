package model.DAO;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDAO
{
	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Seller> findAll();
}
