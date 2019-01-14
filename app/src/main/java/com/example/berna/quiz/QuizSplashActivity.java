package com.example.berna.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class QuizSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
        TextView logo2 = (TextView) findViewById(R.id.TextViewBottomTitle);
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo1.startAnimation(fade1);
        logo2.startAnimation(fade1);

        Animation spinin = AnimationUtils.loadAnimation(this,R.anim.custom_anim);
        LayoutAnimationController controller = new LayoutAnimationController(spinin);
        TableLayout layout = (TableLayout) findViewById(R.id.Tablelayout);

        for (int i = 0; i <layout.getChildCount() ; i++) {
            TableRow row = (TableRow)layout.getChildAt(i);
            row.setLayoutAnimation(controller);

        }

        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade_in2);
        fade2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            public void onAnimationEnd(Animation animation) {
                                startActivity( new Intent(QuizSplashActivity.this,QuizMenuActivity.class));
                                QuizSplashActivity.this.finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        logo2.startAnimation(fade2);

    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
        TextView logo2 = (TextView) findViewById(R.id.TextViewBottomTitle);
        TableLayout layout = (TableLayout) findViewById(R.id.Tablelayout);

        logo1.clearAnimation();
        logo2.clearAnimation();

        for (int i = 0; i <layout.getChildCount() ; i++) {
            layout.getChildAt(i).clearAnimation();

        }

    }


    @Override
    protected void onStart() {
        super.onStart();

    }
}
