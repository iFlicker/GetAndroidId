package me.a0ff.getandroidid

import android.app.Activity
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.provider.Settings
import android.widget.EditText
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<EditText>(R.id.et).setText(Settings.System.getString(contentResolver, Settings.System.ANDROID_ID))

        findViewById<EditText>(R.id.et).setOnClickListener{
            (getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager).text = Settings.System.getString(contentResolver, Settings.System.ANDROID_ID)
            Toast.makeText(this, "copy ANDROID ID success!", Toast.LENGTH_SHORT).show()
        }

    }
}
