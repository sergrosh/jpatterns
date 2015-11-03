package com.srosh.jpatterns.structural.proxy;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public class ProxyImage  implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
