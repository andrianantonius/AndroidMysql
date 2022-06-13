package ac.id.atmaluhur.mhs.latihan_retrofit_1922500215;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Locale;

public class EBarangActivity extends AppCompatActivity {
    private EditText txtnmbarang, txtstok, txtdeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebarang);
        txtnmbarang = (EditText) findViewById(R.id.et_nmBarang);
        txtstok = (EditText) findViewById(R.id.et_stok);
        txtdeskripsi = (EditText) findViewById(R.id.et_deskripsi);
    }
    public void tambahbarang(View view) {
        final String nmbarang = txtnmbarang.getText().toString().trim();
        final String stok = txtstok.getText().toString().trim();
        final String deskripsi = txtdeskripsi.getText().toString().trim();
        class tambahbarang extends AsyncTask<Void, Void, String> {
            ProgressDialog load;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                load = ProgressDialog.show(
                        EBarangActivity.this, "Add ...", "wait...", false, false);
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String, String> params = new HashMap<>();
                params.put("nama_barang", nmbarang);
                params.put("stok", stok);
                params.put("deskripsi", deskripsi);
                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest("http://10.117.117.73/API/tambah_barang.php", params);
                return res;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                load.dismiss();
                Toast.makeText(EBarangActivity.this, s, Toast.LENGTH_LONG).show();
            }
        }
        tambahbarang tb = new tambahbarang();
        tb.execute();
    }
}