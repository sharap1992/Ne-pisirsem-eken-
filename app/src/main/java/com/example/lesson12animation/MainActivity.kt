package com.example.lesson12animation

import android.animation.ObjectAnimator
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val anim1 = ObjectAnimator.ofFloat(button1, "translationX", -9500f, 500f)
            anim1.duration = 4000
            anim1.repeatCount = 5
            val anim2 = ObjectAnimator.ofFloat(button2, "translationX", -9500f, 500f)
            anim2.duration = 4000
            anim2.repeatCount = 5
            val anim3 = ObjectAnimator.ofFloat(button3, "translationX", -9500f, 500f)
            anim3.duration = 4000
            anim3.repeatCount = 5
            val anim4 = ObjectAnimator.ofFloat(button4, "translationX", -9500f, 500f)
            anim4.duration = 4000
            anim4.repeatCount = 5
            val anim5 = ObjectAnimator.ofFloat(button5, "translationX", -9500f, 500f)
            anim5.duration = 4000
            anim5.repeatCount = 5
            val anim6 = ObjectAnimator.ofFloat(button6, "translationX", -9500f, 500f)
            anim6.duration = 4000
            anim6.repeatCount = 5
            val anim7 = ObjectAnimator.ofFloat(button7, "translationX", -9500f, 500f)
            anim7.duration = 4000
            anim7.repeatCount = 5
            val anim8 = ObjectAnimator.ofFloat(button8, "translationX", -9500f, 500f)
            anim8.duration = 4000
            anim8.repeatCount = 5
            val anim9 = ObjectAnimator.ofFloat(button9, "translationX", -9500f, 500f)
            anim9.duration = 4000
            anim9.repeatCount = 5
            val anim10 = ObjectAnimator.ofFloat(button10, "translationX", -9500f, 500f)
            anim10.duration = 4000
            anim10.repeatCount = 5
            val anim11 = ObjectAnimator.ofFloat(button11, "translationX", -9500f, 500f)
            anim11.duration = 4000
            anim11.repeatCount = 5
            val anim12 = ObjectAnimator.ofFloat(button12, "translationX", -9500f, 500f)
            anim12.duration = 4000
            anim12.repeatCount = 5
            val anim13 = ObjectAnimator.ofFloat(button13, "translationX", -9500f, 500f)
            anim13.duration = 4000
            anim13.repeatCount = 5
            val anim14 = ObjectAnimator.ofFloat(button14, "translationX", -9500f, 500f)
            anim14.duration = 4000
            anim14.repeatCount = 5
            val anim15 = ObjectAnimator.ofFloat(button15, "translationX", -9500f, 500f)
            anim15.duration = 4000
            anim15.repeatCount = 5
            val anim16 = ObjectAnimator.ofFloat(button16, "translationX", -9500f, 500f)
            anim16.duration = 4000
            anim16.repeatCount = 5
            val anim17 = ObjectAnimator.ofFloat(button17, "translationX", -9500f, 500f)
            anim17.duration = 4000
            anim17.repeatCount = 5
            val anim18 = ObjectAnimator.ofFloat(button18, "translationX", -9500f, 500f)
            anim18.duration = 4000
            anim18.repeatCount = 5

            buttonStart.setOnClickListener {
                anim1.start()
                anim2.start()
                anim3.start()
                anim3.start()
                anim4.start()
                anim5.start()
                anim6.start()
                anim6.start()
                anim7.start()
                anim8.start()
                anim9.start()
                anim10.start()
                anim11.start()
                anim13.start()
                anim14.start()
                anim15.start()
                anim16.start()
                anim17.start()
                anim18.start()
            }

                buttonStop.setOnClickListener {
                    anim1.pause()
                    anim2.pause()
                    anim3.pause()
                    anim4.pause()
                    anim5.pause()
                    anim6.pause()
                    anim7.pause()
                    anim8.pause()
                    anim9.pause()
                    anim10.pause()
                    anim11.pause()
                    anim12.pause()
                    anim13.pause()
                    anim14.pause()
                    anim15.pause()
                    anim17.pause()
                    anim18.pause()
                 }
            }
        }





