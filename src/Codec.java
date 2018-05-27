import java.util.HashMap;
import java.util.Random;

/**
 * Encode and Decode TinyURL
 *
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl
 * and it returns a short URL such as http://tinyurl.com/4e9iAk.
 */
public class Codec {
    public String BASEURL = "http://tinyurl.com/";
    public char baseChar = 'a';
    public Random random = new Random();
    public HashMap<String, String> longTOShort = new HashMap<>();
    public HashMap<String,String> shortTOLong = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(longTOShort.containsKey(longUrl)){
            return longTOShort.get(longUrl);
        }
        String shortUrl = getRadomString();
        longTOShort.put(longUrl,shortUrl);
        shortTOLong.put(shortUrl,longUrl);
        return shortUrl;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortTOLong.get(shortUrl);
    }

    public String getRadomString(){
        int[] randomNumbers = random.ints(6, 0, 52).toArray();
        StringBuilder builder = new StringBuilder(BASEURL);
        for (int num: randomNumbers) {
            char temp = (char) (baseChar+num);
            builder.append(temp);
        }
        if(shortTOLong.containsKey(builder.toString())){
            return getRadomString();
        }else{
            return builder.toString();
        }
    }
}
