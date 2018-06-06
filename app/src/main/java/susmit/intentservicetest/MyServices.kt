package susmit.intentservicetest

import android.app.IntentService
import android.content.Intent
import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import java.net.URL

class MyServices: IntentService {
    constructor():super("Myservice")

    override fun onHandleIntent(intent: Intent?) {
        var url =URL("http://moseax.co.ke/wp-content/uploads/2017/04/android-800x445.png")
        var isr=url.openStream()
        var bmp=BitmapFactory.decodeStream(isr)
        var bmp1=ThumbnailUtils.extractThumbnail(bmp,300,300)
        var i=Intent()
        i.action = "Image_loading_done"
        i.putExtra("image",bmp1)
        sendBroadcast(i)



    }
}