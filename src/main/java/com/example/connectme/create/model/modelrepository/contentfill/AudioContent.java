package com.example.connectme.create.model.modelrepository.contentfill;

import com.example.connectme.create.model.Content;

public class AudioContent extends Content implements FunctionalContent{
      public AudioContent(String name) {
        super(name);
    }

    @Override
    public int getTracke() {
        return 7;
    }

    @Override
    public String getType() {
        return "AudeoContent";
    }
}
