package com.ftmp.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    TextView tvHasil;
    Button btnHitung;
    TextInputEditText edtAngka1, edtAngka2;
    Spinner option;
    String[] kalkulator = {"+","/","*","/","%"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAngka1 = findViewById(R.id.edt_angka_pertama);
        edtAngka2 = findViewById(R.id.edt_angka_kedua);
        tvHasil = findViewById(R.id.tv_hasil);
        option = findViewById(R.id.sp_option);
        btnHitung = findViewById(R.id.btn_hitung);

        // menambahkan aksi ketika di klik tombol hitung
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (option.getSelectedItem().toString().equals(kalkulator[0])) {
                    Double input1 = Double.parseDouble(edtAngka1.getText().toString());
                    Double input2 = Double.parseDouble(edtAngka2.getText().toString());
                    Double hasil = input1 + input2;
                    tvHasil.setText(hasil.toString());
                } else if (option.getSelectedItem().toString().equals(kalkulator[1])) {
                    Double input1 = Double.parseDouble(edtAngka1.getText().toString());
                    Double input2 = Double.parseDouble(edtAngka2.getText().toString());
                    Double hasil = input1 - input2;
                    tvHasil.setText(hasil.toString());
                } else if (option.getSelectedItem().toString().equals(kalkulator[2])) {
                    Double input1 = Double.parseDouble(edtAngka1.getText().toString());
                    Double input2 = Double.parseDouble(edtAngka2.getText().toString());
                    Double hasil = input1 * input2;
                    tvHasil.setText(hasil.toString());
                } else if (option.getSelectedItem().toString().equals(kalkulator[3])) {
                    Double input1 = Double.parseDouble(edtAngka1.getText().toString());
                    Double input2 = Double.parseDouble(edtAngka2.getText().toString());
                    Double hasil = input1 / input2;
                    tvHasil.setText(hasil.toString());
                } else if (option.getSelectedItem().toString().equals(kalkulator[4])){
                    Double input1 = Double.parseDouble(edtAngka1.getText().toString());
                    Double input2 = Double.parseDouble(edtAngka2.getText().toString());
                    Double hasil = input1 % input2;
                    tvHasil.setText(hasil.toString());
                }
            }
                });
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item, kalkulator);
        option.setAdapter(adapter);

    }

}
