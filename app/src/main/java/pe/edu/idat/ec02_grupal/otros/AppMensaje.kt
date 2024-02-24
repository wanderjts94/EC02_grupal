package pe.edu.idat.ec02_grupal.otros

import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import pe.edu.idat.ec02_grupal.R
object AppMensaje {
    fun enviarmensaje(vista:View, mensaje:String, tipoMensaje: TipoMensaje){
        val snackBar=Snackbar.make(vista,mensaje,Snackbar.LENGTH_LONG)
        val  snackbarView: View= snackBar.view
        if (tipoMensaje==TipoMensaje.ERROR){
            snackBar.setBackgroundTint(
                ContextCompat.getColor(Miapp.instant,R.color.errorColor))
        }else{
            snackBar.setBackgroundTint(
                ContextCompat.getColor(Miapp.instant,R.color.ExitoColor))
        }
        snackBar.show()

    }
}