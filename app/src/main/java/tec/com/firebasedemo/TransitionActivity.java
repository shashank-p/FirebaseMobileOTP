package tec.com.firebasedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by mehulkanzariya on 08/07/17.
 */

public class TransitionActivity extends AppCompatActivity {

    View contentView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transition_activity);
        contentView = (View) findViewById(R.id.viewA);
    }

    public void startTransition(View view) {

        Slide slide = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            slide = new Slide();
            slide.setSlideEdge(Gravity.TOP);

            ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
            TransitionManager.beginDelayedTransition(root,slide);
            contentView.setVisibility(View.INVISIBLE);

        }

    }
}
