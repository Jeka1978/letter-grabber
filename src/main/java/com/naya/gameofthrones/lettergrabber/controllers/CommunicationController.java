package com.naya.gameofthrones.lettergrabber.controllers;

import com.naya.gameofthrones.lettergrabber.services.LetterDistributor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/distribution")
public class CommunicationController {
    private final LetterDistributor distributor;

    @GetMapping("/readDelay/{sendDelay}")
    public void readDelay(@PathVariable("sendDelay") int delay) {
        distributor.setSendDelay(delay);
    }

}
