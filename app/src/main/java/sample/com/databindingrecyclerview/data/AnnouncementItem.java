package sample.com.databindingrecyclerview.data;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.PropertyChangeRegistry;
import android.util.Log;
import android.view.View;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import sample.com.databindingrecyclerview.BR;

/**
 * Created by anfer on 12-Dec-17.
 */

public class AnnouncementItem extends BaseObservable {
    private PropertyChangeRegistry registry = new PropertyChangeRegistry();

    @SerializedName("ID")
    @Expose
    private Id id;

    @SerializedName("NATIVE_DATE")
    @Expose
    private NativeDate nativeDate;

    @SerializedName("ANNOUNCEMENT_DATE")
    @Expose
    private AnnouncementDate announcementDate;

    @SerializedName("EXPIRY")
    @Expose
    private Expiry expiry;

    @SerializedName("ANNOUNCEMENT_DESCRIPTION")
    @Expose
    private AnnouncementDesc announcementDesc;

    @SerializedName("ANNOUNCEMENT_TITLE")
    @Expose
    private AnnouncementTitle announcementTitle;

    @SerializedName("ANNOUNCEMENT_IMAGE")
    @Expose
    private AnnouncementImage announcementImage;

    @SerializedName("ANNOUNCEMENT_IMAGE_THUMBNAIL")
    @Expose
    private AnnouncementImageThumbnail announcementImageThumbNail;

    @SerializedName("ANNOUNCEMENT_HTML")
    @Expose
    private AnnouncementHtml announcementHtml;

    public void setId(Id id) {
        this.id = id;
        registry.notifyChange(this, BR.id);
    }

    public void setNativeDate(NativeDate nativeDate) {
        this.nativeDate = nativeDate;
        registry.notifyChange(this, BR.nativeDate);
    }

    public void setAnnouncementDate(AnnouncementDate announcementDate) {
        this.announcementDate = announcementDate;
        registry.notifyChange(this, BR.announcementDate);
    }

    public void setExpiry(Expiry expiry) {
        this.expiry = expiry;
        registry.notifyChange(this, BR.expiry);
    }

    public void setAnnouncementDesc(AnnouncementDesc announcementDesc) {
        this.announcementDesc = announcementDesc;
        registry.notifyChange(this, BR.announcementDesc);
    }

    public void setAnnouncementTitle(AnnouncementTitle announcementTitle) {
        this.announcementTitle = announcementTitle;
        registry.notifyChange(this, BR.announcementTitle);
    }

    public void setAnnouncementImage(AnnouncementImage announcementImage) {
        this.announcementImage = announcementImage;
        registry.notifyChange(this, BR.announcementImage);
    }

    public void setAnnouncementImageThumbNail(AnnouncementImageThumbnail announcementImageThumbNail) {
        this.announcementImageThumbNail = announcementImageThumbNail;
        registry.notifyChange(this, BR.announcementImageThumbNail);
    }

    public void setAnnouncementHtml(AnnouncementHtml announcementHtml) {
        this.announcementHtml = announcementHtml;
        registry.notifyChange(this, BR.announcementHtml);
    }

    @Bindable
    public Id getId() {
        return id;
    }

    @Bindable
    public NativeDate getNativeDate() {
        return nativeDate;
    }

    @Bindable
    public AnnouncementDate getAnnouncementDate() {
        return announcementDate;
    }

    @Bindable
    public Expiry getExpiry() {
        return expiry;
    }

    @Bindable
    public AnnouncementDesc getAnnouncementDesc() {
        return announcementDesc;
    }

    @Bindable
    public AnnouncementTitle getAnnouncementTitle() {
        return announcementTitle;
    }

    @Bindable
    public AnnouncementImage getAnnouncementImage() {
        return announcementImage;
    }

    @Bindable
    public AnnouncementImageThumbnail getAnnouncementImageThumbNail() {
        return announcementImageThumbNail;
    }

    @Bindable
    public AnnouncementHtml getAnnouncementHtml() {
        return announcementHtml;
    }
}
