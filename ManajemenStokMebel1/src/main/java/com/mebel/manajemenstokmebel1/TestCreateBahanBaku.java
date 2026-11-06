
package com.mebel.manajemenstokmebel1;

import com.mebel.manajemenstokmebel1.dao.BahanBakuDAO;
import com.mebel.manajemenstokmebel1.config.HibernateUtil;
import com.mebel.manajemenstokmebel1.model.BahanBaku;

public class TestCreateBahanBaku {

    public static void main(String[] args) {

        try {
            BahanBakuDAO dao = new BahanBakuDAO();

            BahanBaku bahan = new BahanBaku(
                "BB001",
                "Kayu Jati",
                "Batang",
                20
            );

            dao.tambahBahanBaku(bahan);

        } finally {
            HibernateUtil.shutdown();
        }
    }
}
