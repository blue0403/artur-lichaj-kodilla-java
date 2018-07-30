package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProcessOrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessOrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
    " && args(userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + ", Order of user: " + userId);
    }
}
