package com.xworkz.formapp.repository;

import com.xworkz.formapp.entity.HealthCardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
@Repository
public class HealthCardRepositoryImpl implements HealthCardRepository {

    @Autowired
    private EntityManagerFactory emf ; //Persistence.createEntityManagerFactory("bhumi");

    //Persistence looks for persistence.xml file

    @Override
    public Boolean save(HealthCardEntity healthCardEntity) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(healthCardEntity);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
                return false;
            } else {
                return false;
            }
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<HealthCardEntity> getAllApplicantInfo() {
        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.createNamedQuery("getAllApplicantInfo").getResultList();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void deleteById(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteById").setParameter("id", id).executeUpdate();
        em.getTransaction().commit();
    }

    @Override
    public HealthCardEntity getApplicantById(Integer i) {
        return (HealthCardEntity) emf.createEntityManager().createNamedQuery("getApplicantById").setParameter("id", i).getSingleResult();

    }




    @Override
    public boolean updateApplicantInfo(HealthCardEntity entity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(entity);

            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("error updating applicant info" + e.getMessage());

            return false;
        } finally {
            em.close();
        }
    }
}









