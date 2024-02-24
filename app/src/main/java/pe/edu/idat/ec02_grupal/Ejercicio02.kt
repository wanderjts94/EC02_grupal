package pe.edu.idat.ec02_grupal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.ec02_grupal.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio02Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}