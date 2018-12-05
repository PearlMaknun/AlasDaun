package com.pearlmaknun.alasdaun;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.pearlmaknun.alasdaun.database.MenuHelper;

public class MainActivity extends AppCompatActivity {

    MenuHelper menuHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuHelper = new MenuHelper(this);
        //menuHelper.open();
    }

    public void Peta(View view) {
        /*Uri gmmIntentUri = Uri.parse("geo:-6.900227, 107.625467(RM+Alas+Daun)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }*/
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=RM Alas Daun - Bandung, Sundanese+restaurant, Bandung");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

    public void Telefon(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:089657466745"));
        startActivity(intent);
    }

    public void Menu(View view) {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.kontak) {
            startActivity(new Intent(this, KontakActivity.class));
        }
        return true;
    }
}
