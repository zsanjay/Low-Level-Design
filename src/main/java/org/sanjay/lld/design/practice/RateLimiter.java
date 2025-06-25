package org.sanjay.lld.design.practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class RateLimiter {
    Map<String, Limit> limitMap = new ConcurrentHashMap<>();
    private static final int NO_OF_REQUEST = 5;
    private static final int WINDOW = 10;
    public boolean allowRequest(String userId) {
        if(!limitMap.containsKey(userId)) {
            limitMap.put(userId , new Limit(1, WINDOW));
            return true;
        } else {
           Limit userRateLimit =  limitMap.get(userId);
            long seconds = Duration.between(userRateLimit.getTimeOfFirstRequest(), LocalDateTime.now()).getSeconds();
            if(seconds >= WINDOW) {
                resetLimit(userRateLimit, userId);
            }
            if(userRateLimit.getNoOfRequest() < NO_OF_REQUEST) {
                userRateLimit.setNoOfRequest(userRateLimit.getNoOfRequest() + 1);
                limitMap.put(userId , userRateLimit);
                return true;
            }
        }
        return false;
    }

    private void resetLimit(Limit userRateLimit, String userId) {
        userRateLimit.setNoOfRequest(0);
        userRateLimit.setTimeOfFirstRequest(LocalDateTime.now());
        limitMap.put(userId , userRateLimit);
    }
}

class Limit {
    private int noOfRequest;
    private int windowInSeconds;
    private LocalDateTime timeOfFirstRequest;
    public Limit(int noOfRequest, int windowInSeconds) {
        this.noOfRequest = noOfRequest;
        this.windowInSeconds = windowInSeconds;
        this.timeOfFirstRequest = LocalDateTime.now();
    }
    public int getNoOfRequest() {
        return noOfRequest;
    }

    public int getWindowInSeconds() {
        return windowInSeconds;
    }

    public LocalDateTime getTimeOfFirstRequest() {
        return timeOfFirstRequest;
    }

    public void setNoOfRequest(int noOfRequest) {
        this.noOfRequest = noOfRequest;
    }

    public void setWindowInSeconds(int windowInSeconds) {
        this.windowInSeconds = windowInSeconds;
    }

    public void setTimeOfFirstRequest(LocalDateTime timeOfFirstRequest) {
        this.timeOfFirstRequest = timeOfFirstRequest;
    }
}
