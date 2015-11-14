package grabhouse.sharathnasa.com.models;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sharathnasa on 14/11/15.
 */
public class Feed {

    @Expose
    private List<Item> items = new ArrayList<Item>();

    /**
     *
     * @return
     * The items
     */
    public List<Item> getItems() {
        return items;
    }
}
