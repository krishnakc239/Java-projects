/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firsttwitterapp;

import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author krishna KC
 */
public class FirstTwitterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cf= new ConfigurationBuilder();
        
        cf.setDebugEnabled(true)
                .setOAuthConsumerKey("kAhGuc152nHKzqu8gz22smoel")
                .setOAuthConsumerSecret("OSwNiJ60Yf9qnzww4tZ5FmyrSClablPzEB7G0NN8KK6PZ2peOo")
                .setOAuthAccessToken("2579892320-9Y2x7vYXND869sKneMDNQ8usr8LLujREOELsBbe")
                .setOAuthAccessTokenSecret("jBO3Ry9SC4Qz7v9ODJWxPmMWd1QbzEPSIv6jMPnimSRrS");
                
       TwitterFactory tf = new TwitterFactory(cf.build());
       twitter4j.Twitter twitter = tf.getInstance();
       twitter.getHomeTimeline();
       
                
    }
    
}
