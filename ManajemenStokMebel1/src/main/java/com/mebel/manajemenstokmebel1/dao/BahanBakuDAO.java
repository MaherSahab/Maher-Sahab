
package com.mebel.manajemenstokmebel1.dao;

import com.mebel.manajemenstokmebel1.config.HibernateUtil;
import com.mebel.manajemenstokmebel1.model.BahanBaku;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BahanBakuDAO {

    public void tambahBahanBaku(BahanBaku bahan) {

        Transaction transaction = null;

        try (Session session = HibernateUtil
                .getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.persist(bahan);

            transaction.commit();

            System.out.println("Data bahan baku berhasil ditambahkan!");

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("Gagal menambahkan data bahan baku!");
            e.printStackTrace();
        }
    }
}
