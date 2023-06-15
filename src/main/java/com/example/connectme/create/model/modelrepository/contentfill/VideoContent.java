package com.example.connectme.create.model.modelrepository.contentfill;

import com.example.connectme.create.model.Content;

public class VideoContent extends Content implements FunctionalContent{
    public VideoContent(String name) {
        super(name);
    }

    @Override
    public int getTracke() {
        return 5;
    }

    @Override
    public String getType() {
       return "VideoContent";
    }
}
