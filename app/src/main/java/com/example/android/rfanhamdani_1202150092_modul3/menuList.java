package com.example.android.rfanhamdani_1202150092_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class menuList extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> NamaMinuman;
    private ArrayList<String> Pminuman;
    private ArrayList<Integer> gambar;

    //Daftar Menu makanan yang akan di tampilkan
    private String[] Nminuman = {
            "Aqua",
            "Pristine",
            "LeMineral",
            "Cleo",
            "Club",
            "Amidis",
            "Ades",
            "Equil",
            "Evian",
            "Nestle",
            "Vit"};

    //daftar harga yang akan di tampilka
    private String[] PMinum = {
            "ini adalah minuman aqua", "ini adalah minuman pristine",
            "ini adalah minuman LeMineral", "ini adalah minuman Cleo  ",
            "ini adalah minuman Club", "ini adalah minuman Amidis",
            "ini adalah minuman Ades", "ini adalah minuman Equil",
            "ini adalah minuman Evian", "ini adalah minuman Nestle",
            "ini adalah minuman Vit"};

    //Daftar Gambar yang akan muncul
    private int[] Gambar = {R.drawable.aqua,
            R.drawable.pristine,
            R.drawable.leminerale,
            R.drawable.cleo,
            R.drawable.club,
            R.drawable.amidis,
            R.drawable.ades,
            R.drawable.equil,
            R.drawable.evian,
            R.drawable.nestle,
            R.drawable.vit};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        //mendeklrasikan array data menu, harga, image
        NamaMinuman = new ArrayList<>();
        Pminuman = new ArrayList<>();
        gambar = new ArrayList<>();


        //inisisasi
        rvView = (RecyclerView) findViewById(R.id.Rview);
        rvView.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rvView.setLayoutManager(new GridLayoutManager(menuList.this, 2));
        } else {
            rvView.setLayoutManager(new GridLayoutManager(menuList.this, 1));
        }DaftarItem();

    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rvView.setLayoutManager(new GridLayoutManager(menuList.this, 2));
        }else {
            rvView.setLayoutManager(new GridLayoutManager(menuList.this, 1));
        }
    }





    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem() {
        for (int w = 0; w < Nminuman.length; w++) {
            NamaMinuman.add(Nminuman[w]);
            Pminuman.add(PMinum[w]);
            gambar.add(Gambar[w]);

            adapter = new RecyclerViewAdapter(NamaMinuman, Pminuman, gambar);
            rvView.setAdapter(adapter);
        }
    }
}