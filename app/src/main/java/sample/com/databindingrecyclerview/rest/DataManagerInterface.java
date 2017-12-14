package sample.com.databindingrecyclerview.rest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sample.com.databindingrecyclerview.data.AnnouncementItem;

/**
 * Created by anfer on 12-Dec-17.
 */

public interface DataManagerInterface {
    @GET("EMC/IPDP/ipdpb.ashx")
    Call<List<AnnouncementItem>> getAnnouncementList(@Query("TemplateName") String templateName,
                                                     @Query("p") String p,
                                                     @Query("Handler") String handler,
                                                     @Query("AppName") String appName,
                                                     @Query("Type") String type,
                                                     @Query("F") String f);
}
