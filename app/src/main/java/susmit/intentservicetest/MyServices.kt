package susmit.intentservicetest

import android.app.IntentService
import android.content.Intent
import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import java.net.URL

class MyServices: IntentService {
    constructor():super("Myservice")

    override fun onHandleIntent(intent: Intent?) {
        var url =URL("https://lh3.googleusercontent.com/VwjJ6QXBv5dofFiyRUtZ02j98r80uw3G_t4R28RHyRfUzVnYQ4LUrQOXqQS7M7UYY3WR9Gc4hGmRyidGIvd2HPptOheYNf3qpq5751cwX_DI72YldFXLPpu29YvnvRuEyPSve3wbqVpQWCDhzaiZ6CVfc_uj_YFspGw_xnqfGeR6hbp0CsrpJhkp5SJyTy1skJ878B9ChqfGFpgvQrBKuPEhsOPGtKTSkGtmFQuqlzfvZqWfimgZQHCm99lY1IM0JPGeDcS1QCmK_b9YjzW5jrj13Hp63qzW9RW3iGUgVIp2wbmqAmS7MD_wqFQd0SkhnUFy_j7wSgqA65Yw8QmNpdF0iO7nzQI6Jh6WefxXumKlGK2JwOxDr11MwQ8xCol8u0eU948jsNYy0DFk_W8L6tXC9rGHealh3NtoVXXhGL7C-YOWFnOyw5IBfxLPaDMdUNfbPuvLfm8DZYQRAM3Qo2VUKqC8PSm5n5anUpAWXzLBlxK6vcHeBq2EnXm7ubIlz3t6xxVSYHcbiVtMkv3zooixK9r37G7TCByGYOMTP4n7xKgKdC6pwCb24Ml_g0wCxxgmvomEQxtfykwORVCqSpXdLow-fCINoG87xgA=w948-h712-no")
        var isr=url.openStream()
        var bmp=BitmapFactory.decodeStream(isr)
        var bmp1=ThumbnailUtils.extractThumbnail(bmp,300,300)
        var i=Intent()
        i.setAction("Image_loading_done")
        i.putExtra("image",bmp1)
        sendBroadcast(i)



    }
}