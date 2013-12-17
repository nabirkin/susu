package su.nabirkin.curs.example.test;

import java.util.List;

import org.junit.Test;

import su.nabirkin.curs.example.dao.DAO;
import su.nabirkin.curs.example.entity.ZipAddress;

/**
 * Testing CRUD operations with ZipAddress entity
 * 
 * @author nabirkin
 *
 */
public class HibernateTest {
	
	final ZipAddress zipAddress = new ZipAddress();
	{
		zipAddress.setZipCode("000000");
	}
	
	@Test
	public void testCreate() throws Exception {
		DAO.getSession().beginTransaction();
        DAO.getSession().save(zipAddress);
        DAO.getSession().getTransaction().commit();
	}
	
	@Test
	public void testRead() throws Exception {
		List<ZipAddress> list = DAO.getSession().createQuery("from ZipAddress").list();
		for (ZipAddress zipAddress : list) {
			System.out.println("load zipAddress: zipcode="+zipAddress.getZipCode());
		}
	}
	
	@Test
	public void testUpdate() throws Exception {
		DAO.getSession().beginTransaction();
		
		Integer id = findIdByZipCode("000000");
        ZipAddress zipAddress = (ZipAddress) DAO.getSession().get(ZipAddress.class, id);
        zipAddress.setZipCode("111111");
        
        DAO.getSession().update(zipAddress);
        DAO.getSession().getTransaction().commit();
	}
	
	@Test
	public void testDelete() throws Exception {
		DAO.getSession().beginTransaction();
		
		Integer id = findIdByZipCode("111111");
		ZipAddress zipAddress = (ZipAddress) DAO.getSession().get(ZipAddress.class, id);
		
        DAO.getSession().delete(zipAddress);
        DAO.getSession().getTransaction().commit();
	}
	
	private Integer findIdByZipCode(String zipcode) {
		ZipAddress zipAddress = (ZipAddress) DAO.getSession()
				.createQuery("from ZipAddress z where z.zipCode = :zipcode")
				.setParameter("zipcode",  zipcode)
				.list().get(0);
		return zipAddress.id;
	}
	
}
