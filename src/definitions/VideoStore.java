/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 19/08/20
 *  Time: 11:51 AM
 *  File Name : VideoStore.java
 * */
package definitions;

public class VideoStore {
    private Video[] store;

    public VideoStore(Video[] store) {
        this.store = store;
    }

    public Video[] getStore() {
        return store.clone();
    }

    public void setStore(Video[] store) {
        this.store = store;
    }
}
