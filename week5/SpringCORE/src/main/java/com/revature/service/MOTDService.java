package com.revature.service;

// this is going to be our first official Bean
// this service will print messages of the day

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOTDService {
    protected List<String> messages = new ArrayList<>();

    private int defaultMotdIndex;

    public String getMotd(int index){
        if(index > 0 && index < messages.size()){
            return messages.get(index);
        }
        return messages.get(defaultMotdIndex);
    }

    protected void initMotds(){
        messages.addAll(Arrays.asList("Good Morning",
                "It seems impossible until it's done",
                "You always pass failure on your way to success",
                "Positive anything is better than negative nothing",
                "The first step of the journey is always the most difficult"));
    }

    // we will set the default via setter injection with spring
    public void setDefaultMotdIndex(int defaultMotdIndex){
        this.defaultMotdIndex = defaultMotdIndex;
    }
}
