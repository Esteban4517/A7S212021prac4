package mx.edu.tesoem.isc.aerj.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UrlActivity extends AppCompatActivity {

    ImageView Miimagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        Miimagen = findViewById(R.id.miimagen);

        Picasso.get()
                .load("https://sites.google.com/site/lmamcrm20161/_/rsrc/1472688248707/portada/TuzosVerde.png")
                .fit()
                .error(R.mipmap.ic_launcher_round)
                .into(Miimagen);
    }
}