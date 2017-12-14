package sample.com.databindingrecyclerview.data;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import sample.com.databindingrecyclerview.R;


/**
 * Created by anfer on 12-Dec-17.
 */

public class CustomImageBinding {

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        if(imageUrl.isEmpty()){
            view.setImageResource(R.drawable.placeholder);
        }else{
            Picasso.with(view.getContext())

                    .load(imageUrl)

                    .placeholder(R.drawable.placeholder)

                    .into(view);
        }
    }
}
