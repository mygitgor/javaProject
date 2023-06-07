package com.example.connectme.create;

public class Program {
    public static void main(String[] args) {
        Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
        videoStorage.add(new VideoContent("track_001.mp4"));
        videoStorage.add(new VideoContent("track_002.mp4")); 

        Repository<ImageContent> imageStorage = new Repository<>("imageStorage");
        imageStorage.add(new ImageContent("photo_001.jpg"));
        imageStorage.add(new ImageContent("photo_002.jpg"));
        System.out.println(imageStorage.get(1));
    }
    
}
