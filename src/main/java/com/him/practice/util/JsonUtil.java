package com.him.practice.util;

import javax.json.Json;

public class JsonUtil {

    public static String formatMessage(String message, String user) {
        return Json.createObjectBuilder()
                .add("content", message)
                .add("sender", user)
                .build().toString();
    }

}
