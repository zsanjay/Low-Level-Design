package org.sanjay.practice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sanjay.lld.design.practice.RateLimiter;

public class RateLimiterTest {
    private RateLimiter rateLimiter;

    @BeforeEach
    void setUp() {
        rateLimiter = new RateLimiter();
    }

    @Test
    public void allowRequestTest() {
        String userId = "123437";
        boolean isRequestAllowed = rateLimiter.allowRequest(userId);
        assertTrue(isRequestAllowed, "Request should be allowed initially for userId = " + userId);
    }

    @Test
    public void denyRequestTest() {
        String userId = "1234";
        boolean isRequestAllowed = false;
        for(int i = 0; i < 6; i++) {
            isRequestAllowed = rateLimiter.allowRequest(userId);
        }
        assertFalse(isRequestAllowed, "❌ Request should have been denied for userId = " + userId);
    }

    @Test
    public void resetWindowTest() throws InterruptedException {
        String userId = "9999";
        for (int i = 0; i < 5; i++) {
            rateLimiter.allowRequest(userId);
        }
        Thread.sleep(11000); // Wait for window to reset (assuming 10s window)
        boolean allowedAfterReset = rateLimiter.allowRequest(userId);
        assertTrue(allowedAfterReset, "❌ Request should be allowed after window reset for userId = " + userId);
    }
}
