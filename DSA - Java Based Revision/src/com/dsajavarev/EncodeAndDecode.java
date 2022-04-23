package com.dsajavarev;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    public static void main(String[] args) {
        String longURL = "https://leetcode.com/problems/design-tinyurl";
//        System.out.println(encode(longURL),decode(longURL));
    }
    static List<String> urls = new ArrayList<String>();
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size() - 1);
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        int index = Integer.parseInt(shortUrl);
        return (index<urls.size()) ? urls.get(index):"";
    }
}
