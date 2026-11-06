
package com.mebel.manajemenstokmebel1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bahan_baku")
public class BahanBaku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bahan")
    private int idBahan;

    @Column(name = "kode_bahan", nullable = false, unique = true)
    private String kodeBahan;

    @Column(name = "nama_bahan", nullable = false)
    private String namaBahan;

    @Column(name = "satuan", nullable = false)
    private String satuan;

    @Column(name = "stok", nullable = false)
    private int stok;

    public BahanBaku() {
    }

    public BahanBaku(String kodeBahan, String namaBahan,
                     String satuan, int stok) {
        this.kodeBahan = kodeBahan;
        this.namaBahan = namaBahan;
        this.satuan = satuan;
        this.stok = stok;
    }

    public int getIdBahan() {
        return idBahan;
    }

    public String getKodeBahan() {
        return kodeBahan;
    }

    public void setKodeBahan(String kodeBahan) {
        this.kodeBahan = kodeBahan;
    }

    public String getNamaBahan() {
        return namaBahan;
    }

    public void setNamaBahan(String namaBahan) {
        this.namaBahan = namaBahan;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
