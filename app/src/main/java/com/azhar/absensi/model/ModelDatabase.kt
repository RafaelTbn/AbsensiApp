package com.azhar.absensi.model

import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.Entity
import java.io.Serializable


@Entity(tableName = "tbl_absensi")
class ModelDatabase : Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid")
    var uid = 0

    @ColumnInfo(name = "nama")
    lateinit var nama: String

    @ColumnInfo(name = "nrp")
    lateinit var nrp: String

    @ColumnInfo(name = "mata_kuliah")
    lateinit var mataKuliah: String

    @ColumnInfo(name = "ruangan")
    lateinit var ruangan: String

    @ColumnInfo(name = "foto_selfie")
    lateinit var fotoSelfie: String

    @ColumnInfo(name = "tanggal")
    lateinit var tanggal: String

    @ColumnInfo(name = "lokasi")
    lateinit var lokasi: String

    @ColumnInfo(name = "keterangan")
    lateinit var keterangan: String
}
