package sg.edu.rp.soi.c347.mydatabook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class AboutUs extends AppCompatActivity {
    ActionBar ab;
    TextView tv, tvCreated;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);


        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        tv = (TextView) findViewById(R.id.textView);
        tvCreated = (TextView) findViewById(R.id.textViewCreated);
        iv = (ImageView) findViewById(R.id.imageView);

        tvCreated.setText("Created By : Ah Chong, Peter, Mary");
        String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(this).load(imageUrl).into(iv);
        tv.setText("C347 Android Programming II Republic Polytechnic");
    }
}
