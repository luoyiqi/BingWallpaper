package wenhao.practice.bingwallpaper;

/**
 * Created by wenhaowu on 29/12/15.
 */
public class Object_Wallpaper {

    private String img_url;
    private String copyright;
    private String date;

    public String getDate() {
        return date;
    }

    public Object_Wallpaper(String img_url, String copyright,String date) {
        this.img_url = img_url;
        this.copyright = copyright;
        this.date = date;

    }

    public String getImg_url() {
        return img_url;
    }

    public String getCopyright() {
        return copyright;
    }

}
