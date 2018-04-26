package tec.com.firebasedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by mehulkanzariya on 08/07/17.
 */

public class MaterialTransition2 extends AppCompatActivity {

    ImageView imageHotel2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materialtransition2);

        imageHotel2 = (ImageView) findViewById(R.id.ivHotel2);
        Picasso.with(MaterialTransition2.this).load(R.drawable.hotel).into(imageHotel2);
        startTextSlide();
    }

    private void startTextSlide() {


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Slide s = new Slide(Gravity.BOTTOM);
            s.addTarget(R.id.tvDummy);

            //for smoothing the transition
            s.setInterpolator(
                    AnimationUtils.loadInterpolator(this,
                            android.R.interpolator.linear_out_slow_in)
            );


            s.setDuration(500);
            getWindow().setEnterTransition(s);


        }

    }
}
