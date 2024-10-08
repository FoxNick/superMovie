package com.bftv.myapplication.util;

import io.github.pixee.security.HostValidator;
import io.github.pixee.security.Urls;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlUtils {
    public static String getHost(String url) throws MalformedURLException {
        return Urls.create(url, Urls.HTTP_PROTOCOLS, HostValidator.DENY_COMMON_INFRASTRUCTURE_TARGETS).getHost();
    }
}
