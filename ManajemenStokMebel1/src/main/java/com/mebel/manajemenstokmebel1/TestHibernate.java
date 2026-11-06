
package com.mebel.manajemenstokmebel1;

import com.mebel.manajemenstokmebel1.config.HibernateUtil;
import org.hibernate.Session;

public class TestHibernate {

    public static void main(String[] args) {

        try {
            Session session = HibernateUtil
                    .getSessionFactory()
                    .openSession();

            System.out.println("KONEKSI HIBERNATE BERHASIL!");
            System.out.println("Database: db_meubel");

            session.close();

        } catch (Exception e) {
            System.out.println("KONEKSI HIBERNATE GAGAL!");
            e.printStackTrace();

        } finally {
            HibernateUtil.shutdown();
        }
    }
}
