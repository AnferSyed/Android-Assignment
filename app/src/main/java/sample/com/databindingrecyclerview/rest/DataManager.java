package sample.com.databindingrecyclerview.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sample.com.databindingrecyclerview.universal.ApplicationUtil;

/**
 * Created by anfer on 12-Dec-17.
 */

public class DataManager {

    private static Retrofit retrofit = null;

    public static Retrofit loadData() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApplicationUtil.getInstance().BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
