package ma.jemla.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String args[]) {
        
		//TransporteurDaoImpl manager=new TransporteurDaoImpl();
        //manager.inserer(new Transporteur("ghg","sd","dffd","dfd",55));
		
		
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("B2B-Project");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();
        

    }
	

}


/*
package com.ensa.test;

import com.ensa.dao.CategoryDao;
import com.ensa.dao.TaxDao;
import com.ensa.entity.Category;
import com.ensa.entity.Tax;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;


 
public class Main {

   
    public static void main(String[] args) {
        
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("ibouigEcommerceStrutsJPAPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();
        

        Category category = new Category();

        category.setDescription("hadiiiihiiii");
        category.setNom("hada");
        category.setCdate(new Date());
        category.setMdate(new Date());
        CategoryDao categoryDao = new CategoryDao();
        categoryDao.addCategory(category);

        TaxDao taxDao = new TaxDao();

        Tax tax = new Tax();
        tax.setPaysTax("maroc");
        tax.setStateTax("agadir");
        tax.setTaux(20);

        taxDao.addTax(tax);




    }
    
}

*/
