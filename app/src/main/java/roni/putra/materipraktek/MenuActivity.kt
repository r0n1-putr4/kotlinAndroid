package roni.putra.materipraktek

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val toolbarMenu = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarMenu)

        val coba = intent.getStringExtra("coba")

        supportActionBar?.apply {
            title = coba
            setDisplayHomeAsUpEnabled(true)
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        finish();
        return true;
    }
}
