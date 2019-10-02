package LATV.itics.tesoem.edu.latv_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }

    public void siguiente3 (View v){
        Intent siguiente3 = new Intent(this,frm3Activity.class);
        startActivity(siguiente3);

    }
}
