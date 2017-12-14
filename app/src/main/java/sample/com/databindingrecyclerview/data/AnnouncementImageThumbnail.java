package sample.com.databindingrecyclerview.data;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.PropertyChangeRegistry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import sample.com.databindingrecyclerview.BR;

/**
 * Created by anfer on 12-Dec-17.
 */

public class AnnouncementImageThumbnail extends BaseObservable {

    private PropertyChangeRegistry registry = new PropertyChangeRegistry();

    @SerializedName("Tag")
    @Expose
    private String tag;
    @SerializedName("TypeCode")
    @Expose
    private Integer typeCode;
    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("IsBinaryUnique")
    @Expose
    private Boolean isBinaryUnique;

    @Bindable
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
        registry.notifyChange(this, BR.tag);
    }

    @Bindable
    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        registry.notifyChange(this, BR.typeCode);
    }

    @Bindable
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        registry.notifyChange(this, BR.value);
    }

    @Bindable
    public Boolean getIsBinaryUnique() {
        return isBinaryUnique;
    }

    public void setIsBinaryUnique(Boolean isBinaryUnique) {
        this.isBinaryUnique = isBinaryUnique;
        registry.notifyChange(this, BR.isBinaryUnique);
    }
}
