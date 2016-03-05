package com.learner.sukesh.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickz(View v)
    {
        Intent intent=null , choser=null;
      if(v.getId()==R.id.botman)
      {
          intent=new Intent(Intent.ACTION_VIEW);

          intent.setData(Uri.parse("geo:19.076,72.8777"));
          Log.d("button", "botman clicked");
         choser=Intent.createChooser(intent,"launch map");
          startActivity(choser);

      }

        if(v.getId()==R.id.zotman)
        {
            Log.d("button","zotman clicked");
            intent= new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=jp.co.translimit.braindots&hl=en"));
            choser=Intent.createChooser(intent,"choose the app to take this action");
            startActivity(choser);
        }

        if(v.getId()==R.id.potman)
        {
            Log.d("button","potman clicked");
            intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            intent.setType("message/rfc822");
            choser=Intent.createChooser(intent,"choose the app");
            startActivity(choser);


        }

        if(v.getId()==R.id.image)
        {
            intent=new Intent(Intent.ACTION_SEND);
            Uri imageUri=Uri.parse("android.resource://com.learner.sukesh.implicitintents/res/drawable/"+R.drawable.spidy);
            intent.setType("image/*");
            //intent.putExtra(Intent.EXTRA_STREAM, imageUri);
            intent.setData(imageUri);
            choser=intent.createChooser(intent,"choose the app");
            startActivity(choser);
        }

    }
}
