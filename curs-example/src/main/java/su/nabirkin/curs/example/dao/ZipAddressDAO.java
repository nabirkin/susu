package su.nabirkin.curs.example.dao;

import java.util.List;

import org.hibernate.HibernateException;

import su.nabirkin.curs.example.entity.ZipAddress;

public class ZipAddressDAO extends DAO {
	
	public ZipAddress createZipAddress(ZipAddress zipAddress)
            throws Exception {
        try {
            begin();
            getSession().save(zipAddress);
            commit();
            return zipAddress;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not create ZipAddress " + zipAddress, e);
        }
    }
	
	public ZipAddress retrieveZipAddress(Integer id) {
		return (ZipAddress) getSession().get(ZipAddress.class, id);
	}

    public void deleteUser( ZipAddress zipAddress ) throws Exception {
        try {
            begin();
            getSession().delete(zipAddress);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not delete ZipAddress " + zipAddress.getZipCode(), e);
        }
    }
    
    public List<ZipAddress> list() {
    	return DAO.getSession().createQuery("from ZipAddress").list();
    }

}	
