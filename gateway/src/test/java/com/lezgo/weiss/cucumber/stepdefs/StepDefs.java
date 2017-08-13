package com.lezgo.weiss.cucumber.stepdefs;

import com.lezgo.weiss.WeissApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = WeissApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
