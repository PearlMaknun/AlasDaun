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
import android.widget.Button;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        registerForContextMenu(aksipesan);
        registerForContextMenu(ayamgeprek);
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
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.satu:
                break;
            case R.id.dua:
                break;
            case R.id.tiga:
                break;
            case R.id.empat:
                break;
            case R.id.lima:
                break;
        }
        return true;
    }
}
