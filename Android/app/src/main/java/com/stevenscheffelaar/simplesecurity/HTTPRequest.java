package com.stevenscheffelaar.simplesecurity;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import java.io.IOException;

/**
 * Created by Steven on 4/11/2016.
 */
public class HTTPRequest extends IntentService {
    private  final String TAG = HTTPRequest.class.getName();

    public HTTPRequest() {
        super("HTTPRequest");
    }
    public HTTPRequest(String name){
        super(HTTPRequest.class.getName());
        setIntentRedelivery(true);
    }

    protected void onHandleIntent(Intent intent){
        String targetHost = "http://192.168.1.109:81/api/sendSignal/";
        String signal =  intent.getStringExtra("Signal");
        try {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpPost request = new HttpPost(targetHost + signal);
            HttpResponse response = client.execute(request);
        } catch (ClientProtocolException e) {
            Log.d("HTTPCLIENT", e.getLocalizedMessage());
        } catch (IOException e) {
            Log.d("HTTPCLIENT", e.getLocalizedMessage());
        }
    }
}

//package com.stevenscheffelaar.simplesecurity;
//
//        import android.os.AsyncTask;
//        import android.util.Log;
//        import org.apache.http.HttpResponse;
//        import org.apache.http.client.ClientProtocolException;
//        import org.apache.http.client.methods.HttpPost;
//        import org.apache.http.impl.client.DefaultHttpClient;
//        import java.io.IOException;
//
///**
// * Created by Steven on 4/11/2016.
// */
//class HTTPRequest extends AsyncTask<String, Integer, String> {
//    private  final String TAG = HTTPRequest.class.getName();
//
//    protected void onPreExecute(){
//        Log.d(TAG, "On preExceute...");
//    }
//
//    protected String doInBackground(String...signal) {
//        String targetHost = "http://192.168.1.109:81/api/sendSignal/";
//        Log.d(TAG, "On doInBackground...");
//
//        try {
//            DefaultHttpClient client = new DefaultHttpClient();
//            HttpPost request = new HttpPost(targetHost + signal[0]);
//            HttpResponse response = client.execute(request);
//        } catch (ClientProtocolException e) {
//            Log.d("HTTPCLIENT", e.getLocalizedMessage());
//        } catch (IOException e) {
//            Log.d("HTTPCLIENT", e.getLocalizedMessage());
//        }
//
//        for(int i = 0; i<5; i++){
//            Integer in = new Integer(i);
//            publishProgress(i);
//        }
//
//        return "You are at PostExecute";}
//
//    protected void onProgressUpdate(Integer...a){
//        Log.d(TAG,"You are in progress update ... " + a[0]);
//    }
//
//    protected void onPostExecute(String result) {
//        Log.d(TAG,result);
//    }
//}


