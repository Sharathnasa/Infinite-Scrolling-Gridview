package grabhouse.sharathnasa.com.models;

import com.google.gson.annotations.Expose;

/**
 * Created by Sharathnasa on 14/11/15.
 */
public class Item {
    @Expose
    private Media media;
    /**
     *
     * @return
     * The media
     */
    public Media getMedia() {
        return media;
    }
}
