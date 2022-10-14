package com.example.drawableimage
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
   private var nameList = intArrayOf(
       R.drawable.img1,
       R.drawable.img2,
       R.drawable.img3,
       R.drawable.img4,
       R.drawable.img5,
       R.drawable.img6,
       R.drawable.img7,
       R.drawable.img8,
       R.drawable.img9,
       R.drawable.img10,
       R.drawable.img11,
       R.drawable.img12,

    )

    private var index=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val isw= findViewById<ImageSwitcher>(R.id.imageSwitcher)
        val btn = findViewById<Button>(R.id.btn1)

        isw.setFactory {
            val imgView= ImageView(applicationContext)
            imgView.scaleType=ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8,8,8,8)
            imgView
        }

        isw.setImageResource(nameList[index])
        val imgIn=loadAnimation(this,android.R.anim.slide_in_left)
        isw.inAnimation=imgIn

        val imgOut=loadAnimation(this,android.R.anim.slide_out_right)
        isw.outAnimation=imgOut

        btn.setOnClickListener{
            index=if(index+1< nameList.size)index+1 else 0
            isw.setImageResource(nameList[index])
        }
    }
}