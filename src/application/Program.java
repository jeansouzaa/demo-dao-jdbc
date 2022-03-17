package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Seller;

public class Program
{

	public static void main(String[] args)
	{

		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
	}

}
