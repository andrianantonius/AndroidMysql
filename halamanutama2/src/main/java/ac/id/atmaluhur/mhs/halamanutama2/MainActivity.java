package ac.id.atmaluhur.mhs.halamanutama2;

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

    public void barang(View View) {
        Intent i = new Intent(MainActivity.this, barang.class);
        startActivity(i);
    }

    public void pelanggan(View View) {
        Intent i = new Intent(MainActivity.this, pelanggan.class);
        startActivity(i);
    }

    public void penjualan(View View) {
        Intent i = new Intent(MainActivity.this, penjualan.class);
        startActivity(i);
    }

    public void laporan(View View) {
        Intent i = new Intent(MainActivity.this, laporan.class);
        startActivity(i);
    }
}