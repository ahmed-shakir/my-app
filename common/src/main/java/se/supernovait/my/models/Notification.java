package se.supernovait.my.models;

import com.codename1.rad.annotations.RAD;
import com.codename1.rad.models.Entity;
import com.codename1.rad.models.Tag;
import com.codename1.rad.schemas.Thing;

import java.util.Date;

@RAD
public interface Notification extends Entity {
    Tag id = Thing.identifier;
    Tag title = Thing.name;
    Tag body = Thing.description;
    Tag timestamp = new Tag("timestamp");
    Tag isNew = new Tag("isNew");

    @RAD(tag="id")
    String getId();
    void setId(String Id);

    @RAD(tag="title")
    String getTitle();
    void setTitle(String title);

    @RAD(tag="body")
    String getBody();
    void setBody(String body);

    @RAD(tag="timestamp")
    Date getTimestamp();
    void setTimestamp(Date timestamp);

    @RAD(tag="isNew")
    boolean isNew();
    void setNew(boolean isNew);
}
