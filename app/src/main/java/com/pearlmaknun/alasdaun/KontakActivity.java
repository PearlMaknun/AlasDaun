package com.pearlmaknun.alasdaun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KontakActivity extends AppCompatActivity {

    @BindView(R.id.kontak)
    TextView kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.kontak)
    public void onViewClicked() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:089657466745"));
        startActivity(intent);
    }
}
