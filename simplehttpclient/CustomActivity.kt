package cpsc411.simplehttpclient

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.loopj.android.http.AsyncHttpClient

class CustomActivity : AppCompatActivity() {
    lateinit var cService : ClaimService
    fun refreshScreen(cObj : Claim) {
        //
        Log.d("Person Service", "Refreshing the Screen. ")
        val claimNameView : EditText = findViewById(R.id.claim_name)
        val dateView : EditText = findViewById(R.id.date)
        //
        claimNameView.setText(cObj.claimName)
        dateView.setText(cObj.date)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //generate claim/date
        val fldRowGenerator = ObjDetailScreenGenerator(this)
        val colView = fldRowGenerator.generate()
        setContentView(colView)
        //generate status message
        val fldRowGenerator2 = ObjDetailScreenGenerator(this)
        val colView2 = fldRowGenerator2.generate()
        setContentView(colView2)
        //
        val bView : Button = findViewById(R.id.add_btn)
        bView.setOnClickListener(){
            print("Button is a success.")
        }
        //
       cService = ClaimService(this)

    }
}