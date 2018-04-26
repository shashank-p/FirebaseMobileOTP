package tec.com.firebasedemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by mehulkanzariya on 08/07/17.
 */

public class MaterialTransition1 extends AppCompatActivity {

    //lesson 4 video 7

    ImageView imageHotel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materialtransition1);
        imageHotel = (ImageView) findViewById(R.id.ivHotel);
        Picasso.with(MaterialTransition1.this).load(R.drawable.hotel).into(imageHotel);




    }



    public void startMaterialTransition(View view) {

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {

            Intent intent = new Intent(this,MaterialTransition2.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            this.startActivity(intent,bundle);
        }
    }
}
