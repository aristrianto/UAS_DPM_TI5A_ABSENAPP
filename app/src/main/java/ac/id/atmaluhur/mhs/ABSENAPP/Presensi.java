package ac.id.atmaluhur.mhs.ABSENAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Presensi extends AppCompatActivity {
ImageView kerjaluar;
ImageView izin;
ImageView cuti;
ImageView lembur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presensi);
        kerjaluar = (ImageView )findViewById(R.id.btnKerjaLuarKantor);
        kerjaluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Presensi.this, KerjaDiluarKantor.class));
            }
        });
        izin = (ImageView )findViewById(R.id.btnIzin);
        izin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Presensi.this, IzinKerja.class));
            }
        });
        cuti = (ImageView )findViewById(R.id.btnCuti);
        cuti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Presensi.this, CutiKerja.class));
            }
        });
        lembur = (ImageView )findViewById(R.id.btnLembur);
        lembur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Presensi.this, LembutKerja.class));
            }
        });
    }
}