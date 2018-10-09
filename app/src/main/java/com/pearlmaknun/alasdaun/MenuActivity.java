package com.pearlmaknun.alasdaun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.jml_ayam)
    TextView jmlAyam;
    @BindView(R.id.jml_ikan)
    TextView jmlIkan;
    @BindView(R.id.jml_nasi)
    TextView jmlNasi;
    @BindView(R.id.jml_green)
    TextView jmlGreen;
    @BindView(R.id.jml_esteh)
    TextView jmlEsteh;
    @BindView(R.id.jml_kopi)
    TextView jmlKopi;
    @BindView(R.id.aksipesan)
    TextView aksipesan;
    @BindView(R.id.ayamgeprek)
    CardView ayamgeprek;
    @BindView(R.id.ikanbakar)
    CardView ikanbakar;
    @BindView(R.id.nasikomplit)
    CardView nasikomplit;
    @BindView(R.id.greettea)
    CardView greettea;
    @BindView(R.id.esteh)
    CardView esteh;
    @BindView(R.id.kopiirlandia)
    CardView kopiirlandia;

    Integer menu_aktif = 0;
    Integer temp_jumlah = 0;
    Integer total;
    String menu = "", jumlah = "", totalperitem = "";
    Integer a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
    Integer tot_ayam = 0, tot_ikan = 0, tot_nasi = 0, tot_green = 0, tot_teh = 0, tot_kopi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        registerForContextMenu(ayamgeprek);
        registerForContextMenu(ikanbakar);
        registerForContextMenu(nasikomplit);
        registerForContextMenu(greettea);
        registerForContextMenu(esteh);
        registerForContextMenu(kopiirlandia);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home) {
            startActivity(new Intent(this, MainActivity.class));
        } else if (item.getItemId() == R.id.kontak) {
            startActivity(new Intent(this, KontakActivity.class));
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        if (v.getId() == R.id.ayamgeprek) {
            menu_aktif = 1;
        } else if (v.getId() == R.id.ikanbakar) {
            menu_aktif = 2;
        } else if (v.getId() == R.id.nasikomplit) {
            menu_aktif = 3;
        } else if (v.getId() == R.id.greettea) {
            menu_aktif = 4;
        } else if (v.getId() == R.id.esteh) {
            menu_aktif = 5;
        } else if (v.getId() == R.id.kopiirlandia) {
            menu_aktif = 6;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nol:
                temp_jumlah = 0;
                break;
            case R.id.satu:
                temp_jumlah = 1;
                break;
            case R.id.dua:
                temp_jumlah = 2;
                break;
            case R.id.tiga:
                temp_jumlah = 3;
                break;
            case R.id.empat:
                temp_jumlah = 4;
                break;
            case R.id.lima:
                temp_jumlah = 5;
                break;
        }

        switch (menu_aktif) {
            case 1:
                jmlAyam.setText("" + temp_jumlah);
                break;
            case 2:
                jmlIkan.setText("" + temp_jumlah);
                break;
            case 3:
                jmlNasi.setText("" + temp_jumlah);
                break;
            case 4:
                jmlGreen.setText("" + temp_jumlah);
                break;
            case 5:
                jmlEsteh.setText("" + temp_jumlah);
                break;
            case 6:
                jmlKopi.setText("" + temp_jumlah);
                break;
        }
        return true;
    }

    public void getCount() {

        a = Integer.parseInt(jmlAyam.getText().toString());
        b = Integer.parseInt(jmlIkan.getText().toString());
        c = Integer.parseInt(jmlNasi.getText().toString());
        d = Integer.parseInt(jmlGreen.getText().toString());
        e = Integer.parseInt(jmlEsteh.getText().toString());
        f = Integer.parseInt(jmlKopi.getText().toString());

        tot_ayam = a * 10000;
        tot_ikan = b * 26000;
        tot_nasi = c * 16000;
        tot_green = d * 10000;
        tot_teh = e * 6000;
        tot_kopi = f * 15000;

        total = tot_ayam + tot_ikan + tot_nasi + tot_green + tot_teh + tot_kopi;

        if (tot_ayam == 0){

        }else{
            menu += "Ayam Geprek\n";
            jumlah += "" + a + "\n";
            totalperitem += "Rp. " + tot_ayam + "\n";
        }
        if (tot_ikan == 0){

        }else{
            menu += "Ikan Bakar\n";
            jumlah += "" + b + "\n";
            totalperitem += "Rp. " + tot_ikan + "\n";
        }
        if (tot_nasi == 0){

        }else{
            menu += "Nasi Komplit\n";
            jumlah += "" + c + "\n";
            totalperitem += "Rp. " + tot_nasi + "\n";
        }
        if (tot_green == 0){

        }else{
            menu += "Green Tea\n";
            jumlah += "" + d + "\n";
            totalperitem += "Rp. " + tot_green + "\n";
        }
        if (tot_teh == 0){

        }else{
            menu += "Es Teh\n";
            jumlah += "" + e + "\n";
            totalperitem += "Rp. " + tot_teh + "\n";
        }
        if (tot_kopi == 0){

        }else{
            menu += "Kopi Irlandia\n";
            jumlah += "" + f + "\n";
            totalperitem += "Rp. " + tot_kopi + "\n";
        }
    }

    @OnClick(R.id.aksipesan)
    public void onViewClicked() {
        menu = "";
        jumlah = "";
        totalperitem = "";

        getCount();

        if(tot_ayam == 0 && tot_ikan == 0 && tot_nasi == 0 && tot_green == 0 && tot_teh == 0 && tot_kopi == 0){
            Toast.makeText(this, "Anda belum memilih menu.", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
            intent.putExtra("total", total);
            intent.putExtra("menu", menu);
            intent.putExtra("jumlah", jumlah);
            intent.putExtra("totalperitem", totalperitem);
            startActivity(intent);
        }

    }
}
