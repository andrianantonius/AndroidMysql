package ac.id.atmaluhur.mhs.latihan_retrofit_1922500215;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void barang(View view){
        Intent i = new Intent( MainActivity.this, barang.class);
        startActivity(i);
    }
    public void pelanggan(View view){
        Intent i = new Intent( MainActivity.this, pelanggan.class);
        startActivity(i);
    }
    public void penjualan(View view){
        Intent i = new Intent( MainActivity.this, penjualan.class);
        startActivity(i);
    }
    public void laporan(View view){
        Intent i = new Intent( MainActivity.this, laporan.class);
        startActivity(i);
    }
}