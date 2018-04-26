package tec.com.firebasedemo;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;

/**
 * Created by mehulkanzariya on 06/07/17.
 */

public class CircularReveal extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_reveal);
    }

    public void startCircularReveal(View view) {

        int finalRadius = (int) Math.hypot(view.getWidth()/2, view.getHeight()/2);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {

            Animator anim = ViewAnimationUtils.createCircularReveal(
                    view,view.getWidth()/2, view.getHeight()/2, 0, finalRadius
            );

            view.setBackgroundColor(Color.BLUE);
            anim.start();
        }

    }
}
