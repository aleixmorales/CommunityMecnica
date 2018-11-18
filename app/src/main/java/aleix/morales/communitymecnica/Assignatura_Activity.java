package aleix.morales.communitymecnica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Assignatura_Activity extends AppCompatActivity {

    private ImageView fonsview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignatura_);

        fonsview = findViewById(R.id.fons_view);

        Glide.with(this)
                .load("file:///android_asset/fondo-azul-jpg.jpg")
                .into(fonsview);
    }
}
