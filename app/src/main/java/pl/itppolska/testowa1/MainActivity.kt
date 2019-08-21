package pl.itppolska.testowa1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //Code
            Log.i("MainActivity", "Button nacisniety")
            Toast.makeText(this, "Nacisniety button 1", Toast.LENGTH_SHORT).show()
        }

        btnSendMessage.setOnClickListener {
            val message : String = edUserMessage.text.toString()
           // Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message",message)
            startActivity(intent)
        }

    }
}
