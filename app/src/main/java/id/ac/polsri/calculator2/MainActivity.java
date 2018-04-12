package id.ac.polsri.calculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editAngka1, editAngka2;
    TextView tvHasil;
    Button tambah, kurang, bagi, kali, hapus;
    Integer angka1, angka2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngka1 = findViewById(R.id.editText1);
        editAngka2 = findViewById(R.id.editText2);
        tvHasil = findViewById(R.id.textView2);
        tambah = findViewById(R.id.button1);
        kurang = findViewById(R.id.button2);
        bagi = findViewById(R.id.button3);
        kali = findViewById(R.id.button4);
        hapus = findViewById(R.id.button5);


        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilTambah();
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilKurang();
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilBagi();
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilKali();
            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hapus();
            }
        });
    }
    public void HasilTambah() {
        if (!editAngka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 + angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

    public void HasilKurang() {
        if (!editAngka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 - angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

    public void HasilBagi() {
        if (!editAngka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 / angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

    public void HasilKali() {
        if (!editAngka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 1", Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi form angka 2", Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 * angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

    public  void Hapus() {
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        this.finish();//
    }

}
