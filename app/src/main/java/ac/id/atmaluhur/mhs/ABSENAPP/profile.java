package ac.id.atmaluhur.mhs.ABSENAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class profile extends AppCompatActivity {
    ImageView absensi;
    ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        absensi = (ImageView) findViewById(R.id.dashboard);
        absensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, dashboard.class));
            }
        });
        profile = (ImageView) findViewById(R.id.btnabsen2);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, Presensi.class));
            }
        });
    }
}