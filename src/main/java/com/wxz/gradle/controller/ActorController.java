package com.wxz.gradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxz
 * @date 15:04 2024/8/22
 */
@RestController
@RequestMapping("/actor")
public class ActorController
{
    @GetMapping("/name")
    public String getActorName()
    {
        return "actor";
    }
}
