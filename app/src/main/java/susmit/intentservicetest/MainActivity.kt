package susmit.intentservicetest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var filter =IntentFilter()
        filter.addAction("Image_loading_done")
        registerReceiver(object:BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent?) {
                Toast.makeText(this@MainActivity,"Image loading complete...",Toast.LENGTH_LONG).show()
                var bmp1= intent?.getParcelableExtra<Bitmap>("image")
                var iview:ImageView=findViewById(R.id.iview)
                iview.setImageBitmap(bmp1)
            }
        },filter)

        }
    fun load (v:View){var i=Intent(this,MyServices::class.java)
        startService(i)

    }


    }

