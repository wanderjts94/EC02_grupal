package pe.edu.idat.ec02_grupal.otros
import android.app.Application
class Miapp: Application() {
    companion object{
        lateinit var instant: Miapp
    }
    override fun onCreate() {
        super.onCreate()
        instant=this
    }
}