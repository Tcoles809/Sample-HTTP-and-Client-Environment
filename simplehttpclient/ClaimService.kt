package cpsc411.simplehttpclient


import android.app.Activity
import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import cz.msebera.android.httpclient.entity.StringEntity
import java.lang.reflect.Type

class ClaimService (val ctx : CustomActivity) {

    inner class addServiceRespHandler : AsyncHttpResponseHandler() {
        override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?
        ) {
            if (responseBody != null) {
                val respStr = String(responseBody)
                Log.d("Claim Service", "The add Service response : ${respStr}")
            }
        }

        override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?,
                error: Throwable?
        ) {
            TODO("Not yet implemented")
        }
    }
    fun addClaim(cObj : Claim) {
        val client = AsyncHttpClient()
        val requestUrl = "http://192.168.1.89:8010/ClaimService/add"
        val cJsonString= Gson().toJson(cObj)
        val entity = StringEntity(cJsonString)

        client.post(ctx, requestUrl, entity,"application/json", addServiceRespHandler())
    }


}
