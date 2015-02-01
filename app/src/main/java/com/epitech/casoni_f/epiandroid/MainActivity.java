package com.epitech.casoni_f.epiandroid;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    public class PostHttp extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String ...params)
        {

            int i = -1;
            String[] parameters = new String[3];
            for (String p : params)
            {
                parameters[++i] = p;
            }

            HttpPost httppost = new HttpPost(parameters[0]);

            List<NameValuePair> paramPair = new ArrayList<NameValuePair>();
            paramPair.add(new BasicNameValuePair("login", parameters[1]));
            paramPair.add(new BasicNameValuePair("password", parameters[2]));


            try {
                httppost.setEntity(new UrlEncodedFormEntity(paramPair));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            HttpClient httpclient = new DefaultHttpClient();
            try {
                httpclient.execute(httppost);
            } catch (IOException e) {
                e.printStackTrace();
            }
            HttpResponse response= null;
            try {
                response = httpclient.execute(httppost);
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }



            return s;
        }

        @Override
        protected void onPostExecute(String result){
            TextView answer = (TextView)findViewById(R.id.answer);
            Token token;
            token = new Gson().fromJson(result, Token.class);
            answer.setText(token.getToken());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(epiLog);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public View.OnClickListener epiLog = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView login = (TextView)findViewById(R.id.login);
            TextView pass = (TextView)findViewById(R.id.password);
            new PostHttp().execute("http://epitech-api.herokuapp.com/login", login.getText().toString(), pass.getText().toString());
        }
    };

}